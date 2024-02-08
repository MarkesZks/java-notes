package academy.javacore.construtores.test;

import academy.javacore.construtores.dominio.Anime;

public class AnimeTest {
    public static void main(String[] args) {
        Anime anime = new Anime("Boku no pico","TV",18, "genero","estudio");

        anime.imprime();

    }
}
