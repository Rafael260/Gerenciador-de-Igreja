/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Util;

import java.util.List;

/**
 *
 * @author Rafael
 */
public interface Dao<T> {
    public List<T> listarTodos();
    public void gravar(T obj);
    
}
