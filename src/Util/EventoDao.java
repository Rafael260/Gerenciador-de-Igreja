/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Util;

import Classes.Evento;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Rafael
 */
public class EventoDao implements Dao<Evento> {

    public EventoDao(){
        
    }
    
    @Override
    public List<Evento> listarTodos() {
        List<Object> objetos = HibernateUtil.getTuplasDaTabela("Evento");
        List<Evento> eventos = new ArrayList<>();
        for (Object obj: objetos){
            eventos.add((Evento)obj);
        }
        return eventos;
    }

    @Override
    public void gravar(Evento obj) {
        HibernateUtil.persistirObjeto(obj);
    }
    
}
