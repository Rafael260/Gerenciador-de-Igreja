package Classes;
// Generated 28/05/2016 22:16:45 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Mensagem generated by hbm2java
 */
public class Mensagem  implements java.io.Serializable {


     private String titulo;
     private String baseBiblica;
     private String tema;
     private Set ministras = new HashSet(0);

    public Mensagem() {
    }

	
    public Mensagem(String titulo) {
        this.titulo = titulo;
    }
    public Mensagem(String titulo, String baseBiblica, String tema, Set ministras) {
       this.titulo = titulo;
       this.baseBiblica = baseBiblica;
       this.tema = tema;
       this.ministras = ministras;
    }
   
    public String getTitulo() {
        return this.titulo;
    }
    
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getBaseBiblica() {
        return this.baseBiblica;
    }
    
    public void setBaseBiblica(String baseBiblica) {
        this.baseBiblica = baseBiblica;
    }
    public String getTema() {
        return this.tema;
    }
    
    public void setTema(String tema) {
        this.tema = tema;
    }
    public Set getMinistras() {
        return this.ministras;
    }
    
    public void setMinistras(Set ministras) {
        this.ministras = ministras;
    }




}


