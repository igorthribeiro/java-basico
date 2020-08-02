package br.com.kasolution.relatorio;

import static br.com.kasoluion.util.Formata.moeda;
import br.com.kasolution.dados.Dados;
import br.com.kasolution.dominio.Funcionario;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.ArrayList;

public class RelatorioFuncionarios {

    static File arquivo = new File("/home/igordev/java/rel_funcionario.txt");
    static PrintStream ps = System.out;

    public static void geraArquivoFuncionario() {
        try {
            System.setOut(new PrintStream(arquivo));
            ArrayList<Funcionario> funcionarios = Dados.getFuncionarios();
            for (Funcionario f : funcionarios) {
                //f.imprime();
                System.out.printf("%s \nSalário: %s\n\n", f, moeda(f.calculaValorPagamento()));
            }
            System.setOut(ps);
            System.out.println("Arquivo gerado!");
        } catch (FileNotFoundException e) {
            System.out.println("Erro ao criar o arquivo. "
                    + e.getMessage());
        } finally {
            ps.close();
        }
    }
}
