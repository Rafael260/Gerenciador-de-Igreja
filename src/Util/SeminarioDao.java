/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Util;

import Classes.Seminario;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Rafael
 */
public class SeminarioDao implements Dao<Seminario> {

    public SeminarioDao(){
        
    }
    
    @Override
    public List<Seminario> listarTodos() {
        List<Object> objetos = HibernateUtil.getTuplasDaTabela("Seminario");
        List<Seminario> seminarios = new ArrayList<>();
        for (Object obj: objetos){
            seminarios.add((Seminario)obj);
        }
        return seminarios;
    }

    @Override
    public void gravar(Seminario obj) {
        HibernateUtil.persistirObjeto(obj);
    }
    
}
