package Testes;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class VeiculoToJson {
    public static void main(String[] args) throws IOException {
        Veiculo carro = new Veiculo();
        carro.setMarca("Chevrole");
        carro.setModelo("Astra");
        carro.setAnoFabricacao(1995);
        carro.setPreco(2500.00);

        Gson gson = new GsonBuilder()
                .setPrettyPrinting()
                .create();

        FileWriter escreva = new FileWriter("veiculos.json");
        escreva.write(gson.toJson(carro));
        escreva.close();
        System.out.println("Veiculo criado com sucesso");




    }
}
