/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Evt;

/**
 *
 * @author Rafael
 */
public class MensagemOld {
    protected String titulo;
    protected String base_biblica;
    protected String tema;

    public MensagemOld(String titulo, String base_biblica, String tema) {
        this.titulo = titulo;
        this.base_biblica = base_biblica;
        this.tema = tema;
    }

    public MensagemOld(String titulo, String tema) {
        this.titulo = titulo;
        this.tema = tema;
    }
    
    /////////////////////// <GETS E SETS> ////////////////////////////////////
    
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getBase_biblica() {
        return base_biblica;
    }

    public void setBase_biblica(String base_biblica) {
        this.base_biblica = base_biblica;
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }
    
    /////////////////////// </GETS E SETS> ////////////////////////////////////
    
    
}
