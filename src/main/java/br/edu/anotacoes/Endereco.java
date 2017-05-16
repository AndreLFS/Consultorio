/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.anotacoes;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 *
 * @author Lab1
 */
@Entity
public class Endereco {
    @Id
    @GeneratedValue
    private int id;
    private String logradouro;

    public int getId() {
        return id;
    }

    public Endereco(String logradouro) {
        this.logradouro = logradouro;
    }
    
    
}
