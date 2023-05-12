package org.example.fundamentos;

public class TipoString {
    public static void main(String[] args) {
//mostra a posição do caractere que compõe a string. string é um objeto imutável, não ha possibilidade de mudar o seu valor inicial.
        System.out.println("Olá Pessoal".charAt(2));

        String s = "Boa tarde";
        s = s.toUpperCase();
        s = "Bom dia";
        System.out.println(s.concat("!!!!"));
        System.out.println(s + "!!!");

        //faz distinção de letra maiuscula e minuscula
        System.out.println(s.startsWith("Bom"));
        System.out.println(s.startsWith("bom"));

        //NÃO faz distinção de letra maiuscula e minuscula
        System.out.println(s.toLowerCase().startsWith("bom"));

        //Quantos caracteres tem uma string
        System.out.println(s.length());

        //saber se uma sentença termina de determinada forma (verdadeiro ou falso)
        System.out.println(s.endsWith("dia"));

        //comparação de igualdade
        System.out.println(s.equals("bom dia"));

        //compara ignorando letras maiusculas ou minusculas
        System.out.println(s.equalsIgnoreCase("Bom DIA"));


        //colocando variaveis de diferentes tipos e pulando linhas para organizar os dados
        String nome = "Pedro";
        String sobrenome = "Santos";
        Integer idade = 33;
        Double salario = 12456.784;

        System.out.println("Nome: " + nome + "\nSobrenome: " + sobrenome + "\nIdade: " + idade + "\nSalario: " + salario + "\n\n" );
        System.out.printf("O senhor %s %s tem %d e ganha R$%.2f", nome, sobrenome, idade, salario);

        String frase = String.format("\nO senhor %s %s tem %d e ganha R$%.2f", nome, sobrenome, idade, salario);
        System.out.println(frase);

        //se existe uma determinada string dentro de uma frase
        System.out.println("Frase qualquer".contains("qual"));

        //posição inicial de uma string
        System.out.println("Frase qualquer".indexOf("qual"));













    }
}
