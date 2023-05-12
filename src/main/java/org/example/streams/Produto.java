package org.example.streams;

public class Produto {

    final String nome;
    final double preco;
    double valorFrete;

    final double desconto;

    public Produto(String nome, double preco, double desconto) {
        this.nome = nome;
        this.preco = preco;
        this.valorFrete = valorFrete;
        this.desconto = desconto;
    }
}
