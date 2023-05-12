package org.example.fundamentos.operadores;

public class Ternario {
    public static void main(String[] args) {

        //é chamado de ternario porque possui 3 operandos numa mesma expressão.
        double nota = 7.6;

        String resultado = nota >= 7.0 ? "Aprovado": "reprovado";

        System.out.println("o aluno esta: " + resultado);
    }
}
