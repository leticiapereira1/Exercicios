package org.example.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class ExcluirPessoa {

    public static void main(String[] args) throws SQLException {

        Scanner entrada = new Scanner(System.in);
        System.out.println("Informe o código: ");
        int codigo = entrada.nextInt();


        Connection conexao = FabricaConexao.getConexao();
        String sql = "DELETE FROM PESSOAS WHERE CODIGO = ?";


        PreparedStatement statement = conexao.prepareStatement(sql);
        statement.setInt(1, codigo);

        if(statement.executeUpdate() > 0){
            System.out.println("Pessoa excluída com sucesso!!");
        }else{
            System.out.println("Nada feito!");
        }

        conexao.close();
        entrada.close();

    }
}
