package org.example.colecoes;

import java.util.ArrayList;

public class Lista {
    public static void main(String[] args) {

        ArrayList<Usuario> lista = new ArrayList<>();

        Usuario u1 = new Usuario("Ana");

        lista.add(u1);
        lista.add(new Usuario("Carlos"));//0
        lista.add(new Usuario("Lia"));//1
        lista.add(new Usuario("Bia"));//2
        lista.add(new Usuario("Manu"));//3

        System.out.println(lista.get(3));//acessar pelo indice

        System.out.println(">>>>> " + lista.remove(1));

        System.out.println("* " + lista.remove(new Usuario("Manu")));

        System.out.println("tem? " + lista.contains(new Usuario("Lia")));

        System.out.println("++ " + lista.contains(u1));// ele vai localizar porque se trata de um objeto

        for (Usuario u:lista) {
            System.out.println(u.nome);// sem colocar '.nome' ele chama implicitamente o método 'toString'

        }


    }
}
