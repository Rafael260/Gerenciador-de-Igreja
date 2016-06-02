/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Util;

import Classes.Assiduidade;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Rafael
 */
public class AssiduidadeDao implements Dao<Assiduidade>{

    @Override
    public List<Assiduidade> listarTodos() {
        List<Object> objetos = HibernateUtil.getTuplasDaTabela("Assiduidade");
        List<Assiduidade> assiduidades = new ArrayList<>();
        for (Object obj: objetos){
            assiduidades.add((Assiduidade)obj);
        }
        return assiduidades;
    }

    @Override
    public void gravar(Assiduidade obj) {
        HibernateUtil.persistirObjeto(obj);
    }
    
}
