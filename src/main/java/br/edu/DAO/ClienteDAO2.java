/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.DAO;

import br.edu.anotacoes.Cliente;
import java.util.List;
import org.hibernate.criterion.Order;

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
    
    @Override
    public List<Cliente> listar() {
        List<Cliente> lista=null;
        try {
            sessao = getSessao().openSession();
            lista = sessao.createCriteria(Cliente.class).
                    addOrder(Order.asc("nome")).list();
        } catch (Exception e) {
            System.out.println("Erro na lista: " + e);
        }
        finally{
            sessao.close();
        }
        return lista;
    }
    
    
}
