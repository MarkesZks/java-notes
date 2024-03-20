package PrimeirosPassos.Desafio7;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Pessoas pessoa1 = new Pessoas();
        pessoa1.setNome("Gabriel");
        pessoa1.setIdade(19);

        Pessoas pessoa2 = new Pessoas();
        pessoa2.setNome("Nicollas");
        pessoa2.setIdade(20);

        Pessoas pessoa3 = new Pessoas();
        pessoa3.setNome("João");
        pessoa3.setIdade(48);

        ArrayList<Pessoas> listaDePessoas = new ArrayList<>();

        listaDePessoas.add(pessoa1);
        listaDePessoas.add(pessoa2);
        listaDePessoas.add(pessoa3);
        System.out.println("O tamanho da Lista de pessoas é de : "+ listaDePessoas.size());
        System.out.println("A primeira pessoa se chama "+listaDePessoas.get(0).getNome()+" e tem "+listaDePessoas.get(0).getIdade()+" Anos" );
        System.out.println("Lista completa: \n"+listaDePessoas.toString());
    }



}
