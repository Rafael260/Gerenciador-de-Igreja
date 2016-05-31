/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pessoas;

import Evt.Endereco;
import java.util.Date;

/**
 *
 * @author Rafael
 */
public class MembroOld extends PessoaOld {
    protected String cpf;
    protected Date nascimento;
    protected Date batismo_apres;
    
    public MembroOld(String cpf, Date data_nascimento, Date data_batismo_apres, int id, String nome, String sobrenome, char estado_civil, String numero_telefone, Endereco endereco) {
        super(id, nome, sobrenome, estado_civil, numero_telefone, endereco);
        this.cpf = cpf;
        this.nascimento = data_nascimento;
        this.batismo_apres = data_batismo_apres;
    }

    public MembroOld(String cpf, Date data_nascimento, boolean lider, boolean professor, int id, String nome, String sobrenome, char estado_civil, String numero_telefone, Endereco endereco) {
        super(id, nome, sobrenome, estado_civil, numero_telefone, endereco);
        this.cpf = cpf;
        this.nascimento = data_nascimento;
    }
    
    /////////////////////// <GETS E SETS> ////////////////////////////////////

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Date getData_nascimento() {
        return nascimento;
    }

    public void setData_nascimento(Date data_nascimento) {
        this.nascimento = data_nascimento;
    }

    public Date getData_batismo_apres() {
        return batismo_apres;
    }

    public void setData_batismo_apres(Date data_batismo_apres) {
        this.batismo_apres = data_batismo_apres;
    }
    
    /////////////////////// </GETS E SETS> ////////////////////////////////////
}