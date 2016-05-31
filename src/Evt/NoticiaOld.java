/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Evt;

import Pessoas.MembroOld;
import javafx.scene.text.Text;

/**
 *
 * @author Rafael
 */
public class NoticiaOld {
    protected String manchete;
    protected Text texto;
    protected MembroOld autor;
    protected EventoOld evento;
    //List<Midia> midias;

    public NoticiaOld(String manchete, Text texto, MembroOld autor) {
        this.manchete = manchete;
        this.texto = texto;
        this.autor = autor;
    }

    public NoticiaOld(String manchete, Text texto, MembroOld autor, EventoOld evento) {
        this.manchete = manchete;
        this.texto = texto;
        this.autor = autor;
        this.evento = evento;
    }
    
    /////////////////////// <GETS E SETS> ////////////////////////////////////
    
    public String getManchete() {
        return manchete;
    }

    public void setManchete(String manchete) {
        this.manchete = manchete;
    }

    public Text getTexto() {
        return texto;
    }

    public void setTexto(Text texto) {
        this.texto = texto;
    }

    public MembroOld getAutor() {
        return autor;
    }

    public void setAutor(MembroOld autor) {
        this.autor = autor;
    }
    
    public EventoOld getEvento() {
        return evento;
    }

    public void setEvento(EventoOld evento) {
        this.evento = evento;
    }
    
    /////////////////////// </GETS E SETS> ////////////////////////////////////
}
