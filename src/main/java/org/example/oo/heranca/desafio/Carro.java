package org.example.oo.heranca.desafio;

public class Carro {

    final int VELOCIDADE_MAXIMA;

    int getVelocidadeAtual;
    int velocidadeAtual;
    private int delta = 5;

    Carro(int velocidadeMaxima){
        VELOCIDADE_MAXIMA = velocidadeMaxima;
    }


    public void acelerar() {
        if (velocidadeAtual + delta > VELOCIDADE_MAXIMA) {
            velocidadeAtual = VELOCIDADE_MAXIMA;
        } else {
            velocidadeAtual += 5;

        }
    }

    public void freiar(){
        if(velocidadeAtual >=5){
            velocidadeAtual -= 5;
        }else {
            velocidadeAtual =0;
        }

        }
    public String toString(){
        return "Velocidade atual é " + velocidadeAtual + "Km/h";
    }

    public int getDelta() {
        return delta;
    }

    public void setDelta(int delta) {
        this.delta = delta;
    }
}
