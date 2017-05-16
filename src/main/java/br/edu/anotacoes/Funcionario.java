/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.anotacoes;

import com.oracle.webservices.internal.api.EnvelopeStyle;
import java.io.Serializable;
import javax.persistence.Entity;
/**
 *
 * @author Lab1
 */

@Entity
 public abstract class Funcionario extends Pessoa implements Serializable{
    
    private String usuario ;
    private String senha ;
    
    public String getUsuario() {
        return usuario;
    }

    public String getSenha() {
        return senha;
    }

    public Funcionario(String usuario, String senha, Endereco endereco, String nome, String rg, String cpf) {
        super(endereco, nome, rg, cpf);
        this.usuario = usuario;
        this.senha = senha;
    }

    
    
    public boolean logar(int usuario,String senha){
      
        return  false;
    }
     
}
