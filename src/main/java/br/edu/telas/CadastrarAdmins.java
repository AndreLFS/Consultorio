/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.telas;

import br.edu.DAO.AdminDAO;
import br.edu.DAO.EnderecoDAO;
import br.edu.anotacoes.Admin;
import br.edu.anotacoes.Endereco;
import br.edu.util.ControleTelas;
import br.edu.util.Validacao;
import java.awt.Color;
import javax.swing.JOptionPane;
import org.jdesktop.swingx.border.DropShadowBorder;

/**
 *
 * @author Lab1
 */
public class CadastrarAdmins extends javax.swing.JFrame {
    Admin admin;
    Endereco endereco;
    /**
     * Creates new form CadastroAdmin
     */
    public CadastrarAdmins(){
        initComponents();
        this.admin = new Admin(); 
        this.endereco = new Endereco();
        ControleTelas.telaCadastroAdmins = true;
    }
    public CadastrarAdmins(Admin admin){
        initComponents();
        ControleTelas.telaCadastroAdmins = true;
        this.admin = admin;
        this.endereco = admin.getEndereco();
        jL_cadastrar.setText("Editar");
        jT_logradouro.setText(admin.getEndereco().getLogradouro());   //set do logradouro
        jT_bairro.setText(admin.getEndereco().getBairro());           //set do bairro
        jT_cidade.setText(admin.getEndereco().getCidade());           //set da cidade
        jT_estado.setText(admin.getEndereco().getEstado());           //set do estado
        jT_numero.setText(admin.getEndereco().getNumero());           //set do numero
        jT_cep.setText(admin.getEndereco().getCep());                 //set do cep
        
        
        jT_nome.setText(admin.getNome());
        jFT_nascimento.setText(validar.converterData(admin.getNascimento()));
        if (admin.isGenero()) {
            jC_Genero.setSelectedIndex(0);
        }else{
            jC_Genero.setSelectedIndex(1);
        }
        jFT_telefone.setText(admin.getTelefone());
        jT_rg.setText(admin.getRg());
        jFT_cpf.setText(validar.retirarMascara(admin.getCpf()));
        jT_email.setText(admin.getUsuario());
        JP_Senha.setText(admin.getSenha());
    }
    
    Validacao validar = new Validacao();
    
    private boolean testeVazio(){
        //Iniciando os campos de Testes
        //Verificando se o campo Nome está vazio
        if (jT_nome.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null,"O campo Nome está vazio!");
            return false;   
        //Verificando se o Campo Data de Nascimento está vazio    
        } else if(jFT_nascimento.getText().equals("  /  /    ") || validar.converterIdade(jFT_nascimento.getText()) == null){
            JOptionPane.showMessageDialog(null,"O campo Data de Nascimento está vazio!");
            return false;       
        //Verificando se o Campo CPF está vazio    
        } else if(validar.isCPF(jFT_cpf.getText()) == false){
            JOptionPane.showMessageDialog(null, "Campo CPF esta em branco ou invalida");
            return false;
        //Verificando se o campo RG está vazio    
        } else if(jT_rg.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Campo RG esta em branco");
            return false;
        }
       return true;
    }
    
    private void salvar(){
        this.endereco.setLogradouro(jT_logradouro.getText());
        this.endereco.setBairro(jT_bairro.getText());
        this.endereco.setCep(jT_cep.getText());
        this.endereco.setCidade(jT_cidade.getText());
        this.endereco.setEstado(jT_estado.getText());
        this.endereco.setNumero(jT_numero.getText());
          
        this.admin.setCpf(jFT_cpf.getText());
        this.admin.setEndereco(this.endereco);
        this.admin.setGenero(jC_Genero.getSelectedItem().toString().equals("Masculino"));
        this.admin.setNascimento(validar.converterIdade(jFT_nascimento.getText()));
        this.admin.setNome(jT_nome.getText());
        this.admin.setRg(jT_rg.getText());
        this.admin.setTelefone(jFT_telefone.getText());
        this.admin.setUsuario(jT_email.getText());
        this.admin.setSenha(new String(JP_Senha.getPassword()));
        
        //criação das classes dao para o cadastro no banco de dados
        AdminDAO adminDAO = new AdminDAO();
        EnderecoDAO enderecoDAO = new EnderecoDAO();
        //ele salva primeiro o endereço para depois salvar o cliente
        enderecoDAO.salvar(endereco);
        if(adminDAO.salvar(this.admin)== true){
            JOptionPane.showMessageDialog(null, "Administrador Cadastrado com sucesso");
            ControleTelas.telaCadastroAdmins = false;
            if (ControleTelas.telaListarAdministrador) {
                ListarAdmin.atualizarTabela();
            }
            this.dispose();
        }else{
            JOptionPane.showMessageDialog(null, "Erro no Cadastro !");
        }
    }
    
     public void fechar(){
        if(ControleTelas.telaListarAdministrador == true){
            ControleTelas.telaCadastroAdmins = false;
        }
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
        jP_cabecalho = new javax.swing.JPanel();
        jL_medico = new javax.swing.JLabel();
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
        jLabel2 = new javax.swing.JLabel();
        jT_estado = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jT_numero = new javax.swing.JTextField();
        jL_genero = new javax.swing.JLabel();
        jC_Genero = new javax.swing.JComboBox<String>();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                formWindowGainedFocus(evt);
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
            }
        });
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jP_cabecalho.setBackground(new java.awt.Color(36, 47, 65));
        jP_cabecalho.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jL_medico.setFont(new java.awt.Font("Century Gothic", 1, 36)); // NOI18N
        jL_medico.setForeground(new java.awt.Color(255, 255, 255));
        jL_medico.setText("Administrador");
        jP_cabecalho.add(jL_medico, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 370, 44));

        jP_conteudo.setBackground(new java.awt.Color(0, 153, 153));
        jP_conteudo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jL_nome.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jL_nome.setForeground(new java.awt.Color(255, 255, 255));
        jL_nome.setText("Nome");
        jP_conteudo.add(jL_nome, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 56, 20));

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
        jP_conteudo.add(jT_nome, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 560, 30));

        jL_nascimento.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jL_nascimento.setForeground(new java.awt.Color(255, 255, 255));
        jL_nascimento.setText("Data de Nascimento");
        jP_conteudo.add(jL_nascimento, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 190, 20));

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
        jP_conteudo.add(jFT_nascimento, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 190, 30));

        jL_rg.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jL_rg.setForeground(new java.awt.Color(255, 255, 255));
        jL_rg.setText("RG");
        jP_conteudo.add(jL_rg, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, -1, 20));

        jT_rg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jT_rgActionPerformed(evt);
            }
        });
        jP_conteudo.add(jT_rg, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 270, 30));

        jl_logradouro.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jl_logradouro.setForeground(new java.awt.Color(255, 255, 255));
        jl_logradouro.setText("Logradouro");
        jP_conteudo.add(jl_logradouro, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, -1, -1));

        jT_logradouro.setBorder(null);
        jT_logradouro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jT_logradouroActionPerformed(evt);
            }
        });
        jP_conteudo.add(jT_logradouro, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, 340, 30));

        jL_cidade.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jL_cidade.setForeground(new java.awt.Color(255, 255, 255));
        jL_cidade.setText("Cidade");
        jP_conteudo.add(jL_cidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 380, -1, 20));

        jT_cidade.setBorder(null);
        jT_cidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jT_cidadeActionPerformed(evt);
            }
        });
        jP_conteudo.add(jT_cidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 410, 340, 30));

        jL_email.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jL_email.setForeground(new java.awt.Color(255, 255, 255));
        jL_email.setText("Email");
        jP_conteudo.add(jL_email, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 510, 60, 20));

        jT_email.setBorder(null);
        jT_email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jT_emailActionPerformed(evt);
            }
        });
        jP_conteudo.add(jT_email, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 540, 340, 30));

        jL_telefone.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jL_telefone.setForeground(new java.awt.Color(255, 255, 255));
        jL_telefone.setText("Telefone");
        jP_conteudo.add(jL_telefone, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 150, -1, 20));

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
        jP_conteudo.add(jFT_telefone, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 180, 190, 30));

        jL_cpf.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jL_cpf.setForeground(new java.awt.Color(255, 255, 255));
        jL_cpf.setText("CPF");
        jP_conteudo.add(jL_cpf, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 100, 49, 20));

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
        jP_conteudo.add(jFT_cpf, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 120, 270, 30));

        jL_bairro.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jL_bairro.setForeground(new java.awt.Color(255, 255, 255));
        jL_bairro.setText("Bairro");
        jP_conteudo.add(jL_bairro, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, 74, 20));

        jT_bairro.setBorder(null);
        jT_bairro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jT_bairroActionPerformed(evt);
            }
        });
        jP_conteudo.add(jT_bairro, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 350, 340, 30));

        jL_cep.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jL_cep.setForeground(new java.awt.Color(255, 255, 255));
        jL_cep.setText("CEP");
        jP_conteudo.add(jL_cep, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 320, -1, 20));

        jT_cep.setBorder(null);
        jT_cep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jT_cepActionPerformed(evt);
            }
        });
        jP_conteudo.add(jT_cep, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 350, 190, 30));

        jL_senha.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jL_senha.setForeground(new java.awt.Color(255, 255, 255));
        jL_senha.setText("Senha");
        jP_conteudo.add(jL_senha, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 500, -1, 20));

        JP_Senha.setBorder(null);
        JP_Senha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JP_SenhaActionPerformed(evt);
            }
        });
        jP_conteudo.add(JP_Senha, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 540, 190, 30));

        jP_cadastrar.setBackground(new java.awt.Color(36, 47, 65));

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
        jP_cadastrar.add(jL_cadastrar);

        jP_conteudo.add(jP_cadastrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 650, 130, 40));

        jP_cancelar.setBackground(new java.awt.Color(36, 47, 65));
        jP_cancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jP_cancelarMouseClicked(evt);
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

        jP_conteudo.add(jP_cancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 650, 130, 40));

        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Estado");
        jP_conteudo.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 380, -1, -1));
        jP_conteudo.add(jT_estado, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 410, 190, 30));

        jLabel3.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Número");
        jP_conteudo.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 260, -1, -1));
        jP_conteudo.add(jT_numero, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 290, 190, 30));

        jL_genero.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jL_genero.setForeground(new java.awt.Color(255, 255, 255));
        jL_genero.setText("Genero");
        jP_conteudo.add(jL_genero, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 150, -1, 20));

        jC_Genero.setForeground(new java.awt.Color(255, 255, 255));
        jC_Genero.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Masculino", "Feminino" }));
        jP_conteudo.add(jC_Genero, new org.netbeans.lib.awtextra.AbsoluteConstraints(263, 180, 100, 30));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Dados de Acesso");
        jP_conteudo.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 470, -1, 20));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Dados Pessoais");
        jP_conteudo.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Endereço");
        jP_conteudo.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, -1, -1));

        jPanel3.setBackground(new java.awt.Color(153, 153, 153));
        jPanel3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        jP_conteudo.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 490, 600, 110));

        jPanel4.setBackground(new java.awt.Color(153, 153, 153));
        jPanel4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        jP_conteudo.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 600, 220));

        jPanel2.setBackground(new java.awt.Color(153, 153, 153));
        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        jP_conteudo.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 600, 200));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 620, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jP_cabecalho, javax.swing.GroupLayout.PREFERRED_SIZE, 620, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jP_conteudo, javax.swing.GroupLayout.PREFERRED_SIZE, 620, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 775, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jP_cabecalho, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(jP_conteudo, javax.swing.GroupLayout.PREFERRED_SIZE, 712, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 620, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 775, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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

    private void jFT_telefoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFT_telefoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFT_telefoneActionPerformed

    private void jFT_cpfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFT_cpfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFT_cpfActionPerformed

    private void jT_bairroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jT_bairroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jT_bairroActionPerformed

    private void jT_cepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jT_cepActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jT_cepActionPerformed

    private void JP_SenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JP_SenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JP_SenhaActionPerformed

    private void jL_cadastrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jL_cadastrarMouseClicked
        // TODO add your handling code here:
        if(testeVazio()){
            salvar();
        }
    }//GEN-LAST:event_jL_cadastrarMouseClicked

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
       ControleTelas.telaCadastroAdmins = false;
    }//GEN-LAST:event_formWindowClosing

    private void jL_cadastrarMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jL_cadastrarMouseMoved
     jP_cadastrar.setBorder(efeitoBorda());
    }//GEN-LAST:event_jL_cadastrarMouseMoved

    private void jL_cadastrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jL_cadastrarMouseExited
        efeitoBordaCancelar(jP_cadastrar);
    }//GEN-LAST:event_jL_cadastrarMouseExited

    private void jL_cancelarMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jL_cancelarMouseMoved
        jP_cancelar.setBorder(efeitoBorda());
    }//GEN-LAST:event_jL_cancelarMouseMoved

    private void jL_cancelarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jL_cancelarMouseExited
        efeitoBordaCancelar(jP_cancelar);
    }//GEN-LAST:event_jL_cancelarMouseExited

    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowGainedFocus

    private void jP_cancelarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jP_cancelarMouseClicked
        // TODO add your handling code here:
        
        
    }//GEN-LAST:event_jP_cancelarMouseClicked

    private void jL_cancelarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jL_cancelarMouseClicked
        if(JOptionPane.showConfirmDialog(null, "Deseja realmente fechar?")==0){
            ControleTelas.telaCadastroAdmins = false;
            this.dispose();
        }
       
    }//GEN-LAST:event_jL_cancelarMouseClicked
    //codigo para colocar as sombras nos paineis
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
            java.util.logging.Logger.getLogger(CadastrarAdmins.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastrarAdmins.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastrarAdmins.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastrarAdmins.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastrarAdmins().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField JP_Senha;
    private javax.swing.JComboBox<String> jC_Genero;
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
    private javax.swing.JLabel jL_genero;
    private javax.swing.JLabel jL_medico;
    private javax.swing.JLabel jL_nascimento;
    private javax.swing.JLabel jL_nome;
    private javax.swing.JLabel jL_rg;
    private javax.swing.JLabel jL_senha;
    private javax.swing.JLabel jL_telefone;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jP_cabecalho;
    private javax.swing.JPanel jP_cadastrar;
    private javax.swing.JPanel jP_cancelar;
    private javax.swing.JPanel jP_conteudo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTextField jT_bairro;
    private javax.swing.JTextField jT_cep;
    private javax.swing.JTextField jT_cidade;
    private javax.swing.JTextField jT_email;
    private javax.swing.JTextField jT_estado;
    private javax.swing.JTextField jT_logradouro;
    private javax.swing.JTextField jT_nome;
    private javax.swing.JTextField jT_numero;
    private javax.swing.JTextField jT_rg;
    private javax.swing.JLabel jl_logradouro;
    // End of variables declaration//GEN-END:variables
}
