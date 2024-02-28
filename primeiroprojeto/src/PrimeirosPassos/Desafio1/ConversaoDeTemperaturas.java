package PrimeirosPassos.Desafio1;

public class ConversaoDeTemperaturas {
    public static void main(String[] args) {

        double temperaturaEmCelsius = 20.0;
        double temperaturaEmFahrenheit = (temperaturaEmCelsius * 1.8)+32;
        String mensagem = String.format("A temperatura de %f Celsius é equivalente a %f Fahrenheit",temperaturaEmCelsius,temperaturaEmFahrenheit);
        System.out.println(mensagem);

        int temperaturaEmFahrenheitInteira = (int) temperaturaEmFahrenheit;
        System.out.println("A temperatura em Fahrenheit inteira é: " + temperaturaEmFahrenheitInteira);

    }
}
