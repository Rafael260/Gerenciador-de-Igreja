package Classes;
// Generated 28/05/2016 22:16:45 by Hibernate Tools 4.3.1



/**
 * ArquivoTurma generated by hbm2java
 */
public class ArquivoTurma  implements java.io.Serializable {
     private ArquivoTurmaId id;
     private Turma turma;
     private String arquivo;
     private String tipoArq;

    public ArquivoTurma() {
    }

    public ArquivoTurma(ArquivoTurmaId id, Turma turma, String arquivo, String tipoArq) {
       this.id = id;
       this.turma = turma;
       this.arquivo = arquivo;
       this.tipoArq = tipoArq;
    }
   
    public ArquivoTurmaId getId() {
        return this.id;
    }
    
    public void setId(ArquivoTurmaId id) {
        this.id = id;
    }
    public Turma getTurma() {
        return this.turma;
    }
    
    public void setTurma(Turma turma) {
        this.turma = turma;
    }
    public String getArquivo() {
        return this.arquivo;
    }
    
    public void setArquivo(String arquivo) {
        this.arquivo = arquivo;
    }
    public String getTipoArq() {
        return this.tipoArq;
    }
    
    public void setTipoArq(String tipoArq) {
        this.tipoArq = tipoArq;
    }




}


