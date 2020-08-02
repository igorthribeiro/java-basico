package br.com.kasolution.util;

import java.text.NumberFormat;

public class Formata {
    public static String moeda(double numero) {
        return NumberFormat
                .getCurrencyInstance().format(numero);
    }
}
