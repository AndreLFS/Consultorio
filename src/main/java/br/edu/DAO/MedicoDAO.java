/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.DAO;


import br.edu.anotacoes.Medico;
import java.util.List;
import org.hibernate.criterion.Order;


/**
 *
 * @author Lab1
 */
public class MedicoDAO extends GenericoDAO<Medico>  {

    public MedicoDAO() {
        super(Medico.class);
    }

    @Override
    public boolean salvar(Medico medico) {
        if(medico.getId() == 0){
            return super.salvar(medico);
        }else{
            return super.editar(medico);
        }
    }
    @Override
    public boolean deletar(Medico medico) {
        return super.deletar(medico);
    }
    
    
    @Override
    public List<Medico> listarCampos(String campo, Object valor) {
        return super.listarCampos(campo, valor);
    }
    
    @Override
    public List<Medico> listar() {
        List<Medico> lista=null;
        try {
            sessao = getSessao().openSession();
            lista = sessao.createCriteria(Medico.class).
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
