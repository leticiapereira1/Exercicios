package org.example.oo.heranca.teste;

import org.example.oo.heranca.desafio.Carro;
import org.example.oo.heranca.desafio.Civic;
import org.example.oo.heranca.desafio.Ferrari;

public class CarroTeste {
    public static void main(String[] args) {

        Carro c1 = new Civic(100);

        c1.acelerar();
        System.out.println(c1);

        c1.acelerar();
        System.out.println(c1);

        c1.acelerar();
        System.out.println(c1);

        Ferrari c2 = new Ferrari(150);

        c2.acelerar();
        c2.freiar();
        System.out.println(c2);

        c2.acelerar();
        System.out.println(c2);

        c2.acelerar();
        System.out.println(c2);





    }
}
