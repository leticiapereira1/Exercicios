package org.example.fundamentos;

public class TiposPrimitivos {

    public static void main(String[] args) {
        //informações de funcionarios

        //tipos numericos inteiros
        byte anosDeEmpresa = 23;
        short numeroDeVoos = 542;
        int id = 56789;
        long pontosAcumulados = 3_134_845_223L;

        //Tipos numéricos reais
        float salario = 11_445.44F;
        double vendasAcumuladas = 2_991_797_103.01;

        //tipo booleano
        boolean estaDeFerias = false; //true

        //tipo caractere
        char status = 'A';

        //dias de empresa
        System.out.println(anosDeEmpresa * 365);

        //numero de viagens
        System.out.println(numeroDeVoos / 2);

        //pontos por real
        System.out.println(pontosAcumulados / vendasAcumuladas);

        System.out.println( id + ": Ganha -> " + salario);

        System.out.println("férias ? " + estaDeFerias);

        System.out.println( "Status: " + status);





    }
}
