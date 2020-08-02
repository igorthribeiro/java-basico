package br.com.kasolution.teste;

import br.com.kasolution.dominio.Aluno;
import br.com.kasolution.dominio.Boletim;

public class TesteBoletim {

    public static void main(String[] args) {
        Aluno[] alunos = {
          new Aluno("Alexandre", 6.5, 5.6, 7.7, 7.0),
          new Aluno("Marcos", 6.5, 5.6, 5.7, 5.0),
          new Aluno("Marilda", 6.5, 5.6, 5.7, 5.0),
          new Aluno("Anna", 5.5, 5.6, 5.7, 5.0),
          new Aluno("Cassia", 5.5, 5.6, 5.7, 5.0)
        };
        //troquei a nota minima da Marilda
        alunos[2].notaMinimaAprovacao = 5.0;
        //Aluno.notaMinimaAprovacao = 5.0;
        
        Boletim boletim = new Boletim(alunos);
        boletim.imprime();
    }
    
}
