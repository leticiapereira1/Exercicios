package org.example.controle.arrays;

import java.util.Arrays;

public class Exercicio {
    public static void main(String[] args) {

        double[] notasAlunoA = new double[4];

        notasAlunoA [0] = 7.9;
        notasAlunoA [1] = 8;
        notasAlunoA [2] = 6.7;
        notasAlunoA [3] = 9.7;

        System.out.println(Arrays.toString(notasAlunoA));

//percorrer array

        double totalAlunoA = 0;
        for (int i = 0; i < notasAlunoA.length; i++){ // 'notasAlunoA.length' ele pega as alterações no array caso seja removido ou adicionado valores
            totalAlunoA += notasAlunoA[i];
        }
        System.out.println("Media Aluno A: "  + totalAlunoA/notasAlunoA.length);// usando a notação e a variavel o código fica a prova de variações.

        double[] notaslAlunoB = {6.9, 8.9, 5.5,10};

        double totalAlunoB = 0;
        for (int i = 0; i < notaslAlunoB.length; i++) {
            totalAlunoB += notaslAlunoB[i];
        }

            System.out.println("Media Aluno B: " + totalAlunoB /notaslAlunoB.length);


    }
}
