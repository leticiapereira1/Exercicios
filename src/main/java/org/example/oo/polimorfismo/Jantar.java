package org.example.oo.polimorfismo;

public class Jantar {

    public static void main(String[] args) {

        Pessoa convidado = new Pessoa(99.65);

        Arroz ingrediente1 = new Arroz(0.250);

        Feijao ingrediente2 = new Feijao(0.180);

        System.out.println(ingrediente1);
        System.out.println(ingrediente2);

        System.out.println(convidado.getPeso());

        Sorvete sobremesa = new Sorvete(0.4);

        convidado.comer(sobremesa);

        System.out.println(convidado.getPeso());





    }


}
