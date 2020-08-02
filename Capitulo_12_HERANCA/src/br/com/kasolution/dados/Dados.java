package br.com.kasolution.dados;

import br.com.kasolution.dominio.ComissionadoAssalariado;
import br.com.kasolution.dominio.Funcionario;
import br.com.kasolution.dominio.FuncionarioAssalariado;
import br.com.kasolution.dominio.FuncionarioComissionado;
import br.com.kasolution.dominio.FuncionarioHorista;
import java.util.ArrayList;

public class Dados {
    public static  ArrayList<Funcionario> getFuncionarios() {
        ArrayList<Funcionario> funcionarios = new ArrayList<>();
        
        funcionarios.add(
         new FuncionarioAssalariado(7500, "Victor", "Souza",
                 "154.141.910-34"));
        funcionarios.add(
         new FuncionarioComissionado(45000, 10, "Marcelo",
                 "Oliveira", "519.529.130-13"));
        funcionarios.add(
         new FuncionarioHorista(100, 120, "Cintia", "Castro",
                 "822.170.190-40"));
        funcionarios.add(
         new ComissionadoAssalariado(3500, 60_000, 10,
                 "Jaqueline", "Costa", "055.831.830-47"));
        
        return funcionarios;
        
    }//fim getFuncionarios;
}
