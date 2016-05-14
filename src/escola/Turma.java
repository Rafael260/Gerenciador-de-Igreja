package escola;

import Pessoas.Membro;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Eliseu, Geraldo e Rafael
 */
public class Turma {
    
    private Date data_inicio;
    private Date data_fim;
    List<Membro> alunos;
    private Disciplina disciplina;

    public Turma(Date data_inicio, Date data_fim, Disciplina disciplina) {
        this.data_inicio = data_inicio;
        this.data_fim = data_fim;
        this.alunos = new ArrayList<>();
        this.disciplina = disciplina;
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

    public List<Membro> getAlunos() {
        return alunos;
    }

    public void setAlunos(List<Membro> alunos) {
        this.alunos = alunos;
    }

    public Disciplina getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }
    
    
    /////////////////////// </GETS E SETS> ////////////////////////////////////
    
    /////////////////////// <TRABALHANDO COM ALUNOS> ////////////////////////////////////
    public void adicionarAluno(Membro aluno) throws Exception{
        if (aluno == null){
            throw new Exception("Objeto referente à aluno é nulo");
        }
        alunos.add(aluno);
    }
        
    /////////////////////// </TRABALHANDO COM ALUNOS> ////////////////////////////////////
}
