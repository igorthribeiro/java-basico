package br.com.kasolution.dominio;

import static br.com.kasoluion.util.Formata.moeda;

public class FuncionarioHorista extends Funcionario {

    private double valorHora;
    private double horas;

    public FuncionarioHorista(double valorHora, double horas, String nome, String sobrenome, String cpf) {
        super(nome, sobrenome, cpf);
        this.valorHora = valorHora;
        this.horas = horas;
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    public double getHoras() {
        return horas;
    }

    public void setHoras(double horas) {
        this.horas = horas;
    }

    @Override
    public void imprime() {
        super.imprime();
        System.out.println("Valor Hora: " + valorHora);
        System.out.println("Qtd. Horas: " + horas);
    }

    @Override
    public String toString() {
        return new StringBuilder(super.toString())
                .append(" / Valor Hora: ")
                .append(moeda(valorHora))
                .append(" / Qtd. Horas: ")
                .append(horas)
                .toString();
    }

    @Override
    public double calculaValorPagamento() {
        double total = valorHora * horas;
        return total;
    }
}
