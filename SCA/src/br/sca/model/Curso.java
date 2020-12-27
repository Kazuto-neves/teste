package br.sca.model;

public class Curso {

    private Integer codigo;
    private String decricao;
    private Integer numPeriodos;
    private Integer cargaHoraria;

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getDecricao() {
        return decricao;
    }

    public void setDecricao(String decricao) {
        this.decricao = decricao;
    }

    public Integer getNumPeriodos() {
        return numPeriodos;
    }

    public void setNumPeriodos(Integer numPeriodos) {
        this.numPeriodos = numPeriodos;
    }

    public Integer getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(Integer cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

}
