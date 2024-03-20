package PrimeirosPassos.Desafio8;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Produto produto1 = new Produto("Escova de dente",18.20,8);
        Produto produto2 = new Produto("Perfume",50.00,10);

        ArrayList<Produto> listaDeProdutos = new ArrayList<>();
        listaDeProdutos.add(produto1);
        listaDeProdutos.add(produto2);


        System.out.println("Tamanho da lista " + listaDeProdutos.size());
        System.out.println("Lista completa: "+ listaDeProdutos) ;
        System.out.println("-----");

        for (Produto produto : listaDeProdutos) {
            System.out.println(produto);
        }
        ProdutoPerecivel produtoPerecivel = new ProdutoPerecivel("Produto C",50,10,"20-02-2000");
        System.out.println(produtoPerecivel);


    }
}
