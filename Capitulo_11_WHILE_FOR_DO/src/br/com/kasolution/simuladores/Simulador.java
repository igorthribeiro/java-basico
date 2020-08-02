package br.com.kasolution.simuladores;

import br.com.kasolution.dominio.Conta;

public class Simulador {

    public static double simulaAplicacaoMensal(Conta conta, double rendimento, int meses) {
        double valorInicial = conta.getSaldo();
        for (int i = 1; i <= meses; i++) {
            valorInicial *= rendimento;
        }
        return valorInicial; //valor corrigido
    }//fim simulaMensal

    public static int simulaAplicacaoDesejada(Conta conta, double rendimento, double valorDesejado) {
        double valorInicial = conta.getSaldo();
        int meses = 0;
        do {
            valorInicial *= rendimento; //correção
            meses++; //acumula mês
        } while (valorInicial < valorDesejado);
        return meses;
    }//fim simulaDesejada

    public static int simulaAplicacaoPromocional(
            Conta conta, double rendimento, double valorDesejado) {
        double valorInicial = conta.getSaldo();
        int meses = 0;
        while (valorInicial < valorDesejado) {
            valorInicial *= rendimento; //correção
            meses++; //acumula mês
        }//fim while
        return meses;
    }//fim simulaPromocional

}//fim classe

