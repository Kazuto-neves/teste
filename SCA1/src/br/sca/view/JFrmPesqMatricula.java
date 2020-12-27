/*
 * JFrmPesqEspecialidade.java
 *
 * Created on 10 de Agosto de 2008, 21:22
 */

package br.sca.view;

import br.sca.util.ExcecaoSCA;
import br.sca.controller.CtrCadastroMatricula;
import br.sca.model.*;
import java.awt.event.KeyEvent;
import java.util.List;
import java.util.ResourceBundle;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTabbedPane;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
/**
 *
 * @author  Administrador
 */
public class JFrmPesqMatricula extends javax.swing.JPanel {
    CtrCadastroMatricula ctrCadastroMatricula = CtrCadastroMatricula.getInstance();
    Avaliacao avaliacao;
    List<Avaliacao> avaliacoes;
    String anoSemestreAtivo;
    private TableColumn  cColuna=null;
    private javax.swing.JFrame parent;
    
    /** Creates new form CursoJPanel */
    public JFrmPesqMatricula(javax.swing.JFrame parent) {
        try {
            initComponents();
            this.parent = parent;
            ResourceBundle prop = ResourceBundle.getBundle("br.sca.utils.anoSemestreAtivo");
            anoSemestreAtivo = prop.getString("anoSemestre");
            jFormattedTextFieldAnoSemestre.setText(anoSemestreAtivo);
            avaliacoes = ctrCadastroMatricula.listarTodosPorAnoSemestre(anoSemestreAtivo,jComboBox.getSelectedIndex());
            atualizarTabela(avaliacoes);
        } catch (ExcecaoSCA ex) {
            JOptionPane.showMessageDialog(null,ex.getMsg(),"Validação",JOptionPane.ERROR_MESSAGE);
        }
}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jToolBar1 = new javax.swing.JToolBar();
        jButtonNovo = new javax.swing.JButton();
        jButtonExcluir = new javax.swing.JButton();
        jButtonFenhar = new javax.swing.JButton();
        jPanel = new javax.swing.JPanel();
        jLabel = new javax.swing.JLabel();
        jComboBox = new javax.swing.JComboBox();
        jSeparator1 = new javax.swing.JSeparator();
        jButtonPesquisa = new javax.swing.JButton();
        jTextFieldPesquisa = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        matriculaJTable = new javax.swing.JTable();
        jLabelAnoSemestre = new javax.swing.JLabel();
        jFormattedTextFieldAnoSemestre = new javax.swing.JFormattedTextField();

        addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                formFocusGained(evt);
            }
        });
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                formKeyTyped(evt);
            }
        });

        jToolBar1.setRollover(true);
        jToolBar1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jToolBar1KeyPressed(evt);
            }
        });

        jButtonNovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/sca/resources/new.PNG"))); // NOI18N
        jButtonNovo.setText("Novo");
        jButtonNovo.setFocusable(false);
        jButtonNovo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonNovo.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButtonNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNovoActionPerformed(evt);
            }
        });
        jToolBar1.add(jButtonNovo);

        jButtonExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/sca/resources/excluir2.png"))); // NOI18N
        jButtonExcluir.setText("Excluir");
        jButtonExcluir.setFocusable(false);
        jButtonExcluir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonExcluir.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButtonExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExcluirActionPerformed(evt);
            }
        });
        jToolBar1.add(jButtonExcluir);

        jButtonFenhar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/sca/resources/sair.png"))); // NOI18N
        jButtonFenhar.setText("Fechar");
        jButtonFenhar.setFocusable(false);
        jButtonFenhar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonFenhar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButtonFenhar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFenharActionPerformed(evt);
            }
        });
        jToolBar1.add(jButtonFenhar);

        jLabel.setText("Ordenar ou Pesquisar por:");

        jComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Número Turma", "Matrícula Aluno" }));
        jComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxActionPerformed(evt);
            }
        });

        jSeparator1.setForeground(new java.awt.Color(51, 51, 51));
        jSeparator1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jButtonPesquisa.setText("Pesquisar");
        jButtonPesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPesquisaActionPerformed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout jPanelLayout = new org.jdesktop.layout.GroupLayout(jPanel);
        jPanel.setLayout(jPanelLayout);
        jPanelLayout.setHorizontalGroup(
            jPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanelLayout.createSequentialGroup()
                .add(jSeparator1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 9, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(18, 18, 18)
                .add(jPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                    .add(jPanelLayout.createSequentialGroup()
                        .add(jLabel)
                        .add(18, 18, 18)
                        .add(jComboBox, 0, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .add(jPanelLayout.createSequentialGroup()
                        .add(jButtonPesquisa)
                        .add(18, 18, 18)
                        .add(jTextFieldPesquisa, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 187, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(59, Short.MAX_VALUE))
        );
        jPanelLayout.setVerticalGroup(
            jPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanelLayout.createSequentialGroup()
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .add(jPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel)
                    .add(jComboBox, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(jPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jButtonPesquisa)
                    .add(jTextFieldPesquisa, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
            .add(jSeparator1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 76, Short.MAX_VALUE)
        );

        matriculaJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Número", "Matrícula", "Curso", "Disciplina", "Nome"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(matriculaJTable);

        jLabelAnoSemestre.setText("Ano Semestre");

        jFormattedTextFieldAnoSemestre.setEditable(false);
        try {
            jFormattedTextFieldAnoSemestre.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####-#")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(layout.createSequentialGroup()
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(jToolBar1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(layout.createSequentialGroup()
                                .addContainerGap()
                                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                    .add(jLabelAnoSemestre)
                                    .add(layout.createSequentialGroup()
                                        .add(101, 101, 101)
                                        .add(jFormattedTextFieldAnoSemestre, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 75, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))))
                        .add(jPanel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                    .add(layout.createSequentialGroup()
                        .add(10, 10, 10)
                        .add(jScrollPane3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 552, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(layout.createSequentialGroup()
                        .add(jToolBar1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 46, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(jLabelAnoSemestre)
                            .add(jFormattedTextFieldAnoSemestre, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                    .add(jPanel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jScrollPane3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 244, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(184, 184, 184))
        );
    }// </editor-fold>//GEN-END:initComponents
private void Fechar() {
        int i;
        JTabbedPane j = (JTabbedPane) this.getParent();
        i = j.indexOfComponent(this);
        if (i != -1) {
            this.getParent().remove(i);
        }
    }

private void configurarBotoes(){
        boolean ok = (matriculaJTable.getRowCount() > 0 );
        jButtonExcluir.setEnabled(ok);
        
    }


private void atualizarTabela(List <Avaliacao> avaliacoes) {
        
        //limpa campos jtable
        DefaultTableModel dtmLimpar;
        dtmLimpar = (DefaultTableModel) matriculaJTable.getModel();
        dtmLimpar.setNumRows(0);
        
        DefaultTableModel dtm;
        
        for (Avaliacao umaAvaliacao : avaliacoes){
            //Carrega os valores no jTable
            dtm = (DefaultTableModel) matriculaJTable.getModel();
            dtm.addRow(new Object[]{ 
                umaAvaliacao.getTurma().getNumero(),
                umaAvaliacao.getAluno().getMatricula(),
                umaAvaliacao.getTurma().getDisciplina().getCurso().getDescricao(),
                umaAvaliacao.getTurma().getDisciplina().getDescricao(),umaAvaliacao.getAluno().getNome() });
        }
        matriculaJTable.getColumnModel().getColumn(0).setPreferredWidth(80);
        matriculaJTable.getColumnModel().getColumn(1).setPreferredWidth(80);
        matriculaJTable.getColumnModel().getColumn(2).setPreferredWidth(100);
        matriculaJTable.getColumnModel().getColumn(3).setPreferredWidth(100);
        matriculaJTable.getColumnModel().getColumn(4).setPreferredWidth(100);
        cColuna = matriculaJTable.getColumnModel().getColumn(0);
        DefaultTableCellRenderer cAlign = new DefaultTableCellRenderer();
        cAlign.setHorizontalAlignment(JLabel.CENTER);
        cColuna.setCellRenderer(cAlign);
        cAlign = null;
        matriculaJTable.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        if (matriculaJTable.getRowCount() > 0 )
            matriculaJTable.setRowSelectionInterval(0, 0);
        configurarBotoes();
    }


private void jButtonNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNovoActionPerformed
        JFrmMatricula jDialogMatricula;

        try{
            jDialogMatricula = new JFrmMatricula(parent,0);
            jDialogMatricula.setLocationRelativeTo(this);
            jDialogMatricula.setVisible(true);
            if (jDialogMatricula.isSucesso())
            {
                try {
                    avaliacoes = ctrCadastroMatricula.listarTodosPorAnoSemestre(anoSemestreAtivo,jComboBox.getSelectedIndex());
                    atualizarTabela(avaliacoes);
                } catch (ExcecaoSCA ex) {
                    JOptionPane.showMessageDialog(null,ex.getMsg(),"Validação",JOptionPane.ERROR_MESSAGE);
                }
            }
         } catch (ExcecaoSCA ex) {
            JOptionPane.showMessageDialog(null,ex.getMsg(),"Validação",JOptionPane.ERROR_MESSAGE);
         }
        
       
}//GEN-LAST:event_jButtonNovoActionPerformed

private void jButtonFenharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFenharActionPerformed
        Fechar();
}//GEN-LAST:event_jButtonFenharActionPerformed

private void jButtonExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExcluirActionPerformed
        if (JOptionPane.showConfirmDialog(null,
                "Deseja excluir a matrícula 'Turma "  + 
                matriculaJTable.getValueAt(matriculaJTable.getSelectedRow(),0) + " Aluno " +
                matriculaJTable.getValueAt(matriculaJTable.getSelectedRow(),4) +
                "'?", "Matrículas",
                JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION ) {
            try {
                // TODO add your handling code here:
                avaliacao = new Avaliacao();              
                Turma umaTurma = avaliacoes.get(matriculaJTable.getSelectedRow()).getTurma();
                avaliacao.setTurma(umaTurma);
                Aluno umAluno = avaliacoes.get(matriculaJTable.getSelectedRow()).getAluno();
                avaliacao.setAluno(umAluno);
                ctrCadastroMatricula.excluir(avaliacao);
                avaliacoes = ctrCadastroMatricula.listarTodosPorAnoSemestre(anoSemestreAtivo,jComboBox.getSelectedIndex());
                atualizarTabela(avaliacoes);
            } catch (ExcecaoSCA ex) {
               JOptionPane.showMessageDialog(null,ex.getMsg(),"Validação",JOptionPane.ERROR_MESSAGE);                            
            }
        }

}//GEN-LAST:event_jButtonExcluirActionPerformed

private void formFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_formFocusGained
        try {
            avaliacoes = ctrCadastroMatricula.listarTodosPorAnoSemestre(anoSemestreAtivo,jComboBox.getSelectedIndex());
            atualizarTabela(avaliacoes);
            /*
            atualizarTabela(medicos);//GEN-LAST:event_formFocusGained
            */
             matriculaJTable.requestFocus();
        } catch (ExcecaoSCA ex) {
               JOptionPane.showMessageDialog(null,ex.getMsg(),"Validação",JOptionPane.ERROR_MESSAGE);                            
        }
        
}                                

private void jToolBar1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jToolBar1KeyPressed
       if (evt.getKeyCode()== KeyEvent.VK_ESCAPE )
            Fechar() ;
}//GEN-LAST:event_jToolBar1KeyPressed

private void formKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyTyped
        if (evt.getKeyCode()== KeyEvent.VK_ESCAPE )
            Fechar() ;
}//GEN-LAST:event_formKeyTyped

private void jComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxActionPerformed
   try{
    avaliacoes = ctrCadastroMatricula.listarTodosPorAnoSemestre(anoSemestreAtivo,jComboBox.getSelectedIndex());
    atualizarTabela(avaliacoes);
   } catch (ExcecaoSCA ex) {
            JOptionPane.showMessageDialog(null,ex.getMsg(),"Validação",JOptionPane.ERROR_MESSAGE);
   }
}//GEN-LAST:event_jComboBoxActionPerformed

private void jButtonPesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPesquisaActionPerformed
        if (!(jTextFieldPesquisa.getText().isEmpty()))
        {
          boolean achou = false;   
          for (int i = 0; i < matriculaJTable.getModel().getRowCount(); i++){
            if (jTextFieldPesquisa.getText().trim().toUpperCase().equals(matriculaJTable.getValueAt(i,jComboBox.getSelectedIndex()).toString().trim().toUpperCase())){
                achou = true;
                matriculaJTable.setRowSelectionInterval(i,i);
                matriculaJTable.repaint();
                break;
            }
     
          }            
          jTextFieldPesquisa.setText("");
          if (!achou)
          {
            JOptionPane.showMessageDialog(null, "Matrícula não localizada","Pesquisa", JOptionPane.OK_OPTION);          
          }          
          
        }    

}//GEN-LAST:event_jButtonPesquisaActionPerformed

private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
    // TODO add your handling code here:
}//GEN-LAST:event_formKeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonExcluir;
    private javax.swing.JButton jButtonFenhar;
    private javax.swing.JButton jButtonNovo;
    private javax.swing.JButton jButtonPesquisa;
    private javax.swing.JComboBox jComboBox;
    private javax.swing.JFormattedTextField jFormattedTextFieldAnoSemestre;
    private javax.swing.JLabel jLabel;
    private javax.swing.JLabel jLabelAnoSemestre;
    private javax.swing.JPanel jPanel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTextFieldPesquisa;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JTable matriculaJTable;
    // End of variables declaration//GEN-END:variables

}
