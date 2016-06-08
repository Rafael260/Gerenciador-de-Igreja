package Objetos;
// Generated 03/06/2016 10:35:37 by Hibernate Tools 4.3.1


import Util.HibernateUtil;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Grupo generated by hbm2java
 */
public class Grupo  implements java.io.Serializable {


     private GrupoId id;
     private Membro membro;
     private String tipoGrupo;
     private String endRua;
     private int endNumero;
     private String endCompl;
     private String endBairro;
     private String endCidade;
     private Set membros = new HashSet(0);

    public Grupo() {
    }

	
    public Grupo(GrupoId id, Membro membro, String endRua, int endNumero, String endBairro, String endCidade) {
        this.id = id;
        this.membro = membro;
        this.endRua = endRua;
        this.endNumero = endNumero;
        this.endBairro = endBairro;
        this.endCidade = endCidade;
    }
    public Grupo(GrupoId id, Membro membro, String tipoGrupo, String endRua, int endNumero, String endCompl, String endBairro, String endCidade, Set membros) {
       this.id = id;
       this.membro = membro;
       this.tipoGrupo = tipoGrupo;
       this.endRua = endRua;
       this.endNumero = endNumero;
       this.endCompl = endCompl;
       this.endBairro = endBairro;
       this.endCidade = endCidade;
       this.membros = membros;
    }
   
    public GrupoId getId() {
        return this.id;
    }
    
    public void setId(GrupoId id) {
        this.id = id;
    }
    public Membro getMembro() {
        return this.membro;
    }
    
    public void setMembro(Membro membro) {
        this.membro = membro;
    }
    public String getTipoGrupo() {
        return this.tipoGrupo;
    }
    
    public void setTipoGrupo(String tipoGrupo) {
        this.tipoGrupo = tipoGrupo;
    }
    public String getEndRua() {
        return this.endRua;
    }
    
    public void setEndRua(String endRua) {
        this.endRua = endRua;
    }
    public int getEndNumero() {
        return this.endNumero;
    }
    
    public void setEndNumero(int endNumero) {
        this.endNumero = endNumero;
    }
    public String getEndCompl() {
        return this.endCompl;
    }
    
    public void setEndCompl(String endCompl) {
        this.endCompl = endCompl;
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
    public Set getMembros() {
        return this.membros;
    }
    
    public void setMembros(Set membros) {
        this.membros = membros;
    }

    ///////////////////////////////////////////////////////////
    
    public static Grupo preencherDadosGrupo(Object[] object, int index){
        Grupo grupo = new Grupo();
        grupo.setId(new GrupoId((Integer)object[index],(Date)object[index+1],(String)object[index+2]));
        grupo.setTipoGrupo((String)object[index+3]);
        grupo.setEndRua((String)object[index+4]);
        grupo.setEndNumero((Integer)object[index+5]);
        grupo.setEndCompl((String)object[index+6]);
        grupo.setEndBairro((String)object[index+7]);
        grupo.setEndCidade((String)object[index+8]);
        return grupo;
    }
    
    public static Grupo selectGrupoPk(GrupoId id){
        List<Object[]> objects = HibernateUtil.getTuplasDaTabela("Grupo", "id_lider="+id.getIdLider() + " and hora='"+id.getHora()+ "' and dia_semana='"+id.getDiaSemana()+"'","");
        return preencherDadosGrupo(objects.get(0),0);
    }
    
    public static Grupo selectGrupoPk(int id_lider, Date hora, String dia_semana){
        //CONFERIR STRING DE HORA
        return (Grupo)HibernateUtil.getTuplasDaTabela("Grupo", "id_lider="+id_lider + " and hora='"+hora+ "' and dia_semana='"+dia_semana+"'","").get(0);
    }
    
    public static List<Grupo> listarTodos(){
        return HibernateUtil.getTuplasDaTabela("Grupo");
    }
    
    public static List<Grupo> selectGrupoPorTipo(String tipo){
        return HibernateUtil.getTuplasDaTabela("Grupo","tipo_grupo='"+tipo+"'","");
    }
    
    public static List<Grupo> selectGrupoPorDiaSemana(String diaSemana){
        return HibernateUtil.getTuplasDaTabela("Grupo","dia_semana='"+diaSemana+"'","");
    }
    
    /**
     * Seleciona os grupos que possuem horário de início entre horaInicio e horaFinal
     * VERIFICAR TIPO DATE E O SEU FORMATO STRING PARA O COMANDO SQL
     * @param horaInicio
     * @param horaFinal
     * @return 
     */
    public static List<Grupo> selectGrupoPorDiaHorario(Date horaInicio, Date horaFinal){
        return HibernateUtil.getTuplasDaTabela("Grupo","hora between '"+horaInicio+"' and '"+horaFinal+"'","");
    }
    
    public static List<Grupo> selectGrupoPorBairro(String bairro){
        return HibernateUtil.getTuplasDaTabela("Grupo","end_bairro='"+bairro+"'","");
    }
    
    public static List<Grupo> selectGrupoPorCidade(String cidade){
        return HibernateUtil.getTuplasDaTabela("Grupo","end_cidade='"+cidade+"'","");
    }
    
    public void adicionarMembro(Membro membro){
        membro.setGrupo(this);
        HibernateUtil.persistirObjeto(membro); //Atualizar membro com os dados de Grupo
    }

}


