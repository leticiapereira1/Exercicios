package org.example.lambdas;

import com.sun.scenario.effect.impl.prism.PrDrawable;

import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Desafio {

    public static void main(String[] args) {

        Produto p = new Produto("Ipad", 3235.89, 0.13);

//        a partir do produto calcular o preço real (com desconto)
//        imposto municipal : >= 2500(8.5%)/<2500 (isento)
//        frete: >= 3000(100)/<3000(50)
//        arredondar: deixar duas casas decimais
//        formatar; R$ 1234.54


        Function<Produto, Double> precoFinal = produto -> produto.preco * (1 - produto.desconto) ;
        UnaryOperator<Double> impostoMunicipal = preco -> preco >= 2500 ? preco * 1.085 : preco;
        UnaryOperator<Double> frete = preco -> preco >= 3000 ? preco + 100 : preco + 50;
        UnaryOperator<Double> arredondar = preco -> Double.parseDouble(String.format("%.2f", preco));
        Function<Double, String> formatar = preco -> ("R$" + preco).replace(",",".");

        String preco = precoFinal
                .andThen(impostoMunicipal)
                .andThen(frete)
                .andThen(arredondar)
                .andThen(formatar)
                .apply(p);

        System.out.println("O preço final é: " + preco);


    }
}
