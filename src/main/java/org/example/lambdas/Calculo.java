package org.example.lambdas;

public interface Calculo {
//interface funcional aceita apenas um metodo
    double executar (double a, double b);

    default String legal(){
        return "Legal";
    }

    static String muitoLegal(){
        return "Muito legal";
    }
}
