/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.telas;

import br.edu.DAO.MedicoDAO;
import br.edu.anotacoes.Medico;
import br.edu.tableModel.MedicoTableModel;
import br.edu.util.ControleTelas;
import javax.swing.JOptionPane;

/**
 *
 * @author Gabriel
 */
public class ListarMedicos extends javax.swing.JFrame {

    /**
     * Creates new form ListarMedicos
     */
    public ListarMedicos() {
        initComponents();
        ControleTelas.telaListarMedicos = true;
        atualizarTabela();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jB_Editar = new javax.swing.JButton();
        jB_Excluir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jB_Editar.setText("Editar");
        jB_Editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_EditarActionPerformed(evt);
            }
        });

        jB_Excluir.setText("Excluir");
        jB_Excluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_ExcluirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addComponent(jB_Excluir)
                .addGap(78, 78, 78)
                .addComponent(jB_Editar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jB_Editar)
                    .addComponent(jB_Excluir))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
 
                           
    
    private void atualizarTabela(){
        MedicoDAO medicoDAO = new MedicoDAO();
        MedicoTableModel medicoTableModel = new MedicoTableModel(medicoDAO.listar());
        jTable1.setModel(medicoTableModel);
    }
    
    private Medico medico(){
        int linha = jTable1.getSelectedRow();
        if (linha >= 0) {
            MedicoTableModel mtm = (MedicoTableModel) jTable1.getModel();
            Medico medico = mtm.getValueAt(linha);
            return medico;
        }
        return null;
    }
    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        if (evt.getClickCount() > 1) {  
            if(ControleTelas.telaAtendimentoGenerico == false){
                ControleTelas.telaAtendimentoGenerico = true;
                ListarAtendimentoMedico listarAtendimentoGenerico = new ListarAtendimentoMedico("medico", medico());
                listarAtendimentoGenerico.setVisible(true);
            }
        }
    }//GEN-LAST:event_jTable1MouseClicked

    private void jB_EditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_EditarActionPerformed
        CadastroMedicos cam = new CadastroMedicos();
        //Falta colocar o Parametro M�dico a cima
        cam.setVisible(true);
    }//GEN-LAST:event_jB_EditarActionPerformed

    private void jB_ExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_ExcluirActionPerformed
       Medico medico = medico();
        if(medico !=  null){
            if(JOptionPane.showConfirmDialog(null, "Certeza que deseja deletar o cliente " + medico.getNome()) == 0){
                try {
                    MedicoDAO medicoDAO = new MedicoDAO();
                    medicoDAO.deletar(medico);
                } catch (Exception e) {
                    System.out.println("Erro ao deletar M�dico " +e);
                }
                JOptionPane.showMessageDialog(null, "M�dico deletado com sucesso");
            }
        }
        atualizarTabela();
    }//GEN-LAST:event_jB_ExcluirActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
       ControleTelas.telaListarMedicos = false;
    }//GEN-LAST:event_formWindowClosing
    
   
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ListarMedicos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ListarMedicos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ListarMedicos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ListarMedicos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ListarMedicos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jB_Editar;
    private javax.swing.JButton jB_Excluir;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
