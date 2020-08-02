package br.com.kasolution.teste;

import br.com.kasolution.dominio.Aluno;

public class TesteAluno {

    public static void main(String[] args) {
        Aluno aluno;
        aluno = new Aluno();
        aluno.nome = "Felipe Ribeiro";
        aluno.idade = 20;
        //escrevendo os dados
        System.out.println("Nome: " + aluno.nome);
        System.out.println("Idade: " + aluno.idade);
    }
}
