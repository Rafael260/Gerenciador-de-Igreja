package Objetos;
// Generated 03/06/2016 10:35:37 by Hibernate Tools 4.3.1



/**
 * Ministracao generated by hbm2java
 */
public class Ministracao  implements java.io.Serializable {


     private MinistracaoId id;
     private Evento evento;
     private Mensagem mensagem;
     private Pessoa pessoa;

    public Ministracao() {
    }

    public Ministracao(MinistracaoId id, Evento evento, Mensagem mensagem, Pessoa pessoa) {
       this.id = id;
       this.evento = evento;
       this.mensagem = mensagem;
       this.pessoa = pessoa;
    }
   
    public MinistracaoId getId() {
        return this.id;
    }
    
    public void setId(MinistracaoId id) {
        this.id = id;
    }
    public Evento getEvento() {
        return this.evento;
    }
    
    public void setEvento(Evento evento) {
        this.evento = evento;
    }
    public Mensagem getMensagem() {
        return this.mensagem;
    }
    
    public void setMensagem(Mensagem mensagem) {
        this.mensagem = mensagem;
    }
    public Pessoa getPessoa() {
        return this.pessoa;
    }
    
    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }




}

