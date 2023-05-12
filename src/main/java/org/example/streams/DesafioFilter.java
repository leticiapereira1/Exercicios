package org.example.streams;

import org.example.streams.Produto;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class DesafioFilter {
    public static void main(String[] args) {

        Produto p1 = new Produto("Lapis", 2.80, 0.35);
        Produto p2 = new Produto("Notebook", 2999.00, 0.35);
        Produto p3 = new Produto("Caderno", 11.99, 0.35);
        Produto p4 = new Produto("Impressora", 400.99, 0.35);
        Produto p5 = new Produto("Ipad", 1111.99, 0.35);
        Produto p6 = new Produto("Relogio", 123.99, 0.35);
        Produto p7 = new Produto("Monitor", 751.99, 0.35);

        List<Produto> produtos = Arrays.asList(p1, p2, p3, p4, p5, p6, p7);

        //Filter, filter, map

        Predicate<Produto> superPromocao = p -> p.desconto >= 0.3;
        Predicate<Produto> freteGratis = p -> p.valorFrete >= 0;
        Predicate<Produto> produtoRelevante = p -> p.preco >= 500;

        Function<Produto, String> chamadaPromocional = p -> "Aproveite! " + p.nome + " por R$" + p.preco;
        produtos.stream()
                .filter(superPromocao)
                .filter(freteGratis)
                .filter(produtoRelevante)
                .map(chamadaPromocional)
                .forEach(System.out::println);




    }
}
