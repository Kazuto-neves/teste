/*
 * JDialogEspecialidade.java
 *
 * Created on 10 de Agosto de 2008, 21:48
 */

package br.sca.view;

import br.sca.util.ExcecaoSCA;
import br.sca.controller.*;
import br.sca.model.*;
import br.sca.util.TrataData;
import java.util.List;
import java.util.ResourceBundle;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;


/**
 *
 * @author  Administrador
 */
public class JFrmMatricula extends javax.swing.JDialog {
    int operacao;
    private boolean sucesso = false;
    CtrCadastroMatricula ctrCadastroMatricula = CtrCadastroMatricula.getInstance() ;
    Avaliacao avaliacao;
    CtrCadastroCurso ctrCadastroCurso = CtrCadastroCurso.getInstance() ;
    Curso curso;
    List<Curso> cursos;
    CtrCadastroTurma ctrCadastroTurma = CtrCadastroTurma.getInstance() ;
    Turma turma;
    List<Turma> turmas;
    CtrCadastroAluno ctrCadastroAluno = CtrCadastroAluno.getInstance() ;
    Aluno aluno;
    List<Aluno> alunos;
    private TableColumn  cColuna=null;
    
    
    /** Creates new form PropCursoJDialog */
    public JFrmMatricula(javax.swing.JFrame parent,int operacao) throws ExcecaoSCA{
        
        super(parent,true);
        initComponents();
        this.operacao = operacao;
        
        ResourceBundle prop = ResourceBundle.getBundle("br.sca.utils.anoSemestreAtivo");
        String anoSemestreAtivo = prop.getString("anoSemestre");
        jFormattedTextFieldAnoSemestre.setText(anoSemestreAtivo);
        
        
        try {
            cursos = ctrCadastroCurso.listarTodos(1);
            carregarCursos();
            
        } catch (ExcecaoSCA ex) {
            throw new ExcecaoSCA(ex.getMsg());
        }        
          catch (ArrayIndexOutOfBoundsException ex) {
            JOptionPane.showMessageDialog(null,"Curso é obrigatório.","Validação",JOptionPane.ERROR_MESSAGE);
        }            
        this.setTitle("Inclusão de matrícula");
        
    
        this.getRootPane().setDefaultButton(jButtonOK);
    
   
    }

 private void carregarCursos() throws ExcecaoSCA{
     
       int posicao = 0;
       
       if (cursos.isEmpty())
       {
         throw new ExcecaoSCA("Não existem cursos cadastrados");
       }

       jComboBoxCurso.removeAllItems();
       
      if(!cursos.isEmpty())
      {
       for ( Curso umCurso : cursos ) {
           jComboBoxCurso.addItem(umCurso.getCodigo() + "-" + umCurso.getDescricao());
 
       }
        
       
       jComboBoxCurso.setSelectedIndex(posicao);
       
      }   
    }   
    
  private void carregarAlunos() throws ExcecaoSCA{
     
       int posicao = 0;
       
       if (alunos.isEmpty())
       {
         throw new ExcecaoSCA("Não existem alunos cadastrados para este curso");
       }

       jComboBoxAluno.removeAllItems();
       
      if(!alunos.isEmpty())
      {
       for ( Aluno umAluno : alunos ) {
           jComboBoxAluno.addItem(umAluno.getMatricula() + "-" + umAluno.getNome());
 
       }
        
       
       jComboBoxAluno.setSelectedIndex(posicao);
       
      }   
    }   
  
  private void limparTurmas() {
        //limpa campos jtable
        DefaultTableModel dtmLimpar;
        dtmLimpar = (DefaultTableModel) jTableTurmas.getModel();
        dtmLimpar.setNumRows(0);     
  }    
  
  private void carregarTurmas() {

        
    if(!turmas.isEmpty())
    {  
        DefaultTableModel dtm;
        
        for (Turma umaTurma : turmas){
            //Carrega os valores no jTable
            dtm = (DefaultTableModel) jTableTurmas.getModel();
            dtm.addRow(new Object[]{ 
                umaTurma.getNumero() + "-" + umaTurma.getAnoSemestre() +
                   "-" + umaTurma.getDisciplina().getDescricao()});
        }
        jTableTurmas.getColumnModel().getColumn(0).setPreferredWidth(100);
        cColuna = jTableTurmas.getColumnModel().getColumn(0);
        DefaultTableCellRenderer cAlign = new DefaultTableCellRenderer();
        cAlign.setHorizontalAlignment(JLabel.CENTER);
        cColuna.setCellRenderer(cAlign);
        cAlign = null;
        jTableTurmas.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        if (jTableTurmas.getRowCount() > 0 )
            jTableTurmas.setRowSelectionInterval(0, 0);
       
    }      
    else
    {
     JOptionPane.showMessageDialog(null,"Não existem turmas cadastradas compatíveis com este aluno.","Validação",JOptionPane.ERROR_MESSAGE);  
    }    

}
  
  
  
  
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelSuperior = new javax.swing.JPanel();
        jComboBoxCurso = new javax.swing.JComboBox();
        jLabelCurso = new javax.swing.JLabel();
        jLabelAluno = new javax.swing.JLabel();
        jComboBoxAluno = new javax.swing.JComboBox();
        jLabelTurma = new javax.swing.JLabel();
        jLabelAnoSemestre = new javax.swing.JLabel();
        jFormattedTextFieldAnoSemestre = new javax.swing.JFormattedTextField();
        jButtonTurmas = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableTurmas = new javax.swing.JTable();
        jPanelInferior = new javax.swing.JPanel();
        jButtonOK = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jComboBoxCurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxCursoActionPerformed(evt);
            }
        });

        jLabelCurso.setText("Curso");

        jLabelAluno.setText("Aluno");

        jComboBoxAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxAlunoActionPerformed(evt);
            }
        });

        jLabelTurma.setText("Turmas disponíveis :");

        jLabelAnoSemestre.setText("Ano Semestre");

        jFormattedTextFieldAnoSemestre.setEditable(false);
        try {
            jFormattedTextFieldAnoSemestre.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####-#")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jButtonTurmas.setText("Localizar Turmas");
        jButtonTurmas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonTurmasActionPerformed(evt);
            }
        });

        jTableTurmas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Descrição"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTableTurmas);

        org.jdesktop.layout.GroupLayout jPanelSuperiorLayout = new org.jdesktop.layout.GroupLayout(jPanelSuperior);
        jPanelSuperior.setLayout(jPanelSuperiorLayout);
        jPanelSuperiorLayout.setHorizontalGroup(
            jPanelSuperiorLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanelSuperiorLayout.createSequentialGroup()
                .add(jPanelSuperiorLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jPanelSuperiorLayout.createSequentialGroup()
                        .add(41, 41, 41)
                        .add(jPanelSuperiorLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(jButtonTurmas)
                            .add(jLabelAnoSemestre)
                            .add(jPanelSuperiorLayout.createSequentialGroup()
                                .add(jPanelSuperiorLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                    .add(jLabelAluno)
                                    .add(jLabelCurso))
                                .add(73, 73, 73)
                                .add(jPanelSuperiorLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                                    .add(jComboBoxCurso, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 241, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                    .add(jComboBoxAluno, 0, 308, Short.MAX_VALUE)
                                    .add(jFormattedTextFieldAnoSemestre, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 75, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                            .add(jLabelTurma)))
                    .add(jPanelSuperiorLayout.createSequentialGroup()
                        .add(22, 22, 22)
                        .add(jScrollPane1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 414, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(10, Short.MAX_VALUE))
        );
        jPanelSuperiorLayout.setVerticalGroup(
            jPanelSuperiorLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanelSuperiorLayout.createSequentialGroup()
                .addContainerGap()
                .add(jPanelSuperiorLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jComboBoxCurso, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jLabelCurso))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanelSuperiorLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jPanelSuperiorLayout.createSequentialGroup()
                        .add(31, 31, 31)
                        .add(jPanelSuperiorLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(jLabelAnoSemestre)
                            .add(jFormattedTextFieldAnoSemestre, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                    .add(jPanelSuperiorLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                        .add(jLabelAluno)
                        .add(jComboBoxAluno, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jButtonTurmas)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(jLabelTurma)
                .add(18, 18, 18)
                .add(jScrollPane1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 234, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(41, Short.MAX_VALUE))
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
                .addContainerGap(189, Short.MAX_VALUE))
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
                .addContainerGap()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(layout.createSequentialGroup()
                        .add(jPanelSuperior, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .add(jPanelInferior, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanelSuperior, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(18, 18, 18)
                .add(jPanelInferior, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


private void jButtonOKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonOKActionPerformed
       Boolean ok;
       try {
            for (int i = 0; i < jTableTurmas.getModel().getRowCount(); i++){
             
                 avaliacao = new Avaliacao();
                 avaliacao.setAluno(alunos.get(jComboBoxAluno.getSelectedIndex()));
                 avaliacao.setTurma(turmas.get(i));
                 ctrCadastroMatricula.incluir(avaliacao);
             }  
             
               
            sucesso = true;
            setVisible(false);
        } 
        catch (ExcecaoSCA ex) {
            JOptionPane.showMessageDialog(null,ex.getMsg(),"Validação",JOptionPane.ERROR_MESSAGE);
        }  
               
}//GEN-LAST:event_jButtonOKActionPerformed


private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
         setVisible(false);
}//GEN-LAST:event_jButtonCancelarActionPerformed

private void jButtonCancelarFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jButtonCancelarFocusGained
      this.getRootPane().setDefaultButton(jButtonCancelar);
}//GEN-LAST:event_jButtonCancelarFocusGained

private void jButtonCancelarFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jButtonCancelarFocusLost
      this.getRootPane().setDefaultButton(jButtonOK);
}//GEN-LAST:event_jButtonCancelarFocusLost

private void jComboBoxCursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxCursoActionPerformed
        try {
            limparTurmas();
            alunos = ctrCadastroAluno.listarTodosPorCurso(cursos.get(jComboBoxCurso.getSelectedIndex()),1);
            carregarAlunos();   
        } catch (ExcecaoSCA ex) {
            JOptionPane.showMessageDialog(null,ex.getMsg(),"Validação",JOptionPane.ERROR_MESSAGE);
        }
          catch (ArrayIndexOutOfBoundsException ex) {
            JOptionPane.showMessageDialog(null,"Curso é obrigatório.","Validação",JOptionPane.ERROR_MESSAGE);
        }
            
            
}//GEN-LAST:event_jComboBoxCursoActionPerformed

private void jComboBoxAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxAlunoActionPerformed
            limparTurmas();

}//GEN-LAST:event_jComboBoxAlunoActionPerformed

private void jButtonTurmasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonTurmasActionPerformed
        
        limparTurmas();

        
        try {
           if ((jComboBoxAluno.getSelectedIndex() != -1) && (jFormattedTextFieldAnoSemestre.getText() != null))
           {
             if (!TrataData.AnoSemestreInvalido(jFormattedTextFieldAnoSemestre.getText().replace("-", "")))
             {    
                   turmas = ctrCadastroMatricula.listarTurmasPorAluno(jFormattedTextFieldAnoSemestre.getText().replace("-", ""),alunos.get(jComboBoxAluno.getSelectedIndex()));          
                   carregarTurmas();
     
             }
             else
             {
               JOptionPane.showMessageDialog(null,"Semestre e Ano inválidos.","Validação",JOptionPane.ERROR_MESSAGE);   
             }    
           }  
        } catch (ExcecaoSCA ex) {
            JOptionPane.showMessageDialog(null,ex.getMsg(),"Validação",JOptionPane.ERROR_MESSAGE);
        }
          catch (ArrayIndexOutOfBoundsException ex) {
            JOptionPane.showMessageDialog(null,"Aluno é obrigatório.","Validação",JOptionPane.ERROR_MESSAGE);
        }
}//GEN-LAST:event_jButtonTurmasActionPerformed



    /**
    * @param args the command line arguments
    */
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonOK;
    private javax.swing.JButton jButtonTurmas;
    private javax.swing.JComboBox jComboBoxAluno;
    private javax.swing.JComboBox jComboBoxCurso;
    private javax.swing.JFormattedTextField jFormattedTextFieldAnoSemestre;
    private javax.swing.JLabel jLabelAluno;
    private javax.swing.JLabel jLabelAnoSemestre;
    private javax.swing.JLabel jLabelCurso;
    private javax.swing.JLabel jLabelTurma;
    private javax.swing.JPanel jPanelInferior;
    private javax.swing.JPanel jPanelSuperior;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableTurmas;
    // End of variables declaration//GEN-END:variables

 public boolean isSucesso() {
        return sucesso;
    }
}
