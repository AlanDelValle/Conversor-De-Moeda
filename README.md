**Currency Converter Application**

**Overview**
This is a Java-based command-line application for converting currencies. It allows users to convert amounts between USD (United States Dollar), BRL (Brazilian Real), ARS (Argentine Peso), BOB (Bolivian Boliviano), CLP (Chilean Peso) and COP (Colombian Peso) using real-time exchange rates fetched from an external API.
Files

**CurrencyConverterApp.java:** The main application class that provides a user interface for selecting conversion options and inputting amounts.
**CurrencyConverter.java:** A utility class responsible for performing the currency conversion by calling the exchange rate API.
**ExchangeRateAPI.java:** Handles communication with the external exchange rate API and parses the response to extract the required exchange rate.
**pom.xml:** Maven configuration file for building the project.

**Prerequisites**

Java Development Kit (JDK) 21
Maven 3.6 or higher
Internet connection (to fetch exchange rates)
An API key from ExchangeRate-API

**Setup**

Clone or download the project to a directory named Conversor de Moeda.
Ensure the Java files are in Conversor de Moeda/src/main/java/Conversor.
Obtain a valid API key from ExchangeRate-API.
Update the API_KEY constant in ExchangeRateAPI.java with your API key:private static final String API_KEY = "your_api_key_here";


Navigate to the project root (Conversor de Moeda) and run the following Maven commands:
mvn clean install
mvn exec:java -Dexec.mainClass="Conversor.CurrencyConverterApp"

Alternatively, build a JAR and run it:
mvn package
java -jar target/Conversor-De-Moeda-1.0-SNAPSHOT.jar


**Usage**

Launch the application using the Maven command or JAR.
Choose a conversion option from the menu (e.g., USD to EUR, BRL to USD) by entering the corresponding number.
Enter the amount to convert.
View the conversion result.
Select another conversion or press 0 to exit.

**Example**
=== CONVERSOR DE MOEDAS ===
Escolha uma opção:
1. USD para BRL
2. ARS para BOB
3. CLP para COP
4. BRL para ARS
5. BOB para CLP
6. COP para USD
0. Sair
Opção: 1
Digite o valor a ser convertido: 100
100,00 USD = 568,52 BRL

**Error Handling**

Invalid menu options prompt an error message and return to the menu.
Non-numeric inputs are caught, and the user is prompted to enter a valid number.
API connection issues or invalid currencies display an error message and allow retrying.

**Dependencies**

Gson (com.google.code.gson:gson:2.13.1): For parsing JSON responses from the API.
Standard Java libraries (java.net, java.io) for HTTP requests.

**Notes**

The exchange rates are fetched from ExchangeRate-API, which requires a valid API key.
For production use, consider:
Adding input validation for negative amounts.
Caching exchange rates to reduce API calls.
Supporting additional currencies.
Implementing a graphical user interface (GUI).


**License**

This project is for educational purposes and is not licensed for commercial use. Ensure compliance with the ExchangeRate-API terms of service.