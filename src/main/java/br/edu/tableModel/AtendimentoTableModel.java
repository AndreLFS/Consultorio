/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.tableModel;

import br.edu.anotacoes.Atendimento;
import java.text.SimpleDateFormat;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author cra-dti-04
 */
public class AtendimentoTableModel extends AbstractTableModel{
    private String[] colunas = {"DATA", "HORA", "CLIENTE", "MEDICO"}; 
    private List<Atendimento> atendimentos;

    public AtendimentoTableModel(List<Atendimento> atendimentos) {
        this.atendimentos = atendimentos;
    }
    
    @Override
    public int getRowCount() {
        return atendimentos.size();
    }
    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    public Object getValueAt(int rowIndex, int columnIndex) {
        Atendimento atendimento = atendimentos.get(rowIndex);
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        switch (columnIndex){
            case 0:
                return formato.format(atendimento.getData());
            case 1:
                return atendimento.getHoraConsulta();
            case 2:
                return atendimento.getCliente().getNome();
            case 3:
                return atendimento.getMedico().getNome();
        }
        return null;
    }
    
    public Atendimento getValueAt(int rowIndex){
        return atendimentos.get(rowIndex);
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
            case 3:
                return colunas[3];
        }
         return null;
    }
    
    
}
