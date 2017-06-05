/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.DAO;

import br.edu.anotacoes.Especialidade;

/**
 *
 * @author Lab3
 */
public class EspecialidadeDAO extends GenericoDAO<Especialidade>{

    public EspecialidadeDAO() {
        super(Especialidade.class);
    }
    
    @Override
    public boolean salvar(Especialidade especialidade) {
        if(especialidade.getId() == 0){
            return super.salvar(especialidade);
        }else{
            return super.editar(especialidade);
        }
    }
}
