## Currency Converter Application

## Overview

This is a simple Java-based command-line application for converting currencies. It allows users to convert amounts between USD, EUR, and BRL using real-time exchange rates fetched from an external API.

## Files

**CurrencyConverterApp.java:** The main application class that provides a user interface for selecting conversion options and inputting amounts;

**CurrencyConverter.java:** A utility class responsible for performing the currency conversion by calling the exchange rate API;

**ExchangeRateAPI.java:** Handles communication with the external exchange rate API and parses the response to extract the required exchange rate.


## Prerequisites

Java Development Kit (JDK) 8 or higher;

Internet connection (to fetch exchange rates);

An API key from ExchangeRate-API (replace the API_KEY in ExchangeRateAPI.java).


## Setup

Clone or download the project files;

Ensure you have a valid API key from ExchangeRate-API;

Update the API_KEY constant in ExchangeRateAPI.java with your API key:

private static final String API_KEY = "your_api_key_here";

Compile the Java files;

javac Conversor/*.java


**Run the application:**

java Conversor.CurrencyConverterApp


## Usage

Launch the application.

Choose a conversion option from the menu (e.g., USD to EUR, BRL to USD, etc.) by entering the corresponding number.

Enter the amount to convert.

View the conversion result.

Select another conversion or press 0 to exit.


## Example

=== CONVERSOR DE MOEDAS ===
Escolha uma opção:
1. USD para EUR
2. EUR para USD
3. BRL para USD
4. USD para BRL
5. BRL para EUR
6. EUR para BRL
0. Sair
Opção: 1
Digite o valor a ser convertido: 100
100.00 USD = 92.50 EUR

## Error Handling

Invalid menu options will prompt an error message and return to the menu.

API connection issues or invalid currencies will display an error message and allow the user to try again.

Invalid input (e.g., non-numeric values) may cause the program to crash (consider adding input validation for production use).


## Dependencies

The application uses the java.net and java.io packages for HTTP requests and JSON parsing.

No external libraries are required beyond the standard Java library.


## Notes

The exchange rates are fetched from the ExchangeRate-API, which requires a valid API key.

The application assumes the API response format remains consistent. Changes to the API structure may require updates to the parseExchangeRate method.

**For production use, consider adding:**

Input validation for user inputs.

Caching for exchange rates to reduce API calls.

Support for more currencies.

A graphical user interface (GUI).


## License

This project is for educational purposes and is not licensed for commercial use. Ensure compliance with the ExchangeRate-API terms of service when using their API.