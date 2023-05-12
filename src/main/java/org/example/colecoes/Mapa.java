package org.example.colecoes;

import java.util.HashMap;
import java.util.Map;

public class Mapa {
    public static void main(String[] args) {

        Map<Integer, String> usuarios = new HashMap<>();
        usuarios.put (1, "Roberto");//put ele adiciona se não existir e substitui caso ja exista
        usuarios.put (2, "Ricardo");
        usuarios.put (3, "Rebeca");
        usuarios.put (4, "Rafaela");

        System.out.println(usuarios.size());//ver tamanho
        System.out.println(usuarios.isEmpty()); //ver se esta vazia
        System.out.println(usuarios.keySet());//conjunto das chaves
        System.out.println(usuarios.values()); // apenas valores
        System.out.println(usuarios.entrySet());//chaves e valores ao mesmo tempo

        System.out.println(usuarios.containsKey(4));//contem chave
        System.out.println(usuarios.containsKey(0));
        System.out.println(usuarios.containsValue("Rebeca"));//contem valor

        System.out.println(usuarios.get(4));//pega apenas a chave
//percorrer pegando apenas as chaves
        for (int chave: usuarios.keySet()) {
            System.out.println(chave);
            
        }

        //percorrer pegando apenas os valores

        for (String valor:usuarios.values()) {
            System.out.println(valor);

        }
        //usar o tipo entry com chaves e valores ao mesmo tempo, com isso precisamos usar o map no foreach

        for (Map.Entry<Integer, String> registro: usuarios.entrySet()){
            System.out.print(registro.getKey());
            System.out.println(registro.getValue());
        }






    }
}
