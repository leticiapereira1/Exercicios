package org.example.fundamentos;

import java.net.StandardSocketOptions;

public class AreaCircunferencia {
    public static void main(String[] args) {
        //psvm
        int raio = 3;
        final double PI = 3.14159;

        double area = PI * raio * raio;
        System.out.println(area);

        raio = 10;
        area = PI * raio * raio;

        System.out.println("Área:"   + area + "m2");// sout - todos os atalhos: crtl + J


    }
}
