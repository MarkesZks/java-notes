package Testes;

import java.io.FileWriter;

public class CriacaoArquivos {

        public static void main(String[] args) {
            try {
                FileWriter writer = new FileWriter("arquivo");

                writer.write("Hello");
                writer.close();
                writer.write(" World!");
                writer.close();
                System.out.println("Arquivo criado");
            } catch (Exception e) {
                System.out.println("Erro!");
            }

    }
}
