package academy.javacore.associacao.test;

import academy.javacore.associacao.domain.Jogador;
import academy.javacore.associacao.domain.Time;

public class JogadorTest01 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Pelé");
        Time time = new Time("Corinthians");
        jogador1.setTime(time);
        jogador1.imprime();
    }
}
