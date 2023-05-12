package org.example.colecoes;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class ConjuntoComportado {

    public static void main(String[] args) {

       // Set <String> ListaAprovados = new HashSet <String> (); com o HashSet ele respeita a lista de ordenaçao
        Set <String> ListaAprovados = new TreeSet <String> ();// com o TreeSet ele respeita a lista de ordenaçao
        ListaAprovados.add("Ana");
        ListaAprovados.add("Carlos");
        ListaAprovados.add("Luca");
        ListaAprovados.add("Pedro");

        for(String candidato: ListaAprovados) {
            System.out.println(candidato);//o resultado apresentado não respeita a ordenação
        }
        Set <Integer> nums = new HashSet <> ();
        nums.add(1);
        nums.add(2);
        nums.add(120);
        nums.add(6);

        //nums.get(1) - não é possivel acessar pelo indice
        for(int n: nums){
            System.out.println(n);
        }
    }
}
