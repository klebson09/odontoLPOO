/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author klebsonsantana
 */
public class Conexoes {
    public Connection getConnection() {
        try {
            //return DriverManager.getConnection("jdbc:mysql://192.168.0.49/biblioteca","usuario49","B@s3@t3st15");
            return DriverManager.getConnection("jdbc:mysql://localhost/bd_sistema_atendimento_odonto","root","");
        }
        catch(SQLException excecao) {
            throw new RuntimeException(excecao);
        }
    }
}
