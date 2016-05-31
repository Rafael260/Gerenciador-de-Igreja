/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package escola;

import Pessoas.MembroOld;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Seminário da igreja - se refere à escola 
 * @author Rafael
 */
public class SeminarioOld {
    protected String nome;
    protected Date data_inicio;
    protected Date data_fim;
    protected List<DisciplinaOld> disciplinas;
    protected List<PeriodoLetivoOld> periodosLetivos;
    protected MembroOld coordenador;

    public SeminarioOld(String nome, Date data_inicio, Date data_fim, MembroOld coordenador) {
        this.nome = nome;
        this.data_inicio = data_inicio;
        this.data_fim = data_fim;
        this.coordenador = coordenador;
        disciplinas = new ArrayList<>();
        periodosLetivos = new ArrayList<>();
    }
    
    /////////////////////// <GETS E SETS> ////////////////////////////////////
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getData_inicio() {
        return data_inicio;
    }

    public void setData_inicio(Date data_inicio) {
        this.data_inicio = data_inicio;
    }

    public Date getData_fim() {
        return data_fim;
    }

    public void setData_fim(Date data_fim) {
        this.data_fim = data_fim;
    }

    public List<DisciplinaOld> getDisciplinas() {
        return disciplinas;
    }

    public void setDisciplinas(List<DisciplinaOld> disciplinas) {
        this.disciplinas = disciplinas;
    }

    public List<PeriodoLetivoOld> getPeriodosLetivos() {
        return periodosLetivos;
    }

    public void setPeriodosLetivos(List<PeriodoLetivoOld> periodosLetivos) {
        this.periodosLetivos = periodosLetivos;
    }

    public MembroOld getCoordenador() {
        return coordenador;
    }

    public void setCoordenador(MembroOld coordenador) {
        this.coordenador = coordenador;
    }
    
    /////////////////////// </GETS E SETS> ////////////////////////////////////
    
    
    ////////// <TRABALHANDO COM OS PERÍODOS LETIVOS /////////////////////////
    public void adicionarPeriodoLetivo(){
        int anoAnterior = periodosLetivos.get(periodosLetivos.size() - 1).getAno();
        periodosLetivos.add(new PeriodoLetivoOld(anoAnterior+1));
    }
    
    public void adicionarPeriodoLetivo(int ano) throws Exception{
        if (ano < 2016)
            throw new Exception("Ano inválido");
        pAdicionarPeriodoLetivo(ano);
    }
    
    private void pAdicionarPeriodoLetivo(int ano){
        periodosLetivos.add(new PeriodoLetivoOld(ano));
    }
    
    ////////// </TRABALHANDO COM OS PERÍODOS LETIVOS /////////////////////////
    
    ////////// <TRABALHANDO COM AS DISCIPLINAS /////////////////////////
    
    public void adicionarDisciplina(DisciplinaOld disciplina) throws Exception{
        if (disciplina == null){
            throw new Exception("Objeto referente à disciplina é nulo");
        }
        disciplinas.add(disciplina);
    }
    
    ////////// </TRABALHANDO COM AS DISCIPLINAS /////////////////////////
    
}
