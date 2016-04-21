/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Evt;

/**
 *
 * @author Rafael
 */
public enum DiaSemana {
    DOMINGO(1), SEGUNDA(2), TERCA(3), QUARTA(4), QUINTA(5), SEXTA(6), SABADO(7);
    public int diaSemana; 
    
    DiaSemana(int valor) {
        diaSemana = valor; 
    }
}
