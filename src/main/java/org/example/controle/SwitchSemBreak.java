package org.example.controle;

import java.util.Scanner;

public class SwitchSemBreak {
    public static void main(String[] args) {

        //Sem o break ele vai trazer a tela a condicional que traz a cor da faixa correspondente e todas antes da faixa selecionada

        String faixa = "roxa";
        switch (faixa.toLowerCase()){
            case "preta":
                System.out.println(" Sei o Bassai-Dai...");
            case "marron":
                System.out.println(" Sei o teki shodan...");
            case "roxa":
                System.out.println(" Sei o Godan...");
            case "verde":
                System.out.println(" Sei o Yodan...");
            case "laranja":
                System.out.println(" Sei o sandan...");
            case "vermelha":
                System.out.println(" Sei o Nidan...");
            case "amarela":
                System.out.println(" Sei o shodan...");
        }
    }
}
