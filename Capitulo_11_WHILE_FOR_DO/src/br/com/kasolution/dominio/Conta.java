package br.com.kasolution.dominio;

import static br.com.kasolution.util.Formata.*;

public class Conta {
    private String numero;
    private Cliente cliente;
    private double saldo;

    public Conta(String numero, Cliente cliente, double saldo) {
        this.numero = numero;
        this.cliente = cliente;
        if (saldo >= 0) {
            this.saldo = saldo;
        } else {
            this.saldo = 0;
        }
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public double getSaldo() {
        return saldo;
    }

    //depositar / sacar
    public void deposita(double valor) {
        if (valor > 0) {
            saldo += valor;
        }//fim if
    }//fim deposita
    
    public void saca(double valor) {
        if (valor > 0) {
            saldo -= valor;
        }//fim if
    }//fim saca  

    public void imprime() {
        System.out.println("Conta: " + numero);
        System.out.println("Cliente: " + cliente.getNome());
        System.out.println("Saldo: " +
                moeda(saldo) + "\n");
    }
}//fim classe


