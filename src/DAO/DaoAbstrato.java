package DAO;

import BD.Conexao;
import java.sql.Connection;

/**
 *
 * @author klebsonsantana
 * @param <T>
 */
public abstract class DaoAbstrato<T> {

    // metodo Connection
    protected Connection connection;
    
    public DaoAbstrato() {
        //a variavel conection referencia ha um novo objeto Conexoes
        this.connection = new Conexao().getConnection();
    }

    public abstract boolean adicionar(T tipoClasse);

    public abstract void editar(T tipoClasse);

    public abstract void remover(T tipoClasse);

    public abstract T procurar(int id);

}
