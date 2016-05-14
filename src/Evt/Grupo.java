/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Evt;

import Pessoas.Membro;
import java.sql.Time;
import java.util.ArrayList;
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

    public Grupo(String tipo_grupo, Endereco endereco, Time hora, DiaSemana dia_semana, Membro lider) {
        this.tipo_grupo = tipo_grupo;
        this.endereco = endereco;
        this.hora = hora;
        this.dia_semana = dia_semana;
        this.lider = lider;
        integrantes = new ArrayList<>();
    }

    /////////////////////// <GETS E SETS> ////////////////////////////////////
    
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
    
    /////////////////////// </GETS E SETS> ////////////////////////////////////
    
    public void adicionarMembro(Membro membro) throws Exception{
        if (membro == null){
            throw new Exception("Objeto referente à membro é nulo");
        }
        integrantes.add(membro);
    }
    
    /*public boolean removerMembro(String nome){
        Membro membro = resultadoConsultaSQL();
        comando pra remover usando chave primária de membro
        se removeu, return true
        return false, caso contrário
    }*/
}
