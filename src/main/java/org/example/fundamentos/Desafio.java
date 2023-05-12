package org.example.fundamentos;

import java.util.Scanner;


public class Desafio {

    public static void main(String[] args) {


        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite seu Salário Pessoa 1: ");
        String valor1 = entrada.next();

        System.out.print("Digite seu Salário Pessoa 2: ");
        String valor2 = entrada.next();

        System.out.print("Digite seu Salário Pessoa 3: ");
        String valor3 = entrada.next();

       double salario1 = Double.parseDouble(valor1);
       double salario2 = Double.parseDouble(valor2);
       double salario3 = Double.parseDouble(valor3);

       double media = (salario1 + salario2 + salario3) / 3;

        System.out.println("A média dos salãrios é  " + media);

        entrada.close();









    }
}
