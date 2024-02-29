package PrimeirosPassos.Desafio5.Loja;

public class Main {

    public static void main(String[] args) {
        Servico servico = new Servico();
        Produto produto = new Produto();
        System.out.println("Valor total do Servico é de "+servico.calcularPrecoTotal(10));
        System.out.println("Valor total do Produto é de "+ produto.calcularPrecoTotal(20));

    }




}
