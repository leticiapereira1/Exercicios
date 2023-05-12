package org.example.oo.abstrato;

public abstract class Mamifero {
    //classe do tipo abstrata ele pode ficar com método inacabado

    public String mover (){
        return "Usando leite";
    }
    public abstract String mamar ();

    public boolean respirar() {
        return false;
    }
}
