package org.example.lambdas;

import java.util.function.Predicate;

public class PredicadoComposicoes {
    public static void main(String[] args) {

        Predicate<Integer> isPar = num -> num % 2 == 0;
        Predicate<Integer> istresDigitos = num -> num >= 100 && num <= 999;

        System.out.println(isPar.and(istresDigitos).negate().test(122));

        System.out.println(isPar.or(istresDigitos).test(123));


    }
}
