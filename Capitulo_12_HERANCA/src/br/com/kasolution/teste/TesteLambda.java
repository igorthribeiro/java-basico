package br.com.kasolution.teste;

import br.com.kasolution.dados.Dados;
import br.com.kasolution.dominio.Funcionario;
import java.util.ArrayList;

public class TesteLambda {

    public static void main(String[] args) {
        ArrayList<Funcionario> funcionarios
                = Dados.getFuncionarios();
        
        funcionarios.forEach(f -> f.setNome(f.getNome().toUpperCase()));
        funcionarios.forEach(f -> {f.imprime();
                                   System.out.println();});

        //tirar nome que tem i
        System.out.println("Nomes sem a letra \"i\"");
        funcionarios.removeIf(f -> f.getNome().toLowerCase()
                .contains("i"));
        funcionarios.forEach(f -> {f.imprime();
                                   System.out.println();});
    }
    
}
