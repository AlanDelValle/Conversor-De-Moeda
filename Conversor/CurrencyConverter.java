package Conversor;
public class CurrencyConverter {

    public static double convert(String from, String to, double amount) throws Exception {
        double rate = ExchangeRateAPI.getExchangeRate(from, to);
        return amount * rate;
    }
}