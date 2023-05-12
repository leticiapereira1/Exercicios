package org.example.controle.classe;

public class Produto {

    //atributos

    String nome;
    double preco;
    static double desconto = 0.25; //valor ficará fixo apenas nesta classe, ele não mudará

    //construtor - ele tem uma nomenclatura padrão onde não recebe parametros nos parenteses, se receber ele sera um metodo e perderá o formato de construtor padrão

    Produto( String nomeInicial, double precoInicial){

        nome = nomeInicial;
        preco = precoInicial;


    }

    Produto (){
        //este construtor seria o padrão e quando o colocamos no código novamente, ele deixa que instanciemos uma classe sem definir um parametro
    }

    //metodos

    double precoComDesconto(){
        return preco * (1 - desconto);
    }
    double precoComDesconto ( double descontoDoGerente){
        return preco * (1 - desconto + descontoDoGerente);
    }





}
