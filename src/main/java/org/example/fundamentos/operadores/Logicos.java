package org.example.fundamentos.operadores;

public class Logicos {

    public static void main(String[] args) {

        boolean condicao1 = true;
        boolean condicao2 = 3 > 7;

        System.out.println(condicao1 && condicao2);
        System.out.println(condicao1 || condicao2);
        System.out.println(condicao1 ^ condicao2);
        System.out.println(!!condicao1);
        System.out.println(!condicao2);

        //tabela verdade E (and)
        System.out.println("Tabela verdade E");
        System.out.println(true && true); //= true
        System.out.println(true && false); //= false
        System.out.println(false && true); // = false
        System.out.println(false && false);// = false

        //tabela verdade OU (or)


        System.out.println("Tabela verdade OU");
        System.out.println(true || true); //= true
        System.out.println(true || false); // =True
        System.out.println(false || true); // = true
        System.out.println(false || false);// = false

        //Tabela verdade exclusivo (xor)

        System.out.println("Tabela verdade exclusivo (xor)");
        System.out.println(true ^ true); //= false
        System.out.println(true ^ false); // =True
        System.out.println(false ^ true); // = true
        System.out.println(false ^ false);// = false

        //Tabela verdade NOT

        System.out.println("Tabela verdade NOT");
        System.out.println(!true); //= false
        System.out.println(!false); // =True




    }
}
