package br.com.kasolution.teste;

import br.com.kasolution.dominio.Banco;
import static br.com.kasolution.dominio.Banco.CORRECAO_MENSAL;
import br.com.kasolution.dominio.Conta;
import static br.com.kasolution.simuladores.Simulador.simulaAplicacaoPromocional;
import br.com.kasolution.util.Dados;

public class TesteSimulaPromocao {

    public static void main(String[] args) {
        Banco banco = Dados.getDados();
        double valorDesejado = 14_000.00;
        System.out.println("Simulador de promoção:\n");
        for (Conta c : banco.getContas()) {
            int meses = simulaAplicacaoPromocional(
                    c, CORRECAO_MENSAL, valorDesejado);
            if (meses == 0) {
                System.out.printf("Não ligar para o cliente: %s\n", c.getCliente().getNome());
            } else {
                System.out.printf("Ligar para %s e oferecer promoção de %d mes(es).\n",
                        c.getCliente().getNome(), meses);
            }//fim if
        }//fim for
    }//fim main

}
