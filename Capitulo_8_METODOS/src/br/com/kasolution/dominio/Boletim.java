package br.com.kasolution.dominio;

public class Boletim {

    public Aluno alunos[];

    public Boletim(Aluno alunos[]) {
        this.alunos = alunos;
    }
    
    public double calculaMedia(Aluno aluno) {
        double total = 0, media = 0;
        for (double n : aluno.notas) {
            total += n;
        }
        media = total/aluno.notas.length;
        return media;
    }
    
    //imprimi o aluno, notas e aprovado ou reprovado
    public void imprime() {
        for (Aluno a : alunos) {
            a.imprime();
            double media = calculaMedia(a);
            System.out.println("Média: " + media);
            String situacao;
            if (media >= a.notaMinimaAprovacao) {
                situacao = "Aprovado";
            } else {
                situacao = "Reprovado";
            }//fim if
            //situacao = (media >= a.notaMinimaAprovacao)
            //        ? "Aprovado" :"Reprovado";
            System.out.println("Situação aluno: " +
                    "****** " + situacao + " ******\n");
        }//fim for
    }//fim imprime
}//fim classe








