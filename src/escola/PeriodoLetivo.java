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
public class PeriodoLetivo {
    private int ano;
    private List<Turma> listaTurmas;

    public PeriodoLetivo(int ano) {
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

    public List<Turma> getListaTurmas() {
        return listaTurmas;
    }

    public void setListaTurmas(List<Turma> listaTurmas) {
        this.listaTurmas = listaTurmas;
    }
    
    /////////////////////// </GETS E SETS> ////////////////////////////////////
    
    /////////////////////// <TRABALHANDO COM TURMAS> ////////////////////////////////////
    
    public void adicionarTurma(Turma turma) throws Exception{
        if(turma == null){
            throw new Exception("Objeto referente à turma é nulo");
        }
        listaTurmas.add(turma);
    }
    
    /////////////////////// </TRABALHANDO COM TURMAS> ////////////////////////////////////
    
}
