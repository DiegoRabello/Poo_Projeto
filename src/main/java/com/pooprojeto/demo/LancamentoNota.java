package com.pooprojeto.demo;

import java.util.ArrayList;

public class LancamentoNota {

    private static int contadorLancamentoNota = 1;
    private int lancamentoNotaID;
    private TurmaDisciplina turmaDisciplina;
    private Professor professor;
    private Aluno aluno;
    private double nota1, nota2, notaRec;
    private double media = nota1 + nota2;

    // constructor
    public LancamentoNota() {

    }

    public LancamentoNota(TurmaDisciplina turmaDisciplina, Professor professor, Aluno aluno) {
        this.turmaDisciplina = turmaDisciplina;
        this.professor = professor;
        lancamentoNotaID = contadorLancamentoNota;
        contadorLancamentoNota++;
    }

    // setters
    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public void setNotaRec(double notaRec) {
        this.notaRec = notaRec;
    }

    public void setMedia(double media) {
        this.media = media;
    }

    // getters
    public Aluno getAluno() {
        return aluno;
    }

    public double getNota1() {
        return nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public double getNotaRec() {
        return notaRec;
    }

    public double getMedia() {
        return media;
    }

    public boolean aprovadoOuNao() {
        return this.media >= 6.0;
    }

    public boolean recuperacao() {
        return this.notaRec >= 6;
    }
}
