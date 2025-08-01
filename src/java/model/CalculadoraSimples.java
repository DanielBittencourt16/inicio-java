package model;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;
import java.util.Scanner;

public class CalculadoraSimples {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in); // Cria o scanner para entrada dos dados
        int opcao = 0; // Inicializa a variável que armazenará a opção escolhida

        // Configura o formatador com separador decimal brasileiro (vírgula)
        DecimalFormatSymbols simbolos = new DecimalFormatSymbols(new Locale("pt", "BR"));
        simbolos.setDecimalSeparator(',');
        DecimalFormat formatador = new DecimalFormat("#.##"); // Remove zeros desnecessários

        // Laço principal: repete até o usuário digitar a opção 0 (sair)
        do {
            System.out.println("\n=== Calculadora Simples ===");

            // Solicita o primeiro numero
            System.out.println("Digite o primeiro numero: ");
            double num1 = scanner.nextDouble();

            // Solicita o segundo numero
            System.out.println("Digite o segundo numero: ");
            double num2 = scanner.nextDouble();

            boolean operacaoValida = false; // Controle para repetir o menu até o usuário digitar uma operação valida

            // Enquanto a operação for invalida, repete esse bloco

            while (!operacaoValida) {

                // Exibe o menu de operações
                System.out.println("\nEscolha uma operação:");
                System.out.println("1 - Adição ( + )");
                System.out.println("2 - Subtração ( - )");
                System.out.println("3 - Multiplicação ( * )");
                System.out.println("4 - Divisão ( / )");
                System.out.println("0 - Sair");
                System.out.println("Opção: ");
                opcao = scanner.nextInt(); // lê a opção escolhida pelo usuário

                double resultado; // Variável para armazenar o resultado da operação

                // Verifica a opção escolhida e realiza a operação correspondente
                switch (opcao) {

                    case 1: // Adição
                        resultado = num1 + num2;
                        System.out.println("Resultado: " + formatador.format(resultado));
                        operacaoValida = true; // Marca como válida para sair do loop
                        break;

                    case 2: // Subtração
                        resultado = num1 - num2;
                        System.out.println("Resultado: " + formatador.format(resultado));
                        operacaoValida = true; // Marca como válida para sair do loop
                        break;

                    case 3: // Multiplicação
                        resultado = num1 * num2;
                        System.out.println("Resultado: " + formatador.format(resultado));
                        operacaoValida = true; // Marca como válida para sair do loop
                        break;

                    case 4: // Divisão
                        if (num2 != 0) {
                            resultado = num1 / num2;
                            System.out.println("Resultado: " + formatador.format(resultado));
                        } else {
                            System.out.println("Erro: divisão por zero!"); // Evita divisão por zero
                        }
                        operacaoValida = true; // Marca como válida para sair do loop
                        break;

                    case 0: // Encerra o programa
                        System.out.println("Encerrando a calculadora...");
                        operacaoValida = true;
                        break;

                    default: // Caso seja digitado uma opção invalida
                        System.out.println("Opção invalida. Tente novamente.");
                        // Não marca como válida - volta a repetir o menu

                }
            }
        } while (opcao != 0); // Repete enquanto a opção for diferente de 0

        scanner.close(); // Fecha o scanner

        }
}
