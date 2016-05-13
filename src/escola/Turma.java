/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package escola;

import Pessoas.Membro;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Rafael
 */
public class Turma {
    
    private Date data_inicio;
    private Date data_fim;
    List<Membro> alunos;

    public Date getData_inicio() {
        return data_inicio;
    }

    public void setData_inicio(Date data_inicio) {
        this.data_inicio = data_inicio;
    }

    public Date getData_fim() {
        return data_fim;
    }

    public void setData_fim(Date data_fim) {
        this.data_fim = data_fim;
    }

    public List<Membro> getAlunos() {
        return alunos;
    }

    public void setAlunos(List<Membro> alunos) {
        this.alunos = alunos;
    }
    
}
