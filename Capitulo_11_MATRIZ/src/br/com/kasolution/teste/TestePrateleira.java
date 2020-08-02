package br.com.kasolution.teste;

import br.com.kasolution.dados.Dados;
import br.com.kasolution.dominio.Livro;
import br.com.kasolution.dominio.Prateleira;

public class TestePrateleira {

    public static void main(String[] args) {
        Livro[] livros = Dados.getLivros();
        Prateleira p = new Prateleira(3,4);
        p.organiza(livros);
        p.imprime();
        System.out.println("\nBuscando livro: ");
        p.buscaLivro("webx");
    }
}







