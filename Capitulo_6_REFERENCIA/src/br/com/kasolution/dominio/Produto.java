package br.com.kasolution.dominio;

public class Produto {
    public String nome;
    public double valor;
    
    public void testeLocal() {
        int x = 50; //x == 50
        int y = x;  //y == 50
        x = 20;     //x == 20
        System.out.println("O valor de Y é: " + y);
    }
}
