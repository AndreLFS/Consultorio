/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.telas;

import br.edu.DAO.AdminDAO;
import br.edu.DAO.MedicoDAO;
import br.edu.DAO.RecepcionistaDAO;
import br.edu.anotacoes.Admin;
import br.edu.anotacoes.Medico;
import br.edu.anotacoes.Recepcionista;
import java.awt.Color;
import java.util.List;
import javax.swing.JOptionPane;
import org.jdesktop.swingx.border.DropShadowBorder;

/**
 *
 * @author Lab1
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Loguin
     */
    public Login() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jP_loguin = new javax.swing.JPanel();
        jL_loguin = new javax.swing.JLabel();
        jP_sair = new javax.swing.JPanel();
        jL_sair = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        jTF_email = new javax.swing.JTextField();
        jPF_senha = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(36, 47, 65));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("SENHA");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 270, -1, -1));

        jLabel4.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Login");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, -1, -1));

        jLabel5.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("EMAIL");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, -1, -1));

        jP_loguin.setBackground(new java.awt.Color(0, 102, 102));
        jP_loguin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jP_loguin.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jP_loguinMouseMoved(evt);
            }
        });
        jP_loguin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jP_loguinMouseExited(evt);
            }
        });
        jP_loguin.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jL_loguin.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jL_loguin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jL_loguin.setText("Login");
        jL_loguin.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jL_loguinMouseMoved(evt);
            }
        });
        jL_loguin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jL_loguinMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jL_loguinMouseExited(evt);
            }
        });
        jP_loguin.add(jL_loguin, new org.netbeans.lib.awtextra.AbsoluteConstraints(-2, -1, 100, 40));

        jPanel2.add(jP_loguin, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 370, 100, 40));

        jP_sair.setBackground(new java.awt.Color(0, 102, 102));
        jP_sair.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jP_sair.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jL_sair.setBackground(new java.awt.Color(0, 102, 102));
        jL_sair.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jL_sair.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jL_sair.setText("Sair");
        jL_sair.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jL_sair.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jL_sairMouseMoved(evt);
            }
        });
        jL_sair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jL_sairMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jL_sairMouseExited(evt);
            }
        });
        jP_sair.add(jL_sair, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 100, 40));

        jPanel2.add(jP_sair, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 370, 100, 40));

        jSeparator5.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, 120, 10));

        jTF_email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTF_emailActionPerformed(evt);
            }
        });
        jPanel2.add(jTF_email, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, 260, 30));

        jPF_senha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPF_senhaActionPerformed(evt);
            }
        });
        jPanel2.add(jPF_senha, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 300, 260, 30));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(426, 0, 420, 500));
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 120, -1, -1));

        jLabel2.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Consultório Médico");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 360, -1, -1));

        jSeparator2.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 410, 240, 20));

        jSeparator6.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 400, 300, 20));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        setSize(new java.awt.Dimension(862, 538));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    Medico medico;
    private boolean logarMedico(){
        MedicoDAO medicoDAO = new MedicoDAO();
        List<Medico> medicos= medicoDAO.listarCampos("usuario", jTF_email.getText());
        for (int i = 0; i < medicos.size(); i++) {
            if (medicos.get(i).getUsuario().equals(jTF_email.getText()) && medicos.get(i).getSenha().equals(new String(jPF_senha.getPassword()))) {
                medico = medicos.get(i);
                return true;
            }
        }
        return false;
    }
    private boolean logarRecepcionista(){
        RecepcionistaDAO recepcionistaDAO = new RecepcionistaDAO();
        List<Recepcionista> recepcionistas= recepcionistaDAO.listarCampos("usuario", jTF_email.getText());
        for (int i = 0; i < recepcionistas.size(); i++) {
            if (recepcionistas.get(i).getUsuario().equals(jTF_email.getText()) && recepcionistas.get(i).getSenha().equals(new String(jPF_senha.getPassword()))) {
                return true;
            }
        }
        return false;
    }
    private boolean logarAdmin(){
        AdminDAO adminDAO = new AdminDAO();
        List<Admin> admins= adminDAO.listarCampos("usuario", jTF_email.getText());
        for (int i = 0; i < admins.size(); i++) {
            if (admins.get(i).getUsuario().equals(jTF_email.getText()) && admins.get(i).getSenha().equals(new String(jPF_senha.getPassword()))) {
                return true;
            }
        }
        return false;
    }
    
    private DropShadowBorder efeitoBorda(){
        DropShadowBorder shadow = new DropShadowBorder();
        shadow.setShadowColor(Color.BLACK);
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
    
    private void jL_loguinMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jL_loguinMouseClicked
        if(logarMedico()){
            //home de medico
            HomeMedico homeMedico = new HomeMedico(medico);
            homeMedico.setVisible(true);
            this.dispose();
        }else if(logarRecepcionista()){
            //home de recepcionista
            System.out.println("Login Recepcionista");
        }else if(logarAdmin()){
            //home de admin
            System.out.println("Loguin de Admin");
        }else{
            JOptionPane.showMessageDialog(null, "Usuario ou senha errados");
        }
    }//GEN-LAST:event_jL_loguinMouseClicked

    private void jL_sairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jL_sairMouseClicked
        //codigo para feixar o aplicativo
        if (JOptionPane.showConfirmDialog(null, "Tem Certeza que deseja feixar o aplicativo?") == 0) {
            System.exit(0);
        }
    }//GEN-LAST:event_jL_sairMouseClicked

    private void jTF_emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTF_emailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTF_emailActionPerformed

    private void jPF_senhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPF_senhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPF_senhaActionPerformed

    private void jP_loguinMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jP_loguinMouseMoved
        jP_loguin.setBorder(efeitoBorda());
    }//GEN-LAST:event_jP_loguinMouseMoved

    private void jL_loguinMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jL_loguinMouseMoved
        jP_loguin.setBorder(efeitoBorda());
    }//GEN-LAST:event_jL_loguinMouseMoved

    private void jL_loguinMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jL_loguinMouseExited
        efeitoBordaCancelar(jP_loguin);
    }//GEN-LAST:event_jL_loguinMouseExited

    private void jP_loguinMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jP_loguinMouseExited
        efeitoBordaCancelar(jP_loguin);
    }//GEN-LAST:event_jP_loguinMouseExited

    private void jL_sairMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jL_sairMouseMoved
        jP_sair.setBorder(efeitoBorda());
    }//GEN-LAST:event_jL_sairMouseMoved

    private void jL_sairMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jL_sairMouseExited
        efeitoBordaCancelar(jP_sair);
    }//GEN-LAST:event_jL_sairMouseExited

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jL_loguin;
    private javax.swing.JLabel jL_sair;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPasswordField jPF_senha;
    private javax.swing.JPanel jP_loguin;
    private javax.swing.JPanel jP_sair;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JTextField jTF_email;
    // End of variables declaration//GEN-END:variables
}
