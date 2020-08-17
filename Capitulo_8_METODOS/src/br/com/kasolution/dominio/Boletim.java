package br.com.kasolution.dominio;

import static br.com.kasolution.util.Formata.nota;

public class Boletim {
    public static final double NOTA_MINIMA_APROVACAO = 6.0;

    public Aluno alunos[];

    public Boletim(Aluno alunos[]) {
        this.alunos = alunos;
    }
    
    //imprimi o aluno, notas e aprovado ou reprovado
    public void imprime(Aluno...alunos) {
        for (Aluno a : alunos) {
            a.imprime();
            double media = a.calculaMedia();
            System.out.println("Média: " + nota(media));
            String situacao;
            if (media >= NOTA_MINIMA_APROVACAO) {
                situacao = "Aprovado";
            } else {
                situacao = "Reprovado";
            }//fim if
            //situacao = (media >= a.notaMinimaAprovacao)
            //        ? "Aprovado" :"Reprovado";
            System.out.printf("Situação aluno: %s\n\n", situacao);
        }//fim for
    }//fim imprime
    
    public void imprime() {
        imprime(alunos);
    }
    
    
}//fim classe








