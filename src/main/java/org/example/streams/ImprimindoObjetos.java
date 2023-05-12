package org.example.streams;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class ImprimindoObjetos {

    public static void main(String[] args) {

   List<String> aprovados = Arrays.asList("Lu", "Gui", "Luca", "Ana");
//        for(int i = 0; i < aprovados.size(); i++){
//            System.out.println(aprovados.get(i));
//        }


        for (String nome: aprovados) {
            System.out.println(nome);

        }

        System.out.println("\nUsando Iterator....");//interface que questiona se ainda ha elemento e traz a tela e uando while para controlar o laço de repetição
        Iterator<String> it = aprovados.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }

        //interface iteração de forma interna
        System.out.println("\nUsando Stream....");
        Stream<String> stream = aprovados.stream();
        stream.forEach(System.out::println);//laço interno



    }


}

//streams

//operadores com mais de 30 metodos

// 7 metodos estaticos

//operadores de construção - builds - criar stream (a partir de uma lista por exemplo)
//operadores intermediaria - intermediarias ops - compor funções, que ficam encadeadas (sempre retornam novas streams)
//operação terminal - terminal ops - gera algo diferente de uma stream (ex média entre valores - retorna valor double que não é uma stream)

//streams ordenadas ou não

//stream sequencial (um dado por vez)

//paralelo stream internamente ele cria varias linhas de execução paralelas, onde essas linhas são independentes


