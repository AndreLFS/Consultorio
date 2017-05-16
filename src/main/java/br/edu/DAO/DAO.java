/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.DAO;

import java.util.List;

/**
 *
 * @author Lab1
 */
public interface DAO<T> {
    
    public boolean salvar(T t);
    public boolean editar(T t);
    public boolean deletar(T t);
    public List<T> listar();
    
}
