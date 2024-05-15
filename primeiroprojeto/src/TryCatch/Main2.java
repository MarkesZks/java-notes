package TryCatch;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);

        System.out.println("informe a senha (pelo menos 8 caracteres)");
        String senha = leitura.next();
        try{
            verificarSenha(senha);

        } catch (SenhaInvalidaException e){
        System.out.println(e.getMensagem());
        }

    }

    public static void verificarSenha(String senha) throws SenhaInvalidaException  {
        if (senha.length() < 8) {
            throw new SenhaInvalidaException("A senha precisa ter mais de 08 caracteres");
        }
    }
}

