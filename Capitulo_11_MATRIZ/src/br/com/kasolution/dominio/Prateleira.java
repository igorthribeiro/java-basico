package br.com.kasolution.dominio;

public class Prateleira {

    private int linhas;
    private int colunas;
    Livro[][] livros;

    /*
     Livros[][] = new Livros[3][4];
     +-----+-----+------+-----+
     | 0,0 | 0,1 |  0,2 | 0,3 |
     +-----+-----+------+-----+
     | 1,0 | 1,1 |  1,2 | 1,3 |
     +-----+-----+------+-----+
     | 2,0 | 2,1 |  2,2 | 2,3 |
     +-----+-----+------+-----+
     */

    public Prateleira(int linhas, int colunas) {
        this.linhas = linhas;
        this.colunas = colunas;
        livros = new Livro[linhas][colunas];
    }

    public void organiza(Livro[] livros) {
        int totalLivros = linhas * colunas;
        if (livros.length > totalLivros) {
            System.out.println("Quantidade de livros não suportada.\nMáximo: " + totalLivros);
        } else {
            int box = 0;
            for (int i = 0; i < linhas; i++) {
                for (int j = 0; j < colunas; j++) {
                    if (livros.length > box) {
                        this.livros[i][j] = livros[box++];
                    } else {
                        return;
                    }
                }//fim for colunas
            }//fim for linhas
        }//fim if
    }//fim organiza

    public void imprime() {
        //imprimir o nome dos livros na prateleira
        //[Java][SQL Oracle][JavaScript][PL/SQL]
        //[Java][SQL Oracle][JavaScript][PL/SQL]
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                if (livros[i][j] == null) {
                    return;
                }
                System.out.print(
                        String.format("[%1$-20s]",
                                livros[i][j].getNome()));
            }
            System.out.println();
        }
    }//fim imprime

    public void buscaLivro(String nome) {
        nome = nome.toUpperCase();
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                if (livros[i][j] == null) {
                    break;
                }
                String nomeLivro =
                        livros[i][j].getNome().toUpperCase();
                if (nomeLivro.contains(nome)){
                    System.out.println("Livro econtrado:");
                    System.out.println("Linha: " + (i+1) + 
                            " Coluna: " + (j+1));
                    return;
                }
            }
        }
        System.out.println("Livro não localizado!");
    }//fim busca
}
