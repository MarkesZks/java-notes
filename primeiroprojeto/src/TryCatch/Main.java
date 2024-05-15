package TryCatch;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        System.out.println("Calculadora de Divisão\n Informe o primeiro numero");
        int num1 = leitura.nextInt();
        System.out.println("Informe o segundo numero: ");
        int num2 = leitura.nextInt();

        try{
            double result = num1/num2;
            System.out.println("O valor é "+ result);
        }catch(ArithmeticException e){
            System.out.println("Houve um erro Aitimetico,Zero não pode ser dividido");

        }

    }
}
