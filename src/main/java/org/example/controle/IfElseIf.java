package org.example.controle;

import java.util.Scanner;

public class IfElseIf {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite a nota: ");
        double nota = entrada.nextDouble();

        if (nota > 10 || nota < 0) {
            System.out.println("Nota inválida!");
        } else if (nota >= 8) {
                System.out.println("conceito A!");
            }

            entrada.close();
        }
    }
