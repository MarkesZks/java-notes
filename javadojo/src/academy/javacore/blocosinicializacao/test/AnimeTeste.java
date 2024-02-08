package academy.javacore.blocosinicializacao.test;

import academy.javacore.blocosinicializacao.dominio.Anime;

public class AnimeTeste {
    public static void main(String[] args) {
        Anime anime = new Anime();

        for (int episodio:anime.getEpisodios()) {
            System.out.print(episodio+ " ");

        }
    }
}
