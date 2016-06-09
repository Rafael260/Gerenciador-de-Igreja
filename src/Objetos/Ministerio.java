package Objetos;
// Generated 03/06/2016 10:35:37 by Hibernate Tools 4.3.1


import Util.HibernateUtil;
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
     private Membro lider;
     private String descricao;
     private Date hora;
     private String diaSemana;
     private Set membros = new HashSet(0);

    public Ministerio() {
    }

	
    public Ministerio(String nome, Membro lider, Date hora, String diaSemana) {
        this.nome = nome;
        this.lider = lider;
        this.hora = hora;
        this.diaSemana = diaSemana;
    }
    
    public Ministerio(String nome, Membro lider, String descricao, Date hora, String diaSemana) {
        this.nome = nome;
        this.lider = lider;
        this.descricao = descricao;
        this.hora = hora;
        this.diaSemana = diaSemana;
    }
    
    
    public Ministerio(String nome, Membro lider, String descricao, Date hora, String diaSemana, Set membros) {
       this.nome = nome;
       this.lider = lider;
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
    public Membro getLider() {
        return this.lider;
    }
    
    public void setLider(Membro lider) {
        this.lider = lider;
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

    public static Ministerio preencherDadosMinisterio(Object[] object, int index){
        Ministerio ministerio = new Ministerio();
        ministerio.setNome((String)object[index]);
        if (object[index+1] != null){
            ministerio.setDescricao((String)object[index+1]);
        }
        ministerio.setHora((Date)object[index+2]);
        ministerio.setDiaSemana((String)object[index+3]);
        return ministerio;
    }
    
    public static List<Ministerio> preencherDadosMinisterio(List<Object[]> objects, int index){
        List<Ministerio> ministerios = new ArrayList();
        for (Object[] obj: objects){
            ministerios.add(preencherDadosMinisterio(obj, index));
        }
        return ministerios;
    }
    
    public static void cadastrarOuAtualizarMinisterio(Ministerio ministerio){
        HibernateUtil.persistirObjeto(ministerio);
    }
    
    public static void cadastrarOuAtualizarMinisterio(String nome, Membro lider, String descricao, Date hora, String diaSemana){
        Ministerio ministerio = new Ministerio(nome,lider,descricao,hora,diaSemana);
        HibernateUtil.persistirObjeto(ministerio);
    }
    
    public static Ministerio selectMinisterioPk(String nome){
        Ministerio ministerio = new Ministerio();
        ministerio.setNome(nome);
        //return (Ministerio)HibernateUtil.getTuplasDaTabela("Ministerio", "nome='"+nome+"'","",0).get(0);
        return (Ministerio)HibernateUtil.getTuplasPorExemplo(ministerio, Ministerio.class).get(0);
    }
    
    public static List<Ministerio> listarTodos(){
        return HibernateUtil.getTuplasDaTabela("Ministerio");
    }
    
    
    /**
     * Em ministério, considera-se que o lider já esteja cadastrado no sistema
 Verificar se usar o comando sql é a melhor solução
     * @param membro 
     */
    public void adicionarMembro(Membro membro){
        List<String> parametros = new ArrayList<>();
        parametros.add(""+membro.getId());
        //Parâmetros do banco que se referem à Strings ou chars, precisam de aspas simples
        parametros.add("'"+getNome()+"'");
        HibernateUtil.insertInto("Participa_Ministerio", parametros);
    }


}


