package org.example.oo.heranca.teste;

import org.example.oo.heranca.Heroi;
import org.example.oo.heranca.Mostro;

public class Jogo {
    public static void main(String[] args) {

        Mostro monstro = new Mostro();
        monstro.x = 10;
        monstro.y = 10;

        Heroi heroi = new Heroi(10,11);
        heroi.x = 10;
        heroi.y = 11;


        System.out.println("Monstro tem=> " + monstro.vida);
        System.out.println("Heroi tem=> " + heroi.vida);

        monstro.atacar(heroi);
        heroi.atacar(monstro);

        System.out.println("Monstro tem=> " + monstro.vida);
        System.out.println("Heroi tem=> " + heroi.vida);




    }
}
