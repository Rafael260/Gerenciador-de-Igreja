/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Evt;

/**
 *
 * @author Rafael
 */
public class Endereco {
    private String rua;
    private String numero;
    private String complemento;
    private String bairro;
    private String cidade;
    private String estado;

    public Endereco(String rua, String numero, String complemento, String bairro, String cidade, String estado) {
        this.rua = rua;
        this.numero = numero;
        this.complemento = complemento;
        this.bairro = bairro;
        this.cidade = cidade;
        this.estado = estado;
    }

    public Endereco(String rua, String numero, String complemento, String bairro, String cidade) {
        this.rua = rua;
        this.numero = numero;
        this.complemento = complemento;
        this.bairro = bairro;
        this.cidade = cidade;
        this.estado = "RN";
    }
    
    /////////////////////// <GETS E SETS> ////////////////////////////////////
    
    public String getRua() {
        return rua;
    }

    public void setRua(String endereco_rua) {
        this.rua = endereco_rua;
    }

    public String geNumero() {
        return numero;
    }

    public void setNumero(String endereco_numero) {
        this.numero = endereco_numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String endereco_complemento) {
        this.complemento = endereco_complemento;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    /////////////////////// </GETS E SETS> ////////////////////////////////////
}
