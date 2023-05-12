package org.example.oo.heranca;

public class Jogador {

    public int vida = 100;
    public int x;
    public int y;


    Jogador (int x, int y){
        this.x=x;
        this.y=y;
    }


    public boolean atacar(Jogador oponente){
        int deltaX = Math.abs(x - oponente.x);
        int deltay = Math.abs(y - oponente.y);

        if(deltaX == 0 && deltay ==1){
            oponente.vida -= 10;
            return true;
        }else if (deltaX == 1 && deltay == 0){
            oponente.vida -= 10;
        }
            return true;
    }

    boolean andar (Direcao direcao) {
        switch (direcao){
            case NORTE:
            y--;
            break;
            case LESTE:
                x++;
                break;
            case SUL:
                y++;
            case OESTE:
                x--;
                break;

        }
        return true;
        }

    }




