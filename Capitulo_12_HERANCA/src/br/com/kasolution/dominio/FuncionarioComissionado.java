package br.com.kasolution.dominio;

import static br.com.kasoluion.util.Formata.moeda;

public class FuncionarioComissionado extends Funcionario {
    private double vendaBruta;
    private double porcentagemComissao;

    public FuncionarioComissionado(double vendaBruta, double porcentagemComissao,
            String nome, String sobrenome, String cpf) {
        super(nome, sobrenome, cpf);
        this.vendaBruta = vendaBruta;
        this.porcentagemComissao = porcentagemComissao;
    }

    public double getVendaBruta() {
        return vendaBruta;
    }

    public void setVendaBruta(double vendaBruta) {
        this.vendaBruta = vendaBruta;
    }

    public double getPorcentagemComissao() {
        return porcentagemComissao;
    }

    public void setPorcentagemComissao(double porcentagemComissao) {
        this.porcentagemComissao = porcentagemComissao;
    }

    @Override
    public void imprime() {
        super.imprime();
        System.out.println("Venda Bruta: " + vendaBruta);
        System.out.println("Porcentagem Comissão: "
                + porcentagemComissao);
    }

    @Override
    public String toString() {
        return new StringBuilder(super.toString())
                .append(" / Venda Bruta: ")
                .append(moeda(vendaBruta))
                .append(" / Porcentagem Comissão: ")
                .append(moeda(porcentagemComissao))
                .toString();
    }
    
    

    @Override
    public double calculaValorPagamento() {
        double total = vendaBruta * (porcentagemComissao/100);
        return total;
    }
}
