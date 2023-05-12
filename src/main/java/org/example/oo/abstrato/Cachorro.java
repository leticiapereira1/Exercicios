package org.example.oo.abstrato;

public class Cachorro extends Mamifero  {

    public String mover (){
        return "usando as patas";
    }

    @Override
    public String mamar() {
        return "Usando leite";
    }

}
