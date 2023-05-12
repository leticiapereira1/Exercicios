package org.example.controle.classe;

public class DataTeste {
    public static void main(String[] args) {

        Data d1 = new Data(1,1,1970);

        Data d2 = new Data();

        System.out.println(d1.obterDataFormatada());
        System.out.println(d2.obterDataFormatada());



    }
}
