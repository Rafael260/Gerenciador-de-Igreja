/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Evt;

import Pessoas.Membro;
import javafx.scene.text.Text;

/**
 *
 * @author Rafael
 */
public class Noticia {
    protected String manchete;
    protected Text texto;
    protected Membro autor;
    
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
    
    
}
