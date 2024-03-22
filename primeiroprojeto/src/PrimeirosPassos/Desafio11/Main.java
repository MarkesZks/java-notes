package PrimeirosPassos.Desafio11;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Produto> listaDeProdutos = new ArrayList<>();
        Produto produto1 = new Produto("Escova de dente", 20);
        Produto produto2 = new Produto("Pasta de dente", 10);
        Produto produto3 = new Produto("Perfume", 50);

        listaDeProdutos.add(produto1);
        listaDeProdutos.add(produto2);
        listaDeProdutos.add(produto3);
        double ultimoItem = 0;
        for (Produto item:listaDeProdutos) {
            System.out.println(item.getPreco());
             ultimoItem += item.getPreco();

        }
        System.out.println("A media é "+ ultimoItem /listaDeProdutos.size());
    }
}
