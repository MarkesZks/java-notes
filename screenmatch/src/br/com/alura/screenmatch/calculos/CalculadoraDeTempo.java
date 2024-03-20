package br.com.alura.screenmatch.calculos;

import br.com.alura.screenmatch.model.Filme;
import br.com.alura.screenmatch.model.Serie;
import br.com.alura.screenmatch.model.Titulo;

public class CalculadoraDeTempo {
    private int tempoTotal;

    public int getTempoTotal() {
        return tempoTotal;
    }


//    public void inclui(Filme f){
//        this.tempoTotal += f.getDuracaoEmMinutos();
//
//    }
//    public void inclui(Serie s){
//        this.tempoTotal += s.getDuracaoEmMinutos();
//
//    }
    public void inclui(Titulo titulo){
        System.out.println("Adicionando duração em minutos de "+ titulo);
        this.tempoTotal += titulo.getDuracaoEmMinutos();
    }
}
