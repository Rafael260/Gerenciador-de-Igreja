/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Util;

import Classes.Mensagem;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Rafael
 */
public class MensagemDao implements Dao<Mensagem>{

    public MensagemDao(){
        
    }
    
    @Override
    public List<Mensagem> listarTodos() {
        List<Object> objetos = HibernateUtil.getTuplasDaTabela("Mensagem");
        List<Mensagem> mensagens = new ArrayList<>();
        for (Object obj: objetos){
            mensagens.add((Mensagem)obj);
        }
        return mensagens;
    }

    @Override
    public void gravar(Mensagem obj) {
        HibernateUtil.persistirObjeto(obj);
    }
    
}
