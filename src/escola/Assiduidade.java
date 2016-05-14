/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package escola;

import java.util.Date;

/**
 * Essa classe é necessária?
 * @author Rafael
 */
public class Assiduidade {
    protected Date data_aula;
    protected boolean presente;
    protected AlunoDe aluno_de;

    public Date getData_aula() {
        return data_aula;
    }

    public void setData_aula(Date data_aula) {
        this.data_aula = data_aula;
    }

    public boolean isPresente() {
        return presente;
    }

    public void setPresente(boolean presente) {
        this.presente = presente;
    }

    public AlunoDe getAluno_de() {
        return aluno_de;
    }

    public void setAluno_de(AlunoDe aluno_de) {
        this.aluno_de = aluno_de;
    }
    
}
