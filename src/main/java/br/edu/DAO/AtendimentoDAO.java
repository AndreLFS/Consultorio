/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.DAO;

import br.edu.anotacoes.Atendimento;
import java.util.List;
import org.hibernate.criterion.Order;

/**
 *
 * @author cra-dti-04
 */
public class AtendimentoDAO extends GenericoDAO<Atendimento>{

    public AtendimentoDAO() {
        super(Atendimento.class);
    }
    
    public List<Atendimento> listar() {
        List<Atendimento> lista=null;
        try {
            sessao = getSessao().openSession();
            lista = sessao.createCriteria(Atendimento.class).
                    addOrder(Order.asc("data")).
                    addOrder(Order.asc("horaConsulta")).list();
        } catch (Exception e) {
            System.out.println("Erro na lista: " + e);
        }
        finally{
            sessao.close();
        }
        return lista;
    }

} 
