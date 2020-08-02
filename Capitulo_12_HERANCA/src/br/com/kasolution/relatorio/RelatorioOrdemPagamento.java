/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.kasolution.relatorio;

import static br.com.kasoluion.util.Formata.moeda;
import br.com.kasolution.dados.Dados;
import br.com.kasolution.dominio.Fatura;
import br.com.kasolution.dominio.Funcionario;
import br.com.kasolution.dominio.Pagavel;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.ArrayList;

/**
 *
 * @author igordev
 */
public class RelatorioOrdemPagamento {

    static File arquivo = new File("/home/igordev/java/rel_ordem_pagmanto.txt") ;
    static PrintStream ps = System.out;

    public static void geraArquivoOrgemPagamento() throws FileNotFoundException {
        System.setOut(new PrintStream(arquivo));
        ArrayList<Pagavel> pagaveis = new ArrayList<>();
        pagaveis.addAll(Dados.getFuncionarios());
        pagaveis.add(new Fatura("Computador", 4, 4000));
        System.out.println("*** Ordem de Pagamento ***\n");
        double total = 0;
        for (Pagavel p: pagaveis) {
            if (p instanceof Funcionario) {
                System.out.println("==> Pagamento de Funcionario");
            } else {
                System.out.println("==> Pagamento de Fatura");
            }
            //p.imprime();
            double valorPagamento = p.calculaValorPagamento();
            System.out.printf("%s\n Valor pagamento: %s\n\n", p, moeda(valorPagamento));
            total += valorPagamento;
        }//fim for
        System.out.printf("\n[Total Ordem Pag.: %s ]\n", moeda(total));
        System.setOut(ps);
        System.out.println("Arquivo gerado!");
    }
}
