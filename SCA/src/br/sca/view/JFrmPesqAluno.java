/*
 * JFrmPesqCurso.java
 *
 * Created on 10 de Agosto de 2008, 21:22
 */

package br.sca.view;

import br.sca.util.ExcecaoSCA;
import br.sca.controller.CtrCadastroAluno;
import br.sca.model.Aluno;
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
public class JFrmPesqAluno extends javax.swing.JPanel {

    CtrCadastroAluno ctrCadastroAluno = CtrCadastroAluno.getInstance();
    Aluno aluno;
    List<Aluno> alunos;
    private TableColumn  cColuna=null;
    private javax.swing.JFrame parent;
    
    /** Creates new form CursoJPanel */
    public JFrmPesqAluno(javax.swing.JFrame parent) {
        try {
            initComponents();
            this.parent = parent;
            alunos = ctrCadastroAluno.listarTodos(jComboBox.getSelectedIndex());
            atualizarTabela(alunos);
        } catch (ExcecaoSCA ex) {
             JOptionPane.showMessageDialog(null,ex.getMsg(),"Validação",JOptionPane.ERROR_MESSAGE);             
        }
}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
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
        jScrollPane2 = new javax.swing.JScrollPane();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTableAluno = new javax.swing.JTable();

        addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                formFocusGained(evt);
            }
        });
        addKeyListener(new java.awt.event.KeyAdapter() {
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

        jComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Matrícula", "Nome" }));
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
                        .add(jButtonPesquisa)
                        .add(18, 18, 18)
                        .add(jTextFieldPesquisa, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 159, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                    .add(jPanelLayout.createSequentialGroup()
                        .add(jLabel)
                        .add(18, 18, 18)
                        .add(jComboBox, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 87, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(345, Short.MAX_VALUE))
        );
        jPanelLayout.setVerticalGroup(
            jPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanelLayout.createSequentialGroup()
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .add(jPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel)
                    .add(jComboBox, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(18, 18, 18)
                .add(jPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jButtonPesquisa)
                    .add(jTextFieldPesquisa, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(33, 33, 33))
            .add(jPanelLayout.createSequentialGroup()
                .add(jSeparator1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 74, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTableAluno.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Matrícula", "Nome", "Curso"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableAluno.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableAlunoMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jTableAluno);

        jScrollPane2.setViewportView(jScrollPane3);

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(jToolBar1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(jPanel, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .add(layout.createSequentialGroup()
                .add(24, 24, 24)
                .add(jScrollPane2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 554, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jToolBar1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 46, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jPanel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 77, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(17, 17, 17)
                .add(jScrollPane2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 154, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(269, Short.MAX_VALUE))
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
        boolean ok = (jTableAluno.getRowCount() > 0 );
        jButtonAlterar.setEnabled(ok);
        jButtonExcluir.setEnabled(ok);
        jButtonConsultar.setEnabled(ok);
    }


private void atualizarTabela(List <Aluno> alunos) {
        
        //limpa campos jtable
        DefaultTableModel dtmLimpar;
        dtmLimpar = (DefaultTableModel) jTableAluno.getModel();
        dtmLimpar.setNumRows(0);
        
        DefaultTableModel dtm;
        
        for (Aluno umAluno : alunos){
            //Carrega os valores no jTable
            dtm = (DefaultTableModel) jTableAluno.getModel();
            dtm.addRow(new Object[]{ 
                umAluno.getMatricula(),umAluno.getNome(),
                umAluno.getCurso().getDescricao()});
        }
        jTableAluno.getColumnModel().getColumn(0).setPreferredWidth(80);
        jTableAluno.getColumnModel().getColumn(1).setPreferredWidth(100);
        jTableAluno.getColumnModel().getColumn(2).setPreferredWidth(100);
        cColuna = jTableAluno.getColumnModel().getColumn(0);
        DefaultTableCellRenderer cAlign = new DefaultTableCellRenderer();
        cAlign.setHorizontalAlignment(JLabel.CENTER);
        cColuna.setCellRenderer(cAlign);
        cAlign = null;
        jTableAluno.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        if (jTableAluno.getRowCount() > 0 )
            jTableAluno.setRowSelectionInterval(0, 0);
        configurarBotoes();
}


private void jButtonNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNovoActionPerformed
        JFrmAluno jDialogAluno;                                           
        
        
        aluno = new Aluno();
        try{
            jDialogAluno = new JFrmAluno(parent,0, aluno);
            jDialogAluno.setLocationRelativeTo(this);
            jDialogAluno.setVisible(true);
            if (jDialogAluno.isSucesso())
            {
                try {
                    alunos = ctrCadastroAluno.listarTodos(jComboBox.getSelectedIndex());
                    atualizarTabela(alunos);
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
                "Deseja excluir o aluno '"  +
                jTableAluno.getValueAt(jTableAluno.getSelectedRow(),1) +
                "'?", "Alunos",
                JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION ) {
            try {
                // TODO add your handling code here:
                aluno = new Aluno();
                aluno.setMatricula( (Integer) jTableAluno.getValueAt(jTableAluno.getSelectedRow(),0));
                ctrCadastroAluno.excluir(aluno);
                alunos = ctrCadastroAluno.listarTodos(jComboBox.getSelectedIndex());
                atualizarTabela(alunos);
            } catch (ExcecaoSCA ex) {
                 JOptionPane.showMessageDialog(null,ex.getMsg(),"Validação",JOptionPane.ERROR_MESSAGE);             
            }
        }
}//GEN-LAST:event_jButtonExcluirActionPerformed

private void formFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_formFocusGained
    jTableAluno.requestFocus();
}//GEN-LAST:event_formFocusGained

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
            JFrmAluno jDialogAluno;  
            aluno = new Aluno();
            aluno.setMatricula( (Integer) jTableAluno.getValueAt(jTableAluno.getSelectedRow(),0));
            ctrCadastroAluno.carregar(aluno);
            jDialogAluno = new JFrmAluno(parent,1, aluno);
            jDialogAluno.setLocationRelativeTo(this);
            jDialogAluno.setVisible(true);
            if (jDialogAluno.isSucesso()) {
               // jTableCurso.setValueAt((Object) curso.getDescricao(),jTableCurso.getSelectedRow(),1);
                alunos = ctrCadastroAluno.listarTodos(jComboBox.getSelectedIndex());
                atualizarTabela(alunos);
            }
        } catch (ExcecaoSCA ex) {
            JOptionPane.showMessageDialog(null,ex.getMsg(),"Validação",JOptionPane.ERROR_MESSAGE);            
        }
}//GEN-LAST:event_jButtonAlterarActionPerformed

private void jComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxActionPerformed
  try {
    alunos = ctrCadastroAluno.listarTodos(jComboBox.getSelectedIndex());
    atualizarTabela(alunos);
  } catch (ExcecaoSCA ex) {
            JOptionPane.showMessageDialog(null,ex.getMsg(),"Validação",JOptionPane.ERROR_MESSAGE);
  }
}//GEN-LAST:event_jComboBoxActionPerformed

private void jButtonConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConsultarActionPerformed
        try {
            // TODO add your handling code here:
            JFrmAluno jDialogAluno;  
            aluno = new Aluno();
            aluno.setMatricula( (Integer) jTableAluno.getValueAt(jTableAluno.getSelectedRow(),0));
            ctrCadastroAluno.carregar(aluno);
            jDialogAluno = new JFrmAluno(parent,2, aluno);
            jDialogAluno.setLocationRelativeTo(this);
            jDialogAluno.setVisible(true);
           
        } catch (ExcecaoSCA ex) {
            JOptionPane.showMessageDialog(null,ex.getMsg(),"Validação",JOptionPane.ERROR_MESSAGE);            
        }

}//GEN-LAST:event_jButtonConsultarActionPerformed

private void jButtonPesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPesquisaActionPerformed
        if (!(jTextFieldPesquisa.getText().isEmpty()))
        {
          boolean achou = false;   
          for (int i = 0; i < jTableAluno.getModel().getRowCount(); i++){
            if (jTextFieldPesquisa.getText().trim().toUpperCase().equals(jTableAluno.getValueAt(i,jComboBox.getSelectedIndex()).toString().trim().toUpperCase())){
                achou = true;
                jTableAluno.setRowSelectionInterval(i,i);
                jTableAluno.repaint();
                break;
            }
     
          }            
          jTextFieldPesquisa.setText("");
          if (!achou)
          {
            JOptionPane.showMessageDialog(null, "Aluno não localizado","Pesquisa", JOptionPane.OK_OPTION);          
          }          
          
        }    
        

}//GEN-LAST:event_jButtonPesquisaActionPerformed

private void jTableAlunoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableAlunoMouseClicked
// TODO add your handling code here:
}//GEN-LAST:event_jTableAlunoMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
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
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTableAluno;
    private javax.swing.JTextField jTextFieldPesquisa;
    private javax.swing.JToolBar jToolBar1;
    // End of variables declaration//GEN-END:variables

}
