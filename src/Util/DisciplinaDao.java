/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Util;

import Classes.Disciplina;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Rafael
 */
public class DisciplinaDao implements Dao<Disciplina>{

    public DisciplinaDao(){
        
    }
    
    @Override
    public List<Disciplina> listarTodos() {
        List<Object> objetos = HibernateUtil.getTuplasDaTabela("Disciplina");
        List<Disciplina> disciplinas = new ArrayList<>();
        for (Object obj: objetos){
            disciplinas.add((Disciplina)obj);
        }
        return disciplinas;
    }

    @Override
    public void gravar(Disciplina obj) {
        HibernateUtil.persistirObjeto(obj);
    }
    
}
