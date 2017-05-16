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
   
    
    private String cpf;

    public Cliente(String cpf, Endereco endereco, String nome) {
        super(endereco, nome);
        this.cpf = cpf;
    }
    
    
    
}
