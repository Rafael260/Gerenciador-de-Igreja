package Classes;
// Generated 28/05/2016 22:16:45 by Hibernate Tools 4.3.1


import Util.HibernateUtil;
import java.sql.Time;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Visitante generated by hbm2java
 */
public class Visitante  implements java.io.Serializable {
     private int id;
     private Pessoa pessoa;
     private String igrejaOrig;
     private Set eventos = new HashSet(0);

    public Visitante() {
    }

	
    public Visitante(Pessoa pessoa) {
        this.pessoa = pessoa;
        this.id = pessoa.getId(); //correto?
    }
    public Visitante(Pessoa pessoa, String igrejaOrig, Set eventos) {
       this.pessoa = pessoa;
       this.id = pessoa.getId();
       this.igrejaOrig = igrejaOrig;
       this.eventos = eventos;
    }
   
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    public Pessoa getPessoa() {
        return this.pessoa;
    }
    
    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }
    public String getIgrejaOrig() {
        return this.igrejaOrig;
    }
    
    public void setIgrejaOrig(String igrejaOrig) {
        this.igrejaOrig = igrejaOrig;
    }
    public Set getEventos() {
        return this.eventos;
    }
    
    public void setEventos(Set eventos) {
        this.eventos = eventos;
    }
    
    public void adicionarEvento(String tema, Date data, Time hora, String tipo){
        //adicionarEvento(new Evento(new EventoId(tema,data)))
    }

    public void adicionarEvento(Evento evento){
        List<String> parametros = new ArrayList<>();
        parametros.add(""+id);
        //Parâmetros do banco que se referem à Strings ou chars, precisam de aspas simples
        parametros.add("'"+evento.getId().getDia()+"'");
        parametros.add("'"+evento.getId().getTema()+"'");
        HibernateUtil.insertInto("visita_evento", parametros);
    }


}


