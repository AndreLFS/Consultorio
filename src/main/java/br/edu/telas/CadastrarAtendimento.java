/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.telas;

import br.edu.DAO.AtendimentoDAO;
import br.edu.DAO.ClienteDAO2;
import br.edu.DAO.MedicoDAO;
import br.edu.anotacoes.Atendimento;
import br.edu.anotacoes.Cliente;
import br.edu.anotacoes.Medico;
import br.edu.util.Validacao;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author cra-dti-04
 */
public class CadastrarAtendimento extends javax.swing.JFrame {

    /**
     * Creates new form CadastrarAtendimento
     */
    public CadastrarAtendimento() {
        initComponents();
        passarMedicos();
        passarClientes();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        birthdayEvaluator1 = new com.toedter.calendar.demo.BirthdayEvaluator();
        jPanel1 = new javax.swing.JPanel();
        jC_medicos = new javax.swing.JComboBox<>();
        jC_clientes = new javax.swing.JComboBox<>();
        jL_data = new javax.swing.JLabel();
        jL_medicos1 = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jL_cliente1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jC_idCliente = new javax.swing.JComboBox<>();
        jC_idMedicos = new javax.swing.JComboBox<>();
        jDateChooser2 = new com.toedter.calendar.JDateChooser();
        jPanel2 = new javax.swing.JPanel();
        jL_consultas = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(67, 212, 195));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jC_medicos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel1.add(jC_medicos, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 40, -1, -1));

        jC_clientes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel1.add(jC_clientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 80, -1, -1));

        jL_data.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jL_data.setText("Data");
        jPanel1.add(jL_data, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 90, 20));

        jL_medicos1.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jL_medicos1.setText("Medico");
        jPanel1.add(jL_medicos1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 90, 20));
        jPanel1.add(jDateChooser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 120, 130, -1));

        jL_cliente1.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jL_cliente1.setText("Cliente");
        jPanel1.add(jL_cliente1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 90, 20));

        jButton1.setText("jButton1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 170, -1, -1));

        jC_idCliente.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel1.add(jC_idCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 80, -1, -1));

        jC_idMedicos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel1.add(jC_idMedicos, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 40, -1, -1));
        jPanel1.add(jDateChooser2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 120, 130, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 590, 260));

        jPanel2.setBackground(new java.awt.Color(36, 47, 65));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jL_consultas.setFont(new java.awt.Font("Century Gothic", 1, 36)); // NOI18N
        jL_consultas.setForeground(new java.awt.Color(255, 255, 255));
        jL_consultas.setText("Consultas");
        jPanel2.add(jL_consultas, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 370, 44));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 600, 60));

        pack();
    }// </editor-fold>//GEN-END:initComponents
MedicoDAO medicoDAO = new MedicoDAO();
    ClienteDAO2 clienteDAO2 = new ClienteDAO2();
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        salvar();
    }//GEN-LAST:event_jButton1ActionPerformed
    
    private boolean testarVazio(){
        if (jDateChooser1.getDate() == null) {
            JOptionPane.showMessageDialog(null, "Data Em branco");
            return false;
        }else{
            return true;
        }
    }
    
    private void salvar(){
        if (testarVazio()) {
            AtendimentoDAO atendimentoDAO = new AtendimentoDAO();
            
            /*cria��o do medico, usando o campo de id, para pegar o id, criei uma lista que esta invisivel na aplica��o com os ids
            quando o usuario seleciona o medico a busca pega o numero do campo que ele selecionou e vai buscar na comonbox invisivel
            pegando esse id ele o transforma de String para inteiro e passa pra busca, a busca retorna uma lista, onde pegamos apenas o primeiro resultado*/
            Medico medico = (medicoDAO.listarCampos("id", Integer.parseInt(jC_idMedicos.getItemAt(jC_medicos.getSelectedIndex()))).get(0));
            Cliente cliente = (clienteDAO2.listarCampos("id", Integer.parseInt(jC_idCliente.getItemAt(jC_clientes.getSelectedIndex()))).get(0));
           
            List<Atendimento> atendimentos = atendimentoDAO.listaEntreDatas(jDateChooser1.getDate(), jDateChooser2.getDate());
            JOptionPane.showMessageDialog(null, atendimentos.size());
            for (int i = 0; i < atendimentos.size(); i++) {
              //  if(atendimentos.get(i).getData() ){
             //       JOptionPane.showMessageDialog(null, "Medico Ocupado");
              //      break;
             //   
            }
                    
            Atendimento atendimento = new Atendimento(cliente, medico, jDateChooser1.getDate());
            
            try {
                atendimentoDAO.salvar(atendimento);
            } catch (Exception e) {
                System.out.println("Erro no cadastro de atendimento " + e);
                JOptionPane.showMessageDialog(null, "Erro na consulta");
            }
            JOptionPane.showMessageDialog(null, "Consulta salva com sucesso");
        }
        
    }
    
    private void passarMedicos(){
        List<Medico> medicos= medicoDAO.listar();
        jC_medicos.removeAllItems();
        jC_idMedicos.removeAllItems();
        jC_idMedicos.setVisible(false);
        for (int i = 0; i < medicos.size(); i++) {
            jC_medicos.addItem(medicos.get(i).getNome());
            jC_idMedicos.addItem(String.valueOf(medicos.get(i).getId()));
        }
    }
    private void passarClientes(){
        List<Cliente> clientes= clienteDAO2.listar();
        jC_clientes.removeAllItems();
        jC_idCliente.removeAllItems();
        jC_idCliente.setVisible(false);
        for (int i = 0; i < clientes.size(); i++) {
            jC_clientes.addItem(clientes.get(i).getNome());
            jC_idCliente.addItem(String.valueOf(clientes.get(i).getId()));
        }
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
            java.util.logging.Logger.getLogger(CadastrarAtendimento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastrarAtendimento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastrarAtendimento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastrarAtendimento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastrarAtendimento().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.demo.BirthdayEvaluator birthdayEvaluator1;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jC_clientes;
    private javax.swing.JComboBox<String> jC_idCliente;
    private javax.swing.JComboBox<String> jC_idMedicos;
    private javax.swing.JComboBox<String> jC_medicos;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private com.toedter.calendar.JDateChooser jDateChooser2;
    private javax.swing.JLabel jL_cliente1;
    private javax.swing.JLabel jL_consultas;
    private javax.swing.JLabel jL_data;
    private javax.swing.JLabel jL_medicos1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
