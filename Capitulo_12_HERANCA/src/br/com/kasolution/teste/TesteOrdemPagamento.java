package br.com.kasolution.teste;

import static br.com.kasoluion.util.Formata.moeda;
import br.com.kasolution.dados.Dados;
import br.com.kasolution.dominio.Fatura;
import br.com.kasolution.dominio.Funcionario;
import br.com.kasolution.dominio.Pagavel;
import java.util.ArrayList;

public class TesteOrdemPagamento {

    public static void main(String[] args) {
        ArrayList<Pagavel> pagaveis = new ArrayList<>();
        pagaveis.addAll(Dados.getFuncionarios());
        pagaveis.add(new Fatura("Computador", 4, 4000));
        System.out.println("*** Ordem de Pagamento ***");
        double total = 0;
        for (Pagavel p: pagaveis) {
            if (p instanceof Funcionario) {
                System.out.println("==> Pagamento de Funcionario");
            } else {
                System.out.println("==> Pagamento de Fatura");
            }
            p.imprime();
            double valorPagamento = p.calculaValorPagamento();
            System.out.printf("Valor pagamento: %s\n", moeda(valorPagamento));
            total += valorPagamento;
        }//fim for
        System.out.printf("Total Ordem Pag.: %s\n", moeda(total));
    }//fim main
    
}//fim classe
