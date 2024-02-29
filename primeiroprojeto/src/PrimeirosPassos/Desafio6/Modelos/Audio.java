package PrimeirosPassos.Desafio6.Modelos;

public class Audio {
    private String titulo;
    private int totalDeReproducoes;
    private int curtidas;
    private int classificacao;


    public void curtir(){
        this.curtidas++;
        System.out.println("O total de Curtidas é "+ this.curtidas);
    }
    public void reproduzir(){
        this.totalDeReproducoes++;
        System.out.println("O total de reproduçoes é "+ this.totalDeReproducoes);
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getTotalDeReproducoes() {
        return totalDeReproducoes;
    }

    public int getCurtidas() {
        return curtidas;
    }

    public int getClassificacao() {
        return classificacao;
    }




}
