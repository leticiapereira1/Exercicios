package org.example.jdbc;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ConsultarPessoas2 {

    public static void main(String[] args) throws SQLException {

        Scanner entrada = new Scanner(System.in);

        Connection conexao = FabricaConexao.getConexao();
        String sql = "SELECT * FROM PESSOAS WHERE NOME LIKE ?";

        System.out.print("Informe o trecho a ser localizado: ");
        String pesquisa = entrada.nextLine();

        PreparedStatement statement = conexao.prepareStatement(sql);
        statement.setString(1, "%" + pesquisa + "%");
        ResultSet resultSet = statement.executeQuery();



        List<Pessoa> pessoas = new ArrayList<>();

        while (resultSet.next()){

            int codigo = resultSet.getInt("codigo");
            String nome = resultSet.getString("nome");
            pessoas.add(new Pessoa(codigo,nome));
        }


        for (Pessoa p:pessoas) {
            System.out.println(p.getCodigo() + "==>" + p.getNome());
        }

        statement.close();

        conexao.close();



    }
}
