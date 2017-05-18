/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.anotacoes;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

/**
 *
 * @author cra-dti-04
 */
@Entity
public class Atendimento {
    @Id
    @GeneratedValue
    private int id;
    @OneToOne
    private Pessoa pessoa;
    @OneToOne
    private Medico medico;
    private Date data;

    public Atendimento() {
    }

    public Atendimento(int id, Pessoa pessoa, Medico medico, Date data) {
        this.id = id;
        this.pessoa = pessoa;
        this.medico = medico;
        this.data = data;
    }
    
    
}
