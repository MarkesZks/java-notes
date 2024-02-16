package academy.javacore.associacao.test;

import academy.javacore.associacao.domain.Escola;
import academy.javacore.associacao.domain.Professor;

public class EscolaTest01 {
    public static void main(String[] args) {
        Professor professor1 = new Professor("Adilson");
        Professor professor2 = new Professor("Godinho");
        Professor[] professores = {professor1,professor2};
        Escola escola1 = new Escola("Sesi",professores);
        escola1.imprime();
    }
}
