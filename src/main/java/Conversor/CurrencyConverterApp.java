package Conversor;
import java.util.Scanner;

public class CurrencyConverterApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("=== CONVERSOR DE MOEDAS ===");
            System.out.println("Escolha uma opção:");
            System.out.println("1. USD para BRL");
            System.out.println("2. ARS para BOB");
            System.out.println("3. CLP para COP");
            System.out.println("4. BRL para ARS");
            System.out.println("5. BOB para CLP");
            System.out.println("6. COP para USD");
            System.out.println("0. Sair");
            System.out.print("Opção: ");             
            int opcao = scanner.nextInt();

            if (opcao == 0) {
                running = false;
                System.out.println("Encerrando...");
                break;
            }

            System.out.print("Digite o valor a ser convertido: ");
            double valor = scanner.nextDouble();

            try {
                String from = "";
                String to = "";

                switch (opcao) {
                    case 1:
                        from = "USD"; to = "BRL"; break;
                    case 2:
                        from = "ARS"; to = "BOB"; break;
                    case 3:
                        from = "CLP"; to = "COP"; break;
                    case 4:
                        from = "BRL"; to = "ARS"; break;
                    case 5:
                        from = "BOB"; to = "CLP"; break;
                    case 6:
                        from = "COP"; to = "USD"; break;
                    default:
                        System.out.println("Opção inválida!");
                        continue;
                }

                double resultado = CurrencyConverter.convert(from, to, valor);
                System.out.printf("%.2f %s = %.2f %s\n\n", valor, from, resultado, to);

            } catch (Exception e) {
                System.out.println("Erro na conversão: " + e.getMessage());
            }
        }
        scanner.close();
    }
}