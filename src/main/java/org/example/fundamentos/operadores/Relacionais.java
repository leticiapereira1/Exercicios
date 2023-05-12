package org.example.fundamentos.operadores;

public class Relacionais {
    public static void main(String[] args) {
        int a = 97;
        int b  = 'a';

        System.out.println(a == b);

        System.out.println('\u0061');//imprimne a letra 'a'

        double nota = 7.3;
        boolean bomComportamento = true;
        boolean passouPorMedia = nota >= 7;

        boolean temDesconto = bomComportamento && nota >= 7;

        System.out.println("Tem desconto?" + temDesconto);
    }
}
