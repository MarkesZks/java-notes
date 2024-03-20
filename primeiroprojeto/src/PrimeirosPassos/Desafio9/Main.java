package PrimeirosPassos.Desafio9;

public class Main {
    public static void main(String[] args) {

        Produto p1 = new Produto("Caneta", 0);
        Produto p2 = p1;
        p2.setPreco(2.00);
        System.out.println(p1.getPreco());
    }
}
