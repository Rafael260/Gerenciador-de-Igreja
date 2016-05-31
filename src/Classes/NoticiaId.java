package Classes;
// Generated 28/05/2016 22:16:45 by Hibernate Tools 4.3.1



/**
 * NoticiaId generated by hbm2java
 */
public class NoticiaId  implements java.io.Serializable {
     private String manchete;
     private int idCadastrante;

    public NoticiaId() {
    }

    public NoticiaId(String manchete, int idCadastrante) {
       this.manchete = manchete;
       this.idCadastrante = idCadastrante;
    }
   
    public String getManchete() {
        return this.manchete;
    }
    
    public void setManchete(String manchete) {
        this.manchete = manchete;
    }
    public int getIdCadastrante() {
        return this.idCadastrante;
    }
    
    public void setIdCadastrante(int idCadastrante) {
        this.idCadastrante = idCadastrante;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof NoticiaId) ) return false;
		 NoticiaId castOther = ( NoticiaId ) other; 
         
		 return ( (this.getManchete()==castOther.getManchete()) || ( this.getManchete()!=null && castOther.getManchete()!=null && this.getManchete().equals(castOther.getManchete()) ) )
 && (this.getIdCadastrante()==castOther.getIdCadastrante());
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getManchete() == null ? 0 : this.getManchete().hashCode() );
         result = 37 * result + this.getIdCadastrante();
         return result;
   }   


}


