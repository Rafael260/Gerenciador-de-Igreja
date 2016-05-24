/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pessoas;

import Evt.Endereco;

/**
 *
 * @author Rafael
 */
public class Pessoa {
    protected int id;
    protected String nome;
    protected String sobrenome;
    protected char estado_civil;
    protected String telefone;
    protected Endereco endereco;

    public Pessoa(int id, String nome, String sobrenome, char estado_civil, String numero_telefone, Endereco endereco) {
        this.id = id;
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.estado_civil = estado_civil;
        this.telefone = numero_telefone;
        this.endereco = endereco;
    }

    public Pessoa(int id, String nome, String sobrenome, char estado_civil, String numero_telefone) {
        this.id = id;
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.estado_civil = estado_civil;
        this.telefone = numero_telefone;
    }

    public Pessoa(int id, String nome, String sobrenome, char estado_civil) {
        this.id = id;
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.estado_civil = estado_civil;
    }
    
    /////////////////////// <GETS E SETS> ////////////////////////////////////
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public char getEstado_civil() {
        return estado_civil;
    }

    public void setEstado_civil(char estado_civil) {
        this.estado_civil = estado_civil;
    }

    public String getNumero_telefone() {
        return telefone;
    }

    public void setNumero_telefone(String numero_telefone) {
        this.telefone = numero_telefone;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    /////////////////////// </GETS E SETS> ////////////////////////////////////
    
    
}
