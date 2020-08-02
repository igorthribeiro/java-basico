package br.com.kasolution.dominio;

import static br.com.kasoluion.util.Formata.moeda;

public class ComissionadoAssalariado 
        extends FuncionarioComissionado {
    private double salarioMensal;

    public ComissionadoAssalariado(double salarioMensal,
              double vendaBruta, double porcentagemComissao,
              String nome, String sobrenome, String cpf) {
        super(vendaBruta, porcentagemComissao,
                nome, sobrenome, cpf);
        this.salarioMensal = salarioMensal;
    }

    public double getSalarioMensal() {
        return salarioMensal;
    }

    public void setSalarioMensal(double salarioMensal) {
        this.salarioMensal = salarioMensal;
    }

    @Override
    public void imprime() {
        super.imprime();
        System.out.println("Salário Mensal: "
                + salarioMensal);
    }

    @Override
    public String toString() {
        return new StringBuilder(super.toString())
                .append(" / Salário Mensal: ")
                .append(moeda(salarioMensal))
                .toString();
    }
    
    
    @Override
    public double calculaValorPagamento() {
        double total = super.calculaValorPagamento() + salarioMensal;
        return total;
    }
}
