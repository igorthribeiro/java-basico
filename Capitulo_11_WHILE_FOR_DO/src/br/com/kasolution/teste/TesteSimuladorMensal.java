package br.com.kasolution.teste;

import br.com.kasolution.dominio.Banco;
import br.com.kasolution.dominio.Conta;
import static br.com.kasolution.simuladores.Simulador.*;
import br.com.kasolution.util.Dados;
import static br.com.kasolution.util.Formata.moeda;

public class TesteSimuladorMensal {

    public static void main(String[] args) {
        Banco banco = Dados.getDados();
        Conta conta = banco.getConta(2);//Renato
        int meses = 7;
        double valorFinal = 
                simulaAplicacaoMensal(conta,
                        Banco.CORRECAO_MENSAL, meses);
        System.out.printf("Cliente: %s\n", conta.getCliente().getNome());
        System.out.printf("Simulação de investimento para %d meses: %s\n", meses, moeda(valorFinal));
    }
    
}
