package org.example.colecoes;

import com.sun.xml.internal.ws.api.client.WSPortInfo;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoBaguncado {

    @SuppressWarnings({"rawtypes","unchecked"})
    public static void main(String[] args) {

        HashSet conjunto = new HashSet();
        //realiza conversões
        conjunto.add (1.2); //double > Double > ele permite tipo primitivo pois converte
        conjunto.add(true); //boolean > Bollean
        conjunto.add("Teste"); //String
        conjunto.add(1); //int > Integer
        conjunto.add('x');

        System.out.println("Tamanho é: " + conjunto.size());

        conjunto.add("Teste");
        conjunto.add('x');
        System.out.println("Tamanho é: " + conjunto.size());

        System.out.println(conjunto.remove("teste"));
        System.out.println(conjunto.remove("Teste"));
        System.out.println("Tamanho é: " + conjunto.size());

        System.out.println(conjunto.contains('x'));
        System.out.println(conjunto.contains('1'));
        System.out.println(conjunto.contains(true));

        Set nums = new HashSet();
        nums.add(1);
        nums.add(2);
        nums.add(3);

        System.out.println(nums);
        System.out.println(conjunto);

        //conjunto.addAll(nums); // União entre dois conjuntos
        conjunto.retainAll(nums);
        System.out.println(conjunto);

        conjunto.clear();
        System.out.println(conjunto);




///observações sobre collections
        //SET - não ordenado (por padrão) - nao garante ordenação
        //nao indexado - nao pode acessar pelo indice (0,1,2)
        //nao aceita repetição - nao pode colocar 2 elementos dentro de um set que são iguais

        //LIST - indexada - consegue acessar o indice (0,1,2)
        //aceita repetição - pode colocar dados repetidos

        //MAP - chave/ valor - chave nao aceita repetição o valor aceita repetição (set  + list)
        //chave não aceita repetição
        //valor aceita repetição

        //QUEUE - implementa fila - FIFO - primeiro a entrar primeiro a sair

        //STACK - implmenta pilha (stack) -
        //LIFO - primeiro que entra é o ultimo a sair







    }
}
