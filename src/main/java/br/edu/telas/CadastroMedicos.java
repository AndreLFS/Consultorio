/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.telas;

import br.edu.DAO.EnderecoDAO;
import br.edu.DAO.EspecialidadeDAO;
import br.edu.DAO.MedicoDAO;
import br.edu.anotacoes.Endereco;
import br.edu.anotacoes.Especialidade;
import br.edu.anotacoes.Medico;
import br.edu.util.ControleTelas;
import br.edu.util.Validacao;
import java.awt.Color;
import java.util.List;
import javax.swing.JOptionPane;
import org.jdesktop.swingx.border.DropShadowBorder;

/**
 *
 * @author Usuario
 */
public class CadastroMedicos extends javax.swing.JFrame {
      Medico medico;
      Endereco endereco;
      Especialidade especialidade;
      String mensagem;
      
    /**
     * Creates new form CadastroMedicos
     */
    public CadastroMedicos() {
        initComponents();
        ControleTelas.telaCadastroMedicos = true;
        passarEspecialidade();
        mensagem =  "Medico salvo com sucesso";
        this.medico = new Medico();
        this.endereco = new Endereco();
    }
    
    public CadastroMedicos(Medico medico){
        initComponents();
        ControleTelas.telaCadastroMedicos = true;
        mensagem =  "Medico editado com sucesso";
        jL_cadastrar.setText("Editar");
        this.medico = medico;
        this.endereco = medico.getEndereco();
        jT_logradouro.setText(medico.getEndereco().getLogradouro());   //set do logradouro
        jT_bairro.setText(medico.getEndereco().getBairro());           //set do bairro
        jT_cidade.setText(medico.getEndereco().getCidade());           //set da cidade
        jT_estado.setText(medico.getEndereco().getEstado());           //set do estado
        jT_numero.setText(medico.getEndereco().getNumero());           //set do numero
        jT_complemento.setText(medico.getEndereco().getObservacoa());  //set do complemento
        jT_cep.setText(medico.getEndereco().getCep());                 //set do cep
        
        
        jT_nome.setText(medico.getNome());
        jFT_nascimento.setText(validar.converterData(medico.getNascimento()));
        if (medico.isGenero()) {
            jC_Genero.setSelectedIndex(0);
        }else{
            jC_Genero.setSelectedIndex(1);
        }
        jT_CRM.setText(medico.getCrm());
        jFT_telefone.setText(medico.getTelefone());
        jT_rg.setText(medico.getRg());
        jFT_cpf.setText(validar.retirarMascara(medico.getCpf()));
        jT_email.setText(medico.getUsuario());
        JP_Senha.setText(medico.getSenha());
        
        
        passarEspecialidade();
        localizarEspecialidade();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        jP_cabecalho = new javax.swing.JPanel();
        jP_cabecalho1 = new javax.swing.JPanel();
        jL_medico1 = new javax.swing.JLabel();
        jL_medico = new javax.swing.JLabel();
        jP_conteudo = new javax.swing.JPanel();
        jL_nome = new javax.swing.JLabel();
        jT_nome = new javax.swing.JTextField();
        jL_especialidade = new javax.swing.JLabel();
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
        jC_especialidade = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jT_complemento = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jT_estado = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jT_numero = new javax.swing.JTextField();
        jL_genero = new javax.swing.JLabel();
        jC_Genero = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jT_CRM = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setText("Dados Pessoais");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jP_cabecalho.setBackground(new java.awt.Color(0, 102, 102));
        jP_cabecalho.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jP_cabecalho1.setBackground(new java.awt.Color(36, 47, 65));
        jP_cabecalho1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jL_medico1.setFont(new java.awt.Font("Century Gothic", 1, 36)); // NOI18N
        jL_medico1.setForeground(new java.awt.Color(255, 255, 255));
        jP_cabecalho1.add(jL_medico1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, -10, 610, 70));

        jL_medico.setFont(new java.awt.Font("Century Gothic", 1, 36)); // NOI18N
        jL_medico.setForeground(new java.awt.Color(255, 255, 255));
        jL_medico.setText("M�dicos");
        jP_cabecalho1.add(jL_medico, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 610, 50));

        jP_cabecalho.add(jP_cabecalho1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        getContentPane().add(jP_cabecalho, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 620, 50));

        jP_conteudo.setBackground(new java.awt.Color(0, 153, 153));
        jP_conteudo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jL_nome.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jL_nome.setForeground(new java.awt.Color(255, 255, 255));
        jL_nome.setText("Nome");
        jP_conteudo.add(jL_nome, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 56, 20));

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
        jP_conteudo.add(jT_nome, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 530, 30));

        jL_especialidade.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jL_especialidade.setForeground(new java.awt.Color(255, 255, 255));
        jL_especialidade.setText("Especialidade");
        jP_conteudo.add(jL_especialidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 170, 150, 20));

        jL_nascimento.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jL_nascimento.setForeground(new java.awt.Color(255, 255, 255));
        jL_nascimento.setText("Data de Nascimento");
        jP_conteudo.add(jL_nascimento, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, 190, 20));

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
        jP_conteudo.add(jFT_nascimento, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, 140, 30));

        jL_rg.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jL_rg.setForeground(new java.awt.Color(255, 255, 255));
        jL_rg.setText("RG");
        jP_conteudo.add(jL_rg, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, -1, 20));

        jT_rg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jT_rgActionPerformed(evt);
            }
        });
        jP_conteudo.add(jT_rg, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 260, 30));

        jl_logradouro.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jl_logradouro.setForeground(new java.awt.Color(255, 255, 255));
        jl_logradouro.setText("Logradouro");
        jP_conteudo.add(jl_logradouro, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, -1, -1));

        jT_logradouro.setBorder(null);
        jT_logradouro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jT_logradouroActionPerformed(evt);
            }
        });
        jP_conteudo.add(jT_logradouro, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 310, 260, 30));

        jL_cidade.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jL_cidade.setForeground(new java.awt.Color(255, 255, 255));
        jL_cidade.setText("Cidade");
        jP_conteudo.add(jL_cidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 400, -1, 20));

        jT_cidade.setBorder(null);
        jT_cidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jT_cidadeActionPerformed(evt);
            }
        });
        jP_conteudo.add(jT_cidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 420, 260, 30));

        jL_email.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jL_email.setForeground(new java.awt.Color(255, 255, 255));
        jL_email.setText("Email");
        jP_conteudo.add(jL_email, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 500, 60, 20));

        jT_email.setBorder(null);
        jT_email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jT_emailActionPerformed(evt);
            }
        });
        jP_conteudo.add(jT_email, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 530, 260, 30));

        jL_telefone.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jL_telefone.setForeground(new java.awt.Color(255, 255, 255));
        jL_telefone.setText("Telefone");
        jP_conteudo.add(jL_telefone, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 120, -1, 20));

        try {
            jFT_telefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)9####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFT_telefone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFT_telefoneActionPerformed(evt);
            }
        });
        jP_conteudo.add(jFT_telefone, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 140, 200, 30));

        jL_cpf.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jL_cpf.setForeground(new java.awt.Color(255, 255, 255));
        jL_cpf.setText("CPF");
        jP_conteudo.add(jL_cpf, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 70, 49, 20));

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
        jP_conteudo.add(jFT_cpf, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 90, 200, 30));

        jL_bairro.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jL_bairro.setForeground(new java.awt.Color(255, 255, 255));
        jL_bairro.setText("Bairro");
        jP_conteudo.add(jL_bairro, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 280, 74, 20));

        jT_bairro.setBorder(null);
        jT_bairro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jT_bairroActionPerformed(evt);
            }
        });
        jP_conteudo.add(jT_bairro, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 370, 260, 30));

        jL_cep.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jL_cep.setForeground(new java.awt.Color(255, 255, 255));
        jL_cep.setText("CEP");
        jP_conteudo.add(jL_cep, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 340, -1, 20));

        jT_cep.setBorder(null);
        jT_cep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jT_cepActionPerformed(evt);
            }
        });
        jP_conteudo.add(jT_cep, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 370, 100, 30));

        jL_senha.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jL_senha.setForeground(new java.awt.Color(255, 255, 255));
        jL_senha.setText("Senha");
        jP_conteudo.add(jL_senha, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 500, -1, 20));

        JP_Senha.setBorder(null);
        JP_Senha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JP_SenhaActionPerformed(evt);
            }
        });
        jP_conteudo.add(JP_Senha, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 530, 200, 30));

        jP_cadastrar.setBackground(new java.awt.Color(36, 47, 65));
        jP_cadastrar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jL_cadastrar.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jL_cadastrar.setForeground(new java.awt.Color(255, 255, 255));
        jL_cadastrar.setText("Cadastrar ");
        jL_cadastrar.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jL_cadastrarMouseMoved(evt);
            }
        });
        jL_cadastrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jL_cadastrarMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jL_cadastrarMouseExited(evt);
            }
        });
        jP_cadastrar.add(jL_cadastrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 5, -1, -1));

        jP_conteudo.add(jP_cadastrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 600, -1, 40));

        jP_cancelar.setBackground(new java.awt.Color(36, 47, 65));
        jP_cancelar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        });
        jP_cancelar.add(jL_cancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        jP_conteudo.add(jP_cancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 600, 130, 40));

        jC_especialidade.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jC_especialidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jC_especialidadeActionPerformed(evt);
            }
        });
        jP_conteudo.add(jC_especialidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 200, 200, 30));

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Complemento");
        jP_conteudo.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 340, -1, -1));
        jP_conteudo.add(jT_complemento, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 370, 80, 30));

        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Estado");
        jP_conteudo.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 400, -1, -1));
        jP_conteudo.add(jT_estado, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 420, 200, 30));

        jLabel3.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("N�mero");
        jP_conteudo.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 340, -1, -1));
        jP_conteudo.add(jT_numero, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 310, 200, 30));

        jL_genero.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jL_genero.setForeground(new java.awt.Color(255, 255, 255));
        jL_genero.setText("G�nero");
        jP_conteudo.add(jL_genero, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 120, -1, 20));

        jC_Genero.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Masculino", "Feminino" }));
        jP_conteudo.add(jC_Genero, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 150, 100, 30));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Dados de Acesso");
        jP_conteudo.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 470, -1, 20));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Dados Pessoais");
        jP_conteudo.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Endere�o");
        jP_conteudo.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, -1, -1));

        jLabel8.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("C.R.M");
        jP_conteudo.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, -1, -1));

        jT_CRM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jT_CRMActionPerformed(evt);
            }
        });
        jP_conteudo.add(jT_CRM, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, 260, 30));

        jPanel3.setBackground(new java.awt.Color(153, 153, 153));
        jPanel3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        jP_conteudo.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 490, 580, 90));

        jPanel2.setBackground(new java.awt.Color(153, 153, 153));
        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        jP_conteudo.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, 580, 200));

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        jP_conteudo.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 580, 230));

        getContentPane().add(jP_conteudo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 620, 650));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    Validacao validar = new Validacao();
    // <editor-fold defaultstate="collapsed" desc="Fun�oes">  
    // <editor-fold defaultstate="collapsed" desc="Vazio"> 
    private boolean testeVazio(){
        //Iniciando os campos de Testes
        //Verificando se o campo Nome est� vazio
        if (jT_nome.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null,"O campo Nome est� vazio!");
            return false;   
        //Verificando se o Campo Data de Nascimento est� vazio    
        } else if(jFT_nascimento.getText().equals("  /  /    ") || validar.converterIdade(jFT_nascimento.getText()) == null){
            JOptionPane.showMessageDialog(null,"O campo Data de Nascimento est� vazio!");
            return false;       
        //Verificando se o Campo CPF est� vazio    
        } else if(validar.isCPF(jFT_cpf.getText()) == false){
            JOptionPane.showMessageDialog(null, "Campo CPF esta em branco ou invalida");
            return false;
        //Verificando se o campo RG est� vazio    
        } else if(jT_rg.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Campo RG esta em branco");
            return false;
        } else if(jT_CRM.getText().isEmpty()){
          JOptionPane.showMessageDialog(null, "Campo CRM est� em branco");
          return false;
        }
       return true;
    }
     // </editor-fold>
    // <editor-fold defaultstate="collapsed" desc="Salvar"> 
    private void salvar(){
     
       
        EspecialidadeDAO especialidadeDAO = new EspecialidadeDAO();
        this.especialidade = especialidadeDAO.listarCampos("especialidade", jC_especialidade.getSelectedItem().toString()).get(0);
        
        this.endereco.setLogradouro(jT_logradouro.getText());
        this.endereco.setBairro(jT_bairro.getText());
        this.endereco.setCep(jT_cep.getText());
        this.endereco.setCidade(jT_cidade.getText());
        this.endereco.setEstado(jT_estado.getText());
        this.endereco.setNumero(jT_numero.getText());
        this.endereco.setObservacoa(jT_complemento.getText());
        
        this.medico.setCpf(jFT_cpf.getText());
        this.medico.setEndereco(this.endereco);
        this.medico.setGenero(jC_Genero.getSelectedItem().toString().equals("Masculino"));
        this.medico.setNascimento(validar.converterIdade(jFT_nascimento.getText()));
        this.medico.setNome(jT_nome.getText());
        this.medico.setRg(jT_rg.getText());
        this.medico.setTelefone(jFT_telefone.getText());
        this.medico.setUsuario(jT_email.getText());
        this.medico.setSenha(new String(JP_Senha.getPassword()));
        this.medico.setEspecialidade(especialidade);
        this.medico.setCrm(jT_CRM.getText());
       
        MedicoDAO medicoDao = new MedicoDAO();
        EnderecoDAO enderecoDAO = new EnderecoDAO();
        
        enderecoDAO.salvar(endereco);
        if(medicoDao.salvar(medico) == true){
            JOptionPane.showMessageDialog(null, mensagem);
            this.dispose();
        }else{
            JOptionPane.showMessageDialog(null, "Erro Fale com seu administrador");
        }
    }
    public void fechar(){
        if(ControleTelas.telaListarMedicos  == true){
            ControleTelas.telaCadastroMedicos = false;
            ListarClientes.atualizarTabela();
        }
    }
    
    private void passarEspecialidade(){
        EspecialidadeDAO especialidadeDAO = new EspecialidadeDAO();
        List<Especialidade> especialidades = especialidadeDAO.listar();
        jC_especialidade.removeAllItems();
        for (int i = 0; i < especialidades.size(); i++) {
            jC_especialidade.addItem(especialidades.get(i).getEspecialidade());
        }
    }
    private void localizarEspecialidade(){
        EspecialidadeDAO especialidadeDAO = new EspecialidadeDAO();
        List<Especialidade> especialidades = especialidadeDAO.listar();
        for (int i = 0; i < especialidades.size(); i++) {
            if(especialidades.get(i).getId() == this.medico.getEspecialidade().getId()){
                jC_especialidade.setSelectedIndex(i);
            }
        }
    }
     // </editor-fold>
     // </editor-fold>
    
    private void jT_nomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jT_nomeMouseClicked
        jT_nome.setText("");
    }//GEN-LAST:event_jT_nomeMouseClicked

    private void jT_nomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jT_nomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jT_nomeActionPerformed

    private void jFT_nascimentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFT_nascimentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFT_nascimentoActionPerformed

    private void jT_rgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jT_rgActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jT_rgActionPerformed

    private void jT_logradouroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jT_logradouroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jT_logradouroActionPerformed

    private void jT_cidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jT_cidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jT_cidadeActionPerformed

    private void jT_emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jT_emailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jT_emailActionPerformed

    private void jT_bairroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jT_bairroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jT_bairroActionPerformed

    private void jT_cepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jT_cepActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jT_cepActionPerformed

    private void JP_SenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JP_SenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JP_SenhaActionPerformed

    private void jFT_telefoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFT_telefoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFT_telefoneActionPerformed

    private void jFT_cpfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFT_cpfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFT_cpfActionPerformed

    private void jL_cadastrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jL_cadastrarMouseClicked
        // TODO add your handling code here:
          if(testeVazio()){
            salvar();
        }
    }//GEN-LAST:event_jL_cadastrarMouseClicked

    private void jC_especialidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jC_especialidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jC_especialidadeActionPerformed

    private void jL_cancelarMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jL_cancelarMouseMoved
        
    }//GEN-LAST:event_jL_cancelarMouseMoved

    private void jL_cadastrarMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jL_cadastrarMouseMoved
       jP_cadastrar.setBorder(efeitoBorda());
    }//GEN-LAST:event_jL_cadastrarMouseMoved

    private void jL_cadastrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jL_cadastrarMouseExited
        efeitoBordaCancelar(jP_cadastrar);
    }//GEN-LAST:event_jL_cadastrarMouseExited

    private void jT_CRMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jT_CRMActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jT_CRMActionPerformed

    private void jL_cancelarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jL_cancelarMouseClicked
        fechar();
        this.dispose();
    }//GEN-LAST:event_jL_cancelarMouseClicked
    

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
            java.util.logging.Logger.getLogger(CadastroMedicos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroMedicos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroMedicos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroMedicos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroMedicos().setVisible(true);
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
    private javax.swing.JPasswordField JP_Senha;
    private javax.swing.JComboBox<String> jC_Genero;
    private javax.swing.JComboBox<String> jC_especialidade;
    private javax.swing.JFormattedTextField jFT_cpf;
    private javax.swing.JFormattedTextField jFT_nascimento;
    private javax.swing.JFormattedTextField jFT_telefone;
    private javax.swing.JLabel jL_bairro;
    private javax.swing.JLabel jL_cadastrar;
    private javax.swing.JLabel jL_cancelar;
    private javax.swing.JLabel jL_cep;
    private javax.swing.JLabel jL_cidade;
    private javax.swing.JLabel jL_cpf;
    private javax.swing.JLabel jL_email;
    private javax.swing.JLabel jL_especialidade;
    private javax.swing.JLabel jL_genero;
    private javax.swing.JLabel jL_medico;
    private javax.swing.JLabel jL_medico1;
    private javax.swing.JLabel jL_nascimento;
    private javax.swing.JLabel jL_nome;
    private javax.swing.JLabel jL_rg;
    private javax.swing.JLabel jL_senha;
    private javax.swing.JLabel jL_telefone;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jP_cabecalho;
    private javax.swing.JPanel jP_cabecalho1;
    private javax.swing.JPanel jP_cadastrar;
    private javax.swing.JPanel jP_cancelar;
    private javax.swing.JPanel jP_conteudo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField jT_CRM;
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
