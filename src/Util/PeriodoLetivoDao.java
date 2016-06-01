/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Util;

import Classes.PeriodoLetivo;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Rafael
 */
public class PeriodoLetivoDao implements Dao<PeriodoLetivo>{

    public PeriodoLetivoDao(){
        
    }
    
    @Override
    public List<PeriodoLetivo> listarTodos() {
        List<Object> objetos = HibernateUtil.getTuplasDaTabela("PeriodoLetivo");
        List<PeriodoLetivo> periodosLetivos = new ArrayList<>();
        for (Object obj: objetos){
            periodosLetivos.add((PeriodoLetivo)obj);
        }
        return periodosLetivos;
    }

    @Override
    public void gravar(PeriodoLetivo obj) {
        HibernateUtil.persistirObjeto(obj);
    }
    
}
