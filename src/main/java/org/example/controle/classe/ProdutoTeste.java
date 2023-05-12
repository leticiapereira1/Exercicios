package org.example.controle.classe;

public class ProdutoTeste {

    public static void main(String[] args) {
       //criar instancias que irão acessar a outra classe 'Produto', estando no mesmo pacote nao precisamos importar a classe

        //instancias criadas:
       Produto p1 = new Produto("Notebook", 1800.00);// dessa forma estamos passando os parametros delimitados no construtor produto que é uma string
       //p1.nome = "Notebook"; //podemos ficar sem o valor na variavel e ter apenas o parametro no construtor
        p1.nome = "Notebook";
        p1.preco = 4356.89;
        Produto.desconto = 0.25;

       Produto p2 = new Produto();// dessa forma estamos passando os parametros delimitados no construtor produto que é uma string
        p2.nome = "Caneta Preta";// ou podemos ter na variavel sem estar no construtot
        p2.preco =0.89;
        p2.desconto = 0.05;

        System.out.println(p1.nome + " "+ p1.precoComDesconto());//chamando 'nome' que é sem parenteses estou chamando um atributo
        System.out.println(p2.nome + " "+ p2.precoComDesconto());

        //double precoFinal1 = p1.preco * (1 - p1.desconto); refatorado utilizando o método 'precoComDesconto'
        //double precoFinal2 = p2.preco * (1 - p2.desconto); refatorado utilizando o método 'precoComDesconto'

        double precoFinal1 = p1.precoComDesconto(0); //chamando 'precoComDesconto' com parenteses estou chamando um método
        double precoFinal2 = p2.precoComDesconto(0.2);

        double mediaCarrinho = ((precoFinal1 + precoFinal2) / 2);
        System.out.printf ("Média do carrinho = R$%.2f.", mediaCarrinho);

        //exemplo: System(classe).out(atributo).println()(metodo)



    }

}
