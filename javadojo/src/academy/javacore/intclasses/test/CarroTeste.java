package academy.javacore.intclasses.test;

import academy.javacore.intclasses.domain.Carro;

public class CarroTeste {
    public static void main(String[] args) {
        Carro carro = new Carro();
        Carro carro1 = new Carro();
        carro.nome = "HB20";
        carro.modelo = "Ford Ka";
        carro.ano = 2010;
        System.out.println(carro.nome);
        System.out.println(carro.modelo);
        System.out.println(carro.ano);

        carro= carro1; // Referencia de objeto


        carro1.nome = "Gol sapão";
        carro1.modelo = "Gol";
        carro1.ano = 2000;
        System.out.println(carro1.nome);
        System.out.println(carro1.modelo);
        System.out.println(carro1.ano);

    }
}
