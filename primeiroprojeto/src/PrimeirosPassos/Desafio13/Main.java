package PrimeirosPassos.Desafio13;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ContaBancaria conta1 = new ContaBancaria();
        conta1.setNumeroDaConta(151515152);

        conta1.setSaldo(2000.00);
        ContaBancaria conta2 = new ContaBancaria();
        conta2.setNumeroDaConta(140015565);
        conta2.setSaldo(0);


        ContaBancaria conta3 = new ContaBancaria();
        conta3.setNumeroDaConta(001003005004);
        conta3.setSaldo(100.00);

        ContaBancaria conta4 = new ContaBancaria();
        conta4.setNumeroDaConta(1238885554);
        conta4.setSaldo(9999.00);

        ArrayList<ContaBancaria> listaDeContasBancarias = new ArrayList<>();

        listaDeContasBancarias.add(conta1);
        listaDeContasBancarias.add(conta2);
        listaDeContasBancarias.add(conta3);
        listaDeContasBancarias.add(conta4);

        ContaBancaria contaMaiorSaldo = listaDeContasBancarias.get(0);
        for (ContaBancaria contas:listaDeContasBancarias) {
            if (contas.getSaldo()>contaMaiorSaldo.getSaldo())
                contaMaiorSaldo = contas;

        }
        System.out.println("A Maior conta é " + contaMaiorSaldo.getSaldo());


    }
}
