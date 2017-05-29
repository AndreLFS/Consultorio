/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.anotacoes;

import java.util.Date;
import javax.persistence.Entity;

/**
 *
 * @author Lab1
 */
@Entity
public class Recepcionista extends Funcionario{

    public Recepcionista() {
    }

    public Recepcionista(String usuario, String senha, Endereco endereco, String nome, Date nascimento, boolean genero, String telefone, String rg, String cpf) {
        super(usuario, senha, endereco, nome, nascimento, genero, telefone, rg, cpf);
    }
    
    
    
    
}
