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
 * Membro generated by hbm2java
 */
public class Membro  implements java.io.Serializable {


     private int id;
     private Grupo grupo;
     private Pessoa pessoa;
     private String cpf;
     private Date dataNasc;
     private Date batismoApres;
     private boolean lider;
     private boolean professor;
     private String usuario;
     private String senha;
     private Set ministerios = new HashSet(0);
     private Set seminarios = new HashSet(0);
     private Set grupos = new HashSet(0);
     private Set matriculas = new HashSet(0);
     private Set ministerios_lidera = new HashSet(0);
     private Set turmas = new HashSet(0);
     private Set noticias = new HashSet(0);

    public Membro() {
    }

	
    public Membro(Pessoa pessoa, String cpf, boolean lider, boolean professor, String usuario, String senha) {
        this.pessoa = pessoa;
        this.cpf = cpf;
        this.lider = lider;
        this.professor = professor;
        this.usuario = usuario;
        this.senha = senha;
    }
    public Membro(Grupo grupo, Pessoa pessoa, String cpf, Date dataNasc, Date batismoApres, boolean lider, boolean professor, String usuario, String senha, Set ministerios, Set seminarios, Set grupos, Set matriculas, Set ministerios_1, Set turmas, Set noticias) {
       this.grupo = grupo;
       this.pessoa = pessoa;
       this.cpf = cpf;
       this.dataNasc = dataNasc;
       this.batismoApres = batismoApres;
       this.lider = lider;
       this.professor = professor;
       this.usuario = usuario;
       this.senha = senha;
       this.ministerios = ministerios;
       this.seminarios = seminarios;
       this.grupos = grupos;
       this.matriculas = matriculas;
       this.ministerios_lidera = ministerios_1;
       this.turmas = turmas;
       this.noticias = noticias;
    }
   
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    public Grupo getGrupo() {
        return this.grupo;
    }
    
    public void setGrupo(Grupo grupo) {
        this.grupo = grupo;
    }
    public Pessoa getPessoa() {
        return this.pessoa;
    }
    
    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }
    public String getCpf() {
        return this.cpf;
    }
    
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public Date getDataNasc() {
        return this.dataNasc;
    }
    
    public void setDataNasc(Date dataNasc) {
        this.dataNasc = dataNasc;
    }
    public Date getBatismoApres() {
        return this.batismoApres;
    }
    
    public void setBatismoApres(Date batismoApres) {
        this.batismoApres = batismoApres;
    }
    public boolean isLider() {
        return this.lider;
    }
    
    public void setLider(boolean lider) {
        this.lider = lider;
    }
    public boolean isProfessor() {
        return this.professor;
    }
    
    public void setProfessor(boolean professor) {
        this.professor = professor;
    }
    public String getUsuario() {
        return this.usuario;
    }
    
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
    public String getSenha() {
        return this.senha;
    }
    
    public void setSenha(String senha) {
        this.senha = senha;
    }
    public Set getMinisterios() {
        return this.ministerios;
    }
    
    public void setMinisterios(Set ministerios) {
        this.ministerios = ministerios;
    }
    public Set getSeminarios() {
        return this.seminarios;
    }
    
    public void setSeminarios(Set seminarios) {
        this.seminarios = seminarios;
    }
    public Set getGrupos() {
        return this.grupos;
    }
    
    public void setGrupos(Set grupos) {
        this.grupos = grupos;
    }
    public Set getMatriculas() {
        return this.matriculas;
    }
    
    public void setMatriculas(Set matriculas) {
        this.matriculas = matriculas;
    }
    public Set getMinisterios_lidera() {
        return this.ministerios_lidera;
    }
    
    public void setMinisterios_lidera(Set ministerios_lidera) {
        this.ministerios_lidera = ministerios_lidera;
    }
    public Set getTurmas() {
        return this.turmas;
    }
    
    public void setTurmas(Set turmas) {
        this.turmas = turmas;
    }
    public Set getNoticias() {
        return this.noticias;
    }
    
    public void setNoticias(Set noticias) {
        this.noticias = noticias;
    }

    /////////////////////////////////////////////////////////////

    public void adicionarMinisterio(String nome, Date hora, String diaSemana){
        Ministerio ministerio = new Ministerio(nome,this,hora,diaSemana);
        List<String> parametros = new ArrayList<>();
        parametros.add(""+getId());
        //Parâmetros do banco que se referem à Strings ou chars, precisam de aspas simples
        parametros.add("'"+ministerio.getNome()+"'");
        HibernateUtil.insertInto("participa_ministerio", parametros);
    }

    /**
     * Adicionar ministério se resume à adicionar a tupla (membro, ministério) na tabela
     * participa_ministerio e ao set de ministérios que membro participa.
     * @param ministerio 
     */
    public void adicionarMinisterio(Ministerio ministerio){
        List<String> parametros = new ArrayList<>();
        parametros.add(""+getId());
        //Parâmetros do banco que se referem à Strings ou chars, precisam de aspas simples
        parametros.add("'"+ministerio.getNome()+"'");
        HibernateUtil.insertInto("participa_ministerio", parametros);
        ministerios.add(ministerio);
    }

    public static List<Membro> listarTodos(){
        List objects = HibernateUtil.getTuplasDaTabela("membro");
        Returner<Membro> returner = new Returner();
        return returner.getListaEspecifica(objects);
    }
}


