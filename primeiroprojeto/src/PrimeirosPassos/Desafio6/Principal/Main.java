package PrimeirosPassos.Desafio6.Principal;

import PrimeirosPassos.Desafio6.Modelos.Musicas;
import PrimeirosPassos.Desafio6.Modelos.Podcast;

public class Main {
    public static void main(String[] args) {

        Musicas minhaMusica = new Musicas();
        minhaMusica.setTitulo("In Bloom");
        minhaMusica.setArtista("Nirvana");

        for (int i = 0; i <1000 ; i++) {
            minhaMusica.reproduzir();
        }
        for (int i = 0; i <50 ; i++) {
            minhaMusica.curtir();

        }
        Podcast meuPodcast = new Podcast();
        meuPodcast.setTitulo("PodPah");
        meuPodcast.setHost("Igão e Mitico");

        for (int i = 0; i < 5000; i++) {
            meuPodcast.reproduzir();
        }
        for (int i = 0; i <1000 ; i++) {
            meuPodcast.curtir();
        }

    }
}
