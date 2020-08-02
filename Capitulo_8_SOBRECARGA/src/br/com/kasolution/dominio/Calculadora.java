package br.com.kasolution.dominio;

public class Calculadora {
    
    public static int soma (int n1, int n2) {
        return n1 + n2;
    }
    
    /* trocar o retorno não é sobrecarga
    public double soma (int n1, int n2) {
        return n1 + n2;
    }
    */
    public static float soma (float n1, float n2) {
        return n1 + n2;
    }

    public static double soma (double n1, double n2) {
        return n1 + n2;
    }

    public static double soma (String n1, String n2) {
        /*
            int => Integer;
            boolean => Boolean;
            float => Float;
            double => Double;
            void => Void;
            char => String;
            ....
        */
        double d1 = Double.parseDouble(n1);
        double d2 = Double.parseDouble(n2);
        return d1 + d2;
    }
}
