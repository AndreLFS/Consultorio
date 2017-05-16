/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.DAO;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author Lab1
 */
public class GenericoDAO<T> implements DAO<T>{
    
    private Session sessao;
    public Class classe;

    public GenericoDAO(Class classe) {
        this.classe = classe;
    }
    
    public SessionFactory getSessao(){
        return new Configuration().configure().buildSessionFactory();
    }
    
    public boolean salvar(T t) {
        sessao = null;
        try {
          sessao = getSessao().openSession();
           sessao.beginTransaction();
           sessao.save(t);
           sessao.getTransaction().commit();
        } catch (Exception e) {
            System.out.println("Erro no cadastro: " + e);
            return false;
        }
        finally{
            sessao.close();
        }
        return true;
    }

    public boolean editar(T t) {
        sessao = null;
        try {
          sessao = getSessao().openSession();
           sessao.beginTransaction();
           sessao.update(t);
           sessao.getTransaction().commit();
        } catch (Exception e) {
            System.out.println("Erro na edicao: " + e);
            return false;
        }
        finally{
            sessao.close();
        }
        return true;
    }

    public boolean deletar(T t) {
        sessao = null;
        try {
          sessao = getSessao().openSession();
           sessao.beginTransaction();
           sessao.delete(t);
           sessao.getTransaction().commit();
        } catch (Exception e) {
            System.out.println("Erro na exclusao: " + e);
            return false;
        }
        finally{
            sessao.close();
        }
        return true;
    }

    public List<T> listar() {
         List<T> lista=null;
        sessao = null;
        
        try {
           
            sessao = getSessao().openSession();
            lista = sessao.createCriteria(classe).list();
        } catch (Exception e) {
            System.out.println("Erro na lista: " + e);
        }
        finally{
            sessao.close();
        }
        return lista;
    }

    public List<T> listarCampos(String campo, Object valor) {
        sessao = null;
        List<T> lista = null;
        try {
            sessao = getSessao().openSession();
            lista = sessao.createCriteria(classe).add(Restrictions.eq(campo, valor)).list();
        } catch (Exception e) {
            System.out.println("Erro na lista de campo: " + e);
        }
        finally{
            sessao.close();
        }
        return lista;
    }
    
}
