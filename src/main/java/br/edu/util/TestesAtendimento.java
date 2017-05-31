/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.util;

import br.edu.DAO.AtendimentoDAO;
import br.edu.anotacoes.Atendimento;
import br.edu.anotacoes.Cliente;
import br.edu.anotacoes.Medico;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author cra-dti-04
 */
public class TestesAtendimento {
    public static boolean testeAtendimento(Medico medico, Cliente cliente, Date data, int hora){
            AtendimentoDAO atendimentoDAO = new AtendimentoDAO();
            //lista buscando pela data que vai ter que cadastrar
            List<Atendimento> atendimentos = atendimentoDAO.listarCampos("data", data);
            //busca todas as consultas da data
            for (int i = 0; i < atendimentos.size(); i++) {
                //dentro da consulta ele testa se o medico ja tem alguma consulta na hora selecionada
                //ele pega medico pelo id para ter um parametro melhor de comparação
                //e o horario vem do banco de dados e da comnbox, so que da comonbox ele é convertido para inteiro
                if((atendimentos.get(i).getMedico().getId() == medico.getId()) && 
                        (atendimentos.get(i).getHoraConsulta() == hora)){
                    //se ele tuver alguma consulta marcada imprime a mensagem e para a estrutura
                    JOptionPane.showMessageDialog(null, "Medico com consulta marcada nesse horario");
                    //se tiver alguma consulta a variavel controlador a é mudada pra false para não ser executado o cadastro
                    return false;
                }
                //testamos tambem se o cliente não tem nenhuma consulta marcada para a mesma data e hora
                if((atendimentos.get(i).getCliente().getId() == cliente.getId()) && 
                        (atendimentos.get(i).getHoraConsulta() == hora)){
                    //se ele tiver alguma consulta marcada imprime a mensagem e para a estrutura
                    JOptionPane.showMessageDialog(null, "Cliente com consulta marcada nesse horario");
                    //se tiver alguma consulta a variavel controlador a é mudada pra false para não ser executado o cadastro
                    return false;
                }
            }
            return true;
    }
}
