package academy.javacore.SobrecargaMetodos.test;

import academy.javacore.SobrecargaMetodos.dominio.Anime;

public class AnimeTest {
    public static void main(String[] args) {
        Anime anime = new Anime();
        anime.init("Boku no pico","TV",18, "genero");

        anime.imprime();

    }
}
