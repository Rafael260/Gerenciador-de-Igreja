/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Objetos;

import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author Rafael
 */
public class Igreja {
    
    private List<Membro> membros;
    private List<Visitante> visitantes;
    private List<Grupo> grupos;
    private List<Ministerio> ministerios;
    private List<Seminario> seminarios;
    private List<Noticia> noticias;
    private List<Evento> eventos;
    private List<Mensagem> mensagens;
    private Membro usuarioAtual;
    
    public Igreja(){
        this.membros = new ArrayList<>();
        this.visitantes = new ArrayList<>();
        this.grupos = new ArrayList<>();
        this.ministerios = new ArrayList<>();
        this.seminarios = new ArrayList<>();
        this.noticias = new ArrayList<>();
        this.eventos = new ArrayList<>();
        this.mensagens = new ArrayList<>();
    }
    
    public Igreja(String usuario){
        this.membros = new ArrayList<>();
        this.visitantes = new ArrayList<>();
        this.grupos = new ArrayList<>();
        this.ministerios = new ArrayList<>();
        this.seminarios = new ArrayList<>();
        this.noticias = new ArrayList<>();
        this.eventos = new ArrayList<>();
        this.mensagens = new ArrayList<>();
        //Preencher o objeto usuarioAtual buscando pelo parâmetro usuario
    }
    
    public void carregarMembros(){
        membros = Membro.listarTodos();
    }
    
    public void carregarVisitantes(){
        visitantes = Visitante.listarTodos();
    }
    
    public void carregarGrupos(){
        grupos = Grupo.listarTodos();
    }
    
    public void carregarMinisterios(){
       ministerios = Ministerio.listarTodos();
    }
    
    public void carregarSeminarios(){
        seminarios = Seminario.listarTodos();
    }
    
    public void carregarNoticias(){
        noticias = Noticia.listarTodos();
    }
    
    public void carregarEventos(){
        eventos = Evento.listarTodos();
    }
    
    public void carregarMensagens(){
        mensagens = Mensagem.listarTodos();
    }
    
}
