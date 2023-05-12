package org.example.lambdas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Foreach {

    public static void main(String[] args) {

        List<String> aprovados = Arrays.asList("Bia", "Ana", "Lia", "Gui");

        System.out.println("Forma tradicional...");
            for (String nome: aprovados){
                System.out.println(nome);
            }
        System.out.println("\nLambda #01...");

            aprovados.forEach((nome) -> {
                System.out.println(nome + "!!!");
            });


        System.out.println("\nMethod reference #01...");
        aprovados.forEach(System.out::println);


        System.out.println("\nLambda #02...");
        aprovados.forEach(nome -> meuImprimir(nome));


        System.out.println("\nMethod reference #02...");
        aprovados.forEach(Foreach::meuImprimir);


    }

        static void meuImprimir (String nome){
            System.out.println("Oi, meu nome é " + nome);
        }

}

//assinatura   -    nome (interfaces funcionais)
//
//nada - T         supplier
//T -> nada        consumer
//T -> T          Unary operator
//T,T -> T        Binary operator
//S -> T          Function
//T -> Boolean    predicate