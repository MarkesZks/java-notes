package academy.javacore.associacao.test;

import academy.javacore.associacao.domain.Jogador;

import java.util.Arrays;

public class JogadorTest {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Pelé");
        Jogador jogador2 = new Jogador("Romario");
        Jogador jogador3 = new Jogador("Vini Junior");
        Jogador[] jogadores = {jogador1,jogador2,jogador3};
        for (Jogador jogador : jogadores){
            jogador.imprime();
        }

    }
}
