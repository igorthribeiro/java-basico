package br.com.kasolution.teste;

import br.com.kasolution.dominio.Aluno;

public class TesteAluno {
    public static void main(String[] args) {
        Aluno[] alunos = new Aluno[10];
        alunos[0] = new Aluno();
        alunos[0].nome = "Andrelino";
        alunos[0].idade = 15;
        
        alunos[1] = new Aluno();
        alunos[1].nome = "Felipe";
        alunos[1].idade = 12;
        
        alunos[2] = new Aluno();
        alunos[2].nome = "Gustavo";
        alunos[2].idade = 11;
        
        alunos[3] = new Aluno();
        alunos[3].nome = "Jullyson";
        alunos[3].idade = 10;
        
        alunos[4] = new Aluno();
        alunos[4].nome = "Rodrigo";
        alunos[4].idade = 13;
        
        alunos[5] = new Aluno();
        alunos[5].nome = "Sandra";
        alunos[5].idade = 14;
        
        alunos[6] = new Aluno();
        alunos[6].nome = "Wesley";
        alunos[6].idade = 11;
        
        alunos[7] = new Aluno();
        alunos[7].nome = "Matheus";
        alunos[7].idade = 10;
        
        alunos[8] = new Aluno();
        alunos[8].nome = "Rafael";
        alunos[8].idade = 12;
        
        alunos[9] = new Aluno();
        alunos[9].nome = "Artur";
        alunos[9].idade = 15;
        
        int contador = 0;
        for (Aluno a : alunos) {
            if (a.idade >= 12) {
                System.out.println("Nome: " + a.nome);
                contador++;
            }//fim if
            if (contador == 5) {
                break;
            }//fim if
        }//fim for
    }//fim main
}//fima TesteAluno
