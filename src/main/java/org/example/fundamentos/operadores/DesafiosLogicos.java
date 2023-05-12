package org.example.fundamentos.operadores;

public class DesafiosLogicos {
    public static void main(String[] args) {
        //trabalho na terça (v ou f)
        //trabalho na quinta (v ou f)
// se um dia de trabalho der certo irei comprar uma tv de 32 polegadas e a familia ira tomar sorvete no shopping
// se os dois dias de trabalho derem certo, irei comprar uma tv de 50 polegadas e a familia ira tomar sorvete no shopping
//se os dois trabalhos derem errados não comprarei nenhuma das tvs e não levarei a familia para tomar sorvete no shopping

        boolean trabalho1 = true;
        boolean trabalho2 = false;

        boolean comprouTV50 = trabalho1 && trabalho2;

        System.out.println("Comprou TV 50 polegadas? " + comprouTV50);

        boolean comprouTV32 = trabalho1 ^ trabalho2;

        System.out.println("Comprou TV 32 polegadas?" + comprouTV32);




    }
}
