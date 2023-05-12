package org.example.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CriarBanco {

    public static void main(String[] args)  throws SQLException {

        String url = "jdbc:mysql://localhost:";
        String usuario = "root";
        String senha = "12345678";

        Connection conexao = DriverManager.getConnection(url,usuario,senha);

        System.out.println("conexão executada com sucesso!");

        Statement statement = conexao.createStatement();
        statement.execute("CREATE DATABASE curso_java");

        System.out.println("banco criado com sucesso!");


        conexao.close();


    }
}
