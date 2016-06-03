package Objetos;
// Generated 03/06/2016 10:35:37 by Hibernate Tools 4.3.1


import java.util.Date;

/**
 * GrupoId generated by hbm2java
 */
public class GrupoId  implements java.io.Serializable {


     private int idLider;
     private Date hora;
     private String diaSemana;

    public GrupoId() {
    }

    public GrupoId(int idLider, Date hora, String diaSemana) {
       this.idLider = idLider;
       this.hora = hora;
       this.diaSemana = diaSemana;
    }
   
    public int getIdLider() {
        return this.idLider;
    }
    
    public void setIdLider(int idLider) {
        this.idLider = idLider;
    }
    public Date getHora() {
        return this.hora;
    }
    
    public void setHora(Date hora) {
        this.hora = hora;
    }
    public String getDiaSemana() {
        return this.diaSemana;
    }
    
    public void setDiaSemana(String diaSemana) {
        this.diaSemana = diaSemana;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof GrupoId) ) return false;
		 GrupoId castOther = ( GrupoId ) other; 
         
		 return (this.getIdLider()==castOther.getIdLider())
 && ( (this.getHora()==castOther.getHora()) || ( this.getHora()!=null && castOther.getHora()!=null && this.getHora().equals(castOther.getHora()) ) )
 && ( (this.getDiaSemana()==castOther.getDiaSemana()) || ( this.getDiaSemana()!=null && castOther.getDiaSemana()!=null && this.getDiaSemana().equals(castOther.getDiaSemana()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + this.getIdLider();
         result = 37 * result + ( getHora() == null ? 0 : this.getHora().hashCode() );
         result = 37 * result + ( getDiaSemana() == null ? 0 : this.getDiaSemana().hashCode() );
         return result;
   }   


}


