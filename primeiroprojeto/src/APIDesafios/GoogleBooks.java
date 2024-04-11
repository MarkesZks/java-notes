package APIDesafios;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class GoogleBooks {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner leitura = new Scanner(System.in);
        System.out.println("Informe o nome do livro ");
        var pesquisa = leitura.nextLine();
        String apiKey ="AIzaSyDc4qwRgH0LU20cEmc_0fntqlkHaBjJvr4";

        String endereco = "https://www.googleapis.com/books/v1/volumes?q="+pesquisa+"&key="+apiKey;

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder().uri(URI.create(endereco)).build();

        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
        System.out.println(response.body());



    }
}
