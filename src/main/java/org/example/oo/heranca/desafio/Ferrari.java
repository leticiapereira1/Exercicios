package org.example.oo.heranca.desafio;

public class Ferrari extends Carro implements Esportivo, Luxo {
//implements é usando para implementar uma interface numa classe

    private boolean ligarTurbo;
    private boolean ligarAr;


    public Ferrari (){
        this(315);
    }
    public Ferrari(int velocidadeMaxima) {
        super(velocidadeMaxima);
        setDelta(15);
    }

    @Override
    public //(anotation pertence ao java) validar que esta subscrevendo um metodo que ja existe na classe pai
    void acelerar() {
       velocidadeAtual += 15;

    }

    @Override
    public void ligarTurbo() {
        setDelta(35);

    }

    @Override
    public void desligarTurbo() {
        setDelta(15);

    }

    public void ligarAr(){
        ligarAr = true;

    }

    public void desligarAr(){
        ligarAr = true;

    }

    public int getDelta (){
        if(ligarTurbo && !ligarAr){
        return 35;
    }else if(ligarTurbo && ligarAr){
        return 30;
    }else if (!ligarTurbo && !ligarAr){
            return 20;
        }else{
            return 15;
        }
}
    }
