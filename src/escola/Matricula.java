/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package escola;

import Pessoas.Membro;
import java.util.ArrayList;
import java.util.List;

/**
 * Essa classe tá certa?
 * @author Rafael
 */
public class Matricula {
    protected Membro aluno;
    protected Turma turma;
    protected float nota_final;
    protected List<Assiduidade> presencas;

    public Matricula(Membro aluno, Turma turma) {
        this.aluno = aluno;
        this.turma = turma;
        presencas = new ArrayList<>();
    }

    /////////////////////// <GETS E SETS> ////////////////////////////////////
    
    public Membro getAluno() {
        return aluno;
    }

    public void setAluno(Membro aluno) {
        this.aluno = aluno;
    }

    public Turma getTurma() {
        return turma;
    }

    public void setTurma(Turma turma) {
        this.turma = turma;
    }

    public float getNota_final() {
        return nota_final;
    }

    public void setNota_final(float nota_final) {
        this.nota_final = nota_final;
    }
   
    public List<Assiduidade> getPresencas() {
        return presencas;
    }

    public void setPresencas(List<Assiduidade> presencas) {
        this.presencas = presencas;
    }
    
    /////////////////////// </GETS E SETS> ////////////////////////////////////

    public void adicionarFrequencia(Assiduidade assiduidade) throws Exception{
        if (assiduidade == null){
            throw new Exception("Objeto referente à assiduidade é nulo");
        }
        presencas.add(assiduidade);
    }
}
