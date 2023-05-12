package org.example.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class AlterarNomePessoa {
    public static void main(String[] args) throws SQLException {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Infome o código da pessoa: ");
        int codigo = entrada.nextInt();

        String select = "SELECT * FROM Pessoas WHERE codigo = ?";
        String update = "UPDATE PESSOAS SET NOME = ? WHERE CODIGO = ?";
        Connection conexao = FabricaConexao.getConexao();

        PreparedStatement statement = conexao.prepareStatement(select);

        statement.setInt(1, codigo);
        ResultSet r = statement.executeQuery();

        if(r.next()){
            Pessoa p = new Pessoa(r.getInt(1), r.getString(2));
            System.out.println("O nome atual é: " + p.getNome());
            entrada.nextLine();

            System.out.print("Informe o novo nome: ");
            String novoNome = entrada.nextLine();



        statement.close();
        statement = conexao.prepareStatement(update);
        statement.setString(1, novoNome);
        statement.setInt(2,codigo);
        statement.execute();

            System.out.println("Pessoa alterada com sucesso!");
            


        }

    }
}
