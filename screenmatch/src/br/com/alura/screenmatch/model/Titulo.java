package br.com.alura.screenmatch.model;

public class Titulo implements Comparable<Titulo>{
    private String nome;
    private int anoDeLancamento;
    private boolean incluidoNoPlano;
    private double somaDasAvaliacoes;
    private int totalDeAvalicoes;
    private int duracaoEmMinutos;


    public Titulo(String nome, int anoDeLancamento) {
        this.nome = nome;
        this.anoDeLancamento = anoDeLancamento;
    }

    public String getNome() {
        return nome;
    }
    public int getAnoDeLancamento() {
        return anoDeLancamento;
    }

    public int getTotalDeAvalicoes() {
        return totalDeAvalicoes;
    }

    public double getSomaDasAvaliacoes() {
        return somaDasAvaliacoes;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setAnoDeLancamento(int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }

    public boolean isIncluidoNoPlano() {
        return incluidoNoPlano;
    }

    public void setIncluidoNoPlano(boolean incluidoNoPlano) {
        this.incluidoNoPlano = incluidoNoPlano;
    }
    public int getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }

    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    public void exibeFichaTecnica() {

        System.out.println("Nome do filme: " + this.nome);
        System.out.println("Ano de Lançamento: " + this.anoDeLancamento);
        System.out.println("Avaliação: " + this.somaDasAvaliacoes);
        System.out.println("Duração em Minutos: " + this.duracaoEmMinutos);
    }

    public void avaliar(double nota) {
        somaDasAvaliacoes += nota;
        totalDeAvalicoes++;
    }

    public double pegaMedia() {
        return somaDasAvaliacoes / totalDeAvalicoes;
    }

    @Override
    public int compareTo(Titulo outroTitulo) {
        return this.getNome().compareTo(outroTitulo.getNome());
    }
}
