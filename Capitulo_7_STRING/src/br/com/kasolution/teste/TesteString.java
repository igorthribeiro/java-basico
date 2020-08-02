package br.com.kasolution.teste;

public class TesteString {

    public static void main(String[] args) {
        String frase = "Curso Java Ka Solution - Centro";
        String maiuscula = frase.toUpperCase();
        System.out.println(maiuscula);
        String minuscula = frase.toLowerCase();
        System.out.println(minuscula);
        frase = frase.concat("!");
        System.out.println(frase);
        String unidade = frase.substring(25, 31);
        System.out.println(unidade);
        int tamanho = frase.length();
        System.out.println(tamanho);
        int posicaoKa = frase.indexOf("Ka");
        System.out.println(posicaoKa);
        frase = frase.replace("Centro", "Morumbi");
        System.out.println(frase);
        char caracter11 = frase.charAt(11);
        System.out.println(caracter11);
        String semEspaco = "         OK         ".trim();
        System.out.println(semEspaco);
        boolean aFraseContemKa = frase.contains("Ka");
        System.out.println(aFraseContemKa);        
    }
    
}
