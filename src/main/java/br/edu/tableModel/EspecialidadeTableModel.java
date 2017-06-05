/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.tableModel;

import br.edu.anotacoes.Especialidade;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Lab1
 */
public class EspecialidadeTableModel extends AbstractTableModel{
    private String[] colunas = {"Especialidade"}; 
    private List<Especialidade> especialidades;

    public EspecialidadeTableModel(List<Especialidade> especialidades) {
        this.especialidades = especialidades;
    }
    
    @Override
    public int getRowCount() {
        return especialidades.size();
    }
    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    public Object getValueAt(int rowIndex, int columnIndex) {
        Especialidade cliente = especialidades.get(rowIndex);
        switch (columnIndex){
            case 0:
                return cliente.getEspecialidade();
        }
        return null;
    }
    
    public Especialidade getValueAt(int rowIndex){
        return especialidades.get(rowIndex);
    }

    @Override
    public String getColumnName(int column) {
         switch (column){
            case 0:
                return colunas[0];
        }
         return null;
    }
    
    
}
