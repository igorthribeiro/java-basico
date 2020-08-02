package br.com.kasolution.teste;

import br.com.kasolution.dominio.Banco;
import br.com.kasolution.util.Dados;

public class TesteBanco {

    public static void main(String[] args) {
        Banco banco = Dados.getDados();//carrega os dados
        banco.imprime();
    }
}
