package academy.javacore.SobrecargaMetodos.dominio;

public class Anime {
    private String nome;
    private String tipo;
    private int episodios;
    private String genero;

    public Anime(){ // Um construtor

    }

    public void init(String nome, String tipo, int episodios){
        this.nome = nome;
        this.tipo= tipo;
        this.episodios= episodios;

    }
    public void init(String nome, String tipo, int episodios,String genero){ //Sobrecarga de metodos
        this.init(nome,tipo,episodios);
        this.genero= genero;
    }
    public void  imprime(){
        System.out.println(this.nome);
        System.out.println(this.tipo);
        System.out.println(this.episodios);
        System.out.println(this.genero);

    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setTipo(String tipo){
        this.tipo =tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setEpisodios(int episodios) {
        this.episodios = episodios;
    }

    public int getEpisodios() {
        return episodios;
    }
}
