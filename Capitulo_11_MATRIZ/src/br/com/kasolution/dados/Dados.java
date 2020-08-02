package br.com.kasolution.dados;

import br.com.kasolution.dominio.Livro;

public class Dados {

    public static Livro[] getLivros() {
        Livro[] livros = {new Livro("Java Basico", "Técnico", "Deitel"),
            new Livro("Java Avançado", "Técnico", "Deitel"),
            new Livro("Java OCA/OCP", "Técnico", "Deitel"),
            new Livro("Android", "Técnico", "Deitel"),
            new Livro("Spring MVC", "Técnico", "Deitel"),
            new Livro("Jogos em Java", "Técnico", "Deitel"),
            new Livro("Jboss", "Técnico", "Deitel"),
            new Livro("GlassFish", "Técnico", "Deitel"),
            new Livro("Oracle Java Master", "Técnico", "Deitel"),
            new Livro("Java WEB", "Técnico", "Deitel"),
            new Livro("Angulas JS", "Técnico", "Deitel")};
        return livros;
    }//fim getLivros
}
