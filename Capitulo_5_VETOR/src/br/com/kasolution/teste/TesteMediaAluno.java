package br.com.kasolution.teste;

import br.com.kasolution.dominio.Aluno;
import java.util.Scanner;

public class TesteMediaAluno {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);//CTRL+SHIF+I
        Aluno aluno = new Aluno();
        System.out.print("Qual 1º nome do aluno: ");
        aluno.nome = sc.next();
        
        System.out.print("Informe as notas de 1 à 4: ");
        aluno.notas[0] = sc.nextDouble();
        aluno.notas[1] = sc.nextDouble();
        aluno.notas[2] = sc.nextDouble();
        aluno.notas[3] = sc.nextDouble();

        //calculo da média
        double media = (aluno.notas[0] +
                        aluno.notas[1] +
                        aluno.notas[2] +
                        aluno.notas[3]) / 4;
        System.out.println("[- Calculo da Média -]");
        System.out.println("\tAluno: " + aluno.nome);
        System.out.println("\tNotas: "
                + aluno.notas[0] + ", "
                + aluno.notas[1] + ", "
                + aluno.notas[2] + ", "
                + aluno.notas[3]);
        System.out.println("\tMédia: " + media);
    }
    
}
