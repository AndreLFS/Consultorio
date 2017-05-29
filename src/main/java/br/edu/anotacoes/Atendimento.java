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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author cra-dti-04
 */
@Entity
public class Atendimento{
    @Id
    @GeneratedValue
    private int id;
    @OneToOne
    private Cliente cliente;
    @OneToOne
    private Medico medico;
    @Temporal(TemporalType.DATE)
    private Date data;
    private int horaConsulta;

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public int getHoraConsulta() {
        return horaConsulta;
    }
    
    public Atendimento() {
    }

    public Atendimento(Cliente cliente, Medico medico, Date data, int horaConsulta) {
        this.cliente = cliente;
        this.medico = medico;
        this.data = data;
        this.horaConsulta = horaConsulta;
    }
    
}
