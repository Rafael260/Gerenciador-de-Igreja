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
public class Seminario {
    protected String nome;
    protected Date data_inicio;
    protected Date data_fim;
    protected List<Disciplina> disciplinas;
    protected Membro coordenador;
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

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
    
    
}
