/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.tableModel;

import br.edu.anotacoes.Recepcionista;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Usuario
 */
public class RecepcionistaTableModel extends AbstractTableModel{

    private String[] colunas = {"NOME", "RG", "CPF"}; 
    private List<Recepcionista> recepcionistas;
    
    public RecepcionistaTableModel(List<Recepcionista> recepcionistas) {
        this.recepcionistas = recepcionistas;
    }
    
    @Override
    public int getRowCount() {
        return recepcionistas.size();
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }
    public Object getValueAt(int rowIndex, int columnIndex) {
        Recepcionista recepcionista = recepcionistas.get(rowIndex);
        switch (columnIndex){
            case 0:
                return recepcionista.getNome();
            case 1:
                return recepcionista.getRg();
            case 2:
                return recepcionista.getCpf();
        }
        return null;
    }

    public Recepcionista getValueAt(int rowIndex){
        return recepcionistas.get(rowIndex);
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
 