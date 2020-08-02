package br.com.igordev.dominio;

public class Cliente {
    //atributo
    public int codigo;
    public String nome;

    //metodos
    public void imprime() {
        System.out.println("Cliente: #" + codigo);
        System.out.println("Nome: " + nome);
    }
}
