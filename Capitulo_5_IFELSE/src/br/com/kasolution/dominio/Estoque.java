package br.com.kasolution.dominio;

public class Estoque {

    public Produto produto;
    {
        produto = new Produto();
        produto.nome = "Notebook";
        produto.quantidadeEstoque = 200;
        produto.valorUnitario = 1500.00;
    }

}
