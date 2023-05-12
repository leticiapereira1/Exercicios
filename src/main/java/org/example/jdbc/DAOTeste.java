package org.example.jdbc;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.sql.SQLOutput;

public class DAOTeste {

    public static void main(String[] args) {

        DAO dao = new DAO();

        String sql = "INSERT INTO PESSOAS (NOME) VALUES (?)";
        System.out.println(dao.incluir(sql,"Ana Julia"));
        System.out.println(dao.incluir(sql,"joão Carlos"));
        dao.incluir(sql,"Ana Julia");
        dao.incluir(sql,"joão Carlos");

        dao.close();


    }


}
