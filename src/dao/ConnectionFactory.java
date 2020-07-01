package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

    static {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public static Connection obtemConexao() throws SQLException {

        // Informe usuario e senha de acesso ao Banco de dados
        String usuario = "";
        String password = "";

        try {
            return DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/desafio?useSSL=false&useTimezone=true&serverTimezone=America/Sao_Paulo" + "&user="
                            + usuario + "&password=" + password);
        } catch (SQLException e) {
            System.out.println("NAO foi estabelecida conexao com o banco!");
            throw new RuntimeException(e);
        }
    }

}