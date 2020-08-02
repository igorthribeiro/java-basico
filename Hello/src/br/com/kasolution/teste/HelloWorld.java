/*
Programador: Igor
Data: 25/03/2019
Primeiro programa do curso de Java
*/

//antes de package só podem existir comentários
package br.com.kasolution.teste;

import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite seu nome: ");
        String nome = sc.next();
        System.out.println("Olá " + nome + " bem vindo ao mundo Java!");
    } //fim main
}//fim classe
