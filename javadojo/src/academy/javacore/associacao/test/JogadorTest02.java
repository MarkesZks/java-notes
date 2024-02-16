package academy.javacore.associacao.test;

import academy.javacore.associacao.domain.Jogador;
import academy.javacore.associacao.domain.Time;

public class JogadorTest02 {
    public static void main(String[] args) {
        Jogador jogador = new Jogador("Cafu");
        Time time = new Time("Brasil");

        jogador.setTime(time);
        Jogador[] jogadores= {jogador};

        time.setJogadores(jogadores);
        System.out.println("----Jogador----");
        jogador.imprime();
        System.out.println("----Time----");
        time.imprime();
    }
}
