package com.pooprojeto.demo;

import java.util.ArrayList;

public class LancamentoNota {
    // Atributos Estáticos
    private static ArrayList<LancamentoNota> lancamentoNotas = new ArrayList<LancamentoNota>();
    private static int contadorLancamentoNota = 0;

    // Atributos 
    private int lancamentoNotaID;
    private Aluno aluno;
    private double nota1, nota2, notaRec;
    private Disciplina disciplina;

    // Construtor
    public LancamentoNota(Aluno aluno, Disciplina disciplina) {
        this.lancamentoNotaID = contadorLancamentoNota++;
        this.aluno = aluno;
        this.disciplina = disciplina;
        lancamentoNotas.add(this);
    }

    public LancamentoNota(Aluno aluno, Disciplina disciplina, double nota1, double nota2, double notaRec) {
        this.lancamentoNotaID = contadorLancamentoNota++;
        this.aluno = aluno;
        this.disciplina = disciplina;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.notaRec = notaRec;
        lancamentoNotas.add(this);
    }

    public static ArrayList<LancamentoNota> getLancamentoNotas() {
        return lancamentoNotas;
    }
    public static int getContadorLancamentoNota() {
        return contadorLancamentoNota;
    }
    public int getLancamentoNotaID() {
        return lancamentoNotaID;
    }
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
    public Disciplina getDisciplina() {
        return disciplina;
    }

}

    