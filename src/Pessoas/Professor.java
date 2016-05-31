/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pessoas;

import Evt.Endereco;
import java.util.Date;

/**
 *
 * @author Rafael
 */
public class Professor extends MembroOld {
    
    public Professor(String cpf, Date data_nascimento, Date data_batismo_apres, int id, String nome, String sobrenome, char estado_civil, String numero_telefone, Endereco endereco) {
        super(cpf, data_nascimento, data_batismo_apres, id, nome, sobrenome, estado_civil, numero_telefone, endereco);
    }

    public Professor(String cpf, Date data_nascimento, boolean lider, boolean professor, int id, String nome, String sobrenome, char estado_civil, String numero_telefone, Endereco endereco) {
        super(cpf, data_nascimento, lider, professor, id, nome, sobrenome, estado_civil, numero_telefone, endereco);
    }
    
    
    
}
