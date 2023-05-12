package org.example.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class FabricaConexoesNovo {

    public static Connection getConexao() {

        final String url = "jdbc:mysql://localhost/curso_java";
        final String usuario = "root";
        final String senha = "12345678";

        try {
            return DriverManager.getConnection(url,usuario,senha);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
}
