/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.anotacoes;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToOne;

/**
 *
 * @author Lab1
 */
@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class Pessoa implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private int id;
    
    @OneToOne
    private Endereco endereco;
    private String nome;

    public int getId() {
        return id;
    }

    public Pessoa(Endereco endereco, String nome) {
        this.endereco = endereco;
        this.nome = nome;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + this.id;
        hash = 29 * hash + (this.endereco != null ? this.endereco.hashCode() : 0);
        hash = 29 * hash + (this.nome != null ? this.nome.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Pessoa other = (Pessoa) obj;
        if (this.id != other.id) {
            return false;
        }
        if ((this.nome == null) ? (other.nome != null) : !this.nome.equals(other.nome)) {
            return false;
        }
        if (this.endereco != other.endereco && (this.endereco == null || !this.endereco.equals(other.endereco))) {
            return false;
        }
        return true;
    }
    
    
    
}
