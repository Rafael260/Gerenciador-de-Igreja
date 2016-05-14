/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Evt;

import java.sql.Time;
import java.util.Date;

/**
 *
 * @author Rafael
 */
public class Evento {
    protected Date data;
    protected Time hora;
    protected String publico_alvo;
    protected String tipo;
    protected String palestrante;

    public Evento(Date data, Time hora, String publico_alvo, String tipo, String palestrante) {
        this.data = data;
        this.hora = hora;
        this.publico_alvo = publico_alvo;
        this.tipo = tipo;
        this.palestrante = palestrante;
    }

    public Evento(Date data, Time hora, String tipo, String palestrante) {
        this.data = data;
        this.hora = hora;
        this.tipo = tipo;
        this.palestrante = palestrante;
        this.publico_alvo = "Todos";
    }
    
    /////////////////////// <GETS E SETS> ////////////////////////////////////
    
    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Time getHora() {
        return hora;
    }

    public void setHora(Time hora) {
        this.hora = hora;
    }

    public String getPublico_alvo() {
        return publico_alvo;
    }

    public void setPublico_alvo(String publico_alvo) {
        this.publico_alvo = publico_alvo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getPalestrante() {
        return palestrante;
    }

    public void setPalestrante(String palestrante) {
        this.palestrante = palestrante;
    }
    
    /////////////////////// </GETS E SETS> ////////////////////////////////////
}
