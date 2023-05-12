package org.example.controle.classe;

public class ValorNulo {
    public static void main(String[] args) {
        String s1 ="";
        System.out.println(s1.concat("!!"));//é possivel concatenar valores a partir de uma string vazia

        String s2 = null;
        System.out.println(s2.concat("??")); //não pode acessar nem atributos nem metodo de variavel nula ou que nao aponta a um objeto real na memoria
    }
}
