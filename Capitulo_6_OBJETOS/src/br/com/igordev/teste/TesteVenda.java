package br.com.igordev.teste;

import br.com.igordev.dominio.Cliente;
import br.com.igordev.dominio.Produto;
import br.com.igordev.dominio.Venda;
import java.util.Date;
import java.util.Scanner;

public class TesteVenda {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("[ SISTEMA DE E-COMMERCE KA ]\n");

        Cliente cliente = new Cliente();
        System.out.print("Cod.Cliente: ");
        cliente.codigo = sc.nextInt();
        System.out.print("1º Nome: ");
        cliente.nome = sc.next();

        System.out.print("Quantos produtos: ");
        int qtdProdutos = sc.nextInt();

        //informações da venda
        Venda venda = new Venda();
        venda.data = new Date(); //pega data automático
        venda.cliente = cliente;
        
        System.out.println("\n[- Lista de produtos -]");
        int idx = 0;
        venda.produtos = new Produto[qtdProdutos];
        while (idx < qtdProdutos) {
            venda.produtos[idx] = new Produto();
            System.out.print("\nProduto " + (idx+1));
            System.out.print(" descrição: ");
            venda.produtos[idx].nome = sc.next();
            System.out.print("Valor: ");
            venda.produtos[idx].valor = sc.nextDouble();
            idx++; //próximo produto
        } //fim for

        venda.calculaTotal(); //calcular total da venda;
        venda.imprime();
    }

}
