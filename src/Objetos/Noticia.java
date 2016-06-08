package Objetos;
// Generated 03/06/2016 10:35:37 by Hibernate Tools 4.3.1

import Util.HibernateUtil;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;




/**
 * Noticia generated by hbm2java
 */
public class Noticia  implements java.io.Serializable {

     private Integer id;
     private String manchete;
     private Evento evento;
     private Membro membro;
     private String texto;

    public Noticia() {
    }
	
    public Noticia(Integer id, String manchete, Membro membro, String texto) {
        this.id = id;
        this.manchete = manchete;
        this.membro = membro;
        this.texto = texto;
    }
    
    public Noticia(int id, String manchete, Evento evento, String texto) {
        this.id = id;
        this.manchete = manchete;
        this.evento = evento;
        this.texto = texto;
    }
    
    public Noticia(int id, String manchete, String texto, Evento evento, Membro membro) {
       this.id = id;
       this.manchete = manchete;
       this.evento = evento;
       this.membro = membro;
       this.texto = texto;
    }
    
    public Noticia(int id, String manchete, String texto){
        this.id = id;
        this.manchete = manchete;
        this.texto = texto;
    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }

    public String getManchete() {
        return manchete;
    }

    public void setManchete(String manchete) {
        this.manchete = manchete;
    }
    
    public Evento getEvento() {
        return this.evento;
    }
    
    public void setEvento(Evento evento) {
        this.evento = evento;
    }
    public Membro getMembro() {
        return this.membro;
    }
    
    public void setMembro(Membro membro) {
        this.membro = membro;
    }
    public String getTexto() {
        return this.texto;
    }
    
    public void setTexto(String texto) {
        this.texto = texto;
    }
    
    /////////////////////////////////////////////
    
    public static Noticia preencherDadosNoticia(Object[] object, int index){
        Noticia noticia = new Noticia();
        noticia.setId((Integer)object[index]);
        noticia.setManchete((String)object[index+1]);
        noticia.setTexto((String)object[index+2]);
        if (object[index+3] != null)
            noticia.setMembro(Membro.selectMembroPk((Integer)object[index+3]));
        if (object[index+4] != null)
            noticia.setEvento(Evento.selectEventoPk((String)object[index+4], (Date)object[index+5]));
        
        return noticia;
    }
    
    public static List<Noticia> preencherDadosNoticia(List<Object[]> objects, int index){
        List<Noticia> noticias = new ArrayList();
        for (Object[] obj: objects){
            noticias.add(preencherDadosNoticia(obj, index));
        }
        return noticias;
    }
    
    public static Noticia selectNoticiaPk(int id){
        List<Object[]> objects = HibernateUtil.getTuplasDaTabela("Noticia", "id="+id,"",0);
        return preencherDadosNoticia(objects.get(0), 0);
    }

    public static List<Noticia> listarTodos(){
        List<Object[]> objects = HibernateUtil.getTuplasDaTabela("Noticia");
        return preencherDadosNoticia(objects, 0);
    }
    
    public static List<Noticia> listarTodos(Ordem ordem){
        List<Object[]> objects = HibernateUtil.getTuplasDaTabela("Noticia","","id "+ordem.getSqlOrder(),0);
        return preencherDadosNoticia(objects, 0);
    }
    
}


