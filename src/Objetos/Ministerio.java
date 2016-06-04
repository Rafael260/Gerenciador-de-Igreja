package Objetos;
// Generated 03/06/2016 10:35:37 by Hibernate Tools 4.3.1


import Util.HibernateUtil;
import Util.Returner;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Ministerio generated by hbm2java
 */
public class Ministerio  implements java.io.Serializable {


     private String nome;
     private Membro membro;
     private String descricao;
     private Date hora;
     private String diaSemana;
     private Set membros = new HashSet(0);

    public Ministerio() {
    }

	
    public Ministerio(String nome, Membro membro, Date hora, String diaSemana) {
        this.nome = nome;
        this.membro = membro;
        this.hora = hora;
        this.diaSemana = diaSemana;
    }
    public Ministerio(String nome, Membro membro, String descricao, Date hora, String diaSemana, Set membros) {
       this.nome = nome;
       this.membro = membro;
       this.descricao = descricao;
       this.hora = hora;
       this.diaSemana = diaSemana;
       this.membros = membros;
    }
   
    public String getNome() {
        return this.nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    public Membro getMembro() {
        return this.membro;
    }
    
    public void setMembro(Membro membro) {
        this.membro = membro;
    }
    public String getDescricao() {
        return this.descricao;
    }
    
    public void setDescricao(String descricao) {
        this.descricao = descricao;
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
    public Set getMembros() {
        return this.membros;
    }
    
    public void setMembros(Set membros) {
        this.membros = membros;
    }

    /////////////////////////////////////////////////////////////////////

    public static Ministerio selectMinisterioPk(String nome){
        Returner<Ministerio> returner = new Returner();
        return returner.getListaEspecifica(HibernateUtil.getTuplasDaTabela("ministerio", "nome="+nome)).get(0);   
    }
    
    public static List<Ministerio> listarTodos(){
        List objects = HibernateUtil.getTuplasDaTabela("ministerio");
        Returner<Ministerio> returner = new Returner();
        return returner.getListaEspecifica(objects);
    }
    
    
    /**
     * Em ministério, considera-se que o membro já esteja cadastrado no sistema
     * Verificar se usar o comando sql é a melhor solução
     * @param membro 
     */
    public void adicionarMembro(Membro membro){
        List<String> parametros = new ArrayList<>();
        parametros.add(""+membro.getId());
        //Parâmetros do banco que se referem à Strings ou chars, precisam de aspas simples
        parametros.add("'"+getNome()+"'");
        HibernateUtil.insertInto("participa_ministerio", parametros);
    }


}


