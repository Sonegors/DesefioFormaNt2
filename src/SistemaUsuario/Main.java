package SistemaUsuario;


// Classe para demonstração

public class Main {
    public static void main(String[] args) {
        double valorProduto = 250;
        double valorFrete = 20;

        Usuario usuarioBase = new UsuarioBase();
        Usuario usuarioStandard = new UsuarioStandard();
        Usuario usuarioPremium = new UsuarioPremium();

        System.out.println("Tipo de Usuário: " + usuarioBase.getTipoUsuario());
        System.out.println("Desconto: " + usuarioBase.getValorDesconto(valorProduto));
        System.out.println("Frete: " + usuarioBase.getValorFreteDesconto(valorFrete, valorProduto));

        System.out.println();

        System.out.println("Tipo de Usuário: " + usuarioStandard.getTipoUsuario());
        System.out.println("Desconto: " + usuarioStandard.getValorDesconto(valorProduto));
        System.out.println("Frete: " + usuarioStandard.getValorFreteDesconto(valorFrete, valorProduto));

        System.out.println();

        System.out.println("Tipo de Usuário: " + usuarioPremium.getTipoUsuario());
        System.out.println("Desconto: " + usuarioPremium.getValorDesconto(valorProduto));
        System.out.println("Frete: " + usuarioPremium.getValorFreteDesconto(valorFrete, valorProduto));
    }
}