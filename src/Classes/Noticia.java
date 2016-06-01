package Classes;
// Generated 28/05/2016 22:16:45 by Hibernate Tools 4.3.1

/**
 * Noticia generated by hbm2java
 */
public class Noticia  implements java.io.Serializable {
     private NoticiaId id;
     private Evento evento;
     private Membro membro;
     private String texto;
    
    public Noticia() {
    }

	
    public Noticia(NoticiaId id, Membro membro, String texto) {
        this.id = id;
        this.membro = membro;
        this.texto = texto;
    }
    public Noticia(NoticiaId id, Evento evento, Membro membro, String texto) {
       this.id = id;
       this.evento = evento;
       this.membro = membro;
       this.texto = texto;
    }
   
    public NoticiaId getId() {
        return this.id;
    }
    
    public void setId(NoticiaId id) {
        this.id = id;
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
}


