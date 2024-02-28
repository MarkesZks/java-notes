package PrimeirosPassos.Desafio1;

import java.util.Scanner;

public class ContaBancaria {
    public static void main(String[] args) {
        /*
        * Dados Inciais do cliente
        * Nome
        * Tipo da conta
        * Saldo inicial
        *
        *
        * Operaçoes
        * 1Consultar saldos
        * 2Receber valor
        * 3Transferir valor
        * 4Sair
        * */
        String nome= "Gabriel";
        String tipoDaConta = "Corrente";
        double saldo= 1599.99;
        double valorAReceber = 0;
        double transferencia = 0;
        int operacao = 0;

        Scanner leitor = new Scanner(System.in);

        System.out.println("-------------------");
        System.out.println("Nome: "+nome);
        System.out.println("Tipo da Conta: " + tipoDaConta);
        System.out.println("Saldo inicial: " + saldo);





        while (operacao !=4) {
            System.out.println("-------------------");
            System.out.println("1- Consultar Saldos");
            System.out.println("2- Receber valor");
            System.out.println("3- Transferir valor");
            System.out.println("4- Sair");
            System.out.println("-------------------");
            operacao = leitor.nextInt();
            if (operacao == 1) {
                System.out.println("Seu saldo é : \n" + saldo);
            } else if (operacao == 2) {
                System.out.println("Informe o valor de deseja receber : ");
                valorAReceber = leitor.nextDouble();
                saldo += valorAReceber;
                System.out.println("Recebimento feito com Sucesso!");
            } else if (operacao ==3){
                System.out.println("informe o valor que voce deseja transferir: ");
                transferencia = leitor.nextDouble();
                if (transferencia > saldo){
                    System.out.println("Saldo não disponivel");
                }else {
                    saldo -= transferencia;
                    System.out.println("Transferencia feita com Sucesso!");
                }

            }
        }
        System.out.println("Obrigado por usar nosso banco C=");

    }
}
