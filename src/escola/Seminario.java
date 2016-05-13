/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package escola;

import Pessoas.Membro;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Seminário da igreja - se refere à escola 
 * @author Rafael
 */
public class Seminario {
    protected String nome;
    protected Date data_inicio;
    protected Date data_fim;
    protected List<Disciplina> disciplinas;
    protected List<PeriodoLetivo> periodosLetivos;
    protected Membro coordenador;

    public Seminario(String nome, Date data_inicio, Date data_fim, Membro coordenador) {
        this.nome = nome;
        this.data_inicio = data_inicio;
        this.data_fim = data_fim;
        this.coordenador = coordenador;
        periodosLetivos = new ArrayList<>();
    }
    
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
