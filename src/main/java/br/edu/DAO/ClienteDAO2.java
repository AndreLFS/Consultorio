/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.DAO;

import br.edu.anotacoes.Cliente;

/**
 *
 * @author Lab1
 */
public class ClienteDAO2 extends GenericoDAO<Cliente>{

    public ClienteDAO2() {
        super(Cliente.class);
    }

    @Override
    public boolean salvar(Cliente cliente) {
        if(cliente.getId() == 0){
            return super.salvar(cliente);
        }else{
            return super.editar(cliente);
        }
    }
    
    
}
