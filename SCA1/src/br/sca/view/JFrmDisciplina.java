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
import javax.swing.JOptionPane;


/**
 *
 * @author  Administrador
 */
public class JFrmDisciplina extends javax.swing.JDialog {
    int operacao;
    private boolean sucesso = false;
    CtrCadastroDisciplina ctrCadastroDisciplina = CtrCadastroDisciplina.getInstance() ;
    Disciplina disciplina;
    CtrCadastroCurso ctrCadastroCurso = CtrCadastroCurso.getInstance() ;
    Curso curso;
    List<Curso> cursos;
    
    
    /** Creates new form PropCursoJDialog */
    public JFrmDisciplina(javax.swing.JFrame parent,int operacao, Disciplina umaDisciplina) throws ExcecaoSCA{
        
        super(parent,true);
        initComponents();
        this.operacao = operacao;
        disciplina = umaDisciplina;
        
        try {
            cursos = ctrCadastroCurso.listarTodos(1);
            carregarCursos();
        } catch (ExcecaoSCA ex) {
            throw new ExcecaoSCA(ex.getMsg());
        }        
                    
        switch (operacao) {
            case 0:
                this.setTitle("Inclusão de disciplina");
                jTextFieldCodigo.setEditable(true);
                break;
            case 1:
                this.setTitle("Alteração de disciplina");
                jTextFieldCodigo.setText(disciplina.getCodigo().toString());
                jTextFieldDescricao.setText(disciplina.getDescricao() );
                jTextFieldPeriodo.setText(disciplina.getPeriodo() );
                jTextFieldCargaHoraria.setText(disciplina.getCargaHoraria().toString());
                jTextFieldPeriodo.setEditable(false);
                jComboBoxCurso.setEnabled(false);
                break;
            case 2:
                this.setTitle("Consulta de disciplina");
                jTextFieldDescricao.setEditable(false);
                jTextFieldPeriodo.setEditable(false);
                jTextFieldCargaHoraria.setEditable(false);
                jButtonCancelar.setEnabled(false);
                jComboBoxCurso.setEnabled(false);
                jTextFieldCodigo.setText(disciplina.getCodigo().toString());
                jTextFieldDescricao.setText(disciplina.getDescricao() );
                jTextFieldPeriodo.setText(disciplina.getPeriodo() );
                jTextFieldCargaHoraria.setText(disciplina.getCargaHoraria().toString());
                break;                
        }
        this.getRootPane().setDefaultButton(jButtonOK);
    
   
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
             
             if (disciplina.getCurso().getCodigo().intValue() == umCurso.getCodigo().intValue())
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
        jLabelCodigo = new javax.swing.JLabel();
        jLabelDescricao = new javax.swing.JLabel();
        jTextFieldCodigo = new javax.swing.JTextField();
        jTextFieldDescricao = new javax.swing.JTextField();
        jComboBoxCurso = new javax.swing.JComboBox();
        jLabelCurso = new javax.swing.JLabel();
        jLabelPeriodo = new javax.swing.JLabel();
        jTextFieldPeriodo = new javax.swing.JTextField();
        jLabelCargaHoraria = new javax.swing.JLabel();
        jTextFieldCargaHoraria = new javax.swing.JTextField();
        jPanelInferior = new javax.swing.JPanel();
        jButtonOK = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabelCodigo.setText("Código");

        jLabelDescricao.setText("Descrição");

        jTextFieldCodigo.setEditable(false);

        jTextFieldDescricao.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldDescricaoKeyTyped(evt);
            }
        });

        jLabelCurso.setText("Curso");

        jLabelPeriodo.setText("Período");

        jTextFieldPeriodo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldPeriodoKeyTyped(evt);
            }
        });

        jLabelCargaHoraria.setText("Carga Horária");

        jTextFieldCargaHoraria.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldCargaHorariaKeyTyped(evt);
            }
        });

        org.jdesktop.layout.GroupLayout jPanelSuperiorLayout = new org.jdesktop.layout.GroupLayout(jPanelSuperior);
        jPanelSuperior.setLayout(jPanelSuperiorLayout);
        jPanelSuperiorLayout.setHorizontalGroup(
            jPanelSuperiorLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanelSuperiorLayout.createSequentialGroup()
                .add(31, 31, 31)
                .add(jPanelSuperiorLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jLabelCodigo)
                    .add(jLabelDescricao)
                    .add(jLabelPeriodo)
                    .add(jLabelCargaHoraria)
                    .add(jLabelCurso))
                .add(63, 63, 63)
                .add(jPanelSuperiorLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jComboBoxCurso, 0, 262, Short.MAX_VALUE)
                    .add(jTextFieldCargaHoraria, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 38, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jTextFieldPeriodo, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 23, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jTextFieldCodigo, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 69, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jTextFieldDescricao, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 214, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanelSuperiorLayout.setVerticalGroup(
            jPanelSuperiorLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanelSuperiorLayout.createSequentialGroup()
                .add(36, 36, 36)
                .add(jPanelSuperiorLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabelCodigo)
                    .add(jTextFieldCodigo, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(18, 18, 18)
                .add(jPanelSuperiorLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabelDescricao)
                    .add(jTextFieldDescricao, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(18, 18, 18)
                .add(jPanelSuperiorLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabelPeriodo)
                    .add(jTextFieldPeriodo, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(18, 18, 18)
                .add(jPanelSuperiorLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabelCargaHoraria)
                    .add(jTextFieldCargaHoraria, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(18, 18, 18)
                .add(jPanelSuperiorLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabelCurso)
                    .add(jComboBoxCurso, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(39, Short.MAX_VALUE))
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
                .addContainerGap(122, Short.MAX_VALUE))
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
                .addContainerGap(28, Short.MAX_VALUE))
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
            
            disciplina.setCodigo(Integer.parseInt(jTextFieldCodigo.getText()));         
            disciplina.setDescricao(jTextFieldDescricao.getText());
            disciplina.setPeriodo(jTextFieldPeriodo.getText());
            disciplina.setCargaHoraria(Integer.parseInt(jTextFieldCargaHoraria.getText()));         
            disciplina.setCurso(cursos.get(jComboBoxCurso.getSelectedIndex()));
            
            
            switch (operacao) {
                case 0:
   
                    ctrCadastroDisciplina.incluir(disciplina);
                    break;
                case 1 :                    
                    ctrCadastroDisciplina.alterar(disciplina);
                    break;
            }
            sucesso = true;
            setVisible(false);
        } 
        catch (ExcecaoSCA ex) {
            JOptionPane.showMessageDialog(null,ex.getMsg(),"Validação",JOptionPane.ERROR_MESSAGE);
            jTextFieldDescricao.requestFocus();
        }
        catch (ArrayIndexOutOfBoundsException ex) {
            JOptionPane.showMessageDialog(null,"Curso é obrigatório.","Validação",JOptionPane.ERROR_MESSAGE);
            jTextFieldCodigo.requestFocus();
        }        
        catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null,"Valor inválido.","Validação",JOptionPane.ERROR_MESSAGE);
            jTextFieldCodigo.requestFocus();
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

private void jTextFieldDescricaoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldDescricaoKeyTyped

}//GEN-LAST:event_jTextFieldDescricaoKeyTyped

private void jTextFieldPeriodoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldPeriodoKeyTyped
// TODO add your handling code here:
}//GEN-LAST:event_jTextFieldPeriodoKeyTyped

private void jTextFieldCargaHorariaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldCargaHorariaKeyTyped
// TODO add your handling code here:
}//GEN-LAST:event_jTextFieldCargaHorariaKeyTyped



    /**
    * @param args the command line arguments
    */
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonOK;
    private javax.swing.JComboBox jComboBoxCurso;
    private javax.swing.JLabel jLabelCargaHoraria;
    private javax.swing.JLabel jLabelCodigo;
    private javax.swing.JLabel jLabelCurso;
    private javax.swing.JLabel jLabelDescricao;
    private javax.swing.JLabel jLabelPeriodo;
    private javax.swing.JPanel jPanelInferior;
    private javax.swing.JPanel jPanelSuperior;
    private javax.swing.JTextField jTextFieldCargaHoraria;
    private javax.swing.JTextField jTextFieldCodigo;
    private javax.swing.JTextField jTextFieldDescricao;
    private javax.swing.JTextField jTextFieldPeriodo;
    // End of variables declaration//GEN-END:variables

 public boolean isSucesso() {
        return sucesso;
    }
}
