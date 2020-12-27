package br.sca.model;

public class Aluno extends Pessoa {

    private Integer matricula;
    private String anoSemestreInicio;
    private Curso curso;

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public Integer getMatricula() {
        return matricula;
    }

    public void setMatricula(Integer matricula) {
        this.matricula = matricula;
    }

    public String getAnoSemestreInicio() {
        return anoSemestreInicio;
    }

    public void setAnoSemestreInicio(String anoSemestreInicio) {
        this.anoSemestreInicio = anoSemestreInicio;
    }

}
