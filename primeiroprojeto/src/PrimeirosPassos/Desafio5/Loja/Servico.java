package PrimeirosPassos.Desafio5.Loja;

public class Servico implements Vendavel{

    private String descricao;
    private double precoHora;


    @Override
    public double calcularPrecoTotal(int quantidade) {
        return precoHora * quantidade;
    }

    @Override
    public void aplicarDesconto(double percentualDesconto) {
        precoHora -= precoHora* (percentualDesconto/100);

    }
}
