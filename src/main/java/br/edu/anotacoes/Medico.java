/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.anotacoes;

import java.util.Date;
import javax.persistence.Entity;


@Entity

public class Medico extends Funcionario {

    private String especialidade;

    public void manterProntuario(){}

    public Medico() {
    }

    public Medico(String especialidade, String usuario, String senha, Endereco endereco, String nome, Date nascimento, boolean genero, String telefone, String etinia, String rg, String cpf) {
        super(usuario, senha, endereco, nome, nascimento, genero, telefone, etinia, rg, cpf);
        this.especialidade = especialidade;
    }
    
    
    



}