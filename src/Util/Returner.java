/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Util;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Rafael
 * @param <T> Classe para retorno de objetos e listas
 */
public class Returner<T> {
    
    public Returner(){
        
    }
 
    public List<T> getListaEspecifica(List lista){
        List<T> novaLista = new ArrayList<>();
        for (Object obj: lista){
            novaLista.add((T)obj);
        }
        return novaLista;
    }
}
