package br.com.alura.screenmatch.exececao;

public class ErroDeConversaoDeAnoExeception extends RuntimeException {
    private String mensagem;

    public ErroDeConversaoDeAnoExeception(String mensagem) {
        this.mensagem = mensagem;

    }

    public String getMensagem() {
        return this.mensagem;
    }
}
