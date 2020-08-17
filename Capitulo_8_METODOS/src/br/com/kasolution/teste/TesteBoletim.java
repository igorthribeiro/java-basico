package br.com.kasolution.teste;

import br.com.kasolution.dominio.Aluno;
import br.com.kasolution.dominio.Boletim;
import java.time.LocalDate;

public class TesteBoletim {

    public static void main(String[] args) {
        Aluno[] alunos = {
          new Aluno("Alexandre", 6.5, 5.6, 7.7, 7.0),
          new Aluno("Marcos", LocalDate.of(2020, 8, 20), 6.5, 5.6, 5.7, 5.0),
          new Aluno("Marilda", 6.5, 8.6, 6.7, 5.0),
          new Aluno("Anna", 5.5, 5.6, 5.7, 5.0),
          new Aluno("Cassia", 7.5, 7.0, 8.5, 5.0)
        };
        
        System.out.println("\n*********** Todos os alunos: ************");
        Boletim boletim = new Boletim(alunos);
        boletim.imprime();
        
        System.out.println("\n**********Apenas reprovados: ************");
        boletim.imprime(alunos[1], alunos[3]);
    }
    
}
