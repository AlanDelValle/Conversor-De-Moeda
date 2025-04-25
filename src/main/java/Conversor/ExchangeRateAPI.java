package Conversor;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URL;

public class ExchangeRateAPI {
    private static final String API_KEY = "ff61490315fe5a757e6201c9";

    public static double getExchangeRate(String baseCurrency, String targetCurrency) throws Exception {
        String urlStr = "https://v6.exchangerate-api.com/v6/" + API_KEY + "/latest/" + baseCurrency;
        URL url = URI.create(urlStr).toURL();
        HttpURLConnection con = (HttpURLConnection) url.openConnection();
        con.setRequestMethod("GET");

        int status = con.getResponseCode();
        if (status != 200) {
            throw new RuntimeException("Erro ao conectar à API. Código: " + status);
        }

        BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
        StringBuilder content = new StringBuilder();
        String inputLine;
        while ((inputLine = in.readLine()) != null) {
            content.append(inputLine);
        }
        in.close();
        con.disconnect();

        return parseExchangeRate(content.toString(), targetCurrency);
    }

    private static double parseExchangeRate(String json, String targetCurrency) throws Exception {
        Gson gson = new Gson();
        JsonObject jsonObject = gson.fromJson(json, JsonObject.class);

        JsonObject conversionRates = jsonObject.getAsJsonObject("conversion_rates");
        if (conversionRates == null || !conversionRates.has(targetCurrency.toUpperCase())) {
            throw new RuntimeException("Moeda não encontrada: " + targetCurrency);
        }

        return conversionRates.get(targetCurrency.toUpperCase()).getAsDouble();
    }
}