package desafioFormaNT;

import java.util.Scanner;

public class Fatorial{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Digite um número para calcular o fatorial (ou digite 'sair' para sair): ");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("sair")) {
                System.out.println("Encerrando o programa.");
                break;
            }

            try {
                int numero = Integer.parseInt(input);
                if (numero < 0) {
                    System.out.println("O fatorial não é definido para números negativos.");
                } else {
                    long fatorial = calcularFatorial(numero);
                    System.out.println("O fatorial de " + numero + " é: " + fatorial);
                }
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida. Digite um número válido ou 'sair'.");
            }
        }

        scanner.close();
    }

    public static long calcularFatorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }

        long resultado = 1;
        for (int i = 2; i <= n; i++) {
            resultado *= i;
        }

        return resultado;
    }
}

