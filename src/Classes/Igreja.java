/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import Util.HibernateUtil;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.hibernate.Criteria;
import org.hibernate.Session;

/**
 *
 * @author Rafael
 */
public class Igreja {
    private Set membros = new HashSet(0);
    private Set visitantes = new HashSet(0);
    private Set eventos = new HashSet(0);
    private Set noticias = new HashSet(0);
    private Set seminarios = new HashSet(0);
    private Set ministerios = new HashSet(0);
    private Set mensagens = new HashSet(0);
    
    public Igreja(){
    }
    
    public void carregarMembros(){
        Session s = HibernateUtil.getSessionFactory().getCurrentSession();
        List<Membro> members = s.createQuery("From membro").list();
        Pessoa p;
        for (Membro m: members){
            p = (Pessoa)s.createQuery("From pessoa where id=" + m.getId()).uniqueResult();
            m.setPessoa(p);
            membros.add(m);
        }
        s.getTransaction().commit();
    }
    
    public void carregarVisitantes(){
        Session s = HibernateUtil.getSessionFactory().getCurrentSession();
        List<Visitante> visit = s.createQuery("From membro").list();
        Pessoa p;
        for (Visitante v: visit){
            p = (Pessoa)s.createQuery("From pessoa where id=" + v.getId()).uniqueResult();
            v.setPessoa(p);
            visitantes.add(v);
        }
        s.getTransaction().commit();
    }
    
    /**
     * Pesquisar sobre CRITERIA
     */
    public void carregarEventos(){
        Session s = HibernateUtil.getSessionFactory().getCurrentSession();
        Criteria crit = s.createCriteria(Evento.class);
        List results = crit.list();
        for (Object result: results){
            eventos.add((Evento)result);
        }
    }
}
