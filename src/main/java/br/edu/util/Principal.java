/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.util;

import br.edu.DAO.ClienteDAO;
import br.edu.DAO.EnderecoDAO;
import br.edu.anotacoes.Cliente;
import br.edu.anotacoes.Endereco;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author Lab1
 */
public class Principal {
    public static void main(String[] args) {
        //criação do valor da classe endereço, para ser salvo em cliente
        Endereco endereco = new Endereco("sdjkbgfs");
        Cliente cliente = new Cliente(endereco, "jaoa");
        ClienteDAO clienteDAO = new ClienteDAO();
        EnderecoDAO enderecoDAO = new EnderecoDAO();
        
        enderecoDAO.salvar(endereco);
        clienteDAO.salvar(cliente);
        
        //HibernateUtil.getSessionFactory();
    }
}
