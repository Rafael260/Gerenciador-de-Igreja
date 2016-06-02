/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Util;

import Classes.Ministerio;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Rafael
 */
public class MinisterioDao implements Dao<Ministerio> {

    public MinisterioDao(){
        
    }
    
    @Override
    public List<Ministerio> listarTodos() {
        List<Object> objetos = HibernateUtil.getTuplasDaTabela("Ministerio");
        List<Ministerio> ministerios = new ArrayList<>();
        for (Object obj: objetos){
            ministerios.add((Ministerio)obj);
        }
        return ministerios;
    }

    @Override
    public void gravar(Ministerio obj) {
        HibernateUtil.persistirObjeto(obj);
    }
    
}
