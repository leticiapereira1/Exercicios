package org.example.jdbc;

public class DiretorioJavaHome {

        public static void main(String[] args) {
            System.out.println("Get Java Home Directory = " + System.getProperty("java.home"));
            System.out.print("Java Specification Version: ");
            System.out.println(System.getProperty("java.specification.version"));
            System.out.print("java Runtime Environment (JRE) version: ");
            System.out.println(System.getProperty("java.version"));

    }
}
