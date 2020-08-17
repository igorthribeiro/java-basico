package br.com.kasolution.util;

import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Formata {
    
    public static String data(LocalDate data) {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return dtf.format(data);
    }
    
    public static String nota(double nota) {
        DecimalFormat df = new DecimalFormat("#.00");
        return df.format(nota);
    }

}
