/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.DAO;

import br.edu.anotacoes.Atendimento;
import br.edu.util.Validacao;
import java.text.DateFormat;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;

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

    public List<Atendimento> listarHoje(String campo, Object valor) {
        Validacao validar = new Validacao();
        List<Atendimento> lista = null;
        try {
            sessao = getSessao().openSession();
            lista = sessao.createCriteria(Atendimento.class).
                    add(Restrictions.eq("data", validar.converterIdade(java.text.DateFormat.getDateInstance(DateFormat.MEDIUM).format(new Date())))).
                    add(Restrictions.eq(campo, valor)).
                    addOrder(Order.asc("data")).
                    addOrder(Order.asc("horaConsulta")).
                    list();
        } catch (Exception e) {
            System.out.println("Erro na lista de campo: " + e);
        }
        finally{
            sessao.close();
        }
        return lista;
    }
    
    public List<Atendimento> listarDoisCampos(String campo, Object valor, String campo2, Object valor2) {
        Validacao validar = new Validacao();
        List<Atendimento> lista = null;
        try {
            sessao = getSessao().openSession();
            lista = sessao.createCriteria(Atendimento.class).
                    add(Restrictions.eq(campo, valor)).
                    add(Restrictions.eq(campo2, valor2)).
                    addOrder(Order.asc("data")).
                    addOrder(Order.asc("horaConsulta")).
                    list();
        } catch (Exception e) {
            System.out.println("Erro na lista de campo: " + e);
        }
        finally{
            sessao.close();
        }
        return lista;
    }
} 
