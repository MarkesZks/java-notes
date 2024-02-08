package academy.javacore.intmetodos.test;

import academy.javacore.intmetodos.dominio.Calculadora;

public class CalculadoraTeste {
    public static void main(String[] args) {
       Calculadora calculadora = new Calculadora();
       /*calculadora.somaDoisNumeros();// metodo
        calculadora.subtraiDoisNumeros();
        calculadora.multiplicaDoisNumeros(50,2);
       double result =  calculadora.dividaDoisNumeros(20,2);
        System.out.println(result);*/
    /*
        int n1 = 1;
        int n2 = 2;
        calculadora.alteraDoisNumeros(n1,n2);
*/


    int [] numeros = {1,2,3,4,5};
    calculadora.somaArray(numeros);
    calculadora.somaVarArgs(1,2,3,4,5);

    }
}
