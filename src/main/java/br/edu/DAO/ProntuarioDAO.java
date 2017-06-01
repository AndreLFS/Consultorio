/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.DAO;

import br.edu.anotacoes.Prontuario;

/**
 *
 * @author Usuario
 */
public class ProntuarioDAO extends GenericoDAO<Prontuario>{
    
    public ProntuarioDAO() {
        super(Prontuario.class);
    }
    @Override
    public boolean salvar(Prontuario prontuario) {
        if(prontuario.getId() == 0){
            return super.salvar(prontuario);
        }else{
            return super.editar(prontuario);
        }
    }
}
