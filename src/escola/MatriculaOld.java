/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package escola;

import Pessoas.MembroOld;
import java.util.ArrayList;
import java.util.List;

/**
 * Essa classe tá certa?
 * @author Rafael
 */
public class MatriculaOld {
    protected MembroOld aluno;
    protected TurmaOld turma;
    protected float nota_final;
    protected List<AssiduidadeOld> presencas;

    public MatriculaOld(MembroOld aluno, TurmaOld turma) {
        this.aluno = aluno;
        this.turma = turma;
        presencas = new ArrayList<>();
    }

    /////////////////////// <GETS E SETS> ////////////////////////////////////
    
    public MembroOld getAluno() {
        return aluno;
    }

    public void setAluno(MembroOld aluno) {
        this.aluno = aluno;
    }

    public TurmaOld getTurma() {
        return turma;
    }

    public void setTurma(TurmaOld turma) {
        this.turma = turma;
    }

    public float getNota_final() {
        return nota_final;
    }

    public void setNota_final(float nota_final) {
        this.nota_final = nota_final;
    }
   
    public List<AssiduidadeOld> getPresencas() {
        return presencas;
    }

    public void setPresencas(List<AssiduidadeOld> presencas) {
        this.presencas = presencas;
    }
    
    /////////////////////// </GETS E SETS> ////////////////////////////////////

    public void adicionarFrequencia(AssiduidadeOld assiduidade) throws Exception{
        if (assiduidade == null){
            throw new Exception("Objeto referente à assiduidade é nulo");
        }
        presencas.add(assiduidade);
    }
}
