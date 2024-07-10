package com.pooprojeto.demo;

import java.util.ArrayList;

public class BancoDeDados {

    private static ArrayList<Aluno> listaDeAlunos = new ArrayList<>();
    private static ArrayList<Professor> listaDeProfessores = new ArrayList<>();
    private static ArrayList<Turma> listaDeTurmas = new ArrayList<>();
    private static ArrayList<Disciplina> listaDeDisciplinas = new ArrayList<>();
    private static ArrayList<TurmaDisciplina> listaDeTurmaDisciplinas = new ArrayList<>();
    private static ArrayList<LancamentoNota> listaDeLancamentoNota = new ArrayList<>();

    public static ArrayList<Aluno> getListaDeAlunos() {
        return listaDeAlunos;
    }

    public static void setListaDeAlunos(ArrayList<Aluno> listaDeAlunos) {
        BancoDeDados.listaDeAlunos = listaDeAlunos;
    }

    public static ArrayList<Professor> getListaDeProfessores() {
        return listaDeProfessores;
    }

    public static void setListaDeProfessores(ArrayList<Professor> listaDeProfessores) {
        BancoDeDados.listaDeProfessores = listaDeProfessores;
    }

    public static ArrayList<Turma> getListaDeTurmas() {
        return listaDeTurmas;
    }

    public static void setListaDeTurmas(ArrayList<Turma> listaDeTurmas) {
        BancoDeDados.listaDeTurmas = listaDeTurmas;
    }

    public static ArrayList<Disciplina> getListaDeDisciplinas() {
        return listaDeDisciplinas;
    }

    public static void setListaDeDisciplinas(ArrayList<Disciplina> listaDeDisciplinas) {
        BancoDeDados.listaDeDisciplinas = listaDeDisciplinas;
    }

    public static ArrayList<TurmaDisciplina> getListaDeTurmaDisciplinas() {
        return listaDeTurmaDisciplinas;
    }

    public static void setListaDeTurmaDisciplinas(ArrayList<TurmaDisciplina> listaDeTurmaDisciplinas) {
        BancoDeDados.listaDeTurmaDisciplinas = listaDeTurmaDisciplinas;
    }

    public static ArrayList<LancamentoNota> getListaDeLancamentoNota() {
        return listaDeLancamentoNota;
    }

    public static void setListaDeLancamentoNota(ArrayList<LancamentoNota> listaDeLancamentoNota) {
        BancoDeDados.listaDeLancamentoNota = listaDeLancamentoNota;
    }

    public static void adicionarAluno(Aluno aluno) {
        listaDeAlunos.add(aluno);
    }

    public static void adicionarProfessor(Professor professor) {
        listaDeProfessores.add(professor);
    }

    public static void adicionarTurma(Turma turma) {
        listaDeTurmas.add(turma);
    }

    public static void adicionarDisciplina(Disciplina disciplina) {
        listaDeDisciplinas.add(disciplina);
    }

    public static void lancarNota(LancamentoNota lancamentoNota) {
        listaDeLancamentoNota.add(lancamentoNota);
    }

    public static void adicionarTurmaDisciplina(TurmaDisciplina turmaDisciplina) {
        listaDeTurmaDisciplinas.add(turmaDisciplina);
    }

    // alunos*, professores*, turma*, disciplina*, turmadisciplina e nota*;
}
