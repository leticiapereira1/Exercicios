package org.example.controle.classe;

public class AreaCir {

    double raio;

    static double PI = 3.14;// ser static significa que ele apenas pertence a classe e nao a instancia.

    AreaCir(double raioInicial){
        raio = raioInicial;
    }

    double area () {
        return  PI * Math.pow(raio,2);
    }


}
