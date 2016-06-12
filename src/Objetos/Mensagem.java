package Objetos;
// Generated 03/06/2016 10:35:37 by Hibernate Tools 4.3.1


import Util.HibernateUtil;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Mensagem generated by hbm2java
 */
public class Mensagem  implements java.io.Serializable {
     private String titulo;
     private String baseBiblica;
     private String tema;
     private Set ministracaos = new HashSet(0);

    public Mensagem() {
    }

	
    public Mensagem(String titulo) {
        this.titulo = titulo;
    }
    
    public Mensagem(String titulo, String baseBiblica, String tema){
        this.titulo = titulo;
        this.baseBiblica = baseBiblica;
        this.tema = tema;
    }
    
    public Mensagem(String titulo, String baseBiblica, String tema, Set ministracaos) {
       this.titulo = titulo;
       this.baseBiblica = baseBiblica;
       this.tema = tema;
       this.ministracaos = ministracaos;
    }
   
    public String getTitulo() {
        return this.titulo;
    }
    
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getBaseBiblica() {
        return this.baseBiblica;
    }
    
    public void setBaseBiblica(String baseBiblica) {
        this.baseBiblica = baseBiblica;
    }
    public String getTema() {
        return this.tema;
    }
    
    public void setTema(String tema) {
        this.tema = tema;
    }
    public Set getMinistracaos() {
        return this.ministracaos;
    }
    
    public void setMinistracaos(Set ministracaos) {
        this.ministracaos = ministracaos;
    }
    
    //////////////////////////////////////////////////////
    
    public static Mensagem preencherDadosMensagem(Object[] object, int index){
        Mensagem mensagem = new Mensagem();
        mensagem.setTitulo((String)object[index]);
        if (object[index+1] != null){
            mensagem.setBaseBiblica((String)object[index+1]);
        }
        if (object[index+2] != null){
            mensagem.setTema((String)object[index+2]);
        }
        return mensagem;
    }
    
    public List<Mensagem> preencherDadosMensagem(List<Object[]> objects, int index){
        List<Mensagem> mensagens = new ArrayList();
        for(Object[] obj: objects){
            mensagens.add(preencherDadosMensagem(obj, index));
        }
        return mensagens;
    }
    
    public static void cadastrarOuAtualizarMensagem(Mensagem mensagem){
        HibernateUtil.persistirObjeto(mensagem);
    }
    
    public static void cadastrarOuAtualizarMensagem(String titulo, String baseBiblica, String tema){
        Mensagem mensagem = new Mensagem(titulo,baseBiblica,tema);
        HibernateUtil.persistirObjeto(mensagem);
    }
    
    public static void deletarMensagem(Mensagem mensagem){
        HibernateUtil.deletarObjeto(mensagem);
    }
            
    public static Mensagem selectMensagemPk(String titulo){
        return (Mensagem)HibernateUtil.getTuplasDaTabela("Mensagem", "titulo='"+titulo+"'","",0).get(0);
    }

    public static List<Mensagem> listarTodos(){
        return HibernateUtil.getTuplasDaTabela("Mensagem");
    }


}


