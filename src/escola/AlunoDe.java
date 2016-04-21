/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package escola;

import Pessoas.Membro;

/**
 *
 * @author Rafael
 */
public class AlunoDe {
    protected Membro aluno;
    protected Disciplina disciplina;
    protected float nota_final;

    public Membro getAluno() {
        return aluno;
    }

    public void setAluno(Membro aluno) {
        this.aluno = aluno;
    }

    public Disciplina getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }

    public float getNota_final() {
        return nota_final;
    }

    public void setNota_final(float nota_final) {
        this.nota_final = nota_final;
    }
    
    
}
