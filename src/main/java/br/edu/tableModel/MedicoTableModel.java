/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.tableModel;

import br.edu.anotacoes.Medico;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Gabriel
 */
public class MedicoTableModel extends AbstractTableModel{
    private String[] colunas = {"NOME", "ESPECIALIDADE", "CPF"}; 
    private List<Medico> medicos;

    public MedicoTableModel(List<Medico> medicos) {
        this.medicos = medicos;
    }
    
    @Override
    public int getRowCount() {
        return medicos.size();
    }
    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    public Object getValueAt(int rowIndex, int columnIndex) {
        Medico medico = medicos.get(rowIndex);
        switch (columnIndex){
            case 0:
                return medico.getNome();
            case 1:
                return medico.getEspecialidade().getEspecialidade();
            case 2:
                return medico.getCpf();
        }
        return null;
    }
    
    public Medico getValueAt(int rowIndex){
        return medicos.get(rowIndex);
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
