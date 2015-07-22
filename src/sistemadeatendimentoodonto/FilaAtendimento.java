/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemadeatendimentoodonto;

import java.util.ArrayList;
import java.util.LinkedList;
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
    private List<Object> objetos = new LinkedList<Object>();

    public void insere(Object objetos) {
        // implementação
        this.objetos.add(objetos);
    }

    public Object remove() {
        // implementação
        return this.objetos.remove(0);
    }

    public boolean vazia() {
        // implementação
        return this.objetos.size() == 0;
    }

   

    
}
