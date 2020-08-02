package br.com.kasolution.teste;

import br.com.kasolution.dominio.Banco;
import static br.com.kasolution.dominio.Banco.CORRECAO_MENSAL;
import br.com.kasolution.dominio.Conta;
import static br.com.kasolution.simuladores.Simulador.*;
import br.com.kasolution.util.Dados;
import static br.com.kasolution.util.Formata.moeda;

public class TesteSimulaValorDesejado {

    public static void main(String[] args) {
        Banco banco = Dados.getDados();
        Conta conta = banco.getConta(2);
        double valorDesejado = 35000.00;
        int meses = simulaAplicacaoDesejada(
                conta, CORRECAO_MENSAL, valorDesejado);
        System.out.printf("Simulação de valor desejado %s => %d meses\n", moeda(valorDesejado), meses);
    }

}
