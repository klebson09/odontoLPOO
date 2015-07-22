package DAO;

import BD.Conexoes;
import java.sql.Connection;
import java.util.ArrayList;

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
        this.connection = new Conexoes().getConnection();
    }

    public abstract void adicionar(T tipoClasse);

    public abstract void editar(T tipoClasse);

    public abstract void remover(T tipoClasse);

    public abstract T procurar(int id);

}
