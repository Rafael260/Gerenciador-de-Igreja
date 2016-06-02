/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Util;

import Classes.Ministra;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Rafael
 */
public class MinistraDao implements Dao<Ministra> {

    public MinistraDao(){
        
    }
    
    @Override
    public List<Ministra> listarTodos() {
        List<Object> objetos = HibernateUtil.getTuplasDaTabela("Ministra");
        List<Ministra> ministracoes = new ArrayList<>();
        for (Object obj: objetos){
            ministracoes.add((Ministra)obj);
        }
        return ministracoes;
    }

    @Override
    public void gravar(Ministra obj) {
        HibernateUtil.persistirObjeto(obj);
    }
    
}
