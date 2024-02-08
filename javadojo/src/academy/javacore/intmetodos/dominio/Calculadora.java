package academy.javacore.intmetodos.dominio;

public class Calculadora {

    public void somaDoisNumeros(){
        System.out.println(10+10);

    }
    public void subtraiDoisNumeros(){
        System.out.println(10-5);

    }
    public void multiplicaDoisNumeros(int n1, int n2){
        System.out.println(n1 *n2);

    }
    public double dividaDoisNumeros(double n1, double n2){
        if (n1 == 0|| n2==0 ){
            return 0;
        }
        return n1/n2;
    }
    public void alteraDoisNumeros(int n1, int n2){
        n1 = 99;
        n2 = 33;
        System.out.println("Dentro do altera dois numeros");
        System.out.println("Num1"+ n1);
        System.out.println("Num2"+ n2);

    }
    public void somaArray(int [] numeros){
        int soma =0;
        for (int num :numeros) {
            soma += num;

        }
        System.out.println(soma);
    }

public void somaVarArgs(int... numeros){
    int soma =0;
    for (int num :numeros) {
        soma += num;

    }
    System.out.println(soma);
}
}
