package org.example.controle;

public class For3 {
    public static void main(String[] args) {

        int i = 0;//declarando a variavel fora do escopo do for ela fica disponível fora do escopo
        for(; i < 10; i ++){
            System.out.println(i);
        }
        System.out.println("Saiu do for...");
        System.out.println(i);
    }
}
