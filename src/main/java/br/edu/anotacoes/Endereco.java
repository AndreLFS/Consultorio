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
    private String bairro;
    private String estado;
    private String cidade;
    private String numero;
    private String observacoa;
    private String cep;

    
    public int getId() {
        return id;
    }

    public Endereco() {
    }

    public Endereco(String logradouro) {
        this.logradouro = logradouro;
    }

    public Endereco(String logradouro, String bairro, String estado, String cidade, String numero, String observacoa, String cep) {
        this.logradouro = logradouro;
        this.bairro = bairro;
        this.estado = estado;
        this.cidade = cidade;
        this.numero = numero;
        this.observacoa = observacoa;
        this.cep = cep;
    }
    
    
    
    
}
