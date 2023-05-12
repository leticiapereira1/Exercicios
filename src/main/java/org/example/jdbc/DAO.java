package org.example.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DAO {
    private Connection conexao;

    public int incluir(String sql, Object...atributos){
        try{
            PreparedStatement preparedStatement = getConexao().prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);
            adicionarAtributos(preparedStatement, atributos);

            if(preparedStatement.executeUpdate() > 0){
                ResultSet resultSet = preparedStatement.getGeneratedKeys();

                if(resultSet.next()){
                    return resultSet.getInt(1);
                }
            }

            return -1;

        }catch (SQLException e){
            throw new RuntimeException(e);
        }
    }

    public void close(){
        try {
            getConexao().close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }finally {
            conexao = null;
        }
    }
    private  void adicionarAtributos (PreparedStatement statement, Object[] atributos) throws SQLException {
        for(Object atributo: atributos){
            int indice = 1;
            if(atributo instanceof String){
                statement.setString(indice, (String) atributo);
            } else if (atributo instanceof Integer){
                statement.setInt(indice, (Integer) atributo);

            }
        }
    }

    private Connection getConexao (){
        try {
            if(conexao != null && !conexao.isClosed()){
                return conexao;
            }
        } catch (SQLException e) {

        }
        conexao = FabricaConexoesNovo.getConexao();
        return conexao;
    }
}
