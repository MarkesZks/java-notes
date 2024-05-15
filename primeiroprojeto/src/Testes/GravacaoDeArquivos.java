package Testes;

import java.io.FileWriter;
import java.io.IOException;

public class GravacaoDeArquivos {
    public static void main(String[] args) throws IOException {

        FileWriter escreva = new FileWriter("arquivo.txt");
        escreva.write("Conteudo a ser gravado no arquivo");
        escreva.close();
    }
}
