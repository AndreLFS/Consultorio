/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.DAO;

import br.edu.anotacoes.Endereco;

/**
 *
 * @author Lab1
 */
public class EnderecoDAO extends GenericoDAO<Endereco>{

    public EnderecoDAO() {
        super(Endereco.class);
    }

    @Override
    public boolean salvar(Endereco endereco) {
        if(endereco.getId() == 0){
            return super.salvar(endereco);
        }else{
            return super.editar(endereco);
        }
    }
    
}
