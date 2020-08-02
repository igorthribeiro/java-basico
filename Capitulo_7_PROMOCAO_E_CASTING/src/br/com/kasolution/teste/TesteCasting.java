package br.com.kasolution.teste;

public class TesteCasting {

    public static void main(String[] args) {
        //teste 1
        int n1 = 55555;
        int n2 = 66666;
        long r =  1L * n1 * n2;
        byte b1 = 50;
        byte b2 = 60;
        //byte  r2 = b1 + b2; não funciona erro de compil.
        int  r2 = b1 + b2; //OK
        byte r3 = (byte) (b1 + b2); //OK
        double d = 7d/2;
        double nd1 = 7;
        double d2 = nd1/2;
        System.out.println("Resposta r: " + r);
        System.out.println("Resposta r2: " + r2);
        System.out.println("Resposta r3: " + r3);
        System.out.println("Resposta d: " + d);
        System.out.println("Resposta d2: " + d2);
        int i = (int) 1L;
        byte bigByte = (byte) 1000;
        short s1 = 100;
        short s2 = 200;
        short s3 = (short) (s1 + s2);
    }
    
}
