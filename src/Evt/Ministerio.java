/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Evt;

import Pessoas.Membro;
import java.sql.Time;
import java.util.List;
import javafx.scene.text.Text;

/**
 *
 * @author Rafael
 */
public class Ministerio {
    protected String nome;
    protected Text descricao;
    protected Time hora;
    protected DiaSemana dia_semana;
    protected List<Membro> integrantes;
    protected Membro lider;

    public Ministerio(String nome, Text descricao, Time hora, DiaSemana dia_semana, Membro lider) {
        this.nome = nome;
        this.descricao = descricao;
        this.hora = hora;
        this.dia_semana = dia_semana;
        this.lider = lider;
    }
    
    /////////////////////// <GETS E SETS> ////////////////////////////////////
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Text getDescricao() {
        return descricao;
    }

    public void setDescricao(Text descricao) {
        this.descricao = descricao;
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
    
    /////////////////////// </GETS E SETS> ////////////////////////////////////
    
    public void adicionarIntegrante(Membro membro) throws Exception{
        if (membro == null){
            throw new Exception("Objeto referente à membro é nulo");
        }
        integrantes.add(membro);
    }
    
}
