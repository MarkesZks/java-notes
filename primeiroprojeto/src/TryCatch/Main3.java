package TryCatch;


import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;
import java.lang.foreign.PaddingLayout;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner leitura = new Scanner(System.in);
        System.out.println("Informe seu usuario do GITHUB");
        String user = leitura.nextLine();
        String addres="https://api.github.com/users/"+user;
        try{
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(addres))
                    .header("Accept", "application/vnd.github.v3+json")
                    .build();

            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());

            if(response.statusCode() ==404){
                throw new ErroConsultaGitHubException("Usuario não encontrado no GitHub");
            }
            String json = response.body();
            System.out.println(json);
            Gson gson = new GsonBuilder().create();
            UserGitHubAPI myUserGit =  gson.fromJson(json,UserGitHubAPI.class);
            User myUser = new User(myUserGit);

            System.out.println("Login: "+myUser.getUser());
            System.out.println("Id: "+myUser.getId());


        }catch (ErroConsultaGitHubException e){
            System.out.println(e.getMessage());
        }
    }
}
