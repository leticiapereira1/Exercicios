package org.example.controle.classe;

public class AreaCirTeste {
    public static void main(String[] args) {

        AreaCir a1 = new AreaCir(10);

        AreaCir a2 = new AreaCir(5);

        AreaCir.PI = 3.1415; //desta forma podemos modificar o valor da variavel static mencionando diretamente a classe dela

        System.out.println(a1.area());


        System.out.println(a2.area());

    }
}
