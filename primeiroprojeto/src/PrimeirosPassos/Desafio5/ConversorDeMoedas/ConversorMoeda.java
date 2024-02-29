package PrimeirosPassos.Desafio5.ConversorDeMoedas;

public class ConversorMoeda implements ConversaoFinanceira {

    double contacaoDolar;
    double valorReal;

    @Override
    public double converterDolarParaReal(double valorDolar) {
        contacaoDolar = 4.97;
        return valorReal = valorDolar * contacaoDolar;
    }
}
