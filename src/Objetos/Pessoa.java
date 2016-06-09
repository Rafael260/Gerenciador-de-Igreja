package Objetos;
// Generated 03/06/2016 10:35:37 by Hibernate Tools 4.3.1


import Util.AtributoValor;
import Util.HibernateUtil;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Pessoa generated by hbm2java
 */
public class Pessoa  implements java.io.Serializable {


     private Integer id;
     private String nome;
     private String sobrenome;
     private String telefone;
     private String endRua;
     private Integer endNumero;
     private String endComp;
     private String endBairro;
     private String endCidade;
     private String endEstado;
     private String email;
     private Character estadoCivil;
     private Membro membro;
     private Set ministracaos = new HashSet(0);
     private Visitante visitante;

    public Pessoa() {
    }

	
    public Pessoa(String nome, String sobrenome) {
        this.nome = nome;
        this.sobrenome = sobrenome;
    }
    public Pessoa(String nome, String sobrenome, String telefone, String endRua, Integer endNumero, String endComp, String endBairro, String endCidade, String endEstado, String email, Character estadoCivil, Membro membro, Set ministracaos, Visitante visitante) {
       this.nome = nome;
       this.sobrenome = sobrenome;
       this.telefone = telefone;
       this.endRua = endRua;
       this.endNumero = endNumero;
       this.endComp = endComp;
       this.endBairro = endBairro;
       this.endCidade = endCidade;
       this.endEstado = endEstado;
       this.email = email;
       this.estadoCivil = estadoCivil;
       this.membro = membro;
       this.ministracaos = ministracaos;
       this.visitante = visitante;
    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public String getNome() {
        return this.nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getSobrenome() {
        return this.sobrenome;
    }
    
    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }
    public String getTelefone() {
        return this.telefone;
    }
    
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    public String getEndRua() {
        return this.endRua;
    }
    
    public void setEndRua(String endRua) {
        this.endRua = endRua;
    }
    public Integer getEndNumero() {
        return this.endNumero;
    }
    
    public void setEndNumero(Integer endNumero) {
        this.endNumero = endNumero;
    }
    public String getEndComp() {
        return this.endComp;
    }
    
    public void setEndComp(String endComp) {
        this.endComp = endComp;
    }
    public String getEndBairro() {
        return this.endBairro;
    }
    
    public void setEndBairro(String endBairro) {
        this.endBairro = endBairro;
    }
    public String getEndCidade() {
        return this.endCidade;
    }
    
    public void setEndCidade(String endCidade) {
        this.endCidade = endCidade;
    }
    public String getEndEstado() {
        return this.endEstado;
    }
    
    public void setEndEstado(String endEstado) {
        this.endEstado = endEstado;
    }
    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    public Character getEstadoCivil() {
        return this.estadoCivil;
    }
    
    public void setEstadoCivil(Character estadoCivil) {
        this.estadoCivil = estadoCivil;
    }
    public Membro getMembro() {
        return this.membro;
    }
    
    public void setMembro(Membro membro) {
        this.membro = membro;
    }
    public Set getMinistracaos() {
        return this.ministracaos;
    }
    
    public void setMinistracaos(Set ministracaos) {
        this.ministracaos = ministracaos;
    }
    public Visitante getVisitante() {
        return this.visitante;
    }
    
    public void setVisitante(Visitante visitante) {
        this.visitante = visitante;
    }
    
    ////////////////////////////////////////////////
    
     public static Pessoa preencherDadosPessoa(Object[] object, int index){
        Pessoa p = new Pessoa();
        p.setId((Integer)object[index]);
        p.setNome((String)object[index+1]);
        p.setSobrenome((String)object[index+2]);
        if (object[index+3] != null)
            p.setTelefone((String)object[index+3]);
        if (object[index+4] != null)
            p.setEndRua((String)object[index+4]);
        if (object[index+5] != null)
            p.setEndNumero((Integer)object[index+5]);
        if (object[index+6] != null)    
            p.setEndComp((String)object[index+6]);
        if (object[index+7] != null)
            p.setEndBairro((String)object[index+7]);
        if (object[index+8] != null)
            p.setEndCidade((String)object[index+8]);
        if (object[index+9] != null)
            p.setEndEstado((String)object[index+9]);
        if (object[index+10] != null)
            p.setEmail((String)object[index+10]);
        if (object[index+11] != null)
            p.setEstadoCivil((Character)object[index+11]);
        return p;
    }
     
    public static List<Pessoa> preencherDadosPessoa(List<Object[]> objects, int index){
        List<Pessoa> pessoas = new ArrayList();
        for(Object[] obj: objects){
            pessoas.add(preencherDadosPessoa(obj, index));
        }
        return pessoas;
    }
    
    public static Pessoa selectPessoaPk(int id){
        return (Pessoa)HibernateUtil.getTuplasDaTabela("Pessoa", "id="+id,"",0).get(0);
    }
    
    public static List<Pessoa> listarTodos(){
        return HibernateUtil.getTuplasDaTabela("Pessoa");
    }
    
    public static List<Pessoa> selectPessoaPorNome(String nome){
        return HibernateUtil.getTuplasDaTabela("Pessoa","nome='"+nome+"'","",0);
    }
    
    public static List<Pessoa> selectPessoaPorNome(String nome, String sobrenome){
        return HibernateUtil.getTuplasDaTabela("Pessoa","nome='"+nome+"' and sobrenome='"+sobrenome+"'","",0);
    }
    
    public static void updatePessoa(Pessoa pessoa){
        HibernateUtil.persistirObjeto(pessoa);
    }
    
    public static Pessoa updatePessoa(Pessoa pessoa, List<AtributoValor> atualizacoes){
        for (AtributoValor atrVal: atualizacoes){
            switch(atrVal.getAtributo()){
                case "nome":
                    pessoa.setNome((String)atrVal.getValor());
                    break;
                case "sobrenome":
                    pessoa.setSobrenome((String)atrVal.getValor());
                    break;
                case "telefone":
                    pessoa.setTelefone((String)atrVal.getValor());
                    break;
                case "endRua":
                    pessoa.setEndRua((String)atrVal.getValor());
                    break;
                case "endNum":
                    pessoa.setEndNumero((Integer)atrVal.getValor());
                    break;
                case "endComp":
                    pessoa.setEndRua((String)atrVal.getValor());
                    break;
                case "endBairro":
                    pessoa.setEndBairro((String)atrVal.getValor());
                    break;
                case "endCidade":
                    pessoa.setEndCidade((String)atrVal.getValor());
                    break;
                case "endEstado":
                    pessoa.setEndEstado((String)atrVal.getValor());
                    break;
                case "email":
                    pessoa.setEmail((String)atrVal.getValor());
                    break;
                case "estadoCivil":
                    pessoa.setEstadoCivil((Character)atrVal.getValor());
            }
        }
        HibernateUtil.persistirObjeto(pessoa);
        return pessoa;
    }
    
    public void cadastrarMinistracao(Evento evento, Mensagem mensagem){
        Ministracao ministracao = new Ministracao(new MinistracaoId(evento.getId().getTema(),evento.getId().getDiaHora(),mensagem.getTitulo()),evento,mensagem,this);
        HibernateUtil.persistirObjeto(ministracao);
    }

    public void cadastrarMinistracao(Ministracao ministracao){
        HibernateUtil.persistirObjeto(ministracao);
    }

    
}


