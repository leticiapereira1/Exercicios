package org.example.streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Match {

    public static void main(String[] args) {

        Aluno a1 = new Aluno("Ana",7.1);
        Aluno a2 = new Aluno("Luna",6.1);
        Aluno a3 = new Aluno("gui",8.1);
        Aluno a4 = new Aluno("Gabi",10);

        List<Aluno> alunos = Arrays.asList(a1, a2,a3,a4);

        Predicate<Aluno> aprovado = a -> a.nota >= 7;
        Predicate<Aluno> Reprovado = aprovado.negate();

        System.out.println(alunos.stream().allMatch(aprovado));// neste resultado precisa demonstrar se todos os alunos passaram caso sim retorna true caso nao retorna false
        System.out.println(alunos.stream().anyMatch(aprovado));// alguma sentença é verdadeira, dai ele retorna com true ou false
        System.err.println(alunos.stream().noneMatch(aprovado));

    }
}
