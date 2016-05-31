/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pessoas;

import Evt.EventoOld;
import Evt.MensagemOld;

/**
 *
 * @author Rafael
 */
public class MinistracaoOld {
    protected PessoaOld palestrante;
    protected EventoOld evento;
    protected MensagemOld mensagem;

    public MinistracaoOld(PessoaOld palestrante, EventoOld evento, MensagemOld mensagem) {
        this.palestrante = palestrante;
        this.evento = evento;
        this.mensagem = mensagem;
    }

    /////////////////////// <GETS E SETS> ////////////////////////////////////
    
    public PessoaOld getPalestrante() {
        return palestrante;
    }

    public void setPalestrante(PessoaOld palestrante) {
        this.palestrante = palestrante;
    }

    public EventoOld getEvento() {
        return evento;
    }

    public void setEvento(EventoOld evento) {
        this.evento = evento;
    }

    public MensagemOld getMensagem() {
        return mensagem;
    }

    public void setMensagem(MensagemOld mensagem) {
        this.mensagem = mensagem;
    }
    
    /////////////////////// </GETS E SETS> ////////////////////////////////////
}
