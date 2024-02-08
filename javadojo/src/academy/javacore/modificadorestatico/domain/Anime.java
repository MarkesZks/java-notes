package academy.javacore.modificadorestatico.domain;

public class Anime {
    private String nome;
    private static int[] episodios;

    //Bloco de inicialização
    static {
        System.out.println("Bloco de Inicialização");
        episodios = new int[100];
        for (int i = 0; i < episodios.length; i++) {
            episodios[i] = i + 1;

        }
    }

    public Anime(String nome) {
        this.nome = nome;

    }

    public Anime() {

        System.out.println(episodios);
        for (int episodio : Anime.episodios) {
            System.out.print(episodio + " ");

        }
        System.out.println();

    }


    public int[] getEpisodios() {
        return episodios;
    }

}
