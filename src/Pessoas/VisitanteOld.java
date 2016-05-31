/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pessoas;

import Evt.Endereco;
import Evt.EventoOld;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Rafael
 */
public class VisitanteOld extends PessoaOld{
    protected String igreja_origem;
    protected List<EventoOld> eventosVisitados;

    ///////////////////////// <CONSTRUTORES> /////////////////////////////////////////////
    //Provavelmente não vamos usar todos os construtores. É apenas a garantia de que vai ter opção pra instanciar o visitante
    public VisitanteOld(String igreja_origem, int id, String nome, String sobrenome, char estado_civil) {
        super(id, nome, sobrenome, estado_civil);
        this.igreja_origem = igreja_origem;
        eventosVisitados = new ArrayList<>();
    }

    public VisitanteOld(String igreja_origem, int id, String nome, String sobrenome, char estado_civil, String numero_telefone) {
        super(id, nome, sobrenome, estado_civil, numero_telefone);
        this.igreja_origem = igreja_origem;
        eventosVisitados = new ArrayList<>();
    }

    public VisitanteOld(String igreja_origem, int id, String nome, String sobrenome, char estado_civil, String numero_telefone, Endereco endereco) {
        super(id, nome, sobrenome, estado_civil, numero_telefone, endereco);
        this.igreja_origem = igreja_origem;
        eventosVisitados = new ArrayList<>();
    }

    public VisitanteOld(int id, String nome, String sobrenome, char estado_civil) {
        super(id, nome, sobrenome, estado_civil);
        eventosVisitados = new ArrayList<>();
    }

    public VisitanteOld(int id, String nome, String sobrenome, char estado_civil, String numero_telefone) {
        super(id, nome, sobrenome, estado_civil, numero_telefone);
        eventosVisitados = new ArrayList<>();
    }

    public VisitanteOld(int id, String nome, String sobrenome, char estado_civil, String numero_telefone, Endereco endereco) {
        super(id, nome, sobrenome, estado_civil, numero_telefone, endereco);
        eventosVisitados = new ArrayList<>();
    }
    
    public VisitanteOld(String igreja_origem, int id, String nome, String sobrenome, char estado_civil, List<EventoOld> eventosVisitados) {
        super(id, nome, sobrenome, estado_civil);
        this.igreja_origem = igreja_origem;
        this.eventosVisitados = eventosVisitados;
    }

    public VisitanteOld(String igreja_origem, int id, String nome, String sobrenome, char estado_civil, String numero_telefone, List<EventoOld> eventosVisitados) {
        super(id, nome, sobrenome, estado_civil, numero_telefone);
        this.igreja_origem = igreja_origem;
        this.eventosVisitados = eventosVisitados;
    }

    public VisitanteOld(String igreja_origem, int id, String nome, String sobrenome, char estado_civil, String numero_telefone, Endereco endereco, List<EventoOld> eventosVisitados) {
        super(id, nome, sobrenome, estado_civil, numero_telefone, endereco);
        this.igreja_origem = igreja_origem;
        this.eventosVisitados = eventosVisitados;
    }

    public VisitanteOld(int id, String nome, String sobrenome, char estado_civil, List<EventoOld> eventosVisitados) {
        super(id, nome, sobrenome, estado_civil);
        this.eventosVisitados = eventosVisitados;
    }

    public VisitanteOld(int id, String nome, String sobrenome, char estado_civil, String numero_telefone, List<EventoOld> eventosVisitados) {
        super(id, nome, sobrenome, estado_civil, numero_telefone);
        this.eventosVisitados = eventosVisitados;
    }

    public VisitanteOld(int id, String nome, String sobrenome, char estado_civil, String numero_telefone, Endereco endereco, List<EventoOld> eventosVisitados) {
        super(id, nome, sobrenome, estado_civil, numero_telefone, endereco);
        this.eventosVisitados = eventosVisitados;
    }
    
    ///////////////////////// </CONSTRUTORES> /////////////////////////////////////////////
    
    /////////////////////// <GETS E SETS> ////////////////////////////////////

    public String getIgreja_origem() {
        return igreja_origem;
    }

    public void setIgreja_origem(String igreja_origem) {
        this.igreja_origem = igreja_origem;
    }
    
    public List<EventoOld> getEventosVisitados() {
        return eventosVisitados;
    }

    public void setEventosVisitados(List<EventoOld> eventosVisitados) {
        this.eventosVisitados = eventosVisitados;
    }
    
    /////////////////////// </GETS E SETS> ////////////////////////////////////

}
