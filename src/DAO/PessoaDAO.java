package DAO;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import sistemadeatendimentoodonto.Endereco;
import sistemadeatendimentoodonto.Pessoa;

/**
 * responsáveis pelo CRUD (Create, Retrieve, Update, Delete – ou – Criar,
 * Consultar, Alterar, Deletar), isto é, dados de persistência.
 *
 * @author klebsonsantana
 */
public class PessoaDAO extends DaoAbstrato<Pessoa> {

    //construtor UsuarioDao
    public PessoaDAO() {

    }

    @Override
    public boolean adicionar(Pessoa pessoa) {
        String sql = "INSERT INTO PESSOA (NOME,RG,CPF,DATA_NASCIMENTO,EMAIL,TELEFONE,ENDERECO,NUMERO,CIDADE,ESTADO,CEP) "
                + "VALUES(?,?,?,?,?,?,?,?,?,?,?)";
        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, pessoa.getNome());
            stmt.setString(2, pessoa.getRg());
            stmt.setString(3, pessoa.getCpf());

            if (pessoa.getDataNascimento() != null) {
                java.sql.Date date = null;
                date = new java.sql.Date(pessoa.getDataNascimento().getTime());
                stmt.setDate(4, date);
            }

            stmt.setString(5, pessoa.getEmail());
            stmt.setString(6, pessoa.getTelefone());

            Endereco endereco = pessoa.getEndereco();
            stmt.setString(7, endereco.getLogradouro());
            stmt.setInt(8, endereco.getNumero());
            stmt.setString(9, endereco.getCidade());
            stmt.setString(10, endereco.getEstado());
            stmt.setString(11, endereco.getCep());

            stmt.execute();
            stmt.close();
        } catch (SQLException u) {
            return false;
        }
        
        return true;
    }

    @Override
    public void editar(Pessoa tipoClasse) {

    }

    @Override
    public void remover(Pessoa tipoClasse) {

    }

    @Override
    public Pessoa procurar(int id) {
        return null;
    }
}
