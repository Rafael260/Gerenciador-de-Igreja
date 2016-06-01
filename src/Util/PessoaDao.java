/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Util;

import Classes.Pessoa;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Rafael
 */
public class PessoaDao implements Dao<Pessoa> {

    public PessoaDao(){
        
    }
    
    @Override
    public List<Pessoa> listarTodos() {
        List<Object> objetos = HibernateUtil.getTuplasDaTabela("Pessoa");
        List<Pessoa> pessoas = new ArrayList<>();
        for (Object obj: objetos){
            pessoas.add((Pessoa)obj);
        }
        return pessoas;
    }

    @Override
    public void gravar(Pessoa obj) {
        HibernateUtil.persistirObjeto(obj);
    }
    
}
