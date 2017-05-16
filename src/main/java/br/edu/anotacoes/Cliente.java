/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.anotacoes;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

/**
 *
 * @author Lab1
 */

@Entity
public class Cliente extends Pessoa{

    public Cliente(Endereco endereco, String nome, String rg, String cpf) {
        super(endereco, nome, rg, cpf);
    }

    public Cliente() {
        super(null, null, null, null);
    }
   
    
}
