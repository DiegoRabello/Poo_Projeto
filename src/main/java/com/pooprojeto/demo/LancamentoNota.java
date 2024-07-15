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
        this.nota1 = 0.0;
        this.nota2 = 0.0;
        this.notaRec = 0.0;
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

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public void setNotaRec(double notaRec) {
        this.notaRec = notaRec;
    }

    public static void verificaLancamentoNotaPorAluno(Aluno aluno) {
        for (int i = 0; i < LancamentoNota.getLancamentoNotas().size(); i++) {
            if (LancamentoNota.getLancamentoNotas().get(i).getAluno().equals(aluno)) {
                System.out.println("Nota já lançada para o aluno " + aluno.getNome());
                return;
            }
        }
    }

    public static void alimentaLancamentoNotas() {
        for (int i = 0; i < Aluno.getAlunos().size(); i++) {
            for (int j = 0; j < Disciplina.getDisciplinas().size(); j++) {
                LancamentoNota lancamentoNota = new LancamentoNota(Aluno.getAlunos().get(i),
                        Disciplina.getDisciplinas().get(j));
            }
        }
        LancamentoNota.getLancamentoNotas().get(0).setNota1(7.0);
        LancamentoNota.getLancamentoNotas().get(1).setNota1(9.0);
        LancamentoNota.getLancamentoNotas().get(2).setNota1(10.0);
        LancamentoNota.getLancamentoNotas().get(3).setNota1(4.0);
        LancamentoNota.getLancamentoNotas().get(4).setNota1(7.0);
        LancamentoNota.getLancamentoNotas().get(5).setNota1(6.0);
        LancamentoNota.getLancamentoNotas().get(6).setNota1(3.0);
        LancamentoNota.getLancamentoNotas().get(7).setNota1(8.0);
        LancamentoNota.getLancamentoNotas().get(8).setNota1(8.0);
        LancamentoNota.getLancamentoNotas().get(9).setNota1(7.0);
        LancamentoNota.getLancamentoNotas().get(0).setNota2(7.0);
        LancamentoNota.getLancamentoNotas().get(1).setNota2(9.0);
        LancamentoNota.getLancamentoNotas().get(2).setNota2(10.0);
        LancamentoNota.getLancamentoNotas().get(3).setNota2(4.0);
        LancamentoNota.getLancamentoNotas().get(4).setNota2(7.0);
        LancamentoNota.getLancamentoNotas().get(5).setNota2(6.0);
        LancamentoNota.getLancamentoNotas().get(6).setNota2(3.0);
        LancamentoNota.getLancamentoNotas().get(7).setNota2(8.0);
        LancamentoNota.getLancamentoNotas().get(8).setNota2(8.0);
        LancamentoNota.getLancamentoNotas().get(9).setNota2(7.0);
    }

}
