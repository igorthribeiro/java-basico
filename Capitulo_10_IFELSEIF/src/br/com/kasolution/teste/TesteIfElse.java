package br.com.kasolution.teste;

import java.util.Scanner;

public class TesteIfElse {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Informe o número do dia [1-7]: ");
        int dia = sc.nextInt();
        //nome do dia da semana usando if/else
        //1 - Domingo / 7 - sábado
        if (dia == 1) {
            System.out.println("Domingo");
        } else if (dia == 2) {
            System.out.println("Segunda");
        } else if (dia == 3) {
            System.out.println("Terça");
        } else if (dia == 4) {
            System.out.println("Quarta");
        } else if (dia == 5) {
            System.out.println("Quinta");
        } else if (dia == 6) {
            System.out.println("Sexta");
        } else if (dia == 7) {
            System.out.println("Sábado");
        } else {
            System.out.println("Dia inválido!");
        }
    }
}
