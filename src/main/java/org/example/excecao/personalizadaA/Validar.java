package org.example.excecao.personalizadaA;

import org.example.excecao.Aluno;

public class Validar {

    private Validar (){}

    public static void aluno (Aluno aluno){
        if (aluno == null){
            throw new IllegalArgumentException("O aluno esta nulo");
        }
        if (aluno.nome == null || aluno.nome.trim().isEmpty()){
            throw new StringVaziaException("Nome");
        }
        if(aluno.nota < 0 || aluno.nota > 10){
            throw new NumeroForaIntervaloException("Nota");
        }

    }



}
