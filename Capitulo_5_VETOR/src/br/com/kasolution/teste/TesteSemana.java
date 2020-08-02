package br.com.kasolution.teste;

import br.com.kasolution.dominio.Semana;
import java.util.Scanner;

public class TesteSemana {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Informe o número do dia da semana: ");
        int numeroDia = sc.nextInt();
        if (numeroDia < 1 || numeroDia > 7) {
            System.out.println("Utilize valores entre 1 e 7!");
        } else {
            Semana semana = new Semana();
            System.out.println("Dia da semana: "
                    + semana.dias[numeroDia - 1]);
        }
    }

}
