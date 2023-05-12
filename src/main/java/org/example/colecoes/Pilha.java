package org.example.colecoes;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {
    public static void main(String[] args) {

        Deque<String> livros = new ArrayDeque<>();

        livros.add("O pequeno Príncipe");
        livros.push("Don Quixote"); //nao retorna nada, ele retorna uma excessão por capacidade (pode determinar uma capacidade maxima)
        livros.push ("O Hobbit");

        System.out.println(livros.peek());
        System.out.println(livros.element());


        for (String livro:livros) {
            System.out.println(livros);

        }


    }
}
