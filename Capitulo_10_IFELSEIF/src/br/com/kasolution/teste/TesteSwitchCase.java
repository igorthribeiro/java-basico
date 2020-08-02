package br.com.kasolution.teste;

import java.util.Scanner;

public class TesteSwitchCase {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Informe o número do dia [1-7]: ");
        int dia = sc.nextInt();
        //nome do dia da semana usando if/else
        //1 - Domingo / 7 - sábado
        switch (dia) {
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda");
                break;
            case 3:
                System.out.println("Terça");
                break;
            case 4:
                System.out.println("Quarta");
                break;
            default:
                System.out.println("Dia inválido!");
                break;
            case 5:
                System.out.println("Quinta");
                break;
            case 6:
                System.out.println("Sexta");
                break;
            case 7:
                System.out.println("Sábado");
                break;
        }
        
    }
}
