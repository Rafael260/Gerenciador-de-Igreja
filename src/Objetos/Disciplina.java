package Objetos;
// Generated 03/06/2016 10:35:37 by Hibernate Tools 4.3.1


import Util.HibernateUtil;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Disciplina generated by hbm2java
 */
public class Disciplina  implements java.io.Serializable {
     private String codigo;
     private Seminario seminario;
     private String nome;
     private Set turmas = new HashSet(0);

    public Disciplina() {
    }

	
    public Disciplina(String codigo, Seminario seminario, String nome) {
        this.codigo = codigo;
        this.seminario = seminario;
        this.nome = nome;
    }
    public Disciplina(String codigo, Seminario seminario, String nome, Set turmas) {
       this.codigo = codigo;
       this.seminario = seminario;
       this.nome = nome;
       this.turmas = turmas;
    }
   
    public String getCodigo() {
        return this.codigo;
    }
    
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    public Seminario getSeminario() {
        return this.seminario;
    }
    
    public void setSeminario(Seminario seminario) {
        this.seminario = seminario;
    }
    public String getNome() {
        return this.nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    public Set getTurmas() {
        return this.turmas;
    }
    
    public void setTurmas(Set turmas) {
        this.turmas = turmas;
    }
    
    //////////////////////////////////////////////
    
    public static Disciplina preencherDadosDisciplina(Object[] object, int index){
        Disciplina disciplina = new Disciplina();
        disciplina.setCodigo((String)object[index]);
        disciplina.setNome((String)object[index+1]);
        if (object[index+2] != null)
            disciplina.setSeminario(Seminario.selectSeminarioPk((String)object[index+2]));
        return disciplina;
    }
    
    public static List<Disciplina> preencherDadosDisciplina(List<Object[]> objects, int index){
        List<Disciplina> disciplinas = new ArrayList();
        for(Object[] object: objects){
            disciplinas.add(preencherDadosDisciplina(object, index));
        }
        return disciplinas;
    }
            
    
    public static Disciplina selectDisciplinaPk(String codigo){
        List<Object[]> objects = HibernateUtil.getTuplasDaTabela("Disciplina", "codigo='"+codigo+"'","",0);
        return preencherDadosDisciplina(objects.get(0), 0);
    }
    
    public static void cadastrarOuAtualizarDisciplina(Seminario seminario, String codigo, String nome) throws Exception{
        Disciplina disciplina = new Disciplina(codigo,seminario,nome);
        HibernateUtil.persistirObjeto(disciplina);
    }
    
    public static void cadastrarOuAtualizarDisciplina(Disciplina disciplina) throws Exception{
        HibernateUtil.persistirObjeto(disciplina);
    }
    
    public static void deletarDisciplina(Disciplina disciplina) throws Exception{
        HibernateUtil.deletarObjeto(disciplina);
    }
    
    public static List<Disciplina> listarTodos(){
        List<Object[]> objects = HibernateUtil.getTuplasDaTabela("Disciplina");
        return preencherDadosDisciplina(objects, 0);
    }
   
//    public void cadastrarOuAtualizarTurma(Membro professor, Date dataInicio, Date dataFim) throws Exception{
//       Turma.cadastrarOuAtualizarTurma(this, professor, dataInicio, dataFim);
//    }
}


