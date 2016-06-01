/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Util;

import Classes.Turma;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Rafael
 */
public class TurmaDao implements Dao<Turma>{

    public TurmaDao(){
        
    }
    
    @Override
    public List<Turma> listarTodos() {
        List<Object> objetos = HibernateUtil.getTuplasDaTabela("Turma");
        List<Turma> turmas = new ArrayList<>();
        for (Object obj: objetos){
            turmas.add((Turma)obj);
        }
        return turmas;
    }

    @Override
    public void gravar(Turma obj) {
        HibernateUtil.persistirObjeto(obj);
    }
    
}
