package academy.javacore.construtores.dominio;

public class Anime {
    private String nome;
    private String tipo;
    private int episodios;
    private String genero;
    private  String estudio;


    //Contrutores são usados para definir regras para os metodos
    public Anime(String nome,String tipo, int episodios,String genero){// Um construtor, não pode ter retorno se não ira virar um metodo
        this.nome = nome; //Dessa forma voce obrigad a ser inicialazado com um nome
        this.tipo= tipo;
        this.episodios= episodios;
        this.genero= genero;
    }
    public Anime(String nome,String tipo, int episodios,String genero,String estudio){// Um construtor, não pode ter retorno se não ira virar um metodo
        this(nome,tipo,episodios,genero);//Sobrecarga de Construtor | Precisa ser a primeira linha
        this.estudio= estudio;
    }

    public void  imprime(){
        System.out.println(this.nome);
        System.out.println(this.tipo);
        System.out.println(this.episodios);
        System.out.println(this.genero);
        System.out.println(this.estudio);

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
