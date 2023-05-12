package org.example.fundamentos;

import java.util.Scanner;

public class Console {

    public static void main(String[] args) {
        //ele imprime um dado na tela sem pular linha
        System.out.print("bom");

        // colocando o \n no final ele passa para a linha de baixo
        System.out.print(" \ndia");

        //o caracter %d abaixo interfere na formatação, a quantidade de %d devera ser igual a quantidade de elementos repasaados

        System.out.printf("\nMegasena: %d %d %d %d %d %d %n", 1,2,3,4,5,6);

        //formata de acordo com a quantidade desejada de casas decimais

        System.out.printf("salário: %.1f %n", 1234.4547);
        System.out.printf("Nome: %s%n", "João");

        //Scanner fica aguardando em tela uma entrada do usuário

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = entrada.nextLine();

        System.out.print("Digite seu sobrenome: ");
        String sobrenome = entrada.nextLine();

        System.out.print("Digite sua idade: ");
        int idade = entrada.nextInt();

        System.out.print("\nNome = " + nome + " " + sobrenome);
        System.out.print("\nIdade = " + idade);

        System.out.printf("s% s% tem %d anos.",nome,sobrenome,idade);
        entrada.close();
    }



//-----------------------------------------------------------

      /*  Esclarecimento sobre os métodos nextInt e nextDouble
        Passando para esclarecer uma particularidade dos métodos nextInt() e nextDouble(). Ambos os métodos têm a mesma particularidade, mas vou explicá-la através do nextInt() com o exemplo abaixo.*/

        /*Scanner teclado = new Scanner(System.in);

        System.out.println("Qual a sua idade?");
        int idade = teclado.nextInt();
        System.out.println("Qual o seu nome?");
        String nome = teclado.nextLine();
        System.out.println("Qual o seu sobrenome?");
        String sobrenome = teclado.nextLine();

        teclado.close();

        /*À primeira vista, parece que está tudo bem com este código. Mas quando o rodamos, o que é impresso no console (contendo os inputs) é o seguinte:
        Qual a sua idade? 25
        Qual o seu nome? Qual o seu sobrenome? Silva
        Isso acontece por causa da maneira como o nextInt() faz a leitura dos valores.

       /*Esse método faz a leitura de um único número, por exemplo, 58 ou 958. Mas quando digitamos os inputs, além do valor que deve ser lido, também apertamos enter, o que gera um caracter "\n" no buffer de entrada (fila de coisas que devem ser lidas), que é uma representação do enter.
       Então, o que acontece é: "Qual a sua idade?" é impresso, digitamos o valor e apertamos enter. Quando fazemos isso, o buffer de entrada fica com o conteúdo "25\n", e quando o nextInt() faz a leitura, ele lê apenas o 25,
       deixando o "\n" para trás. Depois disso, "Qual o seu nome?" é impresso, e o método nextLine() vai ler tudo que estiver no buffer de entrada até encontrar um "\n". Como o nextInt() deixou um "\n" para trás, é esse o valor que o nextLine() lê.
       Isso conclui a leitura e a próxima linha de código, que é "Qual o seu sobrenome?", é impressa. */

       //Para resolver esse problema, precisamos "pegar" o "\n" que o nextInt() não lê. Isso pode ser feito colocando um comando nextLine() depois do nextInt(), de modo que o código abaixo vai funcionar da maneira como queríamos.

       /*Scanner teclado = new Scanner(System.in);
        System.out.println("Qual a sua idade?");
        int idade = teclado.nextInt();
        teclado.nextLine(); //lê o "\\\\n" que o teclado.nextInt() deixa para trás.
        System.out.println("Qual o seu nome?");
        String nome = teclado.nextLine();
        System.out.println("Qual o seu sobrenome?");
        String sobrenome = teclado.nextLine();

        teclado.close();*/



    }

