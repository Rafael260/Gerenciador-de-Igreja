package Objetos;
// Generated 03/06/2016 10:35:37 by Hibernate Tools 4.3.1


import Util.FormatoDataHora;
import Util.HibernateUtil;
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
     private String usuario;
     private String senha;
     //CONSIDERAMOS OS BITS DA DIREITA PARA A ESQUERDA
     //1º BIT: LÍDER, 2º BIT: PROFESSOR, 3º BIT: SECRETARIA, 4º BIT: ADMIN
     private int permissoes;
     private Set ministerios = new HashSet(0);
     private Set seminarios = new HashSet(0);
     private Set grupos = new HashSet(0);
     private Set matriculas = new HashSet(0);
     private Set ministerios_lidera = new HashSet(0);
     private Set turmas = new HashSet(0);
     private Set noticias = new HashSet(0);

    public Membro() {
    }

	
    public Membro(Pessoa pessoa, String cpf, String usuario, String senha, int permissoes) {
        this.pessoa = pessoa;
        this.id = pessoa.getId();
        this.cpf = cpf;
        this.usuario = usuario;
        this.senha = senha;
        this.permissoes = permissoes;
    }
    
    public Membro(Pessoa pessoa, String cpf, String usuario, String senha, boolean lider, boolean professor, boolean secretario, boolean admin) {
        this.pessoa = pessoa;
        this.id = pessoa.getId();
        this.cpf = cpf;
        this.usuario = usuario;
        this.senha = senha;
        this.setLider(lider);
        this.setProfessor(professor);
        this.setSecretario(secretario);
        this.setAdmin(admin);
    }
    
    public Membro(Grupo grupo, Pessoa pessoa, String cpf, Date dataNasc, Date batismoApres, String usuario, String senha, int permissoes, Set ministerios, Set seminarios, Set grupos, Set matriculas, Set ministerios_1, Set turmas, Set noticias) {
       this.grupo = grupo;
       this.pessoa = pessoa;
       this.id = pessoa.getId();
       this.cpf = cpf;
       this.dataNasc = dataNasc;
       this.batismoApres = batismoApres;
       this.usuario = usuario;
       this.senha = senha;
       this.permissoes = permissoes;
       this.ministerios = ministerios;
       this.seminarios = seminarios;
       this.grupos = grupos;
       this.matriculas = matriculas;
       this.ministerios_lidera = ministerios_1;
       this.turmas = turmas;
       this.noticias = noticias;
    }
    
    public Membro(Grupo grupo, Pessoa pessoa, String cpf, Date dataNasc, Date batismoApres, String usuario, String senha, boolean lider, boolean professor, boolean secretario, boolean admin, Set ministerios, Set seminarios, Set grupos, Set matriculas, Set ministerios_1, Set turmas, Set noticias) {
       this.grupo = grupo;
       this.pessoa = pessoa;
       this.id = pessoa.getId();
       this.cpf = cpf;
       this.dataNasc = dataNasc;
       this.batismoApres = batismoApres;
       this.usuario = usuario;
       this.senha = senha;
       this.setLider(lider);
       this.setProfessor(professor);
       this.setSecretario(secretario);
       this.setAdmin(admin);
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
        this.id = pessoa.getId();
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
    public int getPermissoes(){
        return this.permissoes;
    }
    
    public void setPermissoes(int permissoes){
        this.permissoes = permissoes;
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

    public boolean isLider() {
        //Checa se o 1º bit é 1
        return (this.permissoes & 1) == 1;
    }
    
    public final void setLider(boolean lider) {
        //Se quiser setar como líder, o 1º bit deve ser 1
        if (lider){
            this.permissoes = this.permissoes | 1;
        }
        //Senão, faz a operação de and para zerar o 1º bit e preservar os outros 3
        else{
            this.permissoes = this.permissoes & 14;
        }
    }
    //Os outros são semelhantes aos métodos sobre líder
    public boolean isProfessor() {
        return (this.permissoes & 2) == 2;
    }
    
    public final void setProfessor(boolean professor) {
        if (professor){
            this.permissoes = this.permissoes | 2;
        }
        else{
            this.permissoes = this.permissoes & 13;
        }
    }
    
    public boolean isSecretario(){
        return (this.permissoes & 4) == 4;
    }
    
    public final void setSecretario(boolean secretario) {
        if (secretario){
            this.permissoes = this.permissoes | 4;
        }
        else{
            this.permissoes = this.permissoes & 11;
        }
    }
    
    public boolean isAdmin(){
        return (this.permissoes & 8) == 8;
    }
    
    public final void setAdmin(boolean admin){
        if (admin){
            this.permissoes = this.permissoes | 8;
        }
        else{
            this.permissoes = this.permissoes & 7;
        }
    } 
    
    public static Membro selectMembroPk(int id){
        List<Object[]> objects = HibernateUtil.getTuplasDaTabela("Pessoa natural join Membro", "id="+id,"");
        return Membro.preencherDadosMembro(objects.get(0));
    }
     
    public static Membro preencherDadosMembro(Object[] object){
        Pessoa p = Pessoa.preencherDadosPessoa(object);
        Membro membro = new Membro();
        membro.setPessoa(p);
        membro.setCpf((String)object[12]);
        membro.setDataNasc((Date)object[13]);
        membro.setBatismoApres((Date)object[14]);
        membro.setUsuario((String)object[15]);
        membro.setSenha((String)object[16]);
        membro.setPermissoes((Integer)object[17]);
        membro.setGrupo(Grupo.selectGrupoPk(new GrupoId((Integer)object[18],(Date)object[19],(String)object[20])));
        return membro;
    }
     
    public static List<Membro> preencherDadosMembro(List<Object[]> objsList){
        List<Membro> membros = new ArrayList();
        for (Object[] objs : objsList) {
           membros.add(Membro.preencherDadosMembro(objs));
        }
        return membros;
    }
    
    public static List<Membro> listarTodos(){
        List<Object[]> objects = HibernateUtil.getTuplasDaTabela("Pessoa natural join Membro", "","");
        List<Membro> membros = preencherDadosMembro(objects);
        return membros;
    }
    
    public static List<Membro> listarTodos(Ordem ordem){
        List<Object[]> objects = HibernateUtil.getTuplasDaTabela("Pessoa natural join Membro", "","data_nasc "+ordem.getSqlOrder());
        List<Membro> membros = preencherDadosMembro(objects);
        return membros;
    }
    
    public static Membro selectMembroPorUsuario(String usuario){
        List<Object[]> objects = HibernateUtil.getTuplasDaTabela("Pessoa natural join Membro", "usuario='"+usuario+"'","");
        return Membro.preencherDadosMembro(objects.get(0));
    }
    
    public static Membro selectMembroAutenticado(String usuario, String senha){
        List<Object[]> objects = HibernateUtil.getTuplasDaTabela("Pessoa natural join Membro", "usuario='"+usuario+"' and senha='"+senha+"'","");
        return Membro.preencherDadosMembro(objects.get(0));
    }
    
    public static List<Membro> selectMembroPorNome(String nome, String sobrenome){
        List<Object[]> objects = HibernateUtil.getTuplasDaTabela("Pessoa natural join Membro", "nome='"+nome+"' and sobrenome='"+sobrenome+"'","");
        return preencherDadosMembro(objects);
    }
    
    public static List<Membro> selectMembrosComPermissao(int permissao){
        List<Object[]> objects = HibernateUtil.getTuplasDaTabela("Pessoa natural join Membro", "(permissoes & "+permissao+") = "+permissao,"");
        return preencherDadosMembro(objects);
    }
    
    public static List<Membro> selectLideres(){
        return selectMembrosComPermissao(1);
    }
    
    public static List<Membro> selectProfessores(){
       return selectMembrosComPermissao(2);
    }
    
    public static List<Membro> selectSecretarios(){
       return selectMembrosComPermissao(4);
    }
    
    public static List<Membro> selectAdmins(){
       return selectMembrosComPermissao(8);
    }
    
    public static List<Membro> selectAniversariantesDoMes(Ordem ordem){
        Date dataAtual = FormatoDataHora.getDataHoraAtual();
        int mesAtual = FormatoDataHora.getMes(dataAtual);
        List<Object[]> objects = HibernateUtil.getTuplasDaTabela("Pessoa natural join Membro", "data_nasc like '____-"+FormatoDataHora.getCampoCompleto(mesAtual)+"-__'","data_nasc "+ordem.getSqlOrder());
        return preencherDadosMembro(objects);
    }
    
    public void adicionarMinisterio(String nome, Date hora, String diaSemana){
        Ministerio ministerio = new Ministerio(nome,this,hora,diaSemana);
        List<String> parametros = new ArrayList();
        parametros.add(""+getId());
        //Parâmetros do banco que se referem à Strings ou chars, precisam de aspas simples
        parametros.add("'"+ministerio.getNome()+"'");
        HibernateUtil.insertInto("Participa_Ministerio", parametros);
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
        HibernateUtil.insertInto("Participa_Ministerio", parametros);
        ministerios.add(ministerio);
    }

    
}


