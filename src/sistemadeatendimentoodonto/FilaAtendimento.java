/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemadeatendimentoodonto;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author klebsonsantana
 * 
 * essa implementação permite guardar qualquer tipo de objeto
 * TIPOS GENERICOS
 */
public class FilaAtendimento {

    //
    private List<Pessoa> pessoas = new ArrayList<>();

    public void insere(Pessoa pessoa) {
        // implementação
        this.pessoas.add(pessoas.size(),pessoa);
    }

    public Pessoa remove() {
        // implementação
        return this.pessoas.remove(0);
    }

    public boolean vazia() {
        // implementação
        return this.pessoas.size() == 0;
    }

   

    
}
