package br.com.kasolution.dominio;

public class Aluno {
    public String nome;
    public double[] notas;
    public /* static */ double notaMinimaAprovacao = 7.0;
    
    public Aluno(String nome) {
        this.nome = nome + " - " + nome.length();
    }
    
    public Aluno(String nome, double...notas) {
        this(nome);
        this.notas = notas;
    }
    
    public void imprime() {
        System.out.println("Aluno: " + nome);
        String s = "";
        for (double n : notas) {
            s += "[" + n + "] ";// [8.0] [7.5] [6.5]...
        }
        System.out.println("Notas: " + s);
    }
}





