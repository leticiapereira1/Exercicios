package org.example.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TesteConexao {
    public static void main(String[] args) throws SQLException {

//        String url = "jdbc:mysql://localhost:";
//        String usuario = "root";
//        String senha = "12345678";
//
        Connection conexao = FabricaConexao.getConexao();



        System.out.println("conexão executada com sucesso!");
        conexao.close();



    }
}
