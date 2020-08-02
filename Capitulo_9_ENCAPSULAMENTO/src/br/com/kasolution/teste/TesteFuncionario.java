package br.com.kasolution.teste;

import br.com.kasolution.dominio.Funcionario;

public class TesteFuncionario {

    public static void main(String[] args) {
        // TODO code application logic here
        Funcionario f1 = new Funcionario("João Pedro", 500);
        Funcionario f2 = new Funcionario("Maria Joaquina");
        f1.aumentaSalario(1000);
        f1.imprime();
        f2.aumentaSalario(-1000);
        f2.imprime();
        System.out.println("O salario de f2 é: "
                + f2.getSalario());
    }

}
