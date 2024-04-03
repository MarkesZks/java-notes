package PrimeirosPassos.Desafio15;

import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite o limite do cartão:");
        double limite = leitura.nextDouble();
        CartaoDeCredito cartao = new CartaoDeCredito(limite);

        int sair =1 ;
        while (sair!= 0){
            System.out.println("Digite a descrição da compra: ");
            String descricao = leitura.next();

            System.out.println("Digite o valor da compra: ");
            double valor = leitura.nextDouble();

            Compra compra = new Compra(descricao,valor);
            boolean compraRealizada = cartao.lancaCompra(compra);
            if (compraRealizada){
                System.out.println("Compra Realizada!");
                System.out.println("Digite 0 para sair ou 1 para continuar");
                sair=leitura.nextInt();

            }else {
                System.out.println("Saldo insuficiente!");
            }

        }
        System.out.println("********************");
        System.out.println("COMPRAS REALIZADAS:\n");
        Collections.sort(cartao.getCompras());
        for (Compra c: cartao.getCompras()) {

            System.out.println(c.getDescricao()+" - "+c.getValor());

        }
        System.out.println("********************");
        System.out.println("Saldo do cartão: "+cartao.getSaldo());


    }
}
