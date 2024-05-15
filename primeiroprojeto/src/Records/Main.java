package Records;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

/*
* 
* */
public class Main {
    public static void main(String[] args) {

        String json = """
          {
            "nome" : "João",
            "idade" : 30,
            "cidade" : "Ferraz De Vasconcelos"
          }
        """;
        Gson gson = new GsonBuilder().setLenient().create();
        Pessoa pessoa = gson.fromJson(json, Pessoa.class);
        System.out.println(pessoa);
    }
}
