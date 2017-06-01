/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.telas;

import br.edu.DAO.EnderecoDAO;
import br.edu.DAO.RecepcionistaDAO;
import br.edu.anotacoes.Endereco;
import br.edu.anotacoes.Funcionario;
import br.edu.anotacoes.Recepcionista;
import br.edu.util.ControleTelas;
import br.edu.util.Validacao;
import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class CadastroRecepcionista extends javax.swing.JFrame {

    Recepcionista recepcionista;
    Endereco endereco;
    /**
     * Creates new form CadastroFuncionario
     */
    public CadastroRecepcionista() {
        initComponents();
        ControleTelas.telaCadastroRecepcionista = true;
        this.recepcionista = new Recepcionista();
        this.endereco = new Endereco();
    }
     public CadastroRecepcionista(Recepcionista recepcionista) {
        initComponents();
        ControleTelas.telaCadastroRecepcionista = true;
        jL_cadastrar.setText("Editar");
        this.recepcionista = recepcionista;
        this.endereco = recepcionista.getEndereco();
        jT_logradouro.setText(recepcionista.getEndereco().getLogradouro());   //set do logradouro
        jT_bairro.setText(recepcionista.getEndereco().getBairro());           //set do bairro
        jT_cidade.setText(recepcionista.getEndereco().getCidade());           //set da cidade
        jT_estado.setText(recepcionista.getEndereco().getEstado());           //set do estado
        jT_numero.setText(recepcionista.getEndereco().getNumero());           //set do numero
        jT_complemento.setText(recepcionista.getEndereco().getObservacoa());  //set do complemento
        jT_cep.setText(recepcionista.getEndereco().getCep());                 //set do cep

        jT_nome.setText(recepcionista.getNome());
        jFT_nascimento.setText(testes.converterData(recepcionista.getNascimento()));
        if (recepcionista.isGenero()) {
            jC_Genero.setSelectedIndex(0);
        }else{
            jC_Genero.setSelectedIndex(1);
        }
        jFT_telefone.setText(recepcionista.getTelefone());
        jT_rg.setText(recepcionista.getRg());
        jFT_cpf.setText(testes.retirarMascara(recepcionista.getCpf()));
        jT_email.setText(recepcionista.getUsuario());
        JP_Senha.setText(recepcionista.getSenha());
       
    }
     

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jP_cabecalho = new javax.swing.JPanel();
        jL_recepcionista = new javax.swing.JLabel();
        jP_conteudo = new javax.swing.JPanel();
        jL_nome = new javax.swing.JLabel();
        jT_nome = new javax.swing.JTextField();
        jL_nascimento = new javax.swing.JLabel();
        jFT_nascimento = new javax.swing.JFormattedTextField();
        jL_rg = new javax.swing.JLabel();
        jT_rg = new javax.swing.JTextField();
        jl_logradouro = new javax.swing.JLabel();
        jT_logradouro = new javax.swing.JTextField();
        jL_cidade = new javax.swing.JLabel();
        jT_cidade = new javax.swing.JTextField();
        jL_email = new javax.swing.JLabel();
        jT_email = new javax.swing.JTextField();
        jL_telefone = new javax.swing.JLabel();
        jFT_telefone = new javax.swing.JFormattedTextField();
        jL_cpf = new javax.swing.JLabel();
        jFT_cpf = new javax.swing.JFormattedTextField();
        jL_bairro = new javax.swing.JLabel();
        jT_bairro = new javax.swing.JTextField();
        jL_cep = new javax.swing.JLabel();
        jT_cep = new javax.swing.JTextField();
        jL_senha = new javax.swing.JLabel();
        JP_Senha = new javax.swing.JPasswordField();
        jP_cadastrar = new javax.swing.JPanel();
        jL_cadastrar = new javax.swing.JLabel();
        jP_cancelar = new javax.swing.JPanel();
        jL_cancelar = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jT_complemento = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jT_estado = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jT_numero = new javax.swing.JTextField();
        jC_Genero = new javax.swing.JComboBox<>();
        jL_genero = new javax.swing.JLabel();
        jL_Etinia = new javax.swing.JLabel();
        jC_etinia = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jP_cabecalho.setBackground(new java.awt.Color(0, 102, 102));
        jP_cabecalho.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jL_recepcionista.setBackground(new java.awt.Color(0, 102, 102));
        jL_recepcionista.setFont(new java.awt.Font("Century Gothic", 1, 36)); // NOI18N
        jL_recepcionista.setForeground(new java.awt.Color(255, 255, 255));
        jL_recepcionista.setText("Recepcionista");
        jP_cabecalho.add(jL_recepcionista, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 370, 44));

        getContentPane().add(jP_cabecalho, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 620, 50));

        jP_conteudo.setBackground(new java.awt.Color(0, 153, 153));
        jP_conteudo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jL_nome.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jL_nome.setText("Nome");
        jP_conteudo.add(jL_nome, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 56, 20));

        jT_nome.setBorder(null);
        jT_nome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jT_nomeMouseClicked(evt);
            }
        });
        jT_nome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jT_nomeActionPerformed(evt);
            }
        });
        jP_conteudo.add(jT_nome, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 40, 490, 30));

        jL_nascimento.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jL_nascimento.setText("Data de Nascimento");
        jP_conteudo.add(jL_nascimento, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 190, 20));

        try {
            jFT_nascimento.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFT_nascimento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFT_nascimentoActionPerformed(evt);
            }
        });
        jP_conteudo.add(jFT_nascimento, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 80, 110, 30));

        jL_rg.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jL_rg.setText("RG");
        jP_conteudo.add(jL_rg, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, -1, 20));

        jT_rg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jT_rgActionPerformed(evt);
            }
        });
        jP_conteudo.add(jT_rg, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 120, 250, 30));

        jl_logradouro.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jl_logradouro.setText("Logradouro");
        jP_conteudo.add(jl_logradouro, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, -1, -1));

        jT_logradouro.setBorder(null);
        jT_logradouro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jT_logradouroActionPerformed(evt);
            }
        });
        jP_conteudo.add(jT_logradouro, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 230, 270, 30));

        jL_cidade.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jL_cidade.setText("Cidade");
        jP_conteudo.add(jL_cidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, -1, 20));

        jT_cidade.setBorder(null);
        jT_cidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jT_cidadeActionPerformed(evt);
            }
        });
        jP_conteudo.add(jT_cidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 360, 490, 30));

        jL_email.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jL_email.setText("Email");
        jP_conteudo.add(jL_email, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 450, 60, 30));

        jT_email.setBorder(null);
        jT_email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jT_emailActionPerformed(evt);
            }
        });
        jP_conteudo.add(jT_email, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 450, 240, 30));

        jL_telefone.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jL_telefone.setText("Telefone");
        jP_conteudo.add(jL_telefone, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 90, -1, 20));

        try {
            jFT_telefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)9####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jP_conteudo.add(jFT_telefone, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 80, 160, 30));

        jL_cpf.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jL_cpf.setText("CPF");
        jP_conteudo.add(jL_cpf, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 130, 49, 20));

        try {
            jFT_cpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###-###-###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFT_cpf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFT_cpfActionPerformed(evt);
            }
        });
        jP_conteudo.add(jFT_cpf, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 120, 160, 30));

        jL_bairro.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jL_bairro.setText("Bairro");
        jP_conteudo.add(jL_bairro, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 74, 20));

        jT_bairro.setBorder(null);
        jT_bairro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jT_bairroActionPerformed(evt);
            }
        });
        jP_conteudo.add(jT_bairro, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 270, 280, 30));

        jL_cep.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jL_cep.setText("CEP");
        jP_conteudo.add(jL_cep, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 280, -1, 20));

        jT_cep.setBorder(null);
        jT_cep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jT_cepActionPerformed(evt);
            }
        });
        jP_conteudo.add(jT_cep, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 270, 160, 30));

        jL_senha.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jL_senha.setText("Senha");
        jP_conteudo.add(jL_senha, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 450, -1, 30));

        JP_Senha.setBorder(null);
        JP_Senha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JP_SenhaActionPerformed(evt);
            }
        });
        jP_conteudo.add(JP_Senha, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 450, 190, 30));

        jP_cadastrar.setBackground(new java.awt.Color(36, 47, 65));
        jP_cadastrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jP_cadastrarMouseClicked(evt);
            }
        });

        jL_cadastrar.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jL_cadastrar.setForeground(new java.awt.Color(255, 255, 255));
        jL_cadastrar.setText("Cadastrar ");
        jL_cadastrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jL_cadastrarMouseClicked(evt);
            }
        });
        jP_cadastrar.add(jL_cadastrar);

        jP_conteudo.add(jP_cadastrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 520, -1, 40));

        jP_cancelar.setBackground(new java.awt.Color(36, 47, 65));

        jL_cancelar.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jL_cancelar.setForeground(new java.awt.Color(255, 255, 255));
        jL_cancelar.setText("Cancelar");
        jP_cancelar.add(jL_cancelar);

        jP_conteudo.add(jP_cancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 520, 130, 40));

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel1.setText("Complemento");
        jP_conteudo.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, -1, -1));
        jP_conteudo.add(jT_complemento, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 310, 180, 30));

        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel2.setText("Estado");
        jP_conteudo.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 320, -1, -1));
        jP_conteudo.add(jT_estado, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 310, 170, 30));

        jLabel3.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel3.setText("N�mero");
        jP_conteudo.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 230, -1, -1));
        jP_conteudo.add(jT_numero, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 230, 90, 30));

        jC_Genero.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Masculino", "Feminino" }));
        jP_conteudo.add(jC_Genero, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 160, -1, -1));

        jL_genero.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jL_genero.setText("Genero");
        jP_conteudo.add(jL_genero, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, -1, 20));

        jL_Etinia.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jL_Etinia.setText("Etnia");
        jP_conteudo.add(jL_Etinia, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 160, -1, 20));

        jC_etinia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Branca", "Parda", "Amarela", "Negra" }));
        jC_etinia.setBorder(null);
        jP_conteudo.add(jC_etinia, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 160, 160, 20));

        jLabel4.setText("Dados de acesso");
        jP_conteudo.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 410, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setText("Dados Pessoais");
        jP_conteudo.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setText("Endere�o");
        jP_conteudo.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, -1, -1));

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        jP_conteudo.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 600, 160));

        jPanel2.setBackground(new java.awt.Color(153, 153, 153));
        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        jP_conteudo.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 600, 180));

        jPanel3.setBackground(new java.awt.Color(153, 153, 153));
        jPanel3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        jP_conteudo.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 430, 600, 70));

        getContentPane().add(jP_conteudo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 620, 590));

        pack();
    }// </editor-fold>//GEN-END:initComponents

        
    Validacao testes = new Validacao();
    
    private boolean testeVazio(){
        
        if(jT_nome.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Campo nome esta em branco");
            return false;
        }else if(testes.converterIdade(jFT_nascimento.getText()) == null){
            JOptionPane.showMessageDialog(null, "Campo nascimento esta em branco ou invalida");
            return false;
        }else if(testes.isCPF(jFT_cpf.getText()) == false){
            JOptionPane.showMessageDialog(null, "Campo cpf esta em branco ou invalida");
            return false;
        }else if(jT_rg.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Campo rg esta em branco");
            return false;        
        }
            return true;
    }    
    
    private void salvar (){
       
        Validacao validar = new Validacao();
                this.endereco.setLogradouro(jT_logradouro.getText());
                this.endereco.setBairro(jT_bairro.getText());
                this.endereco.setCidade(jT_cidade.getText());
                this.endereco.setEstado(jT_estado.getText());    
                this.endereco.setNumero(jT_numero.getText());    
                this.endereco.setObservacoa(jT_complemento.getText());
                this.endereco.setCep(jT_cep.getText());
                
                this.recepcionista.setCpf(jFT_cpf.getText());
                this.recepcionista.setEndereco(this.endereco);
                this.recepcionista.setGenero(jC_Genero.getSelectedItem().toString().equals("Masculino"));
                this.recepcionista.setNascimento(validar.converterIdade(jFT_nascimento.getText()));
                this.recepcionista.setNome(jT_nome.getText());
                this.recepcionista.setRg(jT_rg.getText());
                this.recepcionista.setTelefone(jFT_telefone.getText());
                this.recepcionista.setSenha(new String(JP_Senha.getPassword()));
                this.recepcionista.setUsuario(jT_email.getText());
                
    
   
    
        RecepcionistaDAO recepcionistaDao = new RecepcionistaDAO();
        EnderecoDAO enderecoDAO = new EnderecoDAO();
        //ele salva primeiro o endere?o para depois salvar o cliente
        enderecoDAO.salvar(endereco);
        if(recepcionistaDao.salvar(recepcionista) == true){
            JOptionPane.showMessageDialog(null, "Recepcionista Cadastrado com sucesso");
            this.dispose();
        }else{
            JOptionPane.showMessageDialog(null, "Erro Fale com seu administrador");
        }
    }
    public void fechar(){
        if(ControleTelas.telaListarRecepcionista  == true){
            ControleTelas.telaCadastroRecepcionista = false;
            ListarRecepcionista.atualizarTabela();
        }
    }


    private void jT_rgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jT_rgActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jT_rgActionPerformed

    private void jT_logradouroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jT_logradouroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jT_logradouroActionPerformed

    private void jT_cepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jT_cepActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jT_cepActionPerformed

    private void jT_cidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jT_cidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jT_cidadeActionPerformed

    private void jT_bairroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jT_bairroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jT_bairroActionPerformed

    private void jFT_nascimentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFT_nascimentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFT_nascimentoActionPerformed

    private void jT_emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jT_emailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jT_emailActionPerformed

    private void JP_SenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JP_SenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JP_SenhaActionPerformed

    private void jL_cadastrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jL_cadastrarMouseClicked
        // TODO add your handling code here:
         if(testeVazio()){
            salvar();
         }
    }//GEN-LAST:event_jL_cadastrarMouseClicked

    private void jFT_cpfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFT_cpfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFT_cpfActionPerformed

    private void jT_nomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jT_nomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jT_nomeActionPerformed

    private void jT_nomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jT_nomeMouseClicked
        jT_nome.setText("");
    }//GEN-LAST:event_jT_nomeMouseClicked

    private void jP_cadastrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jP_cadastrarMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jP_cadastrarMouseClicked

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
            java.util.logging.Logger.getLogger(CadastroRecepcionista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroRecepcionista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroRecepcionista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroRecepcionista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroRecepcionista().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField JP_Senha;
    private javax.swing.JComboBox<String> jC_Genero;
    private javax.swing.JComboBox<String> jC_etinia;
    private javax.swing.JFormattedTextField jFT_cpf;
    private javax.swing.JFormattedTextField jFT_nascimento;
    private javax.swing.JFormattedTextField jFT_telefone;
    private javax.swing.JLabel jL_Etinia;
    private javax.swing.JLabel jL_bairro;
    private javax.swing.JLabel jL_cadastrar;
    private javax.swing.JLabel jL_cancelar;
    private javax.swing.JLabel jL_cep;
    private javax.swing.JLabel jL_cidade;
    private javax.swing.JLabel jL_cpf;
    private javax.swing.JLabel jL_email;
    private javax.swing.JLabel jL_genero;
    private javax.swing.JLabel jL_nascimento;
    private javax.swing.JLabel jL_nome;
    private javax.swing.JLabel jL_recepcionista;
    private javax.swing.JLabel jL_rg;
    private javax.swing.JLabel jL_senha;
    private javax.swing.JLabel jL_telefone;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jP_cabecalho;
    private javax.swing.JPanel jP_cadastrar;
    private javax.swing.JPanel jP_cancelar;
    private javax.swing.JPanel jP_conteudo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField jT_bairro;
    private javax.swing.JTextField jT_cep;
    private javax.swing.JTextField jT_cidade;
    private javax.swing.JTextField jT_complemento;
    private javax.swing.JTextField jT_email;
    private javax.swing.JTextField jT_estado;
    private javax.swing.JTextField jT_logradouro;
    private javax.swing.JTextField jT_nome;
    private javax.swing.JTextField jT_numero;
    private javax.swing.JTextField jT_rg;
    private javax.swing.JLabel jl_logradouro;
    // End of variables declaration//GEN-END:variables
}
