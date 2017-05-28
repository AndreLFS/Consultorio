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
 * @author Lab3
 */
@Entity
public class Especialidade {
    @Id
    @GeneratedValue
    private int id;
    private String especialidade;

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public Especialidade() {
    }

    public Especialidade(String especialidade) {
        this.especialidade = especialidade;
    }
    
}
