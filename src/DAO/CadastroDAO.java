/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import BD.Conexoes;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import sistemadeatendimentoodonto.Cadastro;

/**
 *responsáveis pelo CRUD (Create, Retrieve, Update, Delete – ou 
 * – Criar, Consultar, Alterar, Deletar), isto é, dados de persistência.
 * @author klebsonsantana
 */
public class CadastroDAO {
     Connection connection;
     String nome;
     String rg;
     String cpf;
     String dataNascimento;
     String email;
     String telefone;
     String endereco;
     String numero;
     String cidade;
     String estado;
     String cep;
    
    
    //construtor UsuarioDao
    public CadastroDAO(){
        //a variavel conection referencia ha um novo objeto Conexoes
        this.connection = new Conexoes().getConnection();
        
    }
    
    public void adiciona(Cadastro cadastro){
        String sql = "INSERT INTO CADASTRO(NOME,RG,CPF,DATANASCIMENTO,EMAIL,TELEFONE,ENDERECO,NUMERO,CIDADE,ESTADO,CEP)"
                + "VALUES(?,?,?,?)";
        try {

           PreparedStatement stmt = connection.prepareStatement(sql);
           stmt.setString(1, cadastro.getNome());
           stmt.setString(2, cadastro.getCpf());
           stmt.setString(3, cadastro.getEmail());
           stmt.setString(4, cadastro.getTelefone());
           stmt.execute();
           stmt.close();

        } catch (SQLException u) {
            throw new RuntimeException(u);
        }
        
    }
}
