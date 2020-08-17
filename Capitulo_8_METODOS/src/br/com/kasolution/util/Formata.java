package br.com.kasolution.util;

import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Formata {
    
    public static String data(LocalDate data, boolean curto) {
        String formato = (curto) ? "dd/MM/yyyy" : "dd 'de' MMMM 'de' yyyy, EEEE";
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern(formato);
        return dtf.format(data);
    }
    
    public static String data(LocalDate data) {
        return data(data, true);
    }
    
    public static String nota(double nota) {
        DecimalFormat df = new DecimalFormat("#.00");
        return df.format(nota);
    }

}
