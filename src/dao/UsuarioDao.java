package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import model.Usuario;;

/**
 * @author Davi Fonseca
 * @version 1.0
 * @since 1.0
 */
public class UsuarioDao {

    public void inserirUsuario(Usuario usuario) {
        String sqlInsert = "INSERT INTO usuario" 
                + "(nome, email, cpf, nascimento, endereco)" 
                + "VALUES (?,?,?,?,?)";

        try (Connection conectar = ConnectionFactory.obtemConexao();
                PreparedStatement pst = conectar.prepareStatement(sqlInsert);) {
            
            pst.setString(1, usuario.getNome());
            pst.setString(2, usuario.getEmail());
            pst.setString(3, usuario.getCpf());
            pst.setDate(4,  new java.sql.Date(usuario.getNascimento().getTime()));
            pst.setString(5, usuario.getEndereco());
            
            pst.execute();

        } catch (SQLException ex) {
            ex.printStackTrace();
        }

    }

}