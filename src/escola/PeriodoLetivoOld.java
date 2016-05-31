/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package escola;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Rafael
 */
public class PeriodoLetivoOld {
    private int ano;
    private List<TurmaOld> listaTurmas;

    public PeriodoLetivoOld(int ano) {
        this.ano = ano;
        listaTurmas = new ArrayList<>();
    }
    
    /////////////////////// <GETS E SETS> ////////////////////////////////////
    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public List<TurmaOld> getListaTurmas() {
        return listaTurmas;
    }

    public void setListaTurmas(List<TurmaOld> listaTurmas) {
        this.listaTurmas = listaTurmas;
    }
    
    /////////////////////// </GETS E SETS> ////////////////////////////////////
    
    /////////////////////// <TRABALHANDO COM TURMAS> ////////////////////////////////////
    
    public void adicionarTurma(TurmaOld turma) throws Exception{
        if(turma == null){
            throw new Exception("Objeto referente à turma é nulo");
        }
        listaTurmas.add(turma);
    }
    
    /////////////////////// </TRABALHANDO COM TURMAS> ////////////////////////////////////
    
}
