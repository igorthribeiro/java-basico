package br.com.kasolution.teste;

import br.com.kasolution.dominio.Calculadora;

public class TesteCalculadora {

    public static void main(String[] args) {
        //Calculadora calculadora = new Calculadora();
        //teste1
        int resp1 = Calculadora.soma(10,45);
        System.out.println("Reposta R1: " + resp1);
        float resp2 = Calculadora.soma(7.5f, 8.0f);
        System.out.println("Resposta R2: " + resp2);
        double resp3 = Calculadora.soma(7.5, 8.0);
        System.out.println("Resposta R3: " + resp3);
        double resp4 = Calculadora.soma("7.5", "8.0");
        System.out.println("Resposta R4: " + resp4);
    }
    
}
