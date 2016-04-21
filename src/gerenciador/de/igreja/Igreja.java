/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gerenciador.de.igreja;

import Pessoas.Membro;
import Pessoas.Visitante;
import escola.Seminario;
import java.util.List;

/**
 *
 * @author Rafael
 */
public class Igreja {
    protected String nome_igreja;
    protected List<Seminario> seminarios;
    protected List<Membro> membros;
    protected List<Visitante> visitantes;

    public String getNome_igreja() {
        return nome_igreja;
    }

    public void setNome_igreja(String nome_igreja) {
        this.nome_igreja = nome_igreja;
    }

    public List<Seminario> getSeminarios() {
        return seminarios;
    }

    public void setSeminarios(List<Seminario> seminarios) {
        this.seminarios = seminarios;
    }

    public List<Membro> getMembros() {
        return membros;
    }

    public void setMembros(List<Membro> membros) {
        this.membros = membros;
    }

    public List<Visitante> getVisitantes() {
        return visitantes;
    }

    public void setVisitantes(List<Visitante> visitantes) {
        this.visitantes = visitantes;
    }
    
    
}
