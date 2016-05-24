/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gerenciador.de.igreja;

import Evt.Endereco;
import Evt.Grupo;
import Pessoas.Membro;
import Pessoas.Visitante;
import escola.Seminario;
import escola.Turma;
import java.util.ArrayList;
import java.util.Date;
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
    protected List<Grupo> grupos;
    protected Endereco endereco;

    public Igreja(String nome_igreja) {
        this.nome_igreja = nome_igreja;
        seminarios = new ArrayList<>();
        membros = new ArrayList<>();
        visitantes = new ArrayList<>();
        grupos = new ArrayList<>();
    }
    
    public Igreja(String nome_igreja, Endereco endereco) {
        this.nome_igreja = nome_igreja;
        seminarios = new ArrayList<>();
        membros = new ArrayList<>();
        visitantes = new ArrayList<>();
        grupos = new ArrayList<>();
        this.endereco = endereco;
    }

    /////////////////////// <GETS E SETS> ////////////////////////////////////
    
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

    public List<Grupo> getGrupos() {
        return grupos;
    }

    public void setGrupos(List<Grupo> grupos) {
        this.grupos = grupos;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
    
    /////////////////////// </GETS E SETS> ////////////////////////////////////
    
    public void adicionarSeminario(String nome, Date data_inicio, Date data_fim, Membro coordenador) throws Exception{
        if (nome == null){
            throw new Exception("Objeto relacionado à nome é nulo");
        }
        else if (data_inicio == null){
            throw new Exception("Objeto relacionado à data_inicio é nulo");
        }
        else if (data_fim == null){
            throw new Exception("Objeto relacionado à data_fim é nulo");
        }
        else if (coordenador == null){
            throw new Exception("Objeto relacionado à coordenador é nulo");
        }
        //Após validar os dados, o método de inserir seminario pode ser chamado sem problemas
        pAdicionarSeminario(nome, data_inicio, data_fim, coordenador);
    }
    
    private void pAdicionarSeminario(String nome, Date data_inicio, Date data_fim, Membro coordenador){
        seminarios.add(new Seminario(nome,data_inicio,data_fim,coordenador));
    }
    
    public void adicionarMembro(Membro membro) throws Exception{
        if (membro == null){
            throw new Exception("Objeto referente à membro é nulo");
        }
        membros.add(membro);
    }
    
    public void adicionarVisitante(Visitante visitante) throws Exception{
        if (visitante == null){
            throw new Exception("Objeto referente à visitante é nulo");
        }
        visitantes.add(visitante);
    }
    
    public void adicionarGrupo(Grupo grupo) throws Exception{
        if (grupo == null){
            throw new Exception("Objeto referente à grupo é nulo");
        }
        grupos.add(grupo);
    }
    
    public List<Grupo> getGruposPorBairro(String bairro){
        List<Grupo> grupos = null;
        //CONSULTA SQL
        
        return grupos;
    }
    
    public List<Grupo> getGruposPorCidade(String cidade){
        List<Grupo> grupos = null;
        //consulta SQL
        
        return grupos;
    }
    
    public List<Turma> getTurmasPorDisciplina(String codigoDisciplina){
        List<Turma> turmas = null;
        //consulta SQL
        
        return turmas;
    }
    
    public List<Turma> getTurmasPorPeriodo(int periodo){
        List<Turma> turmas = null;
        //consulta SQL
        
        return turmas;
    }
    
    public List<Turma> getTurmasPorPeriodo(int periodoInicial, int periodoFinal){
        List<Turma> turmas = null;
        //consulta SQL
        
        return turmas;
    }
    
    public Membro getMembro(String cpfMembro){
        Membro membro = null;
        //consulta SQL
        
        return membro;
    }
    
    public List<Turma> getTurmasMembro(String cpfMembro){
        List<Turma> turmas = null;
        Membro membro = getMembro(cpfMembro);
        //consulta SQL
        
        return turmas;
    }
    
    
    
}
