package org.example.fundamentos;

public class ConversaoNumeroString {

    public static void main(String[] args) {
//mostra a quantidade de caracteres dentro da string
        Integer num1 = 10000;
        System.out.println(num1.toString().length());

        int num2 = 100000;
        System.out.println(Integer.toString(num2));



        System.out.println(("" + num1).length());
        System.out.println(("" + num2).length());




    }
}
