/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Util;

import Classes.Visitante;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Rafael
 */
public class VisitanteDao implements Dao<Visitante> {

    private PessoaDao pessoaDao;
    
    public VisitanteDao(){
        pessoaDao = new PessoaDao();
    }
    
    @Override
    public List<Visitante> listarTodos() {
        List<Object> objetos = HibernateUtil.getTuplasDaTabela("Visitante");
        List<Visitante> visitantes = new ArrayList<>();
        for (Object obj: objetos){
            visitantes.add((Visitante)obj);
        }
        return visitantes;
    }

    @Override
    public void gravar(Visitante obj) {
        HibernateUtil.persistirObjeto(obj);
        pessoaDao.gravar(obj.getPessoa());
    }
}
