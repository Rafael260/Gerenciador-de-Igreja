package escola;

import Pessoas.MembroOld;
import Pessoas.Professor;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Eliseu, Geraldo e Rafael
 */
public class TurmaOld {
    
    private Date data_inicio;
    private Date data_fim;
    List<MembroOld> alunos;
    private DisciplinaOld disciplina;
    private Professor professor;

    public TurmaOld(Date data_inicio, Date data_fim, DisciplinaOld disciplina, Professor professor) {
        this.data_inicio = data_inicio;
        this.data_fim = data_fim;
        this.alunos = new ArrayList<>();
        this.disciplina = disciplina;
        this.professor = professor;
    }
    
    /////////////////////// <GETS E SETS> ////////////////////////////////////
    public Date getData_inicio() {
        return data_inicio;
    }

    public void setData_inicio(Date data_inicio) {
        this.data_inicio = data_inicio;
    }

    public Date getData_fim() {
        return data_fim;
    }

    public void setData_fim(Date data_fim) {
        this.data_fim = data_fim;
    }

    public List<MembroOld> getAlunos() {
        return alunos;
    }

    public void setAlunos(List<MembroOld> alunos) {
        this.alunos = alunos;
    }

    public DisciplinaOld getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(DisciplinaOld disciplina) {
        this.disciplina = disciplina;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }
    
    
    /////////////////////// </GETS E SETS> ////////////////////////////////////
    
    /////////////////////// <TRABALHANDO COM ALUNOS> ////////////////////////////////////
    public void adicionarAluno(MembroOld aluno) throws Exception{
        if (aluno == null){
            throw new Exception("Objeto referente à aluno é nulo");
        }
        alunos.add(aluno);
    }
        
    /////////////////////// </TRABALHANDO COM ALUNOS> ////////////////////////////////////
}
