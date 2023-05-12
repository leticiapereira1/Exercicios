package org.example.fundamentos;

public class PrimitivoVsObjeto {

    public static void main(String[] args) {

        //tudo em java é um objeto exceto os 8 tipos primitivos
        //wrappers são a versão objeto dos tipos primitivos

        String s = new String("Texto");
        s.toUpperCase();
        int a = 123;
        System.out.print(a);
    }

}
