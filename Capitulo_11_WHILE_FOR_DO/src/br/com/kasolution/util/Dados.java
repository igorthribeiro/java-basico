package br.com.kasolution.util;

import br.com.kasolution.dominio.Banco;
import br.com.kasolution.dominio.Cliente;
import br.com.kasolution.dominio.Conta;

public class Dados {

    public static Banco getDados() {
        Cliente cli1 = new Cliente("Igor");
        Conta cc1 = new Conta("3435-9", cli1, 4000.00);

        Cliente cli2 = new Cliente("Barbara");
        Conta cc2 = new Conta("3436-9", cli2, 3000.00);

        Cliente cli3 = new Cliente("Renato");
        Conta cc3 = new Conta("3435-9", cli3, 7500.00);

        Cliente cli4 = new Cliente("Marcelo");
        Conta cc4 = new Conta("3837-0", cli4, 15000.00);

        Banco banco = new Banco(
                new Conta[]{cc1, cc2, cc3, cc4});
        
        return banco;
    }//fim getDados()
}//fim classe
