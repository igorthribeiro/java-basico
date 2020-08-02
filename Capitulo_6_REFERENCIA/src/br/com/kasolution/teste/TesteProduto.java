package br.com.kasolution.teste;

import br.com.kasolution.dominio.Produto;

public class TesteProduto {

    public static void main(String[] args) {
        Produto prod1 = new Produto(); //0xaaf89
        Produto prod2 = new Produto(); //0x77bf0
        Produto prod3 = prod1; //0xaaf89
        Produto prod4 = prod2; //0x77bf0
        prod3.nome = "Mouse";
        prod3.valor = 45.00;
        
        prod4.nome = "Teclado";
        prod4.valor = 70.00;
        
        System.out.println("Prod. 01: " + prod1.nome);
        System.out.println("Prod. 01 Valor: " + prod1.valor);
        
        System.out.println("Prod. 02: " + prod2.nome);
        System.out.println("Prod. 02 Valor: " + prod2.valor);
        
        prod1.testeLocal();
    }
}
