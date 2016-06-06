package Objetos;
// Generated 03/06/2016 10:35:37 by Hibernate Tools 4.3.1


import Util.HibernateUtil;
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
    }
    public Visitante(Pessoa pessoa, String igrejaOrig, Set eventos) {
       this.pessoa = pessoa;
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
    
    //////////////////////////////////////////
    
    public static Visitante selectVisitantePk(int id){
        Visitante visitante = (Visitante)HibernateUtil.getTuplasDaTabela("Visitante", "id="+id,"").get(0);
        Pessoa pessoa = Pessoa.selectPessoaPk(visitante.getId());
        visitante.setPessoa(pessoa);
        return visitante;
    }

    public static List<Visitante> listarTodos(){
        List objects = HibernateUtil.getTuplasDaTabela("Visitante");
        List<Visitante> visitantes = objects;
        Pessoa pessoa;
        for (Visitante visitante: visitantes){
            pessoa = Pessoa.selectPessoaPk(visitante.getId()); //talvez não seja eficiente
            visitante.setPessoa(pessoa);
        }
        return visitantes;
    }
    
    public void adicionarEvento(String tema, Date data,String tipo){
        Evento evento = new Evento(new EventoId(tema,data),tipo);
        List<String> parametros = new ArrayList<>();
        parametros.add(""+id);
        //Parâmetros do banco que se referem à Strings ou chars, precisam de aspas simples
        parametros.add("'"+evento.getId().getDiaHora()+"'");
        parametros.add("'"+evento.getId().getTema()+"'");
        HibernateUtil.insertInto("Visita_Evento", parametros);
    }

    public void adicionarEvento(Evento evento){
        List<String> parametros = new ArrayList<>();
        parametros.add(""+id);
        //Parâmetros do banco que se referem à Strings ou chars, precisam de aspas simples
        parametros.add("'"+evento.getId().getDiaHora()+"'");
        parametros.add("'"+evento.getId().getTema()+"'");
        HibernateUtil.insertInto("Visita_Evento", parametros);
    }

}


