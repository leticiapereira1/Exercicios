package org.example.controle.classe;

public class Data {

    int dia;
    int mes;
    int ano;

    Data (){
       // dia = 31;
        //mes = 12;
       // ano = 2020;
        //chamando o this como uma função dentro dos parametros como metodo
        //this usado como metodo significa que voce esta chamando um construtor
        //usar o this de um construtor dentro de um construtor para chamar outro construtor

        this(1,1,1970);

        final int x; //quando é uma constante precisa ser inicializado informando o valor na variavel ou nos parametros do construtor

    }
    Data (int dia, int mes, int ano){
        //this serve para referenciar parametros e atributos que possuem o mesmo nome dai usamos o this para referenciar o objeto que esta sendo criado naquele momento
        //this usado para referenciar o objeto atual
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;

        //int a;//variaveis criadas dentro de um metodo ou construtores não são inicializadas por padrão, somente dentro da classe.
        int a = 3;
        System.out.println(a);
    }

    String obterDataFormatada(){
       String formato = "%d/%d/%d"; //variavel fora do metodo e dentro da classe pode ser uma variavel de instancia ou de classe, quando a variavel fica dentro de um metodo como
        //neste caso dizenos que esta variavel´é local. variavel local fica disponível apenas apos a linha da declaração dela
       // final String formato = "%d/%d/%d"; com este 'final' ele passa a ser uma constante local pois fica dentro do metodo
        return String.format("%d/%d/%d",this.dia, this.mes, this.ano); //metodos que pertencem a instancia (não static) podem ser referenciados pelo this

        //return String.format("%d/%d/%d", dia, mes, ano);
    }


}
