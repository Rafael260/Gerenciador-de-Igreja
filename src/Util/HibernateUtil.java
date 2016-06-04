/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Util;

import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.SessionFactory;

/**
 * Hibernate Utility class with a convenient method to get Session Factory
 * object.
 *
 * @author Rafael
 */
public class HibernateUtil {

    private static final SessionFactory sessionFactory;
    
    static {
        try {
            // Create the SessionFactory from standard (hibernate.cfg.xml) 
            // config file.
            sessionFactory = new AnnotationConfiguration().configure().buildSessionFactory();
        } catch (Throwable ex) {
            // Log the exception. 
            System.err.println("Initial SessionFactory creation failed." + ex);
            throw new ExceptionInInitializerError(ex);
        }
    }
    
    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }
    
    public static void persistirObjeto(Object o){
        Session s = sessionFactory.getCurrentSession();
        s.beginTransaction();
        s.saveOrUpdate(o);
        s.getTransaction().commit();
    }
    
    /**
     * Cria a Query SQL de insert into
     * @param tabela tabela para inserção da tupla
     * @param valores Parâmetros para o insert
     */
    public static void insertInto(String tabela, List<String> valores){
        Session s = sessionFactory.getCurrentSession();
        String parametros = "";
        
        //Concatenando todos os valores da tupla
        for (String str: valores){
            parametros += str + ","; 
        }
        //Tirar a última vírgula
        parametros = parametros.substring(0, parametros.length()-1);
        
        s.beginTransaction();
        s.createSQLQuery("insert into "+ tabela +"values("+parametros+")");
        s.getTransaction().commit();
    }
    
    public static void insertInto(String tabela, List<String> colunas, List<String> valores){
        Session s = sessionFactory.getCurrentSession();
        String parametros = "";
        String columns = "";
        //Concatenando todos os valores da tupla
        for (String str: valores){
            parametros += str + ",";
        }
        for (String str: colunas){
            columns += str += ",";
        }
        //Tirar a última vírgula
        parametros = parametros.substring(0, parametros.length()-1);
        columns = columns.substring(0, columns.length()-1);
        s.beginTransaction();
        s.createSQLQuery("insert into "+ tabela+"(" +columns+ ") " +"values("+parametros+")");
        s.getTransaction().commit();
    }
    
    public static List getTuplasDaTabela(String tabela){
        Session s = sessionFactory.getCurrentSession();
        List tuplas;
        tuplas = s.createQuery("from "+tabela).list();
        s.getTransaction().commit();
        return tuplas;
    }
    
    public static List getTuplasDaTabela(String tabela, String where){
        Session s = sessionFactory.getCurrentSession();
        List tuplas;
        tuplas = s.createQuery("from "+tabela+ " where "+ where).list();
        s.getTransaction().commit();
        return tuplas;
    }
    
}
