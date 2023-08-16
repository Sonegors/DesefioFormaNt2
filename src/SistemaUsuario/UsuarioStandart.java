package SistemaUsuario;

// Implementação da classe Usuário Standard
class UsuarioStandard implements Usuario {
    @Override
    public Double getValorDesconto(double valorProduto) {
        if (valorProduto > 200) {
            return valorProduto * 0.15;
        }
        return 0.0;
    }

    @Override
    public String getTipoUsuario() {
        return "Standard";
    }

    @Override
    public String getValorFreteDesconto(double valorFrete, double valorProduto) {
        if (valorProduto > 200) {
            return String.format("%.2f", valorFrete * 0.9);
        }
        return String.format("%.2f", valorFrete);
    }
}
