package org.example.fundamentos;

public class ConversaoTipoPrimitivoNumerico {
    public static void main(String[] args) {

//gera um zero depois do numero ja com virgula que seria a conversão implicita
        double a = 1;
        System.out.println(a);

        float b = 1.0F; //aqui ja esta convertido

        //conversão explicita ou CAST

        float c = (float) 1.555;


    }
}
