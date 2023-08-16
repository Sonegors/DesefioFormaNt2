package SistemaUsuario;

// Implementação da classe Usuário Premium
class UsuarioPremium implements Usuario {
    @Override
    public Double getValorDesconto(double valorProduto) {
        if (valorProduto > 200) {
            return valorProduto * 0.3;
        }
        return 0.0;
    }

    @Override
    public String getTipoUsuario() {
        return "Premium";
    }

    @Override
    public String getValorFreteDesconto(double valorFrete, double valorProduto) {
        if (valorProduto > 100) {
            return "Frete Grátis";
        }
        return String.format("%.2f", valorFrete);
    }
}
