package academy.javacore.intclasses.test;

import academy.javacore.intclasses.domain.Estudante;

public class EstudanteTeste {

    public static void main(String[] args) {
        Estudante estudante = new Estudante();
      //  Estudante estudante2 = new Estudante();

        estudante.nome = "Gabriel";
        estudante.idade = 19;
        estudante.sexo = 'M';
        estudante.imprime();

      /*  System.out.println(estudante.nome);
        System.out.println(estudante.idade);
        System.out.println(estudante.sexo);*/


    }

}
