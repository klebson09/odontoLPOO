package DAO;

import java.sql.PreparedStatement;
import java.sql.SQLException;
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
    public void adicionar(Pessoa cadastro) {
        String sql = "INSERT INTO PESSOA (NOME,RG,CPF,DATA_NASCIMENTO,EMAIL,TELEFONE,ENDERECO,NUMERO,CIDADE,ESTADO,CEP) "
                + "VALUES(?,?,?,?,?,?,?,?,?,?,?)";
        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, cadastro.getNome());
            stmt.setString(2, cadastro.getRg());
            stmt.setString(3, cadastro.getCpf());
            stmt.setString(4, cadastro.getDataNascimento());
            stmt.setString(5, cadastro.getEmail());
            stmt.setString(6, cadastro.getTelefone());
            stmt.setString(7, cadastro.getEndereco());
            stmt.setString(8, cadastro.getNumero());
            stmt.setString(9, cadastro.getCidade());
            stmt.setString(10, cadastro.getEstado());
            stmt.setString(11, cadastro.getCep());

            stmt.execute();
            stmt.close();

        } catch (SQLException u) {
            throw new RuntimeException(u);
        }
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
