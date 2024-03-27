package PrimeirosPassos.Desafio14;

import java.sql.SQLOutput;
import java.text.CollationElementIterator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //Atv 1
        ArrayList<Integer> llistaDeInteiros = new ArrayList<Integer>();
        llistaDeInteiros.add(5);
        llistaDeInteiros.add(15);
        llistaDeInteiros.add(1);
        llistaDeInteiros.add(25);
        llistaDeInteiros.add(81);

        System.out.println("Lista normal "+llistaDeInteiros.toString());
        Collections.sort(llistaDeInteiros);
        System.out.println("Lista ordenada "+llistaDeInteiros.toString());
        //Atv 3

        Titulo titulo1 = new Titulo("Sherek 2");
        Titulo titulo2 = new Titulo("Sherek 1");
        Titulo titulo3 = new Titulo("Sherek 3");
        LinkedList<Titulo> listaDeTitulos = new LinkedList<>();

        listaDeTitulos.add(titulo1);
        listaDeTitulos.add(titulo2);
        listaDeTitulos.add(titulo3);
        System.out.println("(Titulos) Lista de titulos normal: "+listaDeTitulos.toString());
        Collections.sort(listaDeTitulos);
        System.out.println("(Titulos) Lista de titulos Ordenada: "+listaDeTitulos.toString());
        for (Titulo titulo: listaDeTitulos) {
            System.out.println(titulo.getNome());

        }

        //Atv 4
        List<Titulo> listTitulos = new LinkedList<Titulo>();
        listTitulos.add(titulo1);
        listTitulos.add(titulo2);
        listTitulos.add(titulo3);
        System.out.println("(LIST) Lista "+ listTitulos.toString());

        List<Titulo> listTitulos2 = new LinkedList<Titulo>();
        listTitulos2.add(titulo1);
        listTitulos2.add(titulo2);
        listTitulos2.add(titulo3);
        System.out.println("(LIST) Linked List "+ listTitulos2.toString());

        //Atv 5
        List<String> listaPoliformica;
        listaPoliformica = new ArrayList<>();
        listaPoliformica.add("Elemento1");
        listaPoliformica.add("Elemento2");
        System.out.println("ArrayList"+listaPoliformica);
        listaPoliformica = new LinkedList<>();

    }
}
