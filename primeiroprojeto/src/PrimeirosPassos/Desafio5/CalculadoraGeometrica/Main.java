package PrimeirosPassos.Desafio5.CalculadoraGeometrica;

public class Main {
    public static void main(String[] args) {

        CalculadoraSalaRetangular calculadora = new CalculadoraSalaRetangular();
        System.out.println("A area é : "+ calculadora.calcularArea(10,20));
        System.out.println("O perimetro é: "+calculadora.calcularPerimetro(10,20));
    }
}
