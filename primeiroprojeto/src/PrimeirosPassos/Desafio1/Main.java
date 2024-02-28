package PrimeirosPassos.Desafio1;

public class Main {
    public static void main(String[] args) {

        int anoDeLancamento = 2022;
        boolean incluidoNoPlano = true;
        double notaDoFilme =  8.1;
        System.out.println("Esse é o Screen Match");
        System.out.println("Filme: Top Gun: Maverick");
        System.out.println("Ano de lançamento: "+anoDeLancamento);
        //Media calculada pelas 3 notas Jack, paulo e Suelem
        double media = (9.8 + 6.3 + 8.0) / 3;
        System.out.println(media);
        String sinopse;
        sinopse = """
                Filme Top Gun
                Filme de aventura com galã dos anos 80
                Ano de lançamento
                """ + anoDeLancamento;
        System.out.println(sinopse);
        int classificacao = (int) (media/2);
        System.out.println(classificacao);

        String saudacao = "Olá, meu nome é ";
        String nome = "Alice ";
        String continuacao = "e minha idade é ";
        int idade = 17;
        System.out.println(saudacao + nome + continuacao + idade);
    }

}