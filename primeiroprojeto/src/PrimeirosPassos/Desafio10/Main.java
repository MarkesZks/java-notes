package PrimeirosPassos.Desafio10;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

       /* ArrayList<String> listaDeStrings = new ArrayList<>();
        listaDeStrings.add("Gabriel");
        listaDeStrings.add("Olivia");
        listaDeStrings.add("Beatriz");
        listaDeStrings.add("Garibaldo");

        for (String pessoa:listaDeStrings) {
            System.out.println(pessoa);}*/


Cachorro cachorro1 =new Cachorro("Pingo");
Cachorro cachorro2 =new Cachorro("Garibaldo");
Cachorro cachorro3 =new Cachorro("Sabia");

        ArrayList<Animal> listaDeAnimais = new ArrayList<>();
        listaDeAnimais.add((Animal)cachorro1);
        listaDeAnimais.add((Animal)cachorro2);
        listaDeAnimais.add((Animal)cachorro3);

        for (Animal bicho:listaDeAnimais) {
            if (bicho instanceof Cachorro cachorro){
                System.out.println(bicho.getNome());
            }

        }

    }



}
