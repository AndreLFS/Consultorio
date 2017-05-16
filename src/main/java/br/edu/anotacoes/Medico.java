/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.anotacoes;

import javax.persistence.Entity;


@Entity

public class Medico extends Funcionario {

    private String especialidade;

    public Medico(String especialidade, String usuario, String senha, Endereco endereco, String nome, String rg, String cpf) {
        super(usuario, senha, endereco, nome, rg, cpf);
        this.especialidade = especialidade;
    }
    
    public void manterProntuario(){}
    



}
