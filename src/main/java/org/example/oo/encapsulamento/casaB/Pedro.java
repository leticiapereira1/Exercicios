package org.example.oo.encapsulamento.casaB;

import org.example.oo.encapsulamento.casaA.Ana;

public class Pedro extends Ana {


    void testeAcessos() {

//        segredo
//        facoDentroDeCasa
//        formaDeFalar
//        todosSabem
//        System.out.println(segredo);// apenas visivel dentro da classe a qual pertence
//        System.out.println(facoDentroDeCasa);// apenas é visivel dentro do mesmo pacote
        System.out.println(formaDeFalar);
        System.out.println(todosSabem);

    }
}
