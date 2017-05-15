/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import br.edu.anotacoes.Cliente;
import br.edu.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;


/**
 *
 * @author Lab1
 */
public class ClienteDAO{
    private Session conexao;
    private Transaction update;

    public boolean salvarCliente(Cliente cliente) {
        try {
            conexao = HibernateUtil.getSessionFactory().openSession();
            update = conexao.beginTransaction();
            conexao.save(cliente);
            update.commit();
        } catch (Exception e) {
            System.out.println("Erro no cadastro do cliente : " + e.getMessage());
            return false;
        }
        conexao.close();
        return true;
    }
     
}
