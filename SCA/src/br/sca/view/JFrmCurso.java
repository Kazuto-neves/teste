/*
 * JFrmCurso.java
 *
 * Created on 10 de Agosto de 2008, 21:48
 */

package br.sca.view;

import br.sca.util.ExcecaoSCA;
import br.sca.controller.CtrCadastroCurso;
import br.sca.model.Curso;
import javax.swing.JOptionPane;


/**
 *
 * @author  Administrador
 */
public class JFrmCurso extends javax.swing.JDialog {
    int operacao;
    private boolean sucesso = false;
    CtrCadastroCurso ctrCadastroCurso = CtrCadastroCurso.getInstance() ;
    Curso curso;
    
    
    /** Creates new form PropCursoJDialog */
    public JFrmCurso(javax.swing.JFrame parent,int operacao, Curso umCurso) {
        
        super(parent,true);
        initComponents();
        this.operacao = operacao;
        curso = umCurso;
                    
        switch (operacao) {
            case 0:
                this.setTitle("Inclusão de curso");
                jTextFieldCodigo.setEditable(true);
                break;
            case 1:
                this.setTitle("Alteração de curso");
                jTextFieldCodigo.setText(curso.getCodigo().toString());
                jTextFieldCargaHoraria.setText(curso.getCargaHoraria().toString() );
                jTextFieldDescricao.setText(curso.getDescricao() );
                jTextFieldNumPeriodos.setText(curso.getNumPeriodos().toString());
                break;
            case 2:
                this.setTitle("Consulta de curso");
                jTextFieldCargaHoraria.setEditable(false);
                jTextFieldDescricao.setEditable(false);
                jTextFieldNumPeriodos.setEditable(false);
                jButtonCancelar.setEnabled(false);
                jTextFieldCodigo.setText(curso.getCodigo().toString());
                jTextFieldCargaHoraria.setText(curso.getCargaHoraria().toString() );
                jTextFieldDescricao.setText(curso.getDescricao() );
                jTextFieldNumPeriodos.setText(curso.getNumPeriodos().toString());
                break;                
        }
        this.getRootPane().setDefaultButton(jButtonOK);
    
   
    }

   
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelSuperior = new javax.swing.JPanel();
        jLabelCodigo = new javax.swing.JLabel();
        jLabelCargaHoraria = new javax.swing.JLabel();
        jLabelDescricao = new javax.swing.JLabel();
        jLabelNumPeriodos = new javax.swing.JLabel();
        jTextFieldCodigo = new javax.swing.JTextField();
        jTextFieldCargaHoraria = new javax.swing.JTextField();
        jTextFieldDescricao = new javax.swing.JTextField();
        jTextFieldNumPeriodos = new javax.swing.JTextField();
        jPanelInferior = new javax.swing.JPanel();
        jButtonOK = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabelCodigo.setText("Código");

        jLabelCargaHoraria.setText("Carga Horária");

        jLabelDescricao.setText("Descrição");

        jLabelNumPeriodos.setText("Número de Períodos");

        jTextFieldCodigo.setEditable(false);

        jTextFieldDescricao.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldDescricaoKeyTyped(evt);
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
                    .add(jLabelNumPeriodos)
                    .add(jLabelDescricao)
                    .add(jLabelCargaHoraria))
                .add(35, 35, 35)
                .add(jPanelSuperiorLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jTextFieldCargaHoraria, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 69, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jTextFieldNumPeriodos, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 69, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jTextFieldCodigo, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 69, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jTextFieldDescricao, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 162, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(110, Short.MAX_VALUE))
        );
        jPanelSuperiorLayout.setVerticalGroup(
            jPanelSuperiorLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanelSuperiorLayout.createSequentialGroup()
                .add(36, 36, 36)
                .add(jPanelSuperiorLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabelCodigo)
                    .add(jTextFieldCodigo, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(jPanelSuperiorLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabelCargaHoraria)
                    .add(jTextFieldCargaHoraria, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(jPanelSuperiorLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabelDescricao)
                    .add(jTextFieldDescricao, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(jPanelSuperiorLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabelNumPeriodos)
                    .add(jTextFieldNumPeriodos, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(111, Short.MAX_VALUE))
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
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .add(jPanelSuperior, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .add(layout.createSequentialGroup()
                .add(10, 10, 10)
                .add(jPanelInferior, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                .add(jPanelSuperior, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanelInferior, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

private void jButtonOKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonOKActionPerformed
        try {
            // TODO add your handling code here:
            
            curso.setCodigo(Integer.parseInt(jTextFieldCodigo.getText()));         
            curso.setCargaHoraria( Integer.valueOf(jTextFieldCargaHoraria.getText()) );
            curso.setDescricao(jTextFieldDescricao.getText());
            curso.setNumPeriodos(Integer.valueOf(jTextFieldNumPeriodos.getText()) );
            switch (operacao) {
                case 0:
   
                    ctrCadastroCurso.incluir(curso);
                    break;
                case 1 :                    
                    ctrCadastroCurso.alterar(curso);
                    break;
            }
            sucesso = true;
            setVisible(false);
        } 
        catch (ExcecaoSCA ex) {
            JOptionPane.showMessageDialog(null,ex.getMsg(),"Validação",JOptionPane.ERROR_MESSAGE);
            jTextFieldDescricao.requestFocus();
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



    /**
    * @param args the command line arguments
    */
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonOK;
    private javax.swing.JLabel jLabelCargaHoraria;
    private javax.swing.JLabel jLabelCodigo;
    private javax.swing.JLabel jLabelDescricao;
    private javax.swing.JLabel jLabelNumPeriodos;
    private javax.swing.JPanel jPanelInferior;
    private javax.swing.JPanel jPanelSuperior;
    private javax.swing.JTextField jTextFieldCargaHoraria;
    private javax.swing.JTextField jTextFieldCodigo;
    private javax.swing.JTextField jTextFieldDescricao;
    private javax.swing.JTextField jTextFieldNumPeriodos;
    // End of variables declaration//GEN-END:variables

 public boolean isSucesso() {
        return sucesso;
    }
}
