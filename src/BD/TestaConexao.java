/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BD;

import java.sql.Connection;
import java.sql.SQLException;

/**
 *
 * @author klebsonsantana
 */
public class TestaConexao {
    public static void main(String[] args) throws SQLException {
        Connection conexao = new Conexao().getConnection();
        System.out.println("Conexão aberta!");
        conexao.close();
    }
}
