/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.telas;

import br.edu.DAO.EspecialidadeDAO;
import br.edu.anotacoes.Especialidade;
import br.edu.tableModel.EspecialidadeTableModel;
import br.edu.util.ControleTelas;
import java.awt.Color;
import javax.swing.JOptionPane;
import org.jdesktop.swingx.border.DropShadowBorder;

/**
 *
 * @author Lab1
 */
public class ListarEspecialidades extends javax.swing.JFrame {

    /**
     * Creates new form ListarEspecialidades
     */
    public ListarEspecialidades() {
        initComponents();
        atualizarTabela();
        ControleTelas.telaListarEspecialiades = true;
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
        jP_excluir = new javax.swing.JPanel();
        jL_excluir1 = new javax.swing.JLabel();
        jP_editar = new javax.swing.JPanel();
        jL_editar1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

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

        JP_conteudo.add(jP_voltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 30, 120, 40));

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

        jL_excluir1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jL_excluir1.setForeground(new java.awt.Color(255, 255, 255));
        jL_excluir1.setText("Editar");
        jL_excluir1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jL_excluir1MouseMoved(evt);
            }
        });
        jL_excluir1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jL_excluir1MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jL_excluir1MouseExited(evt);
            }
        });

        javax.swing.GroupLayout jP_excluirLayout = new javax.swing.GroupLayout(jP_excluir);
        jP_excluir.setLayout(jP_excluirLayout);
        jP_excluirLayout.setHorizontalGroup(
            jP_excluirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jP_excluirLayout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addComponent(jL_excluir1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jP_excluirLayout.setVerticalGroup(
            jP_excluirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jP_excluirLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jL_excluir1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        JP_conteudo.add(jP_excluir, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 30, 110, 40));

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

        jL_editar1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jL_editar1.setForeground(new java.awt.Color(255, 255, 255));
        jL_editar1.setText("Excluir");
        jL_editar1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jL_editar1MouseMoved(evt);
            }
        });
        jL_editar1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jL_editar1MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jL_editar1MouseExited(evt);
            }
        });

        javax.swing.GroupLayout jP_editarLayout = new javax.swing.GroupLayout(jP_editar);
        jP_editar.setLayout(jP_editarLayout);
        jP_editarLayout.setHorizontalGroup(
            jP_editarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jP_editarLayout.createSequentialGroup()
                .addContainerGap(27, Short.MAX_VALUE)
                .addComponent(jL_editar1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );
        jP_editarLayout.setVerticalGroup(
            jP_editarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jP_editarLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jL_editar1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        JP_conteudo.add(jP_editar, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 30, -1, 40));

        jButton2.setText("jButton2");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        JP_conteudo.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 80, -1, -1));

        jButton1.setText("jButton1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        JP_conteudo.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 80, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(JP_conteudo, javax.swing.GroupLayout.DEFAULT_SIZE, 880, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(JP_conteudo, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        ControleTelas.telaListarEspecialiades=false;
    }//GEN-LAST:event_formWindowClosing

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if(getEspecialidade() !=  null){
            if(JOptionPane.showConfirmDialog(null, "Certeza que deseja deletar a especilidade ") == 0){
                try {
                    EspecialidadeDAO especialidadeDAO = new EspecialidadeDAO();
                    especialidadeDAO.deletar(getEspecialidade());
                    atualizarTabela();
                } catch (Exception e) {
                    System.out.println("Erro no delete da especialidade " +e);
                }
                JOptionPane.showMessageDialog(null, "Especialidade deletada com sucesso");
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       if(ControleTelas.telaCadastroEspecialidade == false && getEspecialidade()!= null){
            CadastrarEspecialidade cadastrarEspecialidade = new CadastrarEspecialidade(getEspecialidade());
            cadastrarEspecialidade.setVisible(true);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

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

    private void jL_excluir1MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jL_excluir1MouseMoved
        jP_excluir.setBorder(efeitoBorda());
    }//GEN-LAST:event_jL_excluir1MouseMoved

    private void jL_excluir1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jL_excluir1MouseClicked
        {                                         
       if(ControleTelas.telaCadastroEspecialidade == false && getEspecialidade()!= null){
            CadastrarEspecialidade cadastrarEspecialidade = new CadastrarEspecialidade(getEspecialidade());
            cadastrarEspecialidade.setVisible(true);
        }
    }
    }//GEN-LAST:event_jL_excluir1MouseClicked

    private void jL_excluir1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jL_excluir1MouseExited
        efeitoBordaCancelar(jP_excluir);
    }//GEN-LAST:event_jL_excluir1MouseExited

    private void jP_excluirMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jP_excluirMouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_jP_excluirMouseMoved

    private void jP_excluirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jP_excluirMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jP_excluirMouseClicked

    private void jP_excluirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jP_excluirMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jP_excluirMouseExited

    private void jL_editar1MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jL_editar1MouseMoved
        jP_editar.setBorder(efeitoBorda());
    }//GEN-LAST:event_jL_editar1MouseMoved

    private void jL_editar1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jL_editar1MouseClicked
        {                                         
        if(getEspecialidade() !=  null){
            if(JOptionPane.showConfirmDialog(null, "Certeza que deseja deletar a especilidade ") == 0){
                try {
                    EspecialidadeDAO especialidadeDAO = new EspecialidadeDAO();
                    especialidadeDAO.deletar(getEspecialidade());
                    atualizarTabela();
                } catch (Exception e) {
                    System.out.println("Erro no delete da especialidade " +e);
                }
                JOptionPane.showMessageDialog(null, "Especialidade deletada com sucesso");
            }
        }
    }
    }//GEN-LAST:event_jL_editar1MouseClicked

    private void jL_editar1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jL_editar1MouseExited
        efeitoBordaCancelar(jP_editar);
    }//GEN-LAST:event_jL_editar1MouseExited

    private void jP_editarMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jP_editarMouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_jP_editarMouseMoved

    private void jP_editarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jP_editarMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jP_editarMouseClicked

    private void jP_editarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jP_editarMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jP_editarMouseExited

    private void jL_voltarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jL_voltarMouseClicked
        this.dispose();
    }//GEN-LAST:event_jL_voltarMouseClicked
    protected static void atualizarTabela(){
        EspecialidadeDAO especialidadeDAO = new EspecialidadeDAO();
        EspecialidadeTableModel especialidadeTableModel = new EspecialidadeTableModel(especialidadeDAO.listar());
        jTable1.setModel(especialidadeTableModel);
    }
    
     private Especialidade getEspecialidade(){
        int linha = jTable1.getSelectedRow();
        if (linha >= 0) {
            EspecialidadeTableModel tbm = (EspecialidadeTableModel) jTable1.getModel();
            Especialidade especialidade = tbm.getValueAt(linha);
            return especialidade;
        }else{
            JOptionPane.showMessageDialog(null, "Nenhuma especialidade selecionada");
            return null;
        }
    }
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
            java.util.logging.Logger.getLogger(ListarEspecialidades.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ListarEspecialidades.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ListarEspecialidades.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ListarEspecialidades.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ListarEspecialidades().setVisible(true);
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
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jL_editar1;
    private javax.swing.JLabel jL_excluir1;
    private javax.swing.JLabel jL_voltar;
    private javax.swing.JPanel jP_editar;
    private javax.swing.JPanel jP_excluir;
    private javax.swing.JPanel jP_voltar;
    private javax.swing.JScrollPane jScrollPane1;
    private static javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
