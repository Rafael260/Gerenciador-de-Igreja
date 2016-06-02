/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Util;

import Classes.Membro;
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
public class MembroDao implements Dao<Membro> {

    private PessoaDao pessoaDao;
    
    public MembroDao(){
        pessoaDao = new PessoaDao();
    }
    @Override
    public List listarTodos() {
        List<Object> objetos = HibernateUtil.getTuplasDaTabela("Membro");
        List<Membro> membros = new ArrayList<>();
        for (Object obj: objetos){
            membros.add((Membro)obj);
        }
        return membros;
    }

    @Override
    public void gravar(Membro obj) {
        HibernateUtil.persistirObjeto(obj);
        pessoaDao.gravar(obj.getPessoa());
    }
    
    public Membro selectMembroPk(int id){
        Session s = HibernateUtil.getSessionFactory().getCurrentSession();
        s.beginTransaction();
        Criteria criteria = s.createCriteria(Membro.class);
        criteria.add(Restrictions.eq("id",id));
        Membro m = (Membro)HibernateUtil.select(criteria).get(0);
        Pessoa p = pessoaDao.selectPessoaPk(id);
        m.setPessoa(p);
        s.getTransaction().commit();
        return m;
    }
}
