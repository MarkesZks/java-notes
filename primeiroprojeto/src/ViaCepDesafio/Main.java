package ViaCepDesafio;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {

        Scanner leitura = new Scanner(System.in);
        ConsultaCep consultaCep = new ConsultaCep();

        System.out.println("Informe seu CEP");
        var cep = leitura.nextLine();
try{

    Endereco endereco = consultaCep.buscaEndereco(cep);
    CriarAquivoCep novoArquivo = new CriarAquivoCep();
    novoArquivo.criaArquivo(endereco);

}
catch (RuntimeException | IOException e){
    System.out.println(e.getMessage());
}}}




