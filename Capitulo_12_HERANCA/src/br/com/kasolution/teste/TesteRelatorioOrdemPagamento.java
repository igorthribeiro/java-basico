package br.com.kasolution.teste;

import br.com.kasolution.relatorio.RelatorioOrdemPagamento;
import java.io.FileNotFoundException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TesteRelatorioOrdemPagamento {

    public static void main(String[] args) {
        try {
            RelatorioOrdemPagamento.geraArquivoOrgemPagamento();
        } catch (FileNotFoundException e) {
            System.out.println("Erro ao gerar arquivo. " + e.getMessage());
        }
    }
    
}
