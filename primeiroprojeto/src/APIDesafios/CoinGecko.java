package APIDesafios;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class CoinGecko {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner leitura = new Scanner(System.in);
        System.out.println("Escolha um cripto moeda: ");
        var pesquisa = leitura.nextLine();
        String endereco = "https://api.coingecko.com/api/v3/simple/price?ids="+pesquisa+"&vs_currencies=usd";

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder().uri(URI.create(endereco)).build();

        HttpResponse<String> response= client.send(request, HttpResponse.BodyHandlers.ofString());

        System.out.println(response.body());


    }
}
