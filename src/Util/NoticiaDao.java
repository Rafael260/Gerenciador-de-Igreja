/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Util;

import Classes.Noticia;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Rafael
 */
public class NoticiaDao implements Dao<Noticia>{

    public NoticiaDao(){
        
    }
    
    @Override
    public List<Noticia> listarTodos() {
        List<Object> objetos = HibernateUtil.getTuplasDaTabela("Noticia");
        List<Noticia> noticias = new ArrayList<>();
        for (Object obj: objetos){
            noticias.add((Noticia)obj);
        }
        return noticias;
    }

    @Override
    public void gravar(Noticia obj) {
        HibernateUtil.persistirObjeto(obj);
    }
    
}
