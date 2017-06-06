/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.DAO;

import br.edu.anotacoes.Admin;
import br.edu.anotacoes.Atendimento;

/**
 *
 * @author Lab1
 */
public class AdminDAO extends GenericoDAO<Admin>{

    public AdminDAO() {
        super(Admin.class);
    }
    
    @Override
    public boolean salvar(Admin admin) {
        if(admin.getId() == 0){
            return super.salvar(admin);
        }else{
            return super.editar(admin);
        }
    }
}
