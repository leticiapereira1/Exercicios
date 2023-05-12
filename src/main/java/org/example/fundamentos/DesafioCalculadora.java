package org.example.fundamentos;

import java.util.Scanner;

public class DesafioCalculadora {

    public static void main(String[] args) {
        //ler num1
        //ler num2
        // + - * / %
//fazer usuario colocar os numeros como entrada e os operadores logicos
        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe o número: ");
        double num1 = entrada.nextDouble();

        System.out.println("Informe o número: ");
        double num2 = entrada.nextDouble();

        System.out.println("Informe a operação: ");
        String operacao = entrada.next();

        //lógica

        double resultado = "+".equals(operacao) ? num1 + num2 : 0;
        resultado = "-".equals(operacao) ? num1 - num2 : resultado;
        resultado = "*".equals(operacao) ? num1 * num2 : resultado;
        resultado = "/".equals(operacao) ? num1 / num2 : resultado;
        resultado = "%".equals(operacao) ? num1 % num2 : resultado;

        System.out.printf("%.2f %s %.2f = %.2f", num1, operacao, num2, resultado);


        entrada.close();



    }
}
