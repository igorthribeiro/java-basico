package br.com.kasolution.dominio;

import java.time.LocalDate;
import static br.com.kasolution.util.Formata.*;

public class Aluno {
    public static int ultimoCodigoGerado = 0;
    
    public int codigo;
    public LocalDate dataMatricula;
    public String nome;
    public double[] notas;
    
    public Aluno(String nome) {
        this.codigo = ++ultimoCodigoGerado;
        this.dataMatricula = LocalDate.now();
        this.nome = "# " + nome;
    }
    
    public Aluno(String nome, double...notas) {
        this(nome);
        this.notas = notas;
    }
    
    public double calculaMedia() {
        double total = 0;
        for (double n : notas) {
            total += n;
        }
        return total/notas.length;
    }
    
    public void imprime() {
        System.out.println("Aluno: " + nome);
        System.out.println("Matriculado em: " + data(dataMatricula));
        StringBuilder s = new StringBuilder();
        for (double n : notas) {
            s.append("[" + n + "] ");// [8.0] [7.5] [6.5]...
        }
        System.out.println("Notas: " + s);
    }
}





