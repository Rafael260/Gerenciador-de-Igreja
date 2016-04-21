/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Evt;

import Pessoas.Membro;
import java.sql.Time;
import java.util.List;

/**
 *
 * @author Rafael
 */
public class Grupo {
    protected String tipo_grupo;
    protected Endereco endereco;
    protected Time hora;
    protected DiaSemana dia_semana;
    protected List<Membro> integrantes;
    protected Membro lider;

    public String getTipo_grupo() {
        return tipo_grupo;
    }

    public void setTipo_grupo(String tipo_grupo) {
        this.tipo_grupo = tipo_grupo;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Time getHora() {
        return hora;
    }

    public void setHora(Time hora) {
        this.hora = hora;
    }

    public DiaSemana getDia_semana() {
        return dia_semana;
    }

    public void setDia_semana(DiaSemana dia_semana) {
        this.dia_semana = dia_semana;
    }
    
}
