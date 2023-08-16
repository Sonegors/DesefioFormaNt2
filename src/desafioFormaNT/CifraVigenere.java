package desafioFormaNT;

import java.util.Scanner;

public class CifraVigenere {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o texto: ");
        String texto = scanner.nextLine();

        System.out.print("Digite a palavra chave: ");
        String chave = scanner.nextLine();

        System.out.println("Escolha uma opção:");
        System.out.println("1 - Criptografar");
        System.out.println("2 - Descriptografar");
        int opcao = scanner.nextInt();
        scanner.nextLine(); // Limpar o buffer

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

    public static String criptografar(String texto, String chave) {
        StringBuilder resultado = new StringBuilder();
        int chaveLength = chave.length();

        for (int i = 0; i < texto.length(); i++) {
            char caractere = texto.charAt(i);
            int deslocamento = chave.charAt(i % chaveLength) - 'a';
            char novoCaractere = criptografarCaractere(caractere, deslocamento);
            resultado.append(novoCaractere);
        }

        return resultado.toString();
    }

    public static String descriptografar(String texto, String chave) {
        StringBuilder resultado = new StringBuilder();
        int chaveLength = chave.length();

        for (int i = 0; i < texto.length(); i++) {
            char caractere = texto.charAt(i);
            int deslocamento = chave.charAt(i % chaveLength) - 'a';
            char novoCaractere = descriptografarCaractere(caractere, deslocamento);
            resultado.append(novoCaractere);
        }

        return resultado.toString();
    }

    public static char criptografarCaractere(char caractere, int deslocamento) {
        if (Character.isLetter(caractere)) {
            char base = Character.isUpperCase(caractere) ? 'A' : 'a';
            return (char) (((caractere - base + deslocamento) % 26) + base);
        }
        return caractere;
    }

    public static char descriptografarCaractere(char caractere, int deslocamento) {
        if (Character.isLetter(caractere)) {
            char base = Character.isUpperCase(caractere) ? 'A' : 'a';
            return (char) (((caractere - base - deslocamento + 26) % 26) + base);
        }
        return caractere;
    }
}

