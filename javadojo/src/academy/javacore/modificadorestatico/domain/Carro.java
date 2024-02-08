package academy.javacore.modificadorestatico.domain;

public class Carro {
    private String nome;
    private double velociadadeMaxima;
    private static double velocidadeLimite = 250;

    public Carro(String nome, double velociadadeMaxima) {
        this.nome = nome;
        this.velociadadeMaxima = velociadadeMaxima;

    }

    public void imprime() {
        System.out.println("-----------");
        System.out.println("Nome " + this.nome);
        System.out.println("Velocidade maxima " + this.velociadadeMaxima);
        System.out.println("Velocidade Limite " + this.velocidadeLimite);
    }

    public static void setVelocidadeLimite(double velocidadeLimite) {
        Carro.velocidadeLimite = velocidadeLimite;
    }

    public static double getVelocidadeLimite() {
        return velocidadeLimite;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getVelociadadeMaxima() {
        return velociadadeMaxima;
    }

    public void setVelociadadeMaxima(double velociadadeMaxima) {
        this.velociadadeMaxima = velociadadeMaxima;
    }

}



