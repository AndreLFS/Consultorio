/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.anotacoes;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.OneToOne;


@Entity

public class Medico extends Funcionario {
    @OneToOne
    private Especialidade especialidade;
    private String crm;

    public Especialidade getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(Especialidade especialidade) {
        this.especialidade = especialidade;
    }

    public String getCrm() {
        return crm;
    }

    public void setCrm(String crm) {
        this.crm = crm;
    }
    
    
    public void manterProntuario(){}

    public Medico() {
    }

    public Medico(Especialidade especialidade, String crm, String usuario, String senha, Endereco endereco, String nome, Date nascimento, boolean genero, String telefone, String rg, String cpf) {
        super(usuario, senha, endereco, nome, nascimento, genero, telefone, rg, cpf);
        this.especialidade = especialidade;
        this.crm = crm;
    }

    
    
    
    



}
