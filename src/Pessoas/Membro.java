/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pessoas;

import java.util.Date;

/**
 *
 * @author Rafael
 */
public class Membro extends Pessoa {
    protected String cpf;
    protected Date data_nascimento;
    protected Date data_batismo_apres;
    protected boolean lider;
    protected boolean professor;

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Date getData_nascimento() {
        return data_nascimento;
    }

    public void setData_nascimento(Date data_nascimento) {
        this.data_nascimento = data_nascimento;
    }

    public Date getData_batismo_apres() {
        return data_batismo_apres;
    }

    public void setData_batismo_apres(Date data_batismo_apres) {
        this.data_batismo_apres = data_batismo_apres;
    }

    public boolean isLider() {
        return lider;
    }

    public void setLider(boolean lider) {
        this.lider = lider;
    }

    public boolean isProfessor() {
        return professor;
    }

    public void setProfessor(boolean professor) {
        this.professor = professor;
    }
    
    
}
