package org.example.oo.encapsulamento;

public class Pessoa {

    private String sobrenome;
    private String nome;
    public int idade;

    public Pessoa( String nome, String sobrenome,int idade){
        setIdade(idade);
        setNome(nome);
        setSobrenome(sobrenome);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    //getter
    public int getIdade (){
        return idade;
    }
    //sette
    public void setIdade (int novaIdade){
        if(novaIdade >= 0 && novaIdade <= 120){
            this.idade = novaIdade;
        }

    }

    public String toString () {
        return "Olá eu sou o "+ getNome() + " e tenho " + getIdade() + " anos. ";
    }


}
