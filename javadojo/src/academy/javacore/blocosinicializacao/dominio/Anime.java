package academy.javacore.blocosinicializacao.dominio;

public class Anime {
    private String nome;
    private int[] episodios ;
    //Bloco de inicialização ou Instacia
    //A difereça é que ele não precisa ser inicilizado denovo
    {
        System.out.println("Bloco de Inicialização");
        episodios = new int[100];
        for (int i = 0; i < episodios.length ; i++) {
            episodios[i] = i+1;

        }
    }
   public Anime(String nome){
        this.nome = nome;

   }
    public Anime(){

        System.out.println(episodios);
        for (int episodio: this.episodios) {
            System.out.print(episodio+ " ");
            
        }
        System.out.println();

    }



    public int[] getEpisodios() {
        return episodios;
    }

}
