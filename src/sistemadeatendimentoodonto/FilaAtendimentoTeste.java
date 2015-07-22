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
public class FilaAtendimentoTeste {

    public static void main(String[] args) {
        FilaAtendimento fila = new FilaAtendimento();

        Pessoa pessoas = new Pessoa();
        fila.insere(pessoas);

        Pessoa pessoasRemovido = fila.remove();

        if (fila.vazia()) {
            System.out.println("A fila está vazia");
        }

    }
}
