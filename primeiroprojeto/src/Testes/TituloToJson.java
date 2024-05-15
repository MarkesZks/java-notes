package Testes;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;

public class TituloToJson {
    public static void main(String[] args) throws IOException {

        Titulo titulo = new Titulo("Matrix",2000,true,5,50,50);

        Gson gson = new GsonBuilder()
                .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
                .setPrettyPrinting()
                .create();

        FileWriter escrita = new FileWriter("filmes.json");
        escrita.write(gson.toJson(titulo));
        escrita.close();
        System.out.println("Json Criado com sucesso!");


    }
}
