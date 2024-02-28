package PrimeirosPassos.Desafio2;

public class IdadePessoa {
    private int idade;
    private String nome;

    public void verificarIdade(){
        if (idade>18){
            System.out.println("Voce é maior de idade");
        }else {
            System.out.println("Menor de idade");
        }
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
