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
   private String sintomas;
   private String observa�oes;
   private String encaminhamentos;
   private String medicamentos; 

    public int getId() {
        return id;
    }
    
    public String getSintomas() {
        return sintomas;
    }

    public void setSintomas(String sintomas) {
        this.sintomas = sintomas;
    }

    public String getObserva�oes() {
        return observa�oes;
    }

    public void setObserva�oes(String observa�oes) {
        this.observa�oes = observa�oes;
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
    
}
