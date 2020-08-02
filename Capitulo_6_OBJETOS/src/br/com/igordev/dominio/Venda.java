package br.com.igordev.dominio;

import java.util.Date;

public class Venda {
    //atributos
    public Date data;
    public Cliente cliente;
    public Produto[] produtos;
    public double total;
    
    public void calculaTotal() {
        double totalProdutos = 0;
        for (Produto p : produtos) {
            totalProdutos += p.valor;
        }
        total = totalProdutos;
    }//fim calculaTotal
    
    public void imprime() {
        System.out.println("\n\n**** VENDA FINALIZADA ****");
        System.out.println("Data: " + data);
        System.out.println("Dados Cliente: ");
        cliente.imprime();
        System.out.println("[- Lista de Produtos -]");
        for (Produto p : produtos) {
            p.imprime();
        }
        System.out.println("Total: " + total);
    }//fim imprime
}//fim classe









