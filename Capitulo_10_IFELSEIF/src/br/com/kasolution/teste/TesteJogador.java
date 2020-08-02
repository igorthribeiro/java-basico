package br.com.kasolution.teste;

public class TesteJogador {

    public static void main(String[] args) {
        int idade = 22;
        System.out.println("Classificacao: " + getClassificacao(idade));
    }
    
    public static String getClassificacao(int idade) {
        String classificacao;
        if (idade <= 10) {
            classificacao = "SUB11";
        } else if (idade <= 16) {
            classificacao = "SUB17";
        } else if (idade <= 20) {
            classificacao = "SUB21";
        } else {
            classificacao = "PROFISSIONAL";
        }//fim if
        
        return classificacao;
    }//fim getClassificacao

}
