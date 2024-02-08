package academy.javacore.intclasses.domain;

public class Estudante {
    public String nome;
    public int idade;
    public char sexo;

    public void imprime(){
        System.out.println("Nome:"+this.nome);
        System.out.println("idade:"+this.idade);
        System.out.println("sexo:"+this.sexo);
    }
}
