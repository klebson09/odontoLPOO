/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemadeatendimentoodonto;

/**
 *
 * @author klebsonsantana
 */
public class LoginFuncionario {
    String senha;
    String login;
    
    public boolean autentica(String senha, String login) {
    if (this.senha == senha && this.login == login) {
      System.out.println("Acesso Permitido!");
      return true;
    } else {
      System.out.println("Acesso Negado!");
      return false;
    }
  }
    
}
