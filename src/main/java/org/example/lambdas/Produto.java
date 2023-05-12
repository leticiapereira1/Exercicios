package org.example.lambdas;

public class Produto extends Object{
//a classe mãe de todas as classes do java é a classe 'Object'
    protected final String nome;
    protected final double preco;
    protected final double desconto;

    public Produto(String nome, double preco, double desconto) {
        this.nome = nome;
        this.preco = preco;
        this.desconto = desconto;
    }

    public String toString (){
        double precoFinal = preco * (1-desconto);
                return "Nome: " + nome + " tem preço de R$" + preco;
    }
}
