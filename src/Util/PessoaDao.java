/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Util;

import Classes.Pessoa;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

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
    
    public Pessoa selectPessoaPk(int id){
        Session s = HibernateUtil.getSessionFactory().getCurrentSession();
        s.beginTransaction();
        Criteria criteria = s.createCriteria(Pessoa.class);
        criteria.add(Restrictions.eq("id",id));
        Pessoa pessoa = (Pessoa)HibernateUtil.select(criteria).get(0);
        s.getTransaction().commit();
        return pessoa;
    }    
}
