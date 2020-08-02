package br.com.kasolution.dominio;

import static br.com.kasoluion.util.Formata.moeda;

public class FuncionarioAssalariado extends Funcionario {

    private double salarioSemanal;
    
    public FuncionarioAssalariado(double salarioSemanal,
            String nome, String sobrenome, String cpf) {
        super(nome, sobrenome, cpf);
        this.salarioSemanal = salarioSemanal;
    }

    public double getSalarioSemanal() {
        return salarioSemanal;
    }

    public void setSalarioSemanal(double salarioSemanal) {
        this.salarioSemanal = salarioSemanal;
    }

    @Override
    public void imprime() {
        super.imprime();
        System.out.println("Sal.Semanal: " + salarioSemanal);
    }

    @Override
    public String toString() {
        return new StringBuilder(super.toString())
                .append(" / Sal.Semanal: ")
                .append(moeda(salarioSemanal))
                .toString();
    }
    
    

    @Override
    public double calculaValorPagamento() {
        double total = salarioSemanal; //não tem calculo
        return total;
    }
}







