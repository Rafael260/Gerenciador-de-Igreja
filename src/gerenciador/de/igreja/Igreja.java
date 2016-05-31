/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gerenciador.de.igreja;

import Evt.Endereco;
import Evt.GrupoOld;
import Pessoas.MembroOld;
import Pessoas.VisitanteOld;
import escola.SeminarioOld;
import escola.TurmaOld;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Rafael
 */
public class Igreja {
    protected String nome_igreja;
    protected List<SeminarioOld> seminarios;
    protected List<MembroOld> membros;
    protected List<VisitanteOld> visitantes;
    protected List<GrupoOld> grupos;
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

    public List<SeminarioOld> getSeminarios() {
        return seminarios;
    }

    public void setSeminarios(List<SeminarioOld> seminarios) {
        this.seminarios = seminarios;
    }

    public List<MembroOld> getMembros() {
        return membros;
    }

    public void setMembros(List<MembroOld> membros) {
        this.membros = membros;
    }

    public List<VisitanteOld> getVisitantes() {
        return visitantes;
    }

    public void setVisitantes(List<VisitanteOld> visitantes) {
        this.visitantes = visitantes;
    }

    public List<GrupoOld> getGrupos() {
        return grupos;
    }

    public void setGrupos(List<GrupoOld> grupos) {
        this.grupos = grupos;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
    
    /////////////////////// </GETS E SETS> ////////////////////////////////////
    
    public void adicionarSeminario(String nome, Date data_inicio, Date data_fim, MembroOld coordenador) throws Exception{
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
    
    private void pAdicionarSeminario(String nome, Date data_inicio, Date data_fim, MembroOld coordenador){
        seminarios.add(new SeminarioOld(nome,data_inicio,data_fim,coordenador));
    }
    
    public void adicionarMembro(MembroOld membro) throws Exception{
        if (membro == null){
            throw new Exception("Objeto referente à membro é nulo");
        }
        membros.add(membro);
    }
    
    public void adicionarVisitante(VisitanteOld visitante) throws Exception{
        if (visitante == null){
            throw new Exception("Objeto referente à visitante é nulo");
        }
        visitantes.add(visitante);
    }
    
    public void adicionarGrupo(GrupoOld grupo) throws Exception{
        if (grupo == null){
            throw new Exception("Objeto referente à grupo é nulo");
        }
        grupos.add(grupo);
    }
    
    public List<GrupoOld> getGruposPorBairro(String bairro){
        List<GrupoOld> grupos = null;
        //CONSULTA SQL
        
        return grupos;
    }
    
    public List<GrupoOld> getGruposPorCidade(String cidade){
        List<GrupoOld> grupos = null;
        //consulta SQL
        
        return grupos;
    }
    
    public List<TurmaOld> getTurmasPorDisciplina(String codigoDisciplina){
        List<TurmaOld> turmas = null;
        //consulta SQL
        
        return turmas;
    }
    
    public List<TurmaOld> getTurmasPorPeriodo(int periodo){
        List<TurmaOld> turmas = null;
        //consulta SQL
        
        return turmas;
    }
    
    public List<TurmaOld> getTurmasPorPeriodo(int periodoInicial, int periodoFinal){
        List<TurmaOld> turmas = null;
        //consulta SQL
        
        return turmas;
    }
    
    public MembroOld getMembro(String cpfMembro){
        MembroOld membro = null;
        //consulta SQL
        
        return membro;
    }
    
    public List<TurmaOld> getTurmasMembro(String cpfMembro){
        List<TurmaOld> turmas = null;
        MembroOld membro = getMembro(cpfMembro);
        //consulta SQL
        
        return turmas;
    }
    
    
    
}
