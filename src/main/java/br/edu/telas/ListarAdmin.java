/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.telas;

import br.edu.DAO.AdminDAO;
import br.edu.anotacoes.Admin;
import br.edu.tableModel.AdministradorTableModel;
import br.edu.util.ControleTelas;
import br.edu.util.Util;
import java.awt.Color;
import java.util.HashMap;
import javax.swing.JOptionPane;
import org.jdesktop.swingx.border.DropShadowBorder;

/**
 *
 * @author Gabriel
 */
public class ListarAdmin extends javax.swing.JFrame {

    /**
     * Creates new form ListarAdmin
     */
    public ListarAdmin() {
        initComponents();
        ControleTelas.telaListarAdministrador = true;
        atualizarTabela();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
        public static void atualizarTabela(){
            AdminDAO adminDAO = new AdminDAO();
            AdministradorTableModel administradorTableModel = new AdministradorTableModel(adminDAO.listar());
            jTable1.setModel(administradorTableModel);
        }
    
    private Admin getAdmin(){
        int linha = jTable1.getSelectedRow();
        if (linha >= 0) {
            AdministradorTableModel tbm = (AdministradorTableModel) jTable1.getModel();
            Admin admin= tbm.getValueAt(linha);
            return admin;
        }
        return null;
    }
  
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        JP_conteudo = new javax.swing.JPanel();
        jP_voltar = new javax.swing.JPanel();
        jL_voltar = new javax.swing.JLabel();
        jP_excluir = new javax.swing.JPanel();
        jL_excluir = new javax.swing.JLabel();
        jP_editar = new javax.swing.JPanel();
        jL_editar = new javax.swing.JLabel();
        jP_Relatorio = new javax.swing.JPanel();
        jL_Relatorio = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jTable1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
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

        jL_voltar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jL_voltar.setForeground(new java.awt.Color(255, 255, 255));
        jL_voltar.setText("          Voltar");
        jL_voltar.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jL_voltarMouseMoved(evt);
            }
        });
        jL_voltar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jL_voltarMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jL_voltarMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jP_voltarLayout = new javax.swing.GroupLayout(jP_voltar);
        jP_voltar.setLayout(jP_voltarLayout);
        jP_voltarLayout.setHorizontalGroup(
            jP_voltarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jL_voltar, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
        );
        jP_voltarLayout.setVerticalGroup(
            jP_voltarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jP_voltarLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jL_voltar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        JP_conteudo.add(jP_voltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 30, 120, 40));

        jP_excluir.setBackground(new java.awt.Color(0, 102, 102));
        jP_excluir.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jP_excluirMouseMoved(evt);
            }
        });
        jP_excluir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jP_excluirMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jP_excluirMouseExited(evt);
            }
        });
        jP_excluir.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jL_excluir.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jL_excluir.setForeground(new java.awt.Color(255, 255, 255));
        jL_excluir.setText("         Excluir");
        jL_excluir.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jL_excluirMouseMoved(evt);
            }
        });
        jL_excluir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jL_excluirMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jL_excluirMouseExited(evt);
            }
        });
        jP_excluir.add(jL_excluir, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 4, 110, 36));

        JP_conteudo.add(jP_excluir, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 30, 110, 40));

        jP_editar.setBackground(new java.awt.Color(0, 102, 102));
        jP_editar.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jP_editarMouseMoved(evt);
            }
        });
        jP_editar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jP_editarMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jP_editarMouseExited(evt);
            }
        });
        jP_editar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jL_editar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jL_editar.setForeground(new java.awt.Color(255, 255, 255));
        jL_editar.setText("         Editar");
        jL_editar.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jL_editarMouseMoved(evt);
            }
        });
        jL_editar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jL_editarMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jL_editarMouseExited(evt);
            }
        });
        jP_editar.add(jL_editar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 4, 110, 36));

        JP_conteudo.add(jP_editar, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 30, 110, 40));

        jP_Relatorio.setBackground(new java.awt.Color(0, 102, 102));
        jP_Relatorio.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jP_RelatorioMouseMoved(evt);
            }
        });
        jP_Relatorio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jP_RelatorioMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jP_RelatorioMouseExited(evt);
            }
        });
        jP_Relatorio.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jL_Relatorio.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jL_Relatorio.setForeground(new java.awt.Color(255, 255, 255));
        jL_Relatorio.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jL_Relatorio.setText("Gerar Relatorio");
        jL_Relatorio.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jL_RelatorioMouseMoved(evt);
            }
        });
        jL_Relatorio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jL_RelatorioMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jL_RelatorioMouseExited(evt);
            }
        });
        jP_Relatorio.add(jL_Relatorio, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 120, 40));

        JP_conteudo.add(jP_Relatorio, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, 120, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(JP_conteudo, javax.swing.GroupLayout.DEFAULT_SIZE, 802, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JP_conteudo, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        ControleTelas.telaListarAdministrador = false;
    }//GEN-LAST:event_formWindowClosing

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

    private void jL_excluirMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jL_excluirMouseMoved
       jP_excluir.setBorder(efeitoBorda());
    }//GEN-LAST:event_jL_excluirMouseMoved

    private void jL_excluirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jL_excluirMouseExited
        efeitoBordaCancelar(jP_excluir);
    }//GEN-LAST:event_jL_excluirMouseExited

    private void jP_excluirMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jP_excluirMouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_jP_excluirMouseMoved

    private void jP_excluirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jP_excluirMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jP_excluirMouseClicked

    private void jP_excluirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jP_excluirMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jP_excluirMouseExited

    private void jL_editarMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jL_editarMouseMoved
        jP_editar.setBorder(efeitoBorda());
    }//GEN-LAST:event_jL_editarMouseMoved

    private void jL_editarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jL_editarMouseExited
        efeitoBordaCancelar(jP_editar);
    }//GEN-LAST:event_jL_editarMouseExited

    private void jP_editarMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jP_editarMouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_jP_editarMouseMoved

    private void jP_editarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jP_editarMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jP_editarMouseClicked

    private void jP_editarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jP_editarMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jP_editarMouseExited

    private void jL_excluirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jL_excluirMouseClicked
        {                                           
        Admin admin = getAdmin();
        if(admin !=  null){
            if(JOptionPane.showConfirmDialog(null, "Certeza que deseja deletar o Administrador " + admin.getNome()) == 0){
                try {
                    AdminDAO adminDAO = new AdminDAO();
                    adminDAO.deletar(admin);
                } catch (Exception e) {
                    System.out.println("Erro no delete do Administrador " +e);
                }
                JOptionPane.showMessageDialog(null, "Administrador deletado com sucesso");
            }
        }
        atualizarTabela();
    }   
    }//GEN-LAST:event_jL_excluirMouseClicked

    private void jL_editarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jL_editarMouseClicked
    if(ControleTelas.telaCadastroAdmins ==  false){
        CadastrarAdmins cac = new CadastrarAdmins(getAdmin());
        cac.setVisible(true);
    }
    }//GEN-LAST:event_jL_editarMouseClicked

    private void jL_voltarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jL_voltarMouseClicked
        ControleTelas.telaListarAdministrador = false;
        this.dispose();
    }//GEN-LAST:event_jL_voltarMouseClicked

    private void jL_RelatorioMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jL_RelatorioMouseMoved
      jP_Relatorio.setBorder(efeitoBorda());
    }//GEN-LAST:event_jL_RelatorioMouseMoved

    private void jL_RelatorioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jL_RelatorioMouseClicked
        try {
            HashMap parametros = new HashMap();
            Util.imprimir("Relatorios\\ListarAdmin.jrxml", parametros);
        } catch (Exception e) {
            System.out.println("Erro na gera��o do prontuario " + e);
        }
    }//GEN-LAST:event_jL_RelatorioMouseClicked

    private void jL_RelatorioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jL_RelatorioMouseExited
        efeitoBordaCancelar(jP_Relatorio);
    }//GEN-LAST:event_jL_RelatorioMouseExited

    private void jP_RelatorioMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jP_RelatorioMouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_jP_RelatorioMouseMoved

    private void jP_RelatorioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jP_RelatorioMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jP_RelatorioMouseClicked

    private void jP_RelatorioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jP_RelatorioMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jP_RelatorioMouseExited

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
            java.util.logging.Logger.getLogger(ListarAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ListarAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ListarAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ListarAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ListarAdmin().setVisible(true);
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
    private javax.swing.JLabel jL_Relatorio;
    private javax.swing.JLabel jL_editar;
    private javax.swing.JLabel jL_excluir;
    private javax.swing.JLabel jL_voltar;
    private javax.swing.JPanel jP_Relatorio;
    private javax.swing.JPanel jP_editar;
    private javax.swing.JPanel jP_excluir;
    private javax.swing.JPanel jP_voltar;
    private javax.swing.JScrollPane jScrollPane1;
    private static javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
