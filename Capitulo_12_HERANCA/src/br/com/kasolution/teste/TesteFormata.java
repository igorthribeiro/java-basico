package br.com.kasolution.teste;

import static br.com.kasoluion.util.Formata.*;
import java.time.LocalDateTime;
import java.util.Date;

public class TesteFormata {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(data(LocalDateTime.now()));
        System.out.println(data(new Date()));
        System.out.println(moeda(14_999.99));
    }
    
}
