package org.example.controle.exercicios;

import java.util.Scanner;

/*"O cálculo é o seguinte:

        →  O ano é divisível por 4 quando é possível dividir sua dezena por 4:

        2020 = 20 ÷ 4 = 5, ou seja, 2020 é um ano bissexto

        Com isso, os próximos anos bissextos divisíveis por 4 serão 2024, 2028, 2032, 2036, 2040, 2044, 2048, 2052.

        →  E sobre os anos terminados em 00?

        400 ÷ 400 = 0 => 400 foi um ano bissexto

        500 ÷ 400 = 1,25 => 500 não foi um ano bissexto

        Por essa regra, o próximo ano terminado em 00 que será bissexto é 2.400."

        Veja mais sobre "Ano bissexto" em: https://brasilescola.uol.com.br/curiosidades/ano-bissexto.htm*/

public class Exercicio2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um ano no formato 'AA': ");
        int ano = scanner.nextInt();



        if (ano % 4 == 0){
            System.out.println("Este ano é Bissexto! ");
        }
        else {
            System.out.println("Este ano não é Bissexto! ");
        }
    }
}
