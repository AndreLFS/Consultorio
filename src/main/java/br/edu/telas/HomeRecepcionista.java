/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.telas;

import br.edu.anotacoes.Recepcionista;
import java.awt.Color;
import org.jdesktop.swingx.border.DropShadowBorder;

/**
 *
 * @author Lab1
 */
public class HomeRecepcionista extends javax.swing.JFrame {
       // Recepcionista = recepcionista;
    /**
     * Creates new form HomeRecepcionista
     */
    public HomeRecepcionista() {
        initComponents();
    }
    public HomeRecepcionista(Recepcionista recepcionista) {
        initComponents();
       // this.recepcionista = recepcionista;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jP_container = new javax.swing.JPanel();
        jP_cadastrarConsultas = new javax.swing.JPanel();
        jL_cadastrarConsultas = new javax.swing.JLabel();
        jP_quadroDireito = new javax.swing.JPanel();
        jP_sair = new javax.swing.JPanel();
        jL_sair = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jP_container.setBackground(new java.awt.Color(0, 102, 102));
        jP_container.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jP_cadastrarConsultas.setBackground(new java.awt.Color(36, 47, 65));
        jP_cadastrarConsultas.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jP_cadastrarConsultasMouseMoved(evt);
            }
        });
        jP_cadastrarConsultas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jP_cadastrarConsultasMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jP_cadastrarConsultasMouseExited(evt);
            }
        });
        jP_cadastrarConsultas.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jL_cadastrarConsultas.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jL_cadastrarConsultas.setForeground(new java.awt.Color(255, 255, 255));
        jL_cadastrarConsultas.setText("          Cadastrar Consultas");
        jL_cadastrarConsultas.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jL_cadastrarConsultasMouseMoved(evt);
            }
        });
        jL_cadastrarConsultas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jL_cadastrarConsultasMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jL_cadastrarConsultasMouseExited(evt);
            }
        });
        jP_cadastrarConsultas.add(jL_cadastrarConsultas, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 4, 210, 36));

        jP_container.add(jP_cadastrarConsultas, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 50, 210, 40));

        jP_quadroDireito.setBackground(new java.awt.Color(36, 47, 65));

        jP_sair.setBackground(new java.awt.Color(0, 102, 102));
        jP_sair.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jP_sairMouseMoved(evt);
            }
        });
        jP_sair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jP_sairMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jP_sairMouseExited(evt);
            }
        });
        jP_sair.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jL_sair.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jL_sair.setForeground(new java.awt.Color(255, 255, 255));
        jL_sair.setText("                Logout");
        jL_sair.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jL_sairMouseMoved(evt);
            }
        });
        jL_sair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jL_sairMouseExited(evt);
            }
        });
        jP_sair.add(jL_sair, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 176, 36));

        javax.swing.GroupLayout jP_quadroDireitoLayout = new javax.swing.GroupLayout(jP_quadroDireito);
        jP_quadroDireito.setLayout(jP_quadroDireitoLayout);
        jP_quadroDireitoLayout.setHorizontalGroup(
            jP_quadroDireitoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jP_quadroDireitoLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jP_sair, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );
        jP_quadroDireitoLayout.setVerticalGroup(
            jP_quadroDireitoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jP_quadroDireitoLayout.createSequentialGroup()
                .addContainerGap(183, Short.MAX_VALUE)
                .addComponent(jP_sair, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jP_container.add(jP_quadroDireito, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 0, 220, 230));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jP_container, javax.swing.GroupLayout.PREFERRED_SIZE, 573, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jP_container, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jP_cadastrarConsultasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jP_cadastrarConsultasMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jP_cadastrarConsultasMouseExited

    private void jP_cadastrarConsultasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jP_cadastrarConsultasMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jP_cadastrarConsultasMouseClicked

    private void jP_cadastrarConsultasMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jP_cadastrarConsultasMouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_jP_cadastrarConsultasMouseMoved

    private void jL_cadastrarConsultasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jL_cadastrarConsultasMouseExited
        efeitoBordaCancelar(jP_cadastrarConsultas);
    }//GEN-LAST:event_jL_cadastrarConsultasMouseExited

    private void jL_cadastrarConsultasMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jL_cadastrarConsultasMouseMoved
        jP_cadastrarConsultas.setBorder(efeitoBorda());
    }//GEN-LAST:event_jL_cadastrarConsultasMouseMoved

    private void jL_sairMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jL_sairMouseMoved
        jP_sair.setBorder(efeitoBorda());
    }//GEN-LAST:event_jL_sairMouseMoved

    private void jL_sairMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jL_sairMouseExited
        efeitoBordaCancelar(jP_sair);
    }//GEN-LAST:event_jL_sairMouseExited

    private void jP_sairMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jP_sairMouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_jP_sairMouseMoved

    private void jP_sairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jP_sairMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jP_sairMouseClicked

    private void jP_sairMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jP_sairMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jP_sairMouseExited

    private void jL_cadastrarConsultasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jL_cadastrarConsultasMouseClicked
        // TODO add your handling code here:
        CadastrarAtendimento atendimento = new CadastrarAtendimento();
        atendimento.setVisible(true);
    }//GEN-LAST:event_jL_cadastrarConsultasMouseClicked

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
            java.util.logging.Logger.getLogger(HomeRecepcionista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HomeRecepcionista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HomeRecepcionista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomeRecepcionista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HomeRecepcionista().setVisible(true);
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
    private javax.swing.JLabel jL_cadastrarConsultas;
    private javax.swing.JLabel jL_sair;
    private javax.swing.JPanel jP_cadastrarConsultas;
    private javax.swing.JPanel jP_container;
    private javax.swing.JPanel jP_quadroDireito;
    private javax.swing.JPanel jP_sair;
    // End of variables declaration//GEN-END:variables
}
