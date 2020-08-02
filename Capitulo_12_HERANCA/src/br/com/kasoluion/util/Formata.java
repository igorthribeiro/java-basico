/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.kasoluion.util;

import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

/**
 *
 * @author igordev
 */
public class Formata {
    public static String moeda(double valor) {
        return NumberFormat.getCurrencyInstance().format(valor);
    }    
    
    public static String data(LocalDateTime data) {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy - EEEE H:m:s");
        return dtf.format(data);
    }
    
    public static String data(Date data) {
        SimpleDateFormat stf = new SimpleDateFormat("dd/MM/yyyy - EEEE H:m:s");
        return stf.format(data);
    }
}
