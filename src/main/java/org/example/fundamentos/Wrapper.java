package org.example.fundamentos;

public class Wrapper {
    public static void main(String[] args) {

        //tipos primitivos

        //byte
        byte b = 100;
        Short s = 1000;

        //integer.paseInt(entrada.next())
        Integer i = 10000;
        Long l = 100000L;

        System.out.println (s.toString());
        System.out.println(i * 3);
        System.out.println(l / 3);

        Float f = 123.10F;
        System.out.println(f);

        Double d = 1234.5678;
        System.out.println(d);

        Boolean bo = Boolean.parseBoolean("true");
        System.out.println(bo);
        System.out.println(bo.toString().toUpperCase());

        //Character c = "#"; //char
       // System.out.println(c + "...");

        //se precisar fazer conversão de byte > short > int > long não ha perca de dados e a conversão poderá ser implicita
        //se precisar fazer conversão de long > int> short > byte, pode haver perca de dados pelo tamanho alocado ser menor, e a conversão precisa ser explicita

        //converter valor do tipo inteiro > float = irá perder as casas decimais. ao contrario ele não perde casas decimais pois pode acrescentar um zero no final

        //java analise tipos de valores e nao o conteudo



    }
}
