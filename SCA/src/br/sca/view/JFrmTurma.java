/*
 * JDialogEspecialidade.java
 *
 * Created on 10 de Agosto de 2008, 21:48
 */

package br.sca.view;

import br.sca.util.ExcecaoSCA;
import br.sca.controller.*;
import br.sca.model.*;
import java.util.List;
import java.util.ResourceBundle;
import javax.swing.JOptionPane;


/**
 *
 * @author  Administrador
 */
public class JFrmTurma extends javax.swing.JDialog {
    int operacao;
    private boolean sucesso = false;
    CtrCadastroTurma ctrCadastroTurma = CtrCadastroTurma.getInstance() ;
    Turma turma;
    CtrCadastroDisciplina ctrCadastroDisciplina = CtrCadastroDisciplina.getInstance() ;
    CtrCadastroProfessor ctrCadastroProfessor = CtrCadastroProfessor.getInstance() ;
    CtrCadastroCurso ctrCadastroCurso = CtrCadastroCurso.getInstance() ;
    Disciplina discipliba;
    List<Disciplina> disciplinas;
    Professor professor;
    List<Professor> professores;
    Curso curso;
    List<Curso> cursos;
    
    
    /** Creates new form PropCursoJDialog */
    public JFrmTurma(javax.swing.JFrame parent,int operacao, Turma umaTurma) throws ExcecaoSCA{
        
        super(parent,true);
        initComponents();
        this.operacao = operacao;
        turma = umaTurma;
        
        try {
            
            cursos = ctrCadastroCurso.listarTodos(1);
            carregarCursos();
            
            professores = ctrCadastroProfessor.listarTodos(1);
            carregarProfessores();
            
        } catch (ExcecaoSCA ex) {
            throw new ExcecaoSCA(ex.getMsg());
        }
          catch (ArrayIndexOutOfBoundsException ex) {
            JOptionPane.showMessageDialog(null,"Curso é obrigatório.","Validação",JOptionPane.ERROR_MESSAGE);
        }
                    
        switch (operacao) {
            case 0:
                this.setTitle("Inclusão de turma");
                jTextFieldNumero.setEditable(true);
                 ResourceBundle prop = ResourceBundle.getBundle("br.sca.utils.anoSemestreAtivo");
                 String anoSemestreAtivo = prop.getString("anoSemestre");
                 jFormattedTextFieldAnoSemestre.setText(anoSemestreAtivo);
                break;
            case 1:
                this.setTitle("Alteração de turma");
                jTextFieldNumero.setText(turma.getNumero().toString());
                jFormattedTextFieldAnoSemestre.setText(turma.getAnoSemestre() );
                jFormattedTextFieldAnoSemestre.setEditable(false);
                jComboBoxDisciplina.setEnabled(false);
                jComboBoxCurso.setEnabled(false);
                break;
            case 2:
                this.setTitle("Consulta de turma");
                jFormattedTextFieldAnoSemestre.setEditable(false);
                jButtonCancelar.setEnabled(false);
                jComboBoxDisciplina.setEnabled(false);
                jComboBoxCurso.setEnabled(false);
                jComboBoxProfessor.setEnabled(false);
                jTextFieldNumero.setText(turma.getNumero().toString());
                jFormattedTextFieldAnoSemestre.setText(turma.getAnoSemestre() );
                break;                
        }
        this.getRootPane().setDefaultButton(jButtonOK);
    
   
    }

 private void carregarDisciplinas() throws ExcecaoSCA{
     
       int posicao = 0;
       
       if (disciplinas.isEmpty())
       {
         throw new ExcecaoSCA("Não existem disciplinas cadastradas para este curso");
       }

       jComboBoxDisciplina.removeAllItems();
       
       int i = 0;
       if (!disciplinas.isEmpty())
       {    
        for ( Disciplina umaDisciplina : disciplinas ) {
           jComboBoxDisciplina.addItem(umaDisciplina.getCodigo() + "-" + umaDisciplina.getDescricao());
           
           
           
           if (operacao != 0)
           {
             if (turma.getDisciplina().getCodigo().intValue() == umaDisciplina.getCodigo().intValue())
             {
                posicao = i;             
             }  
           }
           i++;
           
       
        }
        
        
       
        jComboBoxDisciplina.setSelectedIndex(posicao);
       }
         
    }   
 
 
 private void carregarProfessores() throws ExcecaoSCA{
     
       int posicao = 0;

       if (professores.isEmpty())
       {
         throw new ExcecaoSCA("Não existem professores cadastrados");
       }
       
       jComboBoxProfessor.removeAllItems();
       
       int i = 0;
       if (!professores.isEmpty())
       {
        for ( Professor umProfessor : professores ) {
           jComboBoxProfessor.addItem(umProfessor.getMatricula() + "-" + umProfessor.getNome());
          
           if (operacao != 0)
           {
             
             if (turma.getProfessor().getMatricula().intValue() == umProfessor.getMatricula().intValue())
             {
                posicao = i;             
             }  
           }
           i++;
           
        }
        
       
        jComboBoxProfessor.setSelectedIndex(posicao);
       }
         
    }
    
 private void carregarCursos() throws ExcecaoSCA{

       int posicao = 0;

       if (cursos.isEmpty())
       {
         throw new ExcecaoSCA("Não existem cursos cadastrados");
       }
       
       jComboBoxCurso.removeAllItems();
       
       int i = 0;
       
       if(!cursos.isEmpty())
       {    
        for ( Curso umCurso : cursos ) {
           jComboBoxCurso.addItem(umCurso.getCodigo() + "-" + umCurso.getDescricao());
           
           
           if (operacao != 0)
           {
             if (turma.getDisciplina().getCurso().getCodigo().intValue() == umCurso.getCodigo().intValue())
             {
                posicao = i;             
             }  
           }
           i++;
           
        }
        
       
        jComboBoxCurso.setSelectedIndex(posicao);
       } 
         
    }

 
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelSuperior = new javax.swing.JPanel();
        jLabelNumero = new javax.swing.JLabel();
        jLabelAnoSemestre = new javax.swing.JLabel();
        jTextFieldNumero = new javax.swing.JTextField();
        jComboBoxProfessor = new javax.swing.JComboBox();
        jLabelProfessor = new javax.swing.JLabel();
        jFormattedTextFieldAnoSemestre = new javax.swing.JFormattedTextField();
        jLabelDisciplina = new javax.swing.JLabel();
        jComboBoxDisciplina = new javax.swing.JComboBox();
        jLabelCurso = new javax.swing.JLabel();
        jComboBoxCurso = new javax.swing.JComboBox();
        jPanelInferior = new javax.swing.JPanel();
        jButtonOK = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabelNumero.setText("Número");

        jLabelAnoSemestre.setText("Ano Semestre");

        jTextFieldNumero.setEditable(false);

        jLabelProfessor.setText("Professor");

        jFormattedTextFieldAnoSemestre.setEditable(false);
        try {
            jFormattedTextFieldAnoSemestre.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####-#")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabelDisciplina.setText("Disciplina");

        jLabelCurso.setText("Curso");

        jComboBoxCurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxCursoActionPerformed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout jPanelSuperiorLayout = new org.jdesktop.layout.GroupLayout(jPanelSuperior);
        jPanelSuperior.setLayout(jPanelSuperiorLayout);
        jPanelSuperiorLayout.setHorizontalGroup(
            jPanelSuperiorLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanelSuperiorLayout.createSequentialGroup()
                .add(31, 31, 31)
                .add(jPanelSuperiorLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jPanelSuperiorLayout.createSequentialGroup()
                        .add(jPanelSuperiorLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(jLabelNumero)
                            .add(jLabelAnoSemestre))
                        .add(39, 39, 39)
                        .add(jPanelSuperiorLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING, false)
                            .add(org.jdesktop.layout.GroupLayout.LEADING, jFormattedTextFieldAnoSemestre)
                            .add(org.jdesktop.layout.GroupLayout.LEADING, jTextFieldNumero, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 69, Short.MAX_VALUE))
                        .add(186, 186, 186))
                    .add(jPanelSuperiorLayout.createSequentialGroup()
                        .add(jPanelSuperiorLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(jLabelDisciplina)
                            .add(jLabelProfessor)
                            .add(jLabelCurso))
                        .add(36, 36, 36)
                        .add(jPanelSuperiorLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(jComboBoxCurso, 0, 279, Short.MAX_VALUE)
                            .add(jComboBoxProfessor, 0, 279, Short.MAX_VALUE)
                            .add(jComboBoxDisciplina, 0, 279, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanelSuperiorLayout.setVerticalGroup(
            jPanelSuperiorLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanelSuperiorLayout.createSequentialGroup()
                .add(36, 36, 36)
                .add(jPanelSuperiorLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabelNumero)
                    .add(jTextFieldNumero, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(18, 18, 18)
                .add(jPanelSuperiorLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabelAnoSemestre)
                    .add(jFormattedTextFieldAnoSemestre, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(18, 18, 18)
                .add(jPanelSuperiorLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabelCurso)
                    .add(jComboBoxCurso, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(jPanelSuperiorLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabelDisciplina)
                    .add(jComboBoxDisciplina, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(13, 13, 13)
                .add(jPanelSuperiorLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabelProfessor)
                    .add(jComboBoxProfessor, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(51, Short.MAX_VALUE))
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
                .addContainerGap(78, Short.MAX_VALUE))
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
                .add(10, 10, 10)
                .add(jPanelInferior, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanelSuperior, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanelSuperior, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanelInferior, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

private void jButtonOKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonOKActionPerformed
        try {
            // TODO add your handling code here:
            
            turma.setNumero(Integer.parseInt(jTextFieldNumero.getText()));         
            turma.setAnoSemestre(jFormattedTextFieldAnoSemestre.getText().replace("-", ""));
            
            turma.setDisciplina(disciplinas.get(jComboBoxDisciplina.getSelectedIndex()));
            turma.setProfessor(professores.get(jComboBoxProfessor.getSelectedIndex()));
            
            
            switch (operacao) {
                case 0:
   
                    ctrCadastroTurma.incluir(turma);
                    break;
                case 1 :                    
                    ctrCadastroTurma.alterar(turma);
                    break;
            }
            sucesso = true;
            setVisible(false);
        } 
        catch (ExcecaoSCA ex) {
            JOptionPane.showMessageDialog(null,ex.getMsg(),"Validação",JOptionPane.ERROR_MESSAGE);
            jTextFieldNumero.requestFocus();
        }
        catch (ArrayIndexOutOfBoundsException ex) {
            JOptionPane.showMessageDialog(null,"Curso, disciplina e professor são obrigatórios.","Validação",JOptionPane.ERROR_MESSAGE);
            jTextFieldNumero.requestFocus();
        }        
        catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null,"Valor inválido.","Validação",JOptionPane.ERROR_MESSAGE);
            jTextFieldNumero.requestFocus();
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
            disciplinas = ctrCadastroDisciplina.listarTodosPorCurso(cursos.get(jComboBoxCurso.getSelectedIndex()), 1);
            carregarDisciplinas();
        }catch (ExcecaoSCA ex) {
            JOptionPane.showMessageDialog(null,ex.getMsg(),"Validação",JOptionPane.ERROR_MESSAGE);
            jFormattedTextFieldAnoSemestre.requestFocus();
        }
         catch (ArrayIndexOutOfBoundsException ex) {
            JOptionPane.showMessageDialog(null,"Curso é obrigatório.","Validação",JOptionPane.ERROR_MESSAGE);
        }
            
}//GEN-LAST:event_jComboBoxCursoActionPerformed



    /**
    * @param args the command line arguments
    */
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonOK;
    private javax.swing.JComboBox jComboBoxCurso;
    private javax.swing.JComboBox jComboBoxDisciplina;
    private javax.swing.JComboBox jComboBoxProfessor;
    private javax.swing.JFormattedTextField jFormattedTextFieldAnoSemestre;
    private javax.swing.JLabel jLabelAnoSemestre;
    private javax.swing.JLabel jLabelCurso;
    private javax.swing.JLabel jLabelDisciplina;
    private javax.swing.JLabel jLabelNumero;
    private javax.swing.JLabel jLabelProfessor;
    private javax.swing.JPanel jPanelInferior;
    private javax.swing.JPanel jPanelSuperior;
    private javax.swing.JTextField jTextFieldNumero;
    // End of variables declaration//GEN-END:variables

 public boolean isSucesso() {
        return sucesso;
    }
}
