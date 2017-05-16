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
public class Cliente {
    @Id
    @GeneratedValue
    private int id;
    @OneToOne
    private Endereco endereco;
    private String nome;

    public int getId() {
        return id;
    }

    public Cliente(Endereco endereco, String nome) {
        this.endereco = endereco;
        this.nome = nome;
    }
    
    
}
