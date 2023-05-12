package org.example.streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class FilterGatinhos {

    public static void main(String[] args) {

        Gatinhos g1 = new Gatinhos("Bolinha",2);
        Gatinhos g2 = new Gatinhos("Milk",6);
        Gatinhos g3 = new Gatinhos("Peludinho",9);

        List <Gatinhos> gatos = Arrays.asList(g1,g2,g3);

        Predicate <Gatinhos> nomeGato = g -> g.nome == "Milk";



        gatos.stream().filter(g -> g.nome == "Bolinha" && g.idade == 2).map(g -> g.nome + " - " + g.idade + " anos").forEach(System.out::println);



    }
}
