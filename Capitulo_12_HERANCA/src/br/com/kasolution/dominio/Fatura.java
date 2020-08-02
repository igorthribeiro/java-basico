package br.com.kasolution.dominio;

import static br.com.kasoluion.util.Formata.moeda;

public class Fatura implements Pagavel {
    
    private static int ultimoNumero = 0;
    
    private int numero;
    private String descricao;
    private int quantidadeItem;
    private double valorUnitario;

    public Fatura(String descricao, int quantidadeItem, double valorUnitario) {
        this.numero = ++ultimoNumero;
        this.descricao = descricao;
        this.quantidadeItem = quantidadeItem;
        this.valorUnitario = valorUnitario;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getQuantidadeItem() {
        return quantidadeItem;
    }

    public void setQuantidadeItem(int quantidadeItem) {
        this.quantidadeItem = quantidadeItem;
    }

    public double getValorUnitario() {
        return valorUnitario;
    }

    public void setValorUnitario(double valorUnitario) {
        this.valorUnitario = valorUnitario;
    }

    @Override
    public void imprime() {
        System.out.println("Fatura: " + numero);
        System.out.println("Descrição: " + descricao);
        System.out.println("Quantidade: " + quantidadeItem);
        System.out.println("Vl.Unitário: " + valorUnitario);
    }

    @Override
    public String toString() {
        return new StringBuilder("Fatura: ").append(numero)
                .append(" Descrição: ").append(descricao)
                .append(" Quantidade: ").append(quantidadeItem)
                .append(" Vl.Unitário: ").append(moeda(valorUnitario))
                .toString();
    }   
    

    @Override
    public double calculaValorPagamento() {
        double total = quantidadeItem * valorUnitario;
        return total;
    }
}
