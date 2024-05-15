package Testes;

public class Titulo {


        private String nome;
        private int anoDeLancamento;
        private boolean incluidoNoPlano;
        private double somaDasAvaliacoes;
        private int totalDeAvalicoes;
        private int duracaoEmMinutos;


    public Titulo(String nome, int anoDeLancamento, boolean incluidoNoPlano, double somaDasAvaliacoes, int totalDeAvalicoes, int duracaoEmMinutos) {
        this.nome = nome;
        this.anoDeLancamento = anoDeLancamento;
        this.incluidoNoPlano = incluidoNoPlano;
        this.somaDasAvaliacoes = somaDasAvaliacoes;
        this.totalDeAvalicoes = totalDeAvalicoes;
        this.duracaoEmMinutos = duracaoEmMinutos;
    }
}
