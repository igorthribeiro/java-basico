package br.com.kasolution.teste;

import br.com.kasolution.dados.Dados;
import br.com.kasolution.dominio.Funcionario;
import java.util.ArrayList;

public class TesteFuncionario {

    public static void main(String[] args) {
        ArrayList<Funcionario> funcionarios = Dados.getFuncionarios();
        for (Funcionario f : funcionarios) {
            System.out.printf("Classe: %s\n", f.getClass().getSimpleName());
            //f.imprime();
            System.out.println(f.toString());
            System.out.printf("Salário funcionario: %s\n\n", f.calculaValorPagamento());
        }
    }
}
