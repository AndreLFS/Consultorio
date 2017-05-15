/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.util;

import br.edu.DAO.ClienteDAO;
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
        Endereco endereco = new Endereco(
                "rua x",    //get do logradouro
                "bairro x",        //get do bairro
                "cidade x",        //get da cidade
                "estado x",        //get do estado
                "53",        //get do numero
                "",   //get do complemento
                "6532541"            //get do cep
        );
        //pegar data para passar para o cliente
        Date  nascimento = null;
        try {
            SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
            nascimento = (java.util.Date)format.parse("11/11/1999");
        } catch (ParseException e) {            
            System.out.println("Erro na conversao da data "+ e);;
        }
        //criação do cliente
        Cliente cliente = new Cliente(
                "pueira",
                Double.parseDouble("1.6"),
                Double.parseDouble("55.6"),
                "pedro",
                nascimento,
                "65862560",
                true,//sexo
                "51252",
                endereco,
                "dbahfdb",
                "negro"//raça
        );
        
        ClienteDAO clienteDao = new ClienteDAO();
        if(clienteDao.salvarCliente(cliente) == true){
            JOptionPane.showMessageDialog(null, "Cliente Cadastrado com sucesso");
        }else{
            JOptionPane.showMessageDialog(null, "Erro Fale com seu administrador");
        }
        
        
        //HibernateUtil.getSessionFactory();
    }
}
