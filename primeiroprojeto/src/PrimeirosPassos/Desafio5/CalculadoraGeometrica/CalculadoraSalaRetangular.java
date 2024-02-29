package PrimeirosPassos.Desafio5.CalculadoraGeometrica;

public class CalculadoraSalaRetangular implements CalculoGeometrico{
    double area;
    double perimetro;
    @Override
    public double calcularArea(double altura, double largura) {

        return area = altura*largura;
    }

    @Override
    public double calcularPerimetro(double altura, double largura) {

        return perimetro = (altura+largura)*2;
    }
}
