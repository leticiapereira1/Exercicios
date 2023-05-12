package org.example.colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
    public static void main(String[] args) {

        Queue <String> fila = new LinkedList<>();

        //offer e add - adicionam elementos na fila
        //diferença é o comportamento quando a fila está cheia
        fila.add("Ana");//se o tamanho for pre definido ele da erro
        fila.offer("Bia");//retorna verdadeiro ou falso
        fila.add("Carlos"); // add retorna falso
        fila.offer("Daniel");//offer lança uma exceção
        fila.add("Rafaela");
        fila.offer("Gui");
        //diferença é o comportamento quando a fila está VAZIA
        //peek e element - obter o próximo elemento da fila (sem remover)
        System.out.println(fila.peek());//peek ele lê o elemento da lista mas não remove o elemento - retorna null se a fila estiver vazia
        System.out.println(fila.element());

        //fila.clear(); limpar fila
        //fila.isEmpty(); ver se a fila esta vazia
        //fila.size(); ver tamanho da fila
        //fila.contains() ver se contem elemento na fila


        System.out.println(fila.poll());//retorna o primeiro elemento da fila ja removendo, quando não houver mais elementos ele retona null




//OBSERVAÇAO

//.add() lançará uma exceção caso a fila esteja cheia.

//.offer() retorna falso caso a fila esteja cheia.





    }
}
