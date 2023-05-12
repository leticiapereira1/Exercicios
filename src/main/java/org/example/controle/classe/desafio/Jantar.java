package org.example.controle.classe.desafio;

public class Jantar {
    public static void main(String[] args) {

        Comida c = new Comida("Lasanha", 0.200);

        Pessoa p = new Pessoa("João",67);

        System.out.println("Dados antes de Jantar");
        System.out.println("Nome da pessoa: " + p.nome);
        System.out.println("Nome da comida" + c.nomeComida);
        System.out.println("Peso atual:" + p.peso);

        System.out.println("Dados depois de Jantar");
        System.out.println("Nome da pessoa: " + p.nome);
        System.out.println("Nome da comida" + c.nomeComida);
        System.out.println("Peso após jantar:" + (p.peso + c.pesoComida));

    }
}
