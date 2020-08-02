package br.com.kasolution.teste;

public class TesteStringBuilder {

    public static void main(String[] args) {
        StringBuilder frase = new StringBuilder("Igor");
        frase.append(" Instrutor");
        frase.append("!");
        System.out.println(frase);
        frase.insert(5, "Ribeiro ");
        frase.reverse();
        System.out.println(frase);
    }

}
