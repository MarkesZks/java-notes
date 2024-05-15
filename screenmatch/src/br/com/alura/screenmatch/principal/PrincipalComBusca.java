package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.exececao.ErroDeConversaoDeAnoExeception;
import br.com.alura.screenmatch.model.Titulo;
import br.com.alura.screenmatch.model.TituloOmdb;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URI;
import java.net.URLEncoder;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrincipalComBusca {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner leitura = new Scanner(System.in);
        var busca  = "";
        List<Titulo> titulos = new ArrayList<>();
        Gson gson = new GsonBuilder()
                .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
                .setPrettyPrinting()
                .create();
        while (!busca.equalsIgnoreCase("sair")){
        System.out.println("Digite um filme para busca");

        busca  = leitura.nextLine();

        if (busca.equalsIgnoreCase("sair")){
            break;
        }
        String apikey = "ed83a12c";

        String endereco = "https://www.omdbapi.com/?t="+busca.replace(" ", "%20")+"&apikey="+apikey+"";
        try{

            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(endereco))
                    .build();

            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
            String json = response.body();
            System.out.println(json);


            TituloOmdb meuTituloOmdb = gson.fromJson(json,TituloOmdb.class);
            System.out.println(meuTituloOmdb);

            Titulo meuTitulo = new Titulo(meuTituloOmdb);
            System.out.println("Titulo já convertido ");
            System.out.println(meuTitulo);

            titulos.add(meuTitulo);
        }
        catch (NumberFormatException e){
            System.out.println("Aconteceu um erro: ");
            System.out.println(e.getMessage());
        }
        catch (IllegalArgumentException e){
            System.out.println("Erro de argumento");
        }
        catch (ErroDeConversaoDeAnoExeception e){
            System.out.println(e.getMensagem());
        }
        }
        System.out.println(titulos);
        FileWriter escrita = new FileWriter("filmes.json");
        escrita.write(gson.toJson(titulos));
        escrita.close();

        System.out.println("Programa finalizou corretamente");





    }

}

