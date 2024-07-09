package com.pooprojeto.demo;

public class TurmaDisciplina {

    private static int contadorTurmaDisciplina = 1;
    private int turmaDisciplinaID;
    private Turma turma;
    private Disciplina disciplina;
    private Professor professor;
    private Aluno aluno;

    public TurmaDisciplina(Turma turma, Disciplina disciplina) {
        this.turma = turma;
        this.disciplina = disciplina;
        turmaDisciplinaID = contadorTurmaDisciplina;
        contadorTurmaDisciplina++;
    }

    public int getTurmaDisciplinaID() {
        return turmaDisciplinaID;
    }

    public void setTurmaDisciplinaID(int turmaDisciplinaID) {
        this.turmaDisciplinaID = turmaDisciplinaID;
    }

    public Turma getTurma() {
        return turma;
    }

    public void setTurma(Turma turma) {
        this.turma = turma;
    }

    public Disciplina getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }
}