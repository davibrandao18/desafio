package model;

import java.util.Date;

/**
 * Classe que representa um Usuario
 * 
 * @author Davi Fonseca
 * @version 1.0
 * @since 1.0
 *
 */
public class Usuario  implements java.io.Serializable {
    
    private static final long serialVersionUID = 1L;
    private String nome;
    private String email;
    private String cpf;
    private Date nascimento;
    private String endereco;
    
    /**
     * Void constructor
     */
    public Usuario() {}
    
    /**
     * Constructor
     * 
     * @param nome
     * @param email
     * @param cpf
     * @param nascimento
     * @param endereco
     */
    public Usuario(String nome, String email, String cpf, Date nascimento, String endereco) {
        this.nome = nome;
        this.email = email;
        this.cpf = cpf;
        this.nascimento = nascimento;
        this.endereco = endereco;
    }
    
    //Getters

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public String getCpf() {
        return cpf;
    }

    public Date getNascimento() {
        return nascimento;
    }

    public String getEndereco() {
        return endereco;
    }
    
    //Setters

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setNascimento(Date nascimento) {
        this.nascimento = nascimento;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return "Usuario { Nome=" + nome 
                + ", E-mail=" + email 
                + ", CPF=" + cpf 
                + ", Data de Nascimento=" + nascimento
                + ", Endereco=" + endereco
                + "}";
    };
    
    
    
}