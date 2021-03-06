/*
 * JFrmCurso.java
 *
 * Created on 10 de Agosto de 2008, 21:48
 */

package br.sca.view;

import br.sca.util.ExcecaoSCA;
import br.sca.controller.CtrCadastroProfessor;
import br.sca.model.Professor;
import javax.swing.JOptionPane;


/**
 *
 * @author  Administrador
 */
public class JFrmProfessor extends javax.swing.JDialog {
    int operacao;
    private boolean sucesso = false;
    CtrCadastroProfessor ctrCadastroProfessor = CtrCadastroProfessor.getInstance() ;
    Professor professor;
    
    
    /** Creates new form PropCursoJDialog */
    public JFrmProfessor(javax.swing.JFrame parent,int operacao, Professor umProfessor) {
        
        super(parent,true);
        initComponents();
        this.operacao = operacao;
        professor = umProfessor;
                    
        switch (operacao) {
            case 0:
                this.setTitle("Inclusão de professor");
                jTextFieldMatrícula.setEditable(true);
                break;
            case 1:
                this.setTitle("Alteração de professor");
                setDados();
                break;
            case 2:
                this.setTitle("Consulta de professor");
                jTextFieldMatrícula.setText(professor.getMatricula().toString());
                jTextFieldNome.setEditable(false);
                jFormattedTextFieldIdentidade.setEditable(false);
                jTextFieldOrgaoExpedidor.setEditable(false);
                JComboBoxUfIdentidade.setEnabled(false);
                jFormattedTextFieldCpf.setEditable(false);
                JComboBoxSexo.setEnabled(false);
                jFormattedTextFieldDataNascimento.setEditable(false);
                jTextFieldLogradouro.setEditable(false);
                jTextFieldNumero.setEditable(false);
                jTextFieldComplemento.setEditable(false);
                jTextFieldBairro.setEditable(false);
                jTextFieldCidade.setEditable(false);
                JComboBoxUf.setEnabled(false);
                jFormattedTextFieldCep.setEditable(false);
                jTextFieldEmail.setEditable(false);
                jFormattedTextFieldTelResidencial.setEditable(false);
                jFormattedTextFieldTelComercial.setEditable(false);
                jFormattedTextFieldTelCelular.setEditable(false);
                jTextFieldTitulacaoMaxima.setEditable(false);
                
                jButtonCancelar.setEnabled(false);
                setDados();
                break;                
        }
        this.getRootPane().setDefaultButton(jButtonOK);
    
   
    }

   
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelSuperior = new javax.swing.JPanel();
        jLabelMatricula = new javax.swing.JLabel();
        jLabelNome = new javax.swing.JLabel();
        jLabelSexo = new javax.swing.JLabel();
        jLabelIdentidade = new javax.swing.JLabel();
        jTextFieldMatrícula = new javax.swing.JTextField();
        jTextFieldNome = new javax.swing.JTextField();
        jLabelOrgaoExpedidor = new javax.swing.JLabel();
        jTextFieldOrgaoExpedidor = new javax.swing.JTextField();
        jLabelSemestreInicioUfIdentidade = new javax.swing.JLabel();
        jLabelCpf = new javax.swing.JLabel();
        jLabelDataNascimento = new javax.swing.JLabel();
        jLabelTitulacaoMaxima = new javax.swing.JLabel();
        jTextFieldTitulacaoMaxima = new javax.swing.JTextField();
        jLabelLogradouro = new javax.swing.JLabel();
        jTextFieldLogradouro = new javax.swing.JTextField();
        jTextFieldNumero = new javax.swing.JTextField();
        jLabelNumero = new javax.swing.JLabel();
        JComboBoxSexo = new javax.swing.JComboBox();
        jFormattedTextFieldIdentidade = new javax.swing.JFormattedTextField();
        JComboBoxUfIdentidade = new javax.swing.JComboBox();
        jFormattedTextFieldCpf = new javax.swing.JFormattedTextField();
        jFormattedTextFieldDataNascimento = new javax.swing.JFormattedTextField();
        jLabelComplemento = new javax.swing.JLabel();
        jTextFieldComplemento = new javax.swing.JTextField();
        jTextFieldBairro = new javax.swing.JTextField();
        jLabelBairro = new javax.swing.JLabel();
        jTextFieldCidade = new javax.swing.JTextField();
        jLabelCidade = new javax.swing.JLabel();
        jLabelUf = new javax.swing.JLabel();
        JComboBoxUf = new javax.swing.JComboBox();
        jLabelCep = new javax.swing.JLabel();
        jFormattedTextFieldCep = new javax.swing.JFormattedTextField();
        jLabelEmail = new javax.swing.JLabel();
        jTextFieldEmail = new javax.swing.JTextField();
        jLabelTelComercial = new javax.swing.JLabel();
        jLabelTelResidencial = new javax.swing.JLabel();
        jLabelTelCelular = new javax.swing.JLabel();
        jFormattedTextFieldTelResidencial = new javax.swing.JFormattedTextField();
        jFormattedTextFieldTelCelular = new javax.swing.JFormattedTextField();
        jFormattedTextFieldTelComercial = new javax.swing.JFormattedTextField();
        jPanelInferior = new javax.swing.JPanel();
        jButtonOK = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabelMatricula.setText("Matrícula");

        jLabelNome.setText("Nome");

        jLabelSexo.setText("Sexo");

        jLabelIdentidade.setText("Identidade");

        jTextFieldMatrícula.setEditable(false);

        jLabelOrgaoExpedidor.setText("Orgão Expedidor");

        jTextFieldOrgaoExpedidor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldOrgaoExpedidorKeyTyped(evt);
            }
        });

        jLabelSemestreInicioUfIdentidade.setText("Uf Identidade");

        jLabelCpf.setText("CPF");

        jLabelDataNascimento.setText("Data de Nascimento");

        jLabelTitulacaoMaxima.setText("Titulação Máxima");

        jTextFieldTitulacaoMaxima.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldTitulacaoMaximaKeyTyped(evt);
            }
        });

        jLabelLogradouro.setText("Logradouro");

        jTextFieldLogradouro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldLogradouroKeyTyped(evt);
            }
        });

        jLabelNumero.setText("Número");

        JComboBoxSexo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "M", "F" }));
        JComboBoxSexo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JComboBoxSexoActionPerformed(evt);
            }
        });

        try {
            jFormattedTextFieldIdentidade.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("########-#")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        JComboBoxUfIdentidade.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "AC", "AL", "AM", "AP", "BA", "CE", "DF", "ES", "GO", "MA", "MG", "MS", "MT", "PA", "PB", "PE", "PI", "PR", "RJ", "RN", "RO", "RR", "RS", "SC", "SE", "SP", "TO" }));
        JComboBoxUfIdentidade.setSelectedIndex(18);

        try {
            jFormattedTextFieldCpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#########-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            jFormattedTextFieldDataNascimento.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedTextFieldDataNascimento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFormattedTextFieldDataNascimentoActionPerformed(evt);
            }
        });

        jLabelComplemento.setText("Complemento");

        jTextFieldComplemento.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldComplementoKeyTyped(evt);
            }
        });

        jTextFieldBairro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldBairroKeyTyped(evt);
            }
        });

        jLabelBairro.setText("Bairro");

        jTextFieldCidade.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldCidadeKeyTyped(evt);
            }
        });

        jLabelCidade.setText("Cidade");

        jLabelUf.setText("Uf");

        JComboBoxUf.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "AC", "AL", "AM", "AP", "BA", "CE", "DF", "ES", "GO", "MA", "MG", "MS", "MT", "PA", "PB", "PE", "PI", "PR", "RJ", "RN", "RO", "RR", "RS", "SC", "SE", "SP", "TO" }));
        JComboBoxUf.setSelectedIndex(18);

        jLabelCep.setText("Cep");

        try {
            jFormattedTextFieldCep.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabelEmail.setText("E-mail");

        jTextFieldEmail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldEmailKeyTyped(evt);
            }
        });

        jLabelTelComercial.setText("Telefone Comercial");

        jLabelTelResidencial.setText("Telefone Residencial");

        jLabelTelCelular.setText("Telefone Celular");

        try {
            jFormattedTextFieldTelResidencial.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            jFormattedTextFieldTelCelular.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            jFormattedTextFieldTelComercial.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        org.jdesktop.layout.GroupLayout jPanelSuperiorLayout = new org.jdesktop.layout.GroupLayout(jPanelSuperior);
        jPanelSuperior.setLayout(jPanelSuperiorLayout);
        jPanelSuperiorLayout.setHorizontalGroup(
            jPanelSuperiorLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanelSuperiorLayout.createSequentialGroup()
                .addContainerGap()
                .add(jPanelSuperiorLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jLabelTitulacaoMaxima)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanelSuperiorLayout.createSequentialGroup()
                        .add(jPanelSuperiorLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                            .add(org.jdesktop.layout.GroupLayout.LEADING, jLabelCep)
                            .add(org.jdesktop.layout.GroupLayout.LEADING, jPanelSuperiorLayout.createSequentialGroup()
                                .add(61, 61, 61)
                                .add(jFormattedTextFieldCep, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 78, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                            .add(org.jdesktop.layout.GroupLayout.LEADING, jPanelSuperiorLayout.createSequentialGroup()
                                .add(jPanelSuperiorLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                    .add(jLabelTelResidencial)
                                    .add(jLabelTelCelular))
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(jPanelSuperiorLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                    .add(jTextFieldTitulacaoMaxima, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 234, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                    .add(jPanelSuperiorLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING, false)
                                        .add(org.jdesktop.layout.GroupLayout.LEADING, jFormattedTextFieldTelCelular)
                                        .add(org.jdesktop.layout.GroupLayout.LEADING, jFormattedTextFieldTelResidencial, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE)))))
                        .addContainerGap(192, Short.MAX_VALUE))
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanelSuperiorLayout.createSequentialGroup()
                        .add(jPanelSuperiorLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                            .add(org.jdesktop.layout.GroupLayout.LEADING, jLabelIdentidade)
                            .add(org.jdesktop.layout.GroupLayout.LEADING, jPanelSuperiorLayout.createSequentialGroup()
                                .add(jPanelSuperiorLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                    .add(jLabelNome)
                                    .add(jLabelMatricula))
                                .add(18, 18, 18)
                                .add(jPanelSuperiorLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                    .add(jTextFieldNome, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 218, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                    .add(jTextFieldMatrícula, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 69, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                    .add(jPanelSuperiorLayout.createSequentialGroup()
                                        .add(jPanelSuperiorLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                                            .add(jFormattedTextFieldIdentidade)
                                            .add(jFormattedTextFieldCpf, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE))
                                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                        .add(jPanelSuperiorLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                            .add(jLabelOrgaoExpedidor)
                                            .add(jPanelSuperiorLayout.createSequentialGroup()
                                                .add(jLabelSexo)
                                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                                                .add(JComboBoxSexo, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                        .add(jPanelSuperiorLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                            .add(jPanelSuperiorLayout.createSequentialGroup()
                                                .add(jLabelDataNascimento)
                                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                                                .add(jFormattedTextFieldDataNascimento, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 82, Short.MAX_VALUE))
                                            .add(jPanelSuperiorLayout.createSequentialGroup()
                                                .add(jTextFieldOrgaoExpedidor, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 54, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                                .add(18, 18, 18)
                                                .add(jLabelSemestreInicioUfIdentidade)
                                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                                                .add(JComboBoxUfIdentidade, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))))))
                            .add(org.jdesktop.layout.GroupLayout.LEADING, jLabelCpf)
                            .add(jPanelSuperiorLayout.createSequentialGroup()
                                .add(jPanelSuperiorLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                    .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanelSuperiorLayout.createSequentialGroup()
                                        .add(jLabelComplemento)
                                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED))
                                    .add(jPanelSuperiorLayout.createSequentialGroup()
                                        .add(jLabelCidade)
                                        .add(36, 36, 36)))
                                .add(jPanelSuperiorLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                                    .add(jTextFieldCidade)
                                    .add(jTextFieldComplemento, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 161, Short.MAX_VALUE))
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(jPanelSuperiorLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                    .add(jPanelSuperiorLayout.createSequentialGroup()
                                        .add(jLabelUf)
                                        .add(18, 18, 18)
                                        .add(JComboBoxUf, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                                    .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanelSuperiorLayout.createSequentialGroup()
                                        .add(jLabelBairro)
                                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                        .add(jTextFieldBairro, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 164, Short.MAX_VALUE))
                                    .add(jPanelSuperiorLayout.createSequentialGroup()
                                        .add(jLabelEmail)
                                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                        .add(jTextFieldEmail, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 164, Short.MAX_VALUE))
                                    .add(jPanelSuperiorLayout.createSequentialGroup()
                                        .add(jLabelTelComercial)
                                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                        .add(jFormattedTextFieldTelComercial, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE))))
                            .add(jPanelSuperiorLayout.createSequentialGroup()
                                .add(jLabelLogradouro)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(jTextFieldLogradouro, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 234, Short.MAX_VALUE)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                                .add(jLabelNumero)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(jTextFieldNumero, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 86, Short.MAX_VALUE)))
                        .add(567, 567, 567))))
        );
        jPanelSuperiorLayout.setVerticalGroup(
            jPanelSuperiorLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanelSuperiorLayout.createSequentialGroup()
                .add(26, 26, 26)
                .add(jPanelSuperiorLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabelMatricula)
                    .add(jTextFieldMatrícula, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(11, 11, 11)
                .add(jPanelSuperiorLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                    .add(jTextFieldNome, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jLabelNome))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanelSuperiorLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabelIdentidade)
                    .add(jLabelOrgaoExpedidor)
                    .add(jTextFieldOrgaoExpedidor, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jLabelSemestreInicioUfIdentidade)
                    .add(JComboBoxUfIdentidade, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jFormattedTextFieldIdentidade, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(jPanelSuperiorLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabelCpf)
                    .add(jLabelSexo)
                    .add(JComboBoxSexo, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jLabelDataNascimento)
                    .add(jFormattedTextFieldCpf, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jFormattedTextFieldDataNascimento, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(jPanelSuperiorLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabelLogradouro)
                    .add(jTextFieldLogradouro, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jLabelNumero)
                    .add(jTextFieldNumero, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(jPanelSuperiorLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabelComplemento)
                    .add(jTextFieldComplemento, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jLabelBairro)
                    .add(jTextFieldBairro, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(jPanelSuperiorLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabelCidade)
                    .add(jTextFieldCidade, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jLabelUf)
                    .add(JComboBoxUf, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanelSuperiorLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabelCep)
                    .add(jLabelEmail)
                    .add(jFormattedTextFieldCep, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jTextFieldEmail, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanelSuperiorLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabelTelResidencial)
                    .add(jLabelTelComercial)
                    .add(jFormattedTextFieldTelResidencial, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jFormattedTextFieldTelComercial, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanelSuperiorLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabelTelCelular)
                    .add(jFormattedTextFieldTelCelular, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanelSuperiorLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabelTitulacaoMaxima)
                    .add(jTextFieldTitulacaoMaxima, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(37, Short.MAX_VALUE))
        );

        jButtonOK.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/sca/resources/incluirPequeno.png"))); // NOI18N
        jButtonOK.setText("OK");
        jButtonOK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonOKActionPerformed(evt);
            }
        });

        jButtonCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/sca/resources/excluirPequeno.png"))); // NOI18N
        jButtonCancelar.setText("Cancelar");
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarActionPerformed(evt);
            }
        });
        jButtonCancelar.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jButtonCancelarFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jButtonCancelarFocusLost(evt);
            }
        });

        org.jdesktop.layout.GroupLayout jPanelInferiorLayout = new org.jdesktop.layout.GroupLayout(jPanelInferior);
        jPanelInferior.setLayout(jPanelInferiorLayout);
        jPanelInferiorLayout.setHorizontalGroup(
            jPanelInferiorLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanelInferiorLayout.createSequentialGroup()
                .add(105, 105, 105)
                .add(jButtonOK)
                .add(72, 72, 72)
                .add(jButtonCancelar)
                .addContainerGap(229, Short.MAX_VALUE))
        );
        jPanelInferiorLayout.setVerticalGroup(
            jPanelInferiorLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanelInferiorLayout.createSequentialGroup()
                .addContainerGap()
                .add(jPanelInferiorLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jButtonOK)
                    .add(jButtonCancelar))
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING, false)
                    .add(layout.createSequentialGroup()
                        .add(10, 10, 10)
                        .add(jPanelInferior, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .add(org.jdesktop.layout.GroupLayout.LEADING, jPanelSuperior, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 538, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(jPanelSuperior, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanelInferior, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(66, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

private void jButtonOKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonOKActionPerformed
        try {
            // TODO add your handling code here:
            
            professor.setMatricula(Integer.parseInt(jTextFieldMatrícula.getText()));
            professor.setNome(jTextFieldNome.getText());
            professor.setIdentidade(jFormattedTextFieldIdentidade.getText().replace("-", ""));
            professor.setOrgaoExpedidor(jTextFieldOrgaoExpedidor.getText());
            professor.setUfIdentidade(JComboBoxUfIdentidade.getSelectedItem().toString());
            professor.setCpf(jFormattedTextFieldCpf.getText().replace("-", ""));      
            professor.setSexo(JComboBoxSexo.getSelectedItem().toString());
            professor.setDataNascimento(jFormattedTextFieldDataNascimento.getText());          
            professor.setLogradouro(jTextFieldLogradouro.getText());
            professor.setNumero(jTextFieldNumero.getText());
            professor.setComplemento(jTextFieldComplemento.getText());
            professor.setBairro(jTextFieldBairro.getText());
            professor.setCidade(jTextFieldCidade.getText());
            professor.setUf(JComboBoxUf.getSelectedItem().toString());
            professor.setCep(jFormattedTextFieldCep.getText().replace("-", ""));      
            professor.setEmail(jTextFieldEmail.getText());
            
            String tel = jFormattedTextFieldTelResidencial.getText().replace("(", "");
            tel = tel.replace(")", "");
            tel = tel.replace("-", "");
            professor.setTelResidencial(tel);
            tel = jFormattedTextFieldTelComercial.getText().replace("(", "");
            tel = tel.replace(")", "");
            tel = tel.replace("-", "");
            professor.setTelComercial(tel);
            tel = jFormattedTextFieldTelCelular.getText().replace("(", "");
            tel = tel.replace(")", "");
            tel = tel.replace("-", "");            
            professor.setTelCelular(tel);
            
            professor.setTitulacaoMaxima(jTextFieldTitulacaoMaxima.getText());
            
            
            switch (operacao) {
                case 0:
   
                    ctrCadastroProfessor.incluir(professor);
                    break;
                case 1 :                    
                    ctrCadastroProfessor.alterar(professor);
                    break;
            }
            sucesso = true;
            setVisible(false);
        } 
        catch (ExcecaoSCA ex) {
            JOptionPane.showMessageDialog(null,ex.getMsg(),"Validação",JOptionPane.ERROR_MESSAGE);
            jTextFieldTitulacaoMaxima.requestFocus();
        }
        catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null,"Valor inválido.","Validação",JOptionPane.ERROR_MESSAGE);
            jTextFieldMatrícula.requestFocus();
        }
}//GEN-LAST:event_jButtonOKActionPerformed

public void setDados(){
                jTextFieldMatrícula.setText(professor.getMatricula().toString());
                jTextFieldNome.setText(professor.getNome());
                jFormattedTextFieldIdentidade.setText(professor.getIdentidade());
                jTextFieldOrgaoExpedidor.setText(professor.getOrgaoExpedidor());
                JComboBoxUfIdentidade.setSelectedItem(professor.getUfIdentidade());
                jFormattedTextFieldCpf.setText(professor.getCpf());
                JComboBoxSexo.setSelectedItem(professor.getSexo());
                jFormattedTextFieldDataNascimento.setText(professor.getDataNascimento());
                jTextFieldLogradouro.setText(professor.getLogradouro());
                jTextFieldNumero.setText(professor.getNumero());
                jTextFieldComplemento.setText(professor.getComplemento());
                jTextFieldBairro.setText(professor.getBairro());
                jTextFieldCidade.setText(professor.getCidade());
                JComboBoxUf.setSelectedItem(professor.getUf());
                jFormattedTextFieldCep.setText(professor.getCep());
                jTextFieldEmail.setText(professor.getEmail());
                jFormattedTextFieldTelResidencial.setText(professor.getTelResidencial());
                jFormattedTextFieldTelComercial.setText(professor.getTelComercial());
                jFormattedTextFieldTelCelular.setText(professor.getTelCelular());
                jTextFieldTitulacaoMaxima.setText(professor.getTitulacaoMaxima());
                
}

private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
         setVisible(false);
}//GEN-LAST:event_jButtonCancelarActionPerformed

private void jButtonCancelarFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jButtonCancelarFocusGained
      this.getRootPane().setDefaultButton(jButtonCancelar);
}//GEN-LAST:event_jButtonCancelarFocusGained

private void jButtonCancelarFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jButtonCancelarFocusLost
      this.getRootPane().setDefaultButton(jButtonOK);
}//GEN-LAST:event_jButtonCancelarFocusLost

private void jTextFieldOrgaoExpedidorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldOrgaoExpedidorKeyTyped
// TODO add your handling code here:
}//GEN-LAST:event_jTextFieldOrgaoExpedidorKeyTyped

private void jTextFieldTitulacaoMaximaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldTitulacaoMaximaKeyTyped
// TODO add your handling code here:
}//GEN-LAST:event_jTextFieldTitulacaoMaximaKeyTyped

private void jTextFieldLogradouroKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldLogradouroKeyTyped
// TODO add your handling code here:
}//GEN-LAST:event_jTextFieldLogradouroKeyTyped

private void JComboBoxSexoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JComboBoxSexoActionPerformed

}//GEN-LAST:event_JComboBoxSexoActionPerformed

private void jFormattedTextFieldDataNascimentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFormattedTextFieldDataNascimentoActionPerformed
// TODO add your handling code here:
}//GEN-LAST:event_jFormattedTextFieldDataNascimentoActionPerformed

private void jTextFieldComplementoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldComplementoKeyTyped
// TODO add your handling code here:
}//GEN-LAST:event_jTextFieldComplementoKeyTyped

private void jTextFieldBairroKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldBairroKeyTyped
// TODO add your handling code here:
}//GEN-LAST:event_jTextFieldBairroKeyTyped

private void jTextFieldCidadeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldCidadeKeyTyped
// TODO add your handling code here:
}//GEN-LAST:event_jTextFieldCidadeKeyTyped

private void jTextFieldEmailKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldEmailKeyTyped
// TODO add your handling code here:
}//GEN-LAST:event_jTextFieldEmailKeyTyped



    /**
    * @param args the command line arguments
    */
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox JComboBoxSexo;
    private javax.swing.JComboBox JComboBoxUf;
    private javax.swing.JComboBox JComboBoxUfIdentidade;
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonOK;
    private javax.swing.JFormattedTextField jFormattedTextFieldCep;
    private javax.swing.JFormattedTextField jFormattedTextFieldCpf;
    private javax.swing.JFormattedTextField jFormattedTextFieldDataNascimento;
    private javax.swing.JFormattedTextField jFormattedTextFieldIdentidade;
    private javax.swing.JFormattedTextField jFormattedTextFieldTelCelular;
    private javax.swing.JFormattedTextField jFormattedTextFieldTelComercial;
    private javax.swing.JFormattedTextField jFormattedTextFieldTelResidencial;
    private javax.swing.JLabel jLabelBairro;
    private javax.swing.JLabel jLabelCep;
    private javax.swing.JLabel jLabelCidade;
    private javax.swing.JLabel jLabelComplemento;
    private javax.swing.JLabel jLabelCpf;
    private javax.swing.JLabel jLabelDataNascimento;
    private javax.swing.JLabel jLabelEmail;
    private javax.swing.JLabel jLabelIdentidade;
    private javax.swing.JLabel jLabelLogradouro;
    private javax.swing.JLabel jLabelMatricula;
    private javax.swing.JLabel jLabelNome;
    private javax.swing.JLabel jLabelNumero;
    private javax.swing.JLabel jLabelOrgaoExpedidor;
    private javax.swing.JLabel jLabelSemestreInicioUfIdentidade;
    private javax.swing.JLabel jLabelSexo;
    private javax.swing.JLabel jLabelTelCelular;
    private javax.swing.JLabel jLabelTelComercial;
    private javax.swing.JLabel jLabelTelResidencial;
    private javax.swing.JLabel jLabelTitulacaoMaxima;
    private javax.swing.JLabel jLabelUf;
    private javax.swing.JPanel jPanelInferior;
    private javax.swing.JPanel jPanelSuperior;
    private javax.swing.JTextField jTextFieldBairro;
    private javax.swing.JTextField jTextFieldCidade;
    private javax.swing.JTextField jTextFieldComplemento;
    private javax.swing.JTextField jTextFieldEmail;
    private javax.swing.JTextField jTextFieldLogradouro;
    private javax.swing.JTextField jTextFieldMatrícula;
    private javax.swing.JTextField jTextFieldNome;
    private javax.swing.JTextField jTextFieldNumero;
    private javax.swing.JTextField jTextFieldOrgaoExpedidor;
    private javax.swing.JTextField jTextFieldTitulacaoMaxima;
    // End of variables declaration//GEN-END:variables

 public boolean isSucesso() {
        return sucesso;
    }
}
