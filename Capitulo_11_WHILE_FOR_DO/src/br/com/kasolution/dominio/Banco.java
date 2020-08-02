package br.com.kasolution.dominio;

public class Banco {
    
    public static final double CORRECAO_MENSAL = 1.05;
    private Conta[] contas;
    
    public Banco(Conta[] contas) {
        this.contas = contas;
    }
    
    public Conta getConta(int n) {
        return contas[n];
    }
    
    public Conta[] getContas() {
        return contas;
    }
    
    public void imprime() {
        for (Conta c : contas) {
            c.imprime();
        }
    }
}
