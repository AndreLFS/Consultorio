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
 * @author Lab1
 */

@Entity
public class Cliente extends Pessoa{
    private String alergias;
    private double peso;
    private double altura;
    
    public Cliente() {
    }
    public Cliente(String alergias, double peso, double altura, Endereco endereco, String nome, Date nascimento, boolean genero, String telefone, String etinia, String rg, String cpf) {
        super(endereco, nome, nascimento, genero, telefone, etinia, rg, cpf);
        this.alergias = alergias;
        this.peso = peso;
        this.altura = altura;
    }
}
