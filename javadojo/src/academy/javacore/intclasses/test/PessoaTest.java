package academy.javacore.intclasses.test;

import academy.javacore.intclasses.domain.Pessoa;

public class PessoaTest {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        pessoa.setIdade(80);
        pessoa.setNome("Zé da manga");


        pessoa.imprime();


    }
}
