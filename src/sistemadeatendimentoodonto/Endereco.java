/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemadeatendimentoodonto;

/**
 *
 * @author lourivaldo
 */
public class Endereco {

    private String logradouro;
    private int numero;
    private String cidade;
    private String estado;
    private String cep;
    private String telefoneResid;
    private String bairro;

    public Endereco() {
    }
    
    public Endereco(String endereco, int numero, String cidade, String estado, String cep, String telefoneResid, String bairro) {
        this.logradouro = endereco;
        this.numero = numero;
        this.cidade = cidade;
        this.estado = estado;
        this.cep = cep;
        this.telefoneResid = telefoneResid;
        this.bairro = bairro;
    }

    /**
     * @return the endereco
     */
    public String getLogradouro() {
        return logradouro;
    }

    /**
     * @param logradouro the endereco to set
     */
    public void setEndereco(String logradouro) {
        this.logradouro = logradouro;
    }

    /**
     * @return the numero
     */
    public int getNumero() {
        return numero;
    }

    /**
     * @param numero the numero to set
     */
    public void setNumero(int numero) {
        this.numero = numero;
    }

    /**
     * @return the cidade
     */
    public String getCidade() {
        return cidade;
    }

    /**
     * @param cidade the cidade to set
     */
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    /**
     * @return the estado
     */
    public String getEstado() {
        return estado;
    }

    /**
     * @param estado the estado to set
     */
    public void setEstado(String estado) {
        this.estado = estado;
    }

    /**
     * @return the cep
     */
    public String getCep() {
        return cep;
    }

    /**
     * @param cep the cep to set
     */
    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getTelefoneResid() {
        return telefoneResid;
    }

    /**
     * @param telefoneResid
     */
    public void setTelefoneResid(String telefoneResid) {
        this.telefoneResid = telefoneResid;
    }

    public String getBairro() {
        return bairro;
    }

    /**
     * @param bairro the dataNascimento to set
     */
    public void setBairro(String bairro) {
        this.bairro = bairro;

    }

}
