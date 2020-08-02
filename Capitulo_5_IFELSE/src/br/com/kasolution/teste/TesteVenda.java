package br.com.kasolution.teste;

import br.com.kasolution.dominio.Estoque;
import br.com.kasolution.dominio.Produto;
import java.util.Scanner;
//import java.lang.*;

public class TesteVenda {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //CTRL+SHIFT+I
        System.out.print("Informe a quantidade vendida: ");
        int qtdVendida = sc.nextInt();
        Estoque estoque = new Estoque();
        Produto produto = estoque.produto;
        
        if (produto.quantidadeEstoque >= qtdVendida) {
            System.out.println("Venda finalizada:");
            System.out.println("Produto vendido: " + produto.nome);
            double totalVenda = qtdVendida * produto.valorUnitario;
            System.out.println("Total da venda: " + totalVenda);
            System.out.println("Obrigado, volte sempre!");
            System.out.println("---------------------------------------------");
        } else {
            System.out.println("Quantide em estoque insuficiente!");
            System.out.println("Quantidade atual: " + produto.quantidadeEstoque);
        }
    }
    
}










