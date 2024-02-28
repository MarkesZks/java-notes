package PrimeirosPassos.Desafio4;

public class Main {
    public static void main(String[] args) {

        ModeloCarro meuCarro = new ModeloCarro();
        meuCarro.definirmodelo("Ret");
        meuCarro.definirPrecos(5000,8000,20000);
        meuCarro.exibirInfo();
    }
}
