/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.tableModel;

import br.edu.anotacoes.Cliente;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Lab1
 */
public class ClienteTableModel extends AbstractTableModel{
    private String[] colunas = {"NOME", "CPF", "RG"}; 
    private List<Cliente> clientes;

    public ClienteTableModel(List<Cliente> clientes) {
        this.clientes = clientes;
    }
    
    @Override
    public int getRowCount() {
        return clientes.size();
    }
    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    public Object getValueAt(int rowIndex, int columnIndex) {
        Cliente cliente = clientes.get(rowIndex);
        switch (columnIndex){
            case 0:
                return cliente.getNome();
            case 1:
                return cliente.getCpf();
            case 2:
                return cliente.getRg();
        }
        return null;
    }

    @Override
    public String getColumnName(int column) {
         switch (column){
            case 0:
                return colunas[0];
            case 1:
                return colunas[1];
            case 2:
                return colunas[2];
        }
         return null;
    }
    
    
}
