package org.example.fundamentos;

import java.sql.SQLOutput;

public class NotacaoPonto {

    public static void main(String[] args) {

        String s = "Bom dia X";
        s = s.replace("X", "senhora!");
        s = s.toUpperCase();
        s = s.concat("!!!");

        System.out.println(s);

        String y = "Bom dia X".replace("X", "GUI");

        System.out.println(y);

        //tipos primitivos nao tem operador "."
        int a = 3;


    }
}
