package br.com.pilgriman.part1_part2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;



public class ConnectionJDBC {
    public static void main(String[] args) {
//modo 1 de efetuar uma conexao com o banco de dados
        /*String urlConnection = "jdbc:mysql://localhost/digital_innovation_one";


        try { Connection conn = DriverManager.getConnection(urlConnection,"root", "");
            System.out.println("SUCESSO!");
        } catch (Exception e) {
            System.out.println("FALHA");
        }


    }*/

        //modo 2 :

        String driver = "mysql";
        String dataBaseAddress = "localhost";
        String dataBaseName = "digital_innovation_one ";
        String user = "root";
        String password = "";

        StringBuilder sb = new StringBuilder("jbdc")
                .append(driver).append("://")
                .append(dataBaseAddress).append("/")
                .append(dataBaseName);

        String urlConnection = sb.toString();

        try (Connection conn = DriverManager.getConnection(urlConnection, user, password)){
            System.out.println("SUCESSO!");
        } catch (SQLException e) {
            System.out.println("FALHA");

        }

    }
}




