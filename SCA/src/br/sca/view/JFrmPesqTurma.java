/*
 * JFrmPesqEspecialidade.java
 *
 * Created on 10 de Agosto de 2008, 21:22
 */

package br.sca.view;

import br.sca.util.ExcecaoSCA;
import br.sca.controller.*;
import br.sca.model.*;
import java.awt.event.KeyEvent;
import java.util.List;
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
public class JFrmPesqTurma extends javax.swing.JPanel {
    CtrCadastroTurma ctrCadastroTurma = CtrCadastroTurma.getInstance();
    Turma turma;
    List<Turma> turmas;
    private TableColumn  cColuna=null;
    private javax.swing.JFrame parent;
    
    /** Creates new form CursoJPanel */
    public JFrmPesqTurma(javax.swing.JFrame parent) {
        try {
            initComponents();
            this.parent = parent;
            turmas = ctrCadastroTurma.listarTodos(jComboBox.getSelectedIndex());
            atualizarTabela(turmas);
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
        jButtonAlterar = new javax.swing.JButton();
        jButtonExcluir = new javax.swing.JButton();
        jButtonConsultar = new javax.swing.JButton();
        jButtonFenhar = new javax.swing.JButton();
        jPanel = new javax.swing.JPanel();
        jLabel = new javax.swing.JLabel();
        jComboBox = new javax.swing.JComboBox();
        jSeparator1 = new javax.swing.JSeparator();
        jButtonPesquisa = new javax.swing.JButton();
        jTextFieldPesquisa = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        turmasJTable = new javax.swing.JTable();

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

        jButtonAlterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/sca/resources/propr.png"))); // NOI18N
        jButtonAlterar.setText("Alterar");
        jButtonAlterar.setFocusable(false);
        jButtonAlterar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonAlterar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButtonAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAlterarActionPerformed(evt);
            }
        });
        jToolBar1.add(jButtonAlterar);

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

        jButtonConsultar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/sca/resources/incluirPequeno.png"))); // NOI18N
        jButtonConsultar.setText("Consultar");
        jButtonConsultar.setFocusable(false);
        jButtonConsultar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonConsultar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButtonConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConsultarActionPerformed(evt);
            }
        });
        jToolBar1.add(jButtonConsultar);

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

        jComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Número", "Ano Semestre" }));
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
                .add(jPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jPanelLayout.createSequentialGroup()
                        .add(jLabel)
                        .add(18, 18, 18)
                        .add(jComboBox, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 107, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                    .add(jPanelLayout.createSequentialGroup()
                        .add(jButtonPesquisa)
                        .add(18, 18, 18)
                        .add(jTextFieldPesquisa, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 187, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(69, Short.MAX_VALUE))
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

        turmasJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Número", "Ano Semestre", "Disciplina", "Curso"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(turmasJTable);

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(jToolBar1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .add(layout.createSequentialGroup()
                .add(10, 10, 10)
                .add(jScrollPane3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 484, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jToolBar1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 46, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
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
        boolean ok = (turmasJTable.getRowCount() > 0 );
        jButtonAlterar.setEnabled(ok);
        jButtonExcluir.setEnabled(ok);
        jButtonConsultar.setEnabled(ok);
    }


private void atualizarTabela(List <Turma> turmas) {
        
        //limpa campos jtable
        DefaultTableModel dtmLimpar;
        dtmLimpar = (DefaultTableModel) turmasJTable.getModel();
        dtmLimpar.setNumRows(0);
        
        DefaultTableModel dtm;
        
        for (Turma umaTurma : turmas){
            //Carrega os valores no jTable
            dtm = (DefaultTableModel) turmasJTable.getModel();
            dtm.addRow(new Object[]{ 
                umaTurma.getNumero(), umaTurma.getAnoSemestre(),
                umaTurma.getDisciplina().getDescricao(),umaTurma.getDisciplina().getCurso().getDescricao()});
        }
        turmasJTable.getColumnModel().getColumn(0).setPreferredWidth(80);
        turmasJTable.getColumnModel().getColumn(1).setPreferredWidth(80);
        turmasJTable.getColumnModel().getColumn(2).setPreferredWidth(100);
        turmasJTable.getColumnModel().getColumn(3).setPreferredWidth(100);
        cColuna = turmasJTable.getColumnModel().getColumn(0);
        DefaultTableCellRenderer cAlign = new DefaultTableCellRenderer();
        cAlign.setHorizontalAlignment(JLabel.CENTER);
        cColuna.setCellRenderer(cAlign);
        cAlign = null;
        turmasJTable.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        if (turmasJTable.getRowCount() > 0 )
            turmasJTable.setRowSelectionInterval(0, 0);
        configurarBotoes();
    }


private void jButtonNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNovoActionPerformed
        JFrmTurma jDialogTurma;
        turma = new Turma();
        try{
            jDialogTurma = new JFrmTurma(parent,0, turma);
            jDialogTurma.setLocationRelativeTo(this);
            jDialogTurma.setVisible(true);
            if (jDialogTurma.isSucesso())
            {
                try {
                    turmas = ctrCadastroTurma.listarTodos(jComboBox.getSelectedIndex());
                    atualizarTabela(turmas);
                } catch (ExcecaoSCA ex) {

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
                "Deseja excluir a 'Turma "  +
                turmasJTable.getValueAt(turmasJTable.getSelectedRow(),0) + " Disciplina " +
                turmasJTable.getValueAt(turmasJTable.getSelectedRow(),2) + "'?", "Turmas",
                JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION ) {
            try {
                // TODO add your handling code here:
                turma = new Turma();
                turma.setNumero( (Integer) turmasJTable.getValueAt(turmasJTable.getSelectedRow(),0));
                ctrCadastroTurma.excluir(turma);
                turmas = ctrCadastroTurma.listarTodos(jComboBox.getSelectedIndex());
                atualizarTabela(turmas);
            } catch (ExcecaoSCA ex) {
               JOptionPane.showMessageDialog(null,ex.getMsg(),"Validação",JOptionPane.ERROR_MESSAGE);                            
            }
        }

}//GEN-LAST:event_jButtonExcluirActionPerformed

private void formFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_formFocusGained
        try {
            turmas = ctrCadastroTurma.listarTodos(jComboBox.getSelectedIndex());
            atualizarTabela(turmas);
            /*
            atualizarTabela(medicos);//GEN-LAST:event_formFocusGained
            */
             turmasJTable.requestFocus();
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

private void jButtonAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAlterarActionPerformed
        try {
            // TODO add your handling code here:
            JFrmTurma jDialogTurma;
            turma = new Turma();
            turma.setNumero( (Integer) turmasJTable.getValueAt(turmasJTable.getSelectedRow(),0));
            ctrCadastroTurma.carregar(turma);
            jDialogTurma = new JFrmTurma(parent, 1, turma);
            jDialogTurma.setLocationRelativeTo(this);
            jDialogTurma.setVisible(true);
            if (jDialogTurma.isSucesso()) {
               turmas = ctrCadastroTurma.listarTodos(jComboBox.getSelectedIndex()); 
               atualizarTabela(turmas);
            }
        } catch (ExcecaoSCA ex) {
            JOptionPane.showMessageDialog(null,ex.getMsg(),"Validação",JOptionPane.ERROR_MESSAGE);            
        }
}//GEN-LAST:event_jButtonAlterarActionPerformed

private void jComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxActionPerformed
    try{
        turmas = ctrCadastroTurma.listarTodos(jComboBox.getSelectedIndex());
    } catch (ExcecaoSCA ex) {
        JOptionPane.showMessageDialog(null,ex.getMsg(),"Validação",JOptionPane.ERROR_MESSAGE);
    }

    atualizarTabela(turmas);
}//GEN-LAST:event_jComboBoxActionPerformed

private void jButtonConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConsultarActionPerformed
        try {
            // TODO add your handling code here:
            JFrmTurma jDialogTurma;  
            turma = new Turma();
            turma.setNumero( (Integer) turmasJTable.getValueAt(turmasJTable.getSelectedRow(),0));
            ctrCadastroTurma.carregar(turma);
            jDialogTurma = new JFrmTurma(parent,2, turma);
            jDialogTurma.setLocationRelativeTo(this);
            jDialogTurma.setVisible(true);
           
        } catch (ExcecaoSCA ex) {
            JOptionPane.showMessageDialog(null,ex.getMsg(),"Validação",JOptionPane.ERROR_MESSAGE);            
        }

}//GEN-LAST:event_jButtonConsultarActionPerformed

private void jButtonPesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPesquisaActionPerformed
        if (!(jTextFieldPesquisa.getText().isEmpty()))
        {
          boolean achou = false;   
          for (int i = 0; i < turmasJTable.getModel().getRowCount(); i++){
            if (jTextFieldPesquisa.getText().trim().toUpperCase().equals(turmasJTable.getValueAt(i,jComboBox.getSelectedIndex()).toString().trim().toUpperCase())){
                achou = true;
                turmasJTable.setRowSelectionInterval(i,i);
                turmasJTable.repaint();
                break;
            }
     
          }            
          jTextFieldPesquisa.setText("");
          if (!achou)
          {
            JOptionPane.showMessageDialog(null, "Turma não localizada","Pesquisa", JOptionPane.OK_OPTION);          
          }          
          
        }    

}//GEN-LAST:event_jButtonPesquisaActionPerformed

private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
    // TODO add your handling code here:
}//GEN-LAST:event_formKeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAlterar;
    private javax.swing.JButton jButtonConsultar;
    private javax.swing.JButton jButtonExcluir;
    private javax.swing.JButton jButtonFenhar;
    private javax.swing.JButton jButtonNovo;
    private javax.swing.JButton jButtonPesquisa;
    private javax.swing.JComboBox jComboBox;
    private javax.swing.JLabel jLabel;
    private javax.swing.JPanel jPanel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTextFieldPesquisa;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JTable turmasJTable;
    // End of variables declaration//GEN-END:variables

}
