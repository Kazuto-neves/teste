package br.sca.model;

public class Avaliacao {

    private Aluno aluno;
    private Turma turma;
    private Float npc1;
    private Float npc2;
    private Float nef;
    private Integer freq;
    private Float seqCham;
    private String resultado;

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public Turma getTurma() {
        return turma;
    }

    public void setTurma(Turma turma) {
        this.turma = turma;
    }

    public float getNpc1() {
        return npc1;
    }

    public void setNpc1(Float npc1) {
        this.npc1 = npc1;
    }

    public float getNpc2() {
        return npc2;
    }

    public void setNpc2(Float npc2) {
        this.npc2 = npc2;
    }

    public float getNef() {
        return nef;
    }

    public void setNef(Float nef) {
        this.nef = nef;
    }

    public Integer getFreq() {
        return freq;
    }

    public void setFreq(Integer freq) {
        this.freq = freq;
    }

    public float getSeqCham() {
        return seqCham;
    }

    public void setSeqCham(Float seqCham) {
        this.seqCham = seqCham;
    }

    public String getResultado() {
        return resultado;
    }

    public void setResultado(String resultado) {
        this.resultado = resultado;
    }

    public Avaliacao() {
        npc1 = new Float(0);
        npc2 = new Float(0);
        nef = new Float(0);
        freq = new Integer(0);
        seqCham = new Float(0);
    }
}
