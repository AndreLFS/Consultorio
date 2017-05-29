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

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getObservacoa() {
        return observacoa;
    }

    public void setObservacoa(String observacoa) {
        this.observacoa = observacoa;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }
    
    

    public Endereco() {
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
