package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.calculos.Classificavel;
import br.com.alura.screenmatch.model.Filme;
import br.com.alura.screenmatch.model.Serie;
import br.com.alura.screenmatch.model.Titulo;

import java.util.ArrayList;

public class PrincipalComListas {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("O poderoso chefão",1970);
        meuFilme.avaliar(9);
        var filmeDoPaulo = new Filme("Dogville",2003);
        filmeDoPaulo.avaliar(8);
        Filme outroFilme = new Filme("Avatar",2023);
        outroFilme.avaliar(10);
        Serie lost = new Serie("Lost",2000);


        ArrayList<Titulo> lista = new ArrayList<>();
        lista.add(filmeDoPaulo);
        lista.add(meuFilme);
        lista.add(outroFilme);
        lista.add(lost);

        for (Titulo item:lista) {

            if (item instanceof Filme filme && filme.getClassificacao() > 2){
                System.out.println(item.getNome());
                /*Instanceof verifica o tipo do objeto*/

                System.out.println(filme.getClassificacao());
            }



        }



    }
}
