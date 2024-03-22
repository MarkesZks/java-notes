package PrimeirosPassos.Desafio12;

public class Circulo implements Forma{
double raio;



    @Override
    public double calcularArea() {
        return Math.PI*Math.pow(raio,2);
    }
}
