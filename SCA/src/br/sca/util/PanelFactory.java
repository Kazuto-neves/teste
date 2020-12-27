package br.sca.util;

import br.sca.view.*;

public class PanelFactory {

    public static javax.swing.JPanel getPanel(String titulo, javax.swing.JFrame parent) {
        if (titulo.contentEquals("Cursos")) {
            return new JFrmPesqCurso(parent);
        } else {
        }
        if (titulo.contentEquals("Diciplinas")) {
            return new JFrmPesqDisciplina(parent);
        } else {
        }
        if (titulo.contentEquals("Alunos")) {
            return new JFrmPesqAluno(parent);
        } else {
        }
        if (titulo.contentEquals("Professores")) {
            return new JFrmPesqProfessor(parent);
        } else {
        }
        if (titulo.contentEquals("Turmas")) {
            return new JFrmPesqTurma(parent);
        } else {
        }
        if (titulo.contentEquals("Matricula")) {
            return new JFrmPesqMatricula(parent);
        } else {
            return null;
        }
    }
;
}
