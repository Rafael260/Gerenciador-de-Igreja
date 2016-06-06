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
 * Seminario generated by hbm2java
 */
public class Seminario  implements java.io.Serializable {

     private String nome;
     private Membro membro;
     private Set disciplinas = new HashSet(0);
     private Set periodoLetivos = new HashSet(0);

    public Seminario() {
    }

	
    public Seminario(String nome, Membro membro) {
        this.nome = nome;
        this.membro = membro;
    }
    public Seminario(String nome, Membro membro, Set disciplinas, Set periodoLetivos) {
       this.nome = nome;
       this.membro = membro;
       this.disciplinas = disciplinas;
       this.periodoLetivos = periodoLetivos;
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
    public Set getDisciplinas() {
        return this.disciplinas;
    }
    
    public void setDisciplinas(Set disciplinas) {
        this.disciplinas = disciplinas;
    }
    public Set getPeriodoLetivos() {
        return this.periodoLetivos;
    }
    
    public void setPeriodoLetivos(Set periodoLetivos) {
        this.periodoLetivos = periodoLetivos;
    }

    ////////////////////////////////////////////////////

    public static Seminario selectSeminarioPk(String nome){
        return (Seminario)HibernateUtil.getTuplasDaTabela("Seminario", "nome="+nome).get(0);
    }
    
    //Geralmente só vai ter um
    public static List<Seminario> listarTodos(){
        return HibernateUtil.getTuplasDaTabela("Seminario");
    }
    
    public List<Disciplina> selectDisciplinas(){
        return HibernateUtil.getTuplasDaTabela("Disciplina", "nome_seminario='"+this.nome+"'");
    }
    
    public List<Turma> selectDisciplinasAtivas(){
        Date dataAtual = FormatoDataHora.getDataHoraAtual();
        List<Disciplina> allDisciplinas = selectDisciplinas();
        List<Turma> disciplinasAtivas = new ArrayList();
        for (Disciplina disciplina : allDisciplinas) {
            disciplinasAtivas.addAll(disciplina.getTurmasAtivas(dataAtual));
        }
        return disciplinasAtivas;
    }

    /**
     * Adiciona mais um período letivo - poderia ser feito automaticamente
     * Usa a Session do Hibernate para realizar a transação em salvar o novo período
     * @param ano: ano do período letivo
     */
    public void cadastrarPeriodoLetivo(int ano){
        PeriodoLetivo pLetivo = new PeriodoLetivo(ano, this);
        HibernateUtil.persistirObjeto(pLetivo);
    }

    public void cadastrarDisciplina(String codigo, String nome){
        Disciplina disciplina = new Disciplina(codigo,this,nome);
        HibernateUtil.persistirObjeto(disciplina);
    }


}


