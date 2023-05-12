package org.example.lambdas;

public class CalculoTeste1 {
    public static void main(String[] args) {

        Calculo calculo = new Calculo() {
            @Override
            public double executar(double a, double b) {
                return 0;
            }
        };
        System.out.println(calculo.executar(2,3));


        calculo = new Multiplicar();
        System.out.println(calculo.executar(3,3));
    }
}
