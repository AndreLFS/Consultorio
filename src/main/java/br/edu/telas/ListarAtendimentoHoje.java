/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.telas;

import br.edu.DAO.AtendimentoDAO;
import br.edu.anotacoes.Atendimento;
import br.edu.tableModel.AtendimentoTableModel;
import br.edu.util.Validacao;
import java.awt.Color;
import java.text.DateFormat;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import org.jdesktop.swingx.border.DropShadowBorder;

/**
 *
 * @author Andre
 */
public class ListarAtendimentoHoje extends javax.swing.JFrame {

    /**
     * Creates new form ListarAtendimentoHoje
     */
    public ListarAtendimentoHoje() {
        initComponents();
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
        JP_conteudo = new javax.swing.JPanel();
        jP_voltar = new javax.swing.JPanel();
        jL_voltar = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "A", "B", "C", "D"
            }
        ));
        jTable1.setGridColor(new java.awt.Color(0, 0, 0));
        jTable1.setSelectionBackground(new java.awt.Color(204, 204, 204));
        jScrollPane1.setViewportView(jTable1);

        JP_conteudo.setBackground(new java.awt.Color(36, 47, 65));
        JP_conteudo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jP_voltar.setBackground(new java.awt.Color(0, 102, 102));
        jP_voltar.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jP_voltarMouseMoved(evt);
            }
        });
        jP_voltar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jP_voltarMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jP_voltarMouseExited(evt);
            }
        });
        jP_voltar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jL_voltar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jL_voltar.setForeground(new java.awt.Color(255, 255, 255));
        jL_voltar.setText("          Voltar");
        jL_voltar.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jL_voltarMouseMoved(evt);
            }
        });
        jL_voltar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jL_voltarMouseExited(evt);
            }
        });
        jP_voltar.add(jL_voltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 4, 120, 36));

        JP_conteudo.add(jP_voltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 30, 120, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(JP_conteudo, javax.swing.GroupLayout.PREFERRED_SIZE, 760, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JP_conteudo, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jL_voltarMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jL_voltarMouseMoved
        jP_voltar.setBorder(efeitoBorda());
    }//GEN-LAST:event_jL_voltarMouseMoved

    private void jL_voltarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jL_voltarMouseExited
        efeitoBordaCancelar(jP_voltar);
    }//GEN-LAST:event_jL_voltarMouseExited

    private void jP_voltarMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jP_voltarMouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_jP_voltarMouseMoved

    private void jP_voltarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jP_voltarMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jP_voltarMouseClicked

    private void jP_voltarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jP_voltarMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jP_voltarMouseExited
   
    
    private void atualizarTabela(){
        Validacao validar = new Validacao();
        AtendimentoDAO atendimentoDAO = new AtendimentoDAO();
        List<Atendimento> lista = atendimentoDAO.listarCampos("data", validar.converterIdade(java.text.DateFormat.getDateInstance(DateFormat.MEDIUM).format(new Date())));
        AtendimentoTableModel atendimentoTableModel = new AtendimentoTableModel(lista);
        jTable1.setModel(atendimentoTableModel);
    }
    
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
            java.util.logging.Logger.getLogger(ListarAtendimentoHoje.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ListarAtendimentoHoje.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ListarAtendimentoHoje.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ListarAtendimentoHoje.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ListarAtendimentoHoje().setVisible(true);
            }
        });
    }
    //codigo para colocar as sombras nos paineis
    private DropShadowBorder efeitoBorda(){
        DropShadowBorder shadow = new DropShadowBorder();
        shadow.setShadowColor(Color.black);
        shadow.setShadowSize(5);
        shadow.setShowLeftShadow(true);
        shadow.setShowRightShadow(true);
        shadow.setShowBottomShadow(true);
        shadow.setShowTopShadow(true);
        return shadow;
    }
    //codigo para cancelar a borda em todas os paineis
    private void efeitoBordaCancelar(javax.swing.JPanel painel){
        DropShadowBorder shadow = new DropShadowBorder();
        shadow.setShowLeftShadow(false);
        shadow.setShowRightShadow(false);
        shadow.setShowBottomShadow(false);
        shadow.setShowTopShadow(false);
        
        painel.setBorder(shadow);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel JP_conteudo;
    private javax.swing.JLabel jL_voltar;
    private javax.swing.JPanel jP_voltar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
