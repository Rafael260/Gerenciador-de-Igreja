/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pessoas;

import Evt.Evento;
import Evt.Mensagem;

/**
 *
 * @author Rafael
 */
public class Ministracao {
    protected Pessoa palestrante;
    protected Evento evento;
    protected Mensagem mensagem;

    public Pessoa getPalestrante() {
        return palestrante;
    }

    public void setPalestrante(Pessoa palestrante) {
        this.palestrante = palestrante;
    }

    public Evento getEvento() {
        return evento;
    }

    public void setEvento(Evento evento) {
        this.evento = evento;
    }

    public Mensagem getMensagem() {
        return mensagem;
    }

    public void setMensagem(Mensagem mensagem) {
        this.mensagem = mensagem;
    }
    
    
}
