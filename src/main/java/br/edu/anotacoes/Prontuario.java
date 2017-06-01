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
 * @author Usuario
 */
@Entity
public class Prontuario {
    
   @Id
   @GeneratedValue
   private int id;
   @OneToOne
   private Atendimento atendimento;
   private String sintomas;
   private String observaçoes;
   private String encaminhamentos;
   private String medicamentos; 

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Atendimento getAtendimento() {
        return atendimento;
    }

    public void setAtendimento(Atendimento atendimento) {
        this.atendimento = atendimento;
    }
    
    public String getSintomas() {
        return sintomas;
    }

    public void setSintomas(String sintomas) {
        this.sintomas = sintomas;
    }

    public String getObservaçoes() {
        return observaçoes;
    }

    public void setObservaçoes(String observaçoes) {
        this.observaçoes = observaçoes;
    }

    public String getEncaminhamentos() {
        return encaminhamentos;
    }

    public void setEncaminhamentos(String encaminhamentos) {
        this.encaminhamentos = encaminhamentos;
    }

    public String getMedicamentos() {
        return medicamentos;
    }

    public void setMedicamentos(String medicamentos) {
        this.medicamentos = medicamentos;
    }

    public Prontuario() {
    }
   
   public Prontuario(Atendimento atentimento, String sintomas, String observaçoes, String encaminhamentos, String medicamentos ){
       
       this.atendimento=atentimento;
       this.encaminhamentos=encaminhamentos;
       this.observaçoes=observaçoes;
       this.sintomas=sintomas;
       this.medicamentos=medicamentos;
       
   }
    
    
}
