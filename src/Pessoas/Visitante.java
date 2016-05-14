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
public class Visitante extends Pessoa{
    protected String igreja_origem;

    public Visitante(String igreja_origem, int id, String nome, String sobrenome, char estado_civil) {
        super(id, nome, sobrenome, estado_civil);
        this.igreja_origem = igreja_origem;
    }

    public Visitante(String igreja_origem, int id, String nome, String sobrenome, char estado_civil, String numero_telefone) {
        super(id, nome, sobrenome, estado_civil, numero_telefone);
        this.igreja_origem = igreja_origem;
    }

    public Visitante(String igreja_origem, int id, String nome, String sobrenome, char estado_civil, String numero_telefone, Endereco endereco) {
        super(id, nome, sobrenome, estado_civil, numero_telefone, endereco);
        this.igreja_origem = igreja_origem;
    }

    public Visitante(int id, String nome, String sobrenome, char estado_civil) {
        super(id, nome, sobrenome, estado_civil);
    }

    public Visitante(int id, String nome, String sobrenome, char estado_civil, String numero_telefone) {
        super(id, nome, sobrenome, estado_civil, numero_telefone);
    }

    public Visitante(int id, String nome, String sobrenome, char estado_civil, String numero_telefone, Endereco endereco) {
        super(id, nome, sobrenome, estado_civil, numero_telefone, endereco);
    }
    
    /////////////////////// <GETS E SETS> ////////////////////////////////////

    public String getIgreja_origem() {
        return igreja_origem;
    }

    public void setIgreja_origem(String igreja_origem) {
        this.igreja_origem = igreja_origem;
    }
    
    /////////////////////// </GETS E SETS> ////////////////////////////////////
}
