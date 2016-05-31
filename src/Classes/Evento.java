package Classes;
// Generated 28/05/2016 22:16:45 by Hibernate Tools 4.3.1


import Util.HibernateUtil;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Evento generated by hbm2java
 */
public class Evento  implements java.io.Serializable {
     private EventoId id;
     private String publicoAlvo;
     private String tipo;
     private Set ministras = new HashSet(0);
     private Set visitantes = new HashSet(0);
     private Set noticias = new HashSet(0);

    public Evento() {
    }

	
    public Evento(EventoId id, String tipo) {
        this.id = id;
        this.tipo = tipo;
    }
    public Evento(EventoId id, String publicoAlvo, String tipo, Set ministras, Set visitantes, Set noticias) {
       this.id = id;
       this.publicoAlvo = publicoAlvo;
       this.tipo = tipo;
       this.ministras = ministras;
       this.visitantes = visitantes;
       this.noticias = noticias;
    }
   
    public EventoId getId() {
        return this.id;
    }
    
    public void setId(EventoId id) {
        this.id = id;
    }
    public String getPublicoAlvo() {
        return this.publicoAlvo;
    }
    
    public void setPublicoAlvo(String publicoAlvo) {
        this.publicoAlvo = publicoAlvo;
    }
    public String getTipo() {
        return this.tipo;
    }
    
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public Set getMinistras() {
        return this.ministras;
    }
    
    public void setMinistras(Set ministras) {
        this.ministras = ministras;
    }
    public Set getVisitantes() {
        return this.visitantes;
    }
    
    public void setVisitantes(Set visitantes) {
        this.visitantes = visitantes;
    }
    public Set getNoticias() {
        return this.noticias;
    }
    
    public void setNoticias(Set noticias) {
        this.noticias = noticias;
    }
    
    public void adicionarVisitante(Pessoa pessoa){
        adicionarVisitante(new Visitante(pessoa));
    }
            
    
    public void adicionarVisitante(Visitante visitante){
        List<String> parametros = new ArrayList<>();
        parametros.add(""+visitante.getId());
        //Parâmetros do banco que se referem à Strings ou chars, precisam de aspas simples
        parametros.add("'"+this.id.getDia()+"'");
        parametros.add("'"+this.id.getTema()+"'");
        HibernateUtil.insertInto("visita_evento", parametros);
    }




}


