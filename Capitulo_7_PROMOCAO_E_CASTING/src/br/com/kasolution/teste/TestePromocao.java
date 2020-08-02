package br.com.kasolution.teste;

public class TestePromocao {

    public static void main(String[] args) {
        byte b = 100;
        short s = b; //promoção de 8b para 16b
        int i = s; //promoção de 16b para 32b
        long l = i; //promoção de 32b para 64b
        System.out.println("Valor da variável: " + l);
    }
    
}
