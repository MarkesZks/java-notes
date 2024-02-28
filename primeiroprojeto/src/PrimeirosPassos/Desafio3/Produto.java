package PrimeirosPassos.Desafio3;

public class Produto {
    private String nome;
    private double preco;

    public void aplicarDesconto(){
        double desconto = preco * 0.10;
        double precoComDesconto = preco-desconto;
        System.out.println("O produto " +nome+ " com o preço de "+preco+" teve um desconto de 10% que no total ficara "+precoComDesconto);
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}
