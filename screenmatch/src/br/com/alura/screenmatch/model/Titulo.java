package br.com.alura.screenmatch.model;

import br.com.alura.screenmatch.exececao.ErroDeConversaoDeAnoExeception;
import com.google.gson.annotations.SerializedName;

public class Titulo implements Comparable<Titulo>{
    //@SerializedName("Title") // Nome que esta vindo no Json
    private String nome;
    //@SerializedName("Year")
    private int anoDeLancamento;
    private boolean incluidoNoPlano;
    private double somaDasAvaliacoes;
    private int totalDeAvalicoes;
    private int duracaoEmMinutos;


    public Titulo(String nome, int anoDeLancamento) {
        this.nome = nome;
        this.anoDeLancamento = anoDeLancamento;
    }

    public Titulo(TituloOmdb meuTituloOmdb) {
        this.nome = meuTituloOmdb.title();
        if (meuTituloOmdb.year().length() > 4){
            throw new ErroDeConversaoDeAnoExeception("Não consegui converter o ano" +
                    "porque tem mais de 04 caracteres");
        }
        this.anoDeLancamento = Integer.valueOf(meuTituloOmdb.year());
        this.duracaoEmMinutos = Integer.valueOf(meuTituloOmdb.runtime().substring(0,2));
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

    @Override
    public String toString() {
        return   "(nome='" + nome + '\'' +
                ", anoDeLancamento=" + anoDeLancamento+","+
                "Duração= "+ duracaoEmMinutos + ")";

    }
}
