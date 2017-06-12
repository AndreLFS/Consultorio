/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.telas;

import br.edu.anotacoes.Cliente;
import br.edu.anotacoes.Endereco;
import br.edu.DAO.ClienteDAO2;
import br.edu.DAO.EnderecoDAO;
import br.edu.util.ControleTelas;
import br.edu.util.Validacao;
import java.awt.Color;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import org.jdesktop.swingx.border.DropShadowBorder;

/**
 *
 * @author Usuario
 */
public class CadastroCliente extends javax.swing.JFrame {
    Cliente cliente;
    Endereco endereco;
    /**
     * Creates new form CadastroCliente
     */
    public CadastroCliente() {
        initComponents();
        ControleTelas.telaCadastroClientes = true;
        this.cliente = new Cliente();
        this.endereco = new Endereco();
    }
    public CadastroCliente(Cliente cliente) {
        initComponents();
        ControleTelas.telaCadastroClientes = true;
        jB_cadastrar.setText("Editar");
        this.cliente = cliente;
        this.endereco = cliente.getEndereco();
        jT_logradouro.setText(cliente.getEndereco().getLogradouro());   //set do logradouro
        jT_bairro.setText(cliente.getEndereco().getBairro());           //set do bairro
        jT_cidade.setText(cliente.getEndereco().getCidade());           //set da cidade
        jT_estado.setText(cliente.getEndereco().getEstado());           //set do estado
        jT_numero.setText(cliente.getEndereco().getNumero());           //set do numero
        jT_complemento.setText(cliente.getEndereco().getObservacoa());  //set do complemento
        jT_cep.setText(cliente.getEndereco().getCep());                 //set do cep
        
        jT_alergias.setText(cliente.getAlergias());
        jFT_peso.setText(String.valueOf(cliente.getPeso()));
        jFT_altura.setText(String.valueOf(cliente.getAltura()));
        jT_nome.setText(cliente.getNome());
        jFT_nascimento.setText(testes.converterData(cliente.getNascimento()));
        if (cliente.isGenero()) {
            jC_Genero.setSelectedIndex(0);
        }else{
            jC_Genero.setSelectedIndex(1);
        }
        jFT_telefone.setText(cliente.getTelefone());
        jT_rg.setText(cliente.getRg());
        jFT_cpf.setText(testes.retirarMascara(cliente.getCpf()));
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
        jL_cliente = new javax.swing.JLabel();
        jP_conteudo = new javax.swing.JPanel();
        jL_nome = new javax.swing.JLabel();
        jT_nome = new javax.swing.JTextField();
        jL_nascimento = new javax.swing.JLabel();
        jL_rg = new javax.swing.JLabel();
        jT_rg = new javax.swing.JTextField();
        jl_logradouro = new javax.swing.JLabel();
        jT_logradouro = new javax.swing.JTextField();
        jL_cidade = new javax.swing.JLabel();
        jT_cidade = new javax.swing.JTextField();
        jL_telefone = new javax.swing.JLabel();
        jFT_telefone = new javax.swing.JFormattedTextField();
        jL_cpf = new javax.swing.JLabel();
        jFT_cpf = new javax.swing.JFormattedTextField();
        jL_bairro = new javax.swing.JLabel();
        jT_bairro = new javax.swing.JTextField();
        jT_cep = new javax.swing.JTextField();
        jP_cadastrar = new javax.swing.JPanel();
        jB_cadastrar = new javax.swing.JButton();
        jP_cancelar = new javax.swing.JPanel();
        jB_cancelar = new javax.swing.JButton();
        jL_alerguias = new javax.swing.JLabel();
        jT_alergias = new javax.swing.JTextField();
        jL_peso = new javax.swing.JLabel();
        jL_altura = new javax.swing.JLabel();
        jFT_nascimento = new javax.swing.JFormattedTextField();
        jL_numero = new javax.swing.JLabel();
        jT_numero = new javax.swing.JTextField();
        jl_complemento = new javax.swing.JLabel();
        jT_complemento = new javax.swing.JTextField();
        jL_cep1 = new javax.swing.JLabel();
        jL_genero = new javax.swing.JLabel();
        jC_Genero = new javax.swing.JComboBox<>();
        jFT_peso = new javax.swing.JTextField();
        jFT_altura = new javax.swing.JTextField();
        jL_estado = new javax.swing.JLabel();
        jT_estado = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jP_cabecalho.setBackground(new java.awt.Color(36, 47, 65));
        jP_cabecalho.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jL_cliente.setFont(new java.awt.Font("Century Gothic", 1, 36)); // NOI18N
        jL_cliente.setForeground(new java.awt.Color(255, 255, 255));
        jL_cliente.setText("Paciente");
        jP_cabecalho.add(jL_cliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 180, 44));

        getContentPane().add(jP_cabecalho, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 620, 60));

        jP_conteudo.setBackground(new java.awt.Color(0, 153, 153));
        jP_conteudo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jL_nome.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jL_nome.setForeground(new java.awt.Color(255, 255, 255));
        jL_nome.setText("Nome");
        jP_conteudo.add(jL_nome, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, 56, 20));

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
        jP_conteudo.add(jT_nome, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, 510, 30));

        jL_nascimento.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jL_nascimento.setForeground(new java.awt.Color(255, 255, 255));
        jL_nascimento.setText("Data de Nascimento");
        jP_conteudo.add(jL_nascimento, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, 190, 20));

        jL_rg.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jL_rg.setForeground(new java.awt.Color(255, 255, 255));
        jL_rg.setText("RG");
        jP_conteudo.add(jL_rg, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, -1, 20));

        jT_rg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jT_rgActionPerformed(evt);
            }
        });
        jP_conteudo.add(jT_rg, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, 250, 30));

        jl_logradouro.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jl_logradouro.setForeground(new java.awt.Color(255, 255, 255));
        jl_logradouro.setText("Logradouro");
        jP_conteudo.add(jl_logradouro, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 250, -1, -1));

        jT_logradouro.setBorder(null);
        jT_logradouro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jT_logradouroActionPerformed(evt);
            }
        });
        jP_conteudo.add(jT_logradouro, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 280, 510, 30));

        jL_cidade.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jL_cidade.setForeground(new java.awt.Color(255, 255, 255));
        jL_cidade.setText("Cidade");
        jP_conteudo.add(jL_cidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 420, 80, 20));

        jT_cidade.setBorder(null);
        jT_cidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jT_cidadeActionPerformed(evt);
            }
        });
        jP_conteudo.add(jT_cidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 440, 240, 30));

        jL_telefone.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jL_telefone.setForeground(new java.awt.Color(255, 255, 255));
        jL_telefone.setText("Telefone");
        jP_conteudo.add(jL_telefone, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 150, -1, 20));

        jFT_telefone.setBorder(null);
        try {
            jFT_telefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)9####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jP_conteudo.add(jFT_telefone, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 180, 150, 30));

        jL_cpf.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jL_cpf.setForeground(new java.awt.Color(255, 255, 255));
        jL_cpf.setText("CPF");
        jP_conteudo.add(jL_cpf, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 90, 49, 20));

        jFT_cpf.setBorder(null);
        try {
            jFT_cpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###-###-###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jP_conteudo.add(jFT_cpf, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 120, 190, 30));

        jL_bairro.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jL_bairro.setForeground(new java.awt.Color(255, 255, 255));
        jL_bairro.setText("Bairro");
        jP_conteudo.add(jL_bairro, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 370, 60, 20));

        jT_bairro.setBorder(null);
        jT_bairro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jT_bairroActionPerformed(evt);
            }
        });
        jP_conteudo.add(jT_bairro, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 390, 240, 30));

        jT_cep.setBorder(null);
        jT_cep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jT_cepActionPerformed(evt);
            }
        });
        jP_conteudo.add(jT_cep, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 390, 200, 30));

        jP_cadastrar.setBackground(new java.awt.Color(36, 47, 65));

        jB_cadastrar.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jB_cadastrar.setForeground(new java.awt.Color(255, 255, 255));
        jB_cadastrar.setText("Cadastrar");
        jB_cadastrar.setBorder(null);
        jB_cadastrar.setBorderPainted(false);
        jB_cadastrar.setContentAreaFilled(false);
        jB_cadastrar.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jB_cadastrarMouseMoved(evt);
            }
        });
        jB_cadastrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jB_cadastrarMouseExited(evt);
            }
        });
        jB_cadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_cadastrarActionPerformed(evt);
            }
        });
        jP_cadastrar.add(jB_cadastrar);

        jP_conteudo.add(jP_cadastrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 610, 110, 40));

        jP_cancelar.setBackground(new java.awt.Color(36, 47, 65));

        jB_cancelar.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jB_cancelar.setForeground(new java.awt.Color(255, 255, 255));
        jB_cancelar.setText("Cancelar");
        jB_cancelar.setBorder(null);
        jB_cancelar.setBorderPainted(false);
        jB_cancelar.setContentAreaFilled(false);
        jB_cancelar.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jB_cancelarMouseMoved(evt);
            }
        });
        jB_cancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jB_cancelarMouseExited(evt);
            }
        });
        jB_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_cancelarActionPerformed(evt);
            }
        });
        jP_cancelar.add(jB_cancelar);

        jP_conteudo.add(jP_cancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 610, 110, 40));

        jL_alerguias.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jL_alerguias.setForeground(new java.awt.Color(255, 255, 255));
        jL_alerguias.setText("Alergias");
        jP_conteudo.add(jL_alerguias, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 510, 80, 30));

        jT_alergias.setBorder(null);
        jT_alergias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jT_alergiasActionPerformed(evt);
            }
        });
        jP_conteudo.add(jT_alergias, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 540, 200, 30));

        jL_peso.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jL_peso.setForeground(new java.awt.Color(255, 255, 255));
        jL_peso.setText("Peso");
        jP_conteudo.add(jL_peso, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 520, -1, 20));

        jL_altura.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jL_altura.setForeground(new java.awt.Color(255, 255, 255));
        jL_altura.setText("Altura");
        jP_conteudo.add(jL_altura, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 520, -1, 20));

        jFT_nascimento.setBorder(null);
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
        jP_conteudo.add(jFT_nascimento, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, 190, 30));

        jL_numero.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jL_numero.setForeground(new java.awt.Color(255, 255, 255));
        jL_numero.setText("N�mero");
        jP_conteudo.add(jL_numero, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 310, 74, 20));

        jT_numero.setBorder(null);
        jT_numero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jT_numeroActionPerformed(evt);
            }
        });
        jP_conteudo.add(jT_numero, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 340, 200, 30));

        jl_complemento.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jl_complemento.setForeground(new java.awt.Color(255, 255, 255));
        jl_complemento.setText("Complemento");
        jP_conteudo.add(jl_complemento, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 310, 140, -1));

        jT_complemento.setBorder(null);
        jT_complemento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jT_complementoActionPerformed(evt);
            }
        });
        jP_conteudo.add(jT_complemento, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 340, 240, 30));

        jL_cep1.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jL_cep1.setForeground(new java.awt.Color(255, 255, 255));
        jL_cep1.setText("CEP");
        jP_conteudo.add(jL_cep1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 370, -1, 20));

        jL_genero.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jL_genero.setForeground(new java.awt.Color(255, 255, 255));
        jL_genero.setText("G�nero");
        jP_conteudo.add(jL_genero, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 150, -1, 20));

        jC_Genero.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Masculino", "Feminino" }));
        jP_conteudo.add(jC_Genero, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 180, 110, 30));
        jP_conteudo.add(jFT_peso, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 540, 130, 30));
        jP_conteudo.add(jFT_altura, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 540, 120, 30));

        jL_estado.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jL_estado.setForeground(new java.awt.Color(255, 255, 255));
        jL_estado.setText("Estado");
        jP_conteudo.add(jL_estado, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 420, -1, 20));

        jT_estado.setBorder(null);
        jP_conteudo.add(jT_estado, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 440, 200, 30));

        jPanel2.setBackground(new java.awt.Color(153, 153, 153));
        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        jP_conteudo.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 590, 190));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Dados Pessoais");
        jP_conteudo.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Endere�o");
        jP_conteudo.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 60, 40));

        jPanel3.setBackground(new java.awt.Color(153, 153, 153));
        jPanel3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        jP_conteudo.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, 590, 240));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Dados de Acesso");
        jP_conteudo.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 480, -1, 20));

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        jP_conteudo.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 500, 590, 90));

        getContentPane().add(jP_conteudo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 620, 680));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    // <editor-fold defaultstate="collapsed" desc="fun�oes">   
    Validacao testes = new Validacao();
    // <editor-fold defaultstate="collapsed" desc="vazio">   
    //teste se os campos estao vazios
    private boolean testeVazio(){
        //come�ando com o nome
        if (jT_nome.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Campo nome esta em branco");
            return false;
            // se estiver ok testa a idade
            //ele envia o campo de texto para a classe de valida��o e ela retorna um tipo date
            //se estiver tudo certo e um nulo caso aja algum erro
        }else if(testes.converterIdade(jFT_nascimento.getText()) == null){
            JOptionPane.showMessageDialog(null, "Campo nascimento esta em branco ou invalida");
            return false;
            //testa altura e peso
        }else if(jFT_altura.getText().equals(" .  ") || jFT_peso.getText().equals("   .  ")){
            JOptionPane.showMessageDialog(null, "Campo altura ou peso esta em branco");
            return false;
            //teste do cpf enviando para a classe de valida��o
        }else if(testes.isCPF(jFT_cpf.getText()) == false){
            JOptionPane.showMessageDialog(null, "Campo cpf esta em branco ou invalida");
            return false;
            //teste se o campo do rg esta vazio
        }else if(jT_rg.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Campo rg esta em branco");
            return false;
        }
        return true;
    }
    // </editor-fold>
    // <editor-fold defaultstate="collapsed" desc="salvar">   
    
    private void salvar (){
        Validacao validar = new Validacao();
        this.endereco.setLogradouro(jT_logradouro.getText());
        this.endereco.setBairro(jT_bairro.getText());
        this.endereco.setCep(jT_cep.getText());
        this.endereco.setCidade(jT_cidade.getText());
        this.endereco.setEstado(jT_estado.getText());
        this.endereco.setNumero(jT_numero.getText());
        this.endereco.setObservacoa(jT_complemento.getText());
        
        this.cliente.setAlergias(jT_alergias.getText());
        this.cliente.setAltura(Double.valueOf(jFT_altura.getText()));
        this.cliente.setPeso(Double.valueOf(jFT_peso.getText()));
        this.cliente.setCpf(jFT_cpf.getText());
        this.cliente.setEndereco(this.endereco);
        this.cliente.setGenero(jC_Genero.getSelectedItem().toString().equals("Masculino"));
        this.cliente.setNascimento(validar.converterIdade(jFT_nascimento.getText()));
        this.cliente.setNome(jT_nome.getText());
        this.cliente.setRg(jT_rg.getText());
        this.cliente.setTelefone(jFT_telefone.getText());
        
        //cria��o das classes dao para o cadastro no banco de dados
        ClienteDAO2 clienteDao = new ClienteDAO2();
        EnderecoDAO enderecoDAO = new EnderecoDAO();
        //ele salva primeiro o endere�o para depois salvar o cliente
        enderecoDAO.salvar(endereco);
        if(clienteDao.salvar(cliente) == true){
            JOptionPane.showMessageDialog(null, "Cliente salvo com sucesso");
            fechar();
            this.dispose();
        }else{
            JOptionPane.showMessageDialog(null, "Erro Fale com seu administrador");
        }
    }
    // </editor-fold>      
    public void fechar(){
        if(ControleTelas.telaListarClientes  == true){
            ControleTelas.telaCadastroClientes = false;
            ListarClientes.atualizarTabela();
        }
    }
    // </editor-fold>        
    // <editor-fold defaultstate="collapsed" desc="eventos">        
    private void jT_nomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jT_nomeMouseClicked
        jT_nome.setText("");
    }//GEN-LAST:event_jT_nomeMouseClicked

    private void jT_nomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jT_nomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jT_nomeActionPerformed

    private void jT_rgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jT_rgActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jT_rgActionPerformed

    private void jT_logradouroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jT_logradouroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jT_logradouroActionPerformed

    private void jT_cidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jT_cidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jT_cidadeActionPerformed

    private void jT_bairroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jT_bairroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jT_bairroActionPerformed

    private void jT_cepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jT_cepActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jT_cepActionPerformed

    private void jB_cadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_cadastrarActionPerformed
        if(testeVazio()){
            salvar();
        }
    }//GEN-LAST:event_jB_cadastrarActionPerformed

    private void jT_alergiasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jT_alergiasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jT_alergiasActionPerformed

    private void jFT_nascimentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFT_nascimentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFT_nascimentoActionPerformed

    private void jT_numeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jT_numeroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jT_numeroActionPerformed

    private void jT_complementoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jT_complementoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jT_complementoActionPerformed
 
    private void jB_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_cancelarActionPerformed
        if(JOptionPane.showConfirmDialog(null, "Deseja realmente fechar?")==0){
            ControleTelas.telaCadastroClientes = false;
            this.dispose();
        }
       
    }//GEN-LAST:event_jB_cancelarActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        ControleTelas.telaCadastroClientes = false;
    }//GEN-LAST:event_formWindowClosing

    private void jB_cadastrarMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jB_cadastrarMouseMoved
       jP_cadastrar.setBorder(efeitoBorda());
    }//GEN-LAST:event_jB_cadastrarMouseMoved

    private void jB_cadastrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jB_cadastrarMouseExited
        efeitoBordaCancelar(jP_cadastrar);
    }//GEN-LAST:event_jB_cadastrarMouseExited

    private void jB_cancelarMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jB_cancelarMouseMoved
       jP_cancelar.setBorder(efeitoBorda());
    }//GEN-LAST:event_jB_cancelarMouseMoved

    private void jB_cancelarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jB_cancelarMouseExited
        efeitoBordaCancelar(jP_cancelar);
        
    }//GEN-LAST:event_jB_cancelarMouseExited
    
    
    // </editor-fold>        
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
            java.util.logging.Logger.getLogger(CadastroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroCliente().setVisible(true);
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
    private javax.swing.JButton jB_cadastrar;
    private javax.swing.JButton jB_cancelar;
    private javax.swing.JComboBox<String> jC_Genero;
    private javax.swing.JTextField jFT_altura;
    private javax.swing.JFormattedTextField jFT_cpf;
    private javax.swing.JFormattedTextField jFT_nascimento;
    private javax.swing.JTextField jFT_peso;
    private javax.swing.JFormattedTextField jFT_telefone;
    private javax.swing.JLabel jL_alerguias;
    private javax.swing.JLabel jL_altura;
    private javax.swing.JLabel jL_bairro;
    private javax.swing.JLabel jL_cep1;
    private javax.swing.JLabel jL_cidade;
    private javax.swing.JLabel jL_cliente;
    private javax.swing.JLabel jL_cpf;
    private javax.swing.JLabel jL_estado;
    private javax.swing.JLabel jL_genero;
    private javax.swing.JLabel jL_nascimento;
    private javax.swing.JLabel jL_nome;
    private javax.swing.JLabel jL_numero;
    private javax.swing.JLabel jL_peso;
    private javax.swing.JLabel jL_rg;
    private javax.swing.JLabel jL_telefone;
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
    private javax.swing.JTextField jT_alergias;
    private javax.swing.JTextField jT_bairro;
    private javax.swing.JTextField jT_cep;
    private javax.swing.JTextField jT_cidade;
    private javax.swing.JTextField jT_complemento;
    private javax.swing.JTextField jT_estado;
    private javax.swing.JTextField jT_logradouro;
    private javax.swing.JTextField jT_nome;
    private javax.swing.JTextField jT_numero;
    private javax.swing.JTextField jT_rg;
    private javax.swing.JLabel jl_complemento;
    private javax.swing.JLabel jl_logradouro;
    // End of variables declaration//GEN-END:variables
}
