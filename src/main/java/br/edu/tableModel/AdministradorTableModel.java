/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.tableModel;

import java.util.List;
import javax.swing.table.AbstractTableModel;
import br.edu.anotacoes.Admin;
/**
 *
 * @author Gabriel Ramos
 */
public class AdministradorTableModel extends AbstractTableModel {
    private String[] colunas = {"NOME", "USUARIO", "CPF"}; 
    private List<Admin> administradores;

    public AdministradorTableModel(List<Admin> administradores) {
        this.administradores = administradores;
    }

    @Override
    public int getRowCount() {
        return administradores.size();
    }
    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    public Object getValueAt(int rowIndex, int columnIndex) {
        Admin administrador = administradores.get(rowIndex);
        switch (columnIndex){
            case 0:
                return administrador.getNome();
            case 1:
                return administrador.getUsuario();
            case 2:
                return administrador.getCpf();
        }
        return null;
    }
    
    public Admin getValueAt(int rowIndex){
        return administradores.get(rowIndex);
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
