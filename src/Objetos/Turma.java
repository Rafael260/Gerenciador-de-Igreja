package Objetos;
// Generated 03/06/2016 10:35:37 by Hibernate Tools 4.3.1


import Util.HibernateUtil;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Turma generated by hbm2java
 */
public class Turma  implements java.io.Serializable {


     private TurmaId id;
     private Disciplina disciplina;
     private Membro membro;
     private PeriodoLetivo periodoLetivo;
     private Date dataFim;
     private Set matriculas = new HashSet(0);

    public Turma() {
    }

	
    public Turma(TurmaId id, Disciplina disciplina, Membro membro, PeriodoLetivo periodoLetivo, Date dataFim) {
        this.id = id;
        this.disciplina = disciplina;
        this.membro = membro;
        this.periodoLetivo = periodoLetivo;
        this.dataFim = dataFim;
    }
    public Turma(TurmaId id, Disciplina disciplina, Membro membro, PeriodoLetivo periodoLetivo, Date dataFim, Set matriculas) {
       this.id = id;
       this.disciplina = disciplina;
       this.membro = membro;
       this.periodoLetivo = periodoLetivo;
       this.dataFim = dataFim;
       this.matriculas = matriculas;
    }
   
    public TurmaId getId() {
        return this.id;
    }
    
    public void setId(TurmaId id) {
        this.id = id;
    }
    public Disciplina getDisciplina() {
        return this.disciplina;
    }
    
    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }
    public Membro getMembro() {
        return this.membro;
    }
    
    public void setMembro(Membro membro) {
        this.membro = membro;
    }
    public PeriodoLetivo getPeriodoLetivo() {
        return this.periodoLetivo;
    }
    
    public void setPeriodoLetivo(PeriodoLetivo periodoLetivo) {
        this.periodoLetivo = periodoLetivo;
    }
    public Date getDataFim() {
        return this.dataFim;
    }
    
    public void setDataFim(Date dataFim) {
        this.dataFim = dataFim;
    }
    public Set getMatriculas() {
        return this.matriculas;
    }
    
    public void setMatriculas(Set matriculas) {
        this.matriculas = matriculas;
    }

    /////////////////////////////////////////////////////////////

    public void cadastrarMatricula(Membro aluno){
        Matricula matricula = new Matricula(new MatriculaId(aluno.getId(),disciplina.getCodigo(),id.getDataInicio()),aluno,this);
        HibernateUtil.persistirObjeto(matricula);
    }

    public void cadastrarMatricula(Matricula matricula){
        HibernateUtil.persistirObjeto(matricula);
    }

    //Tentar substituir método de select para HQL, Criteria ou algo semelhante
    //Se a List<Membro> alunos receber corretamente as tuplas do SQL, a classe Returner não é mais necessária
    //VERIFICAR STRING DATA
    public List<Membro> getListaDeAlunos(){
        List<Membro> alunos = HibernateUtil.rodarSql("SELECT * \n" +
"	FROM membro\n" +
"    WHERE id IN (\n" +
"    SELECT id \n" +
"		FROM matricula join membro on id = id_aluno\n" +
"        WHERE cod_disc = '"+this.getId().getCodigo()+"' and data_inicio = '"+this.getId().getDataInicio()+"'\n" +
"    )");
        return alunos;
    }


}


