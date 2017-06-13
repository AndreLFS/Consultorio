/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.DAO;

import br.edu.anotacoes.Especialidade;
import java.util.List;
import org.hibernate.criterion.Order;

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
    
    @Override
    public List<Especialidade> listar() {
        List<Especialidade> lista=null;
        try {
            sessao = getSessao().openSession();
            lista = sessao.createCriteria(Especialidade.class).
                    addOrder(Order.asc("especialidade")).list();
        } catch (Exception e) {
            System.out.println("Erro na lista: " + e);
        }
        finally{
            sessao.close();
        }
        return lista;
    }
}
