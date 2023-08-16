package desafioFormaNT;

import java.util.Scanner;

public class CifraCesar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o texto: ");
        String texto = scanner.nextLine();

        System.out.print("Digite um número para a chave: ");
        int chave = scanner.nextInt();

        scanner.nextLine(); // Limpar o buffer

        System.out.println("Escolha uma opção:");
        System.out.println("1 - Criptografar");
        System.out.println("2 - Descriptografar");
        int opcao = scanner.nextInt();

        if (opcao == 1) {
            String textoCriptografado = criptografar(texto, chave);
            System.out.println("Texto criptografado: " + textoCriptografado);
        } else if (opcao == 2) {
            String textoDescriptografado = descriptografar(texto, chave);
            System.out.println("Texto descriptografado: " + textoDescriptografado);
        } else {
            System.out.println("Opção inválida.");
        }

        scanner.close();
    }

    public static String criptografar(String texto, int chave) {
        StringBuilder resultado = new StringBuilder();

        for (int i = 0; i < texto.length(); i++) {
            char caractere = texto.charAt(i);

            if (Character.isLetter(caractere)) {
                char base = Character.isUpperCase(caractere) ? 'A' : 'a';
                int deslocamento = (caractere - base + chave) % 26;
                char novoCaractere = (char) (base + deslocamento);
                resultado.append(novoCaractere);
            } else {
                resultado.append(caractere);
            }
        }

        return resultado.toString();
    }

    public static String descriptografar(String texto, int chave) {
        return criptografar(texto, 26 - chave);
    }
}
