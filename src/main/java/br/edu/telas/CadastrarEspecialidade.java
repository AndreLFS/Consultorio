/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.telas;

import br.edu.DAO.EspecialidadeDAO;
import br.edu.anotacoes.Especialidade;
import java.awt.Color;
import javax.swing.JOptionPane;
import org.jdesktop.swingx.border.DropShadowBorder;

/**
 *
 * @author Lab3
 */
public class CadastrarEspecialidade extends javax.swing.JFrame {

    /**
     * Creates new form CadastrarEspecialidade
     */
    public CadastrarEspecialidade() {
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

        jPanel2 = new javax.swing.JPanel();
        jL_consultas = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jL_hora = new javax.swing.JLabel();
        jT_especialidade = new javax.swing.JTextField();
        jP_conteudo = new javax.swing.JPanel();
        jP_cancelar = new javax.swing.JPanel();
        jL_cancelar = new javax.swing.JLabel();
        jP_cadastrar = new javax.swing.JPanel();
        jL_cadastrar1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(36, 47, 65));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jL_consultas.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jL_consultas.setForeground(new java.awt.Color(255, 255, 255));
        jL_consultas.setText("Especialidades");
        jPanel2.add(jL_consultas, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 190, 44));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 520, 60));

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jL_hora.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jL_hora.setForeground(new java.awt.Color(255, 255, 255));
        jL_hora.setText("Especialidade");
        jPanel1.add(jL_hora, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, 130, 20));

        jT_especialidade.setBorder(null);
        jPanel1.add(jT_especialidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 50, 260, 30));

        jP_conteudo.setBackground(new java.awt.Color(153, 153, 153));
        jP_conteudo.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        jPanel1.add(jP_conteudo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 440, 80));

        jP_cancelar.setBackground(new java.awt.Color(36, 47, 65));
        jP_cancelar.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jP_cancelarMouseMoved(evt);
            }
        });

        jL_cancelar.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jL_cancelar.setForeground(new java.awt.Color(255, 255, 255));
        jL_cancelar.setText("Cancelar");
        jL_cancelar.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jL_cancelarMouseMoved(evt);
            }
        });
        jL_cancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jL_cancelarMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jL_cancelarMouseExited(evt);
            }
        });
        jP_cancelar.add(jL_cancelar);

        jPanel1.add(jP_cancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 130, 40));

        jP_cadastrar.setBackground(new java.awt.Color(36, 47, 65));
        jP_cadastrar.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jP_cadastrarMouseMoved(evt);
            }
        });

        jL_cadastrar1.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jL_cadastrar1.setForeground(new java.awt.Color(255, 255, 255));
        jL_cadastrar1.setText("Cadastrar ");
        jL_cadastrar1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jL_cadastrar1MouseMoved(evt);
            }
        });
        jL_cadastrar1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jL_cadastrar1MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jL_cadastrar1MouseExited(evt);
            }
        });
        jP_cadastrar.add(jL_cadastrar1);

        jPanel1.add(jP_cadastrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 200, 130, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 510, 270));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jL_cancelarMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jL_cancelarMouseMoved
        jP_cancelar.setBorder(efeitoBorda());
    }//GEN-LAST:event_jL_cancelarMouseMoved

    private void jL_cancelarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jL_cancelarMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jL_cancelarMouseClicked

    private void jL_cancelarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jL_cancelarMouseExited
        efeitoBordaCancelar(jP_cancelar);
    }//GEN-LAST:event_jL_cancelarMouseExited

    private void jP_cancelarMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jP_cancelarMouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_jP_cancelarMouseMoved

    private void jL_cadastrar1MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jL_cadastrar1MouseMoved
        jP_cadastrar.setBorder(efeitoBorda());
    }//GEN-LAST:event_jL_cadastrar1MouseMoved

    private void jL_cadastrar1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jL_cadastrar1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jL_cadastrar1MouseClicked

    private void jL_cadastrar1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jL_cadastrar1MouseExited
        efeitoBordaCancelar(jP_cadastrar);
    }//GEN-LAST:event_jL_cadastrar1MouseExited

    private void jP_cadastrarMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jP_cadastrarMouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_jP_cadastrarMouseMoved
    
    private boolean testarVazio(){
        if(jT_especialidade.getText().isEmpty()){
            return false;
        }else{
            return true;
        }
    }
    
    private boolean salvar(){
        Especialidade especialidade = new Especialidade(
                jT_especialidade.getText()
        );
        EspecialidadeDAO especialidadeDAO = new EspecialidadeDAO();
        try {
            especialidadeDAO.salvar(especialidade);
        } catch (Exception e) {
            System.out.println("Erro no cadastro de especialidade: " + e);
            return false;
        }
        JOptionPane.showMessageDialog(null, "Especialidade Cadastrada com sucesso");
        return true;
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
            java.util.logging.Logger.getLogger(CadastrarEspecialidade.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastrarEspecialidade.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastrarEspecialidade.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastrarEspecialidade.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastrarEspecialidade().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jL_cadastrar1;
    private javax.swing.JLabel jL_cancelar;
    private javax.swing.JLabel jL_consultas;
    private javax.swing.JLabel jL_hora;
    private javax.swing.JPanel jP_cadastrar;
    private javax.swing.JPanel jP_cancelar;
    private javax.swing.JPanel jP_conteudo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jT_especialidade;
    // End of variables declaration//GEN-END:variables
}
