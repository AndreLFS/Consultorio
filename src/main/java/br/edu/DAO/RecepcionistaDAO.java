/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.DAO;

import br.edu.anotacoes.Recepcionista;
import java.util.List;

/**
 *
 * @author Lab1
 */
public class RecepcionistaDAO extends GenericoDAO<Recepcionista>{
    public RecepcionistaDAO() {
        super(Recepcionista.class);
    }

    @Override
    public boolean salvar(Recepcionista recepcionista) {
        if(recepcionista.getId() == 0){
            return super.salvar(recepcionista);
        }else{
            return super.editar(recepcionista);
        }
    }
    
    
    @Override
    public List<Recepcionista> listarCampos(String campo, Object valor) {
        return super.listarCampos(campo, valor);
    }
}
