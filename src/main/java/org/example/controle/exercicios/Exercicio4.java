package org.example.controle.exercicios;

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = entrada.nextInt();

        if (numero / 1 == 0 || numero / numero == 0) {
            System.out.println( numero + "é primo! ");
        }else {
            System.out.println(numero + "Não é primo! ");
        }
    }
}
