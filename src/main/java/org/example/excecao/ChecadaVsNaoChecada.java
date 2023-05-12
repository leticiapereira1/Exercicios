package org.example.excecao;

public class ChecadaVsNaoChecada {

    public static void main(String[] args) {
//atalho para try catch Ctrl+Alt+T
        try {
            geraErro1();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        try {
            geraErro2();
        } catch (Throwable e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Fim :)");
    }

    //não checado ou não verificado
    static void geraErro1(){
       throw new RuntimeException("Ocorreu erro #1");// throw- lança a excecao sem ela o erro não aparece no console

    }

    //excecao checada ou verificada colocando - throws Exception
    static void geraErro2(){
        throw new RuntimeException("Ocorreu erro #2");

    }
}

