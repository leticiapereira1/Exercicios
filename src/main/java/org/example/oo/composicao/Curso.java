package org.example.oo.composicao;

import java.util.ArrayList;
import java.util.List;

public class Curso {

    public final String nome;

    public final List<Aluno> alunos = new ArrayList<>();

    Curso(String nome){
        this.nome = nome;
    }

    void adicionarAluno (Aluno aluno){
        this.alunos.add(aluno);
        aluno.cursos.add(this);
    }
}
