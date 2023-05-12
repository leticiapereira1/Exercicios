package org.example.streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class CriandoStreams {
    public static void main(String[] args) {

        //recebe um parametro e não retorna nada =  consumer
        Consumer<String> print = System.out::print;

        Consumer<Integer> println = System.out::print;

        Stream<String> langs = Stream.of("Java ", "Lua ", "JS\n");
        langs.forEach(print);

        String[] maisLangs = { "Python ", "Lisp ", "Perl ", "Go\n" };

        Stream.of(maisLangs).forEach(print);

        Arrays.stream(maisLangs).forEach(print);

        Arrays.stream(maisLangs, 1, 4).forEach(print);

        List<String> outraslangs = Arrays.asList("C ", "PHP ", "Kotlin\n");
        outraslangs.stream().forEach(print);
        outraslangs.parallelStream().forEach(print);

        //gerar stream de forma indefinida - ele fica numa especie de looping infinito
        //Stream.generate(()-> "a").forEach(print);

        //Stream.iterate(0, n -> n + 1).forEach(println);


    }
}
