package br.com.kasolution.dominio;

public class Cliente {
    private static int ultimoCodigo = 0;
    private int codigo;
    private String nome;

    public Cliente(String nome) {
        this.codigo = ++ultimoCodigo;
        this.nome = nome;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
