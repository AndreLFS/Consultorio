/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.anotacoes;

import java.util.Date;

/**
 *
 * @author Lab1
 */
public class Admin extends Funcionario{

    public Admin() {
    }
    
    public Admin(String usuario, String senha, Endereco endereco, String nome, Date nascimento, boolean genero, String telefone, String etinia, String rg, String cpf) {
        super(usuario, senha, endereco, nome, nascimento, genero, telefone, etinia, rg, cpf);
    }
}
