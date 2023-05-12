package org.example.fundamentos.operadores;

public class Unarios {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;

        a ++; //a = a + 1
        a --; // a = a - 1

        b ++; //b = b + 1
        b --; // b = b - 1

        System.out.println(a);
        System.out.println(b);

        System.out.println("mini desafio...");
        System.out.println("++a == b--"); //operador antes da letra quer dizer que irá acrescentar antes de comparar , e quando o operador for depois da letra
        //ele so vai decrementar o operador depois da comparação
        System.out.println(a);
        System.out.println(b);


    }
}
