package org.example.controle;

import java.util.Scanner;

public class DesafioWhile {
    public static void main(String[] args) {
        //calcular média de uma turma

        Scanner entrada = new Scanner(System.in);

        int quantidadeDeNotas = 0;
        double nota = 0;
        double total = 0;

        while (nota != -1){
            System.out.print("Informe a nota (ou -1 p/ sair): ");
            nota = entrada.nextDouble();

            if(nota <= 10 && nota >= 0){
                total += nota;
                quantidadeDeNotas ++;
            }else if (nota != -1){
                System.out.println("Nota inválida!!");
            }
        }
//calcular média

        double media = total/quantidadeDeNotas;
        System.out.println("média = " + media);

        entrada.close();
    }
}
