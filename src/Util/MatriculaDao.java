/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Util;

import Classes.Matricula;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Rafael
 */
public class MatriculaDao implements Dao<Matricula> {

    public MatriculaDao(){
        
    }
    
    @Override
    public List<Matricula> listarTodos() {
        List<Object> objetos = HibernateUtil.getTuplasDaTabela("Matricula");
        List<Matricula> matriculas = new ArrayList<>();
        for (Object obj: objetos){
            matriculas.add((Matricula)obj);
        }
        return matriculas;
    }

    @Override
    public void gravar(Matricula obj) {
        HibernateUtil.persistirObjeto(obj);
    }
    
}
