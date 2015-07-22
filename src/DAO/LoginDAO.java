/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.PreparedStatement;

/**
 *
 * @author klebsonsantana
 */
public class LoginDAO extends DaoAbstrato<Pessoa> {
    ResultSet login = null; 
    String sql = "SELECT RG FROM bd_sistema_atendimento_odonto.pessoa;";

    
        try{
   // Statement stm= connection.getConnections().createStatement(); 
    PreparedStatement stmt = connection.prepareStatement(sql);
        login = stmt.executeQuery(sql);
        stmt.execute();
        stmt.close();
    }
    catch (Exception e

    
        ){ 
        e.printStackTrace();
    }

    public void comparaLogin() {
        if (login != null) {
            while (login.next()) {
            }
        }
