package org.example.excecao.personalizadaA;

import org.example.excecao.Aluno;

public class TestesValidacoes {

    public static void main(String[] args) {

        try {
            Aluno aluno = new Aluno("", -7);
            Validar.aluno(aluno);

            Validar.aluno(null);
        } catch (StringVaziaException e) {
            System.out.println(e.getMessage());
        } catch (NumeroForaIntervaloException | IllegalArgumentException e){
            System.out.println(e.getMessage());
        }

        System.out.println("Fim");
    }




}
