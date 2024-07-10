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

    // Função para adicionar na lista;

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

    // Funções para remover algo das listas

    public static void removerAluno(Aluno aluno) {
        listaDeAlunos.remove(aluno);
    }

    public static void removerProfessor(Professor professor) {
        listaDeProfessores.remove(professor);
    }

    public static void removerTurma(Turma turma) {
        listaDeTurmas.remove(turma);
    }

    public static void removerDisciplina(Disciplina disciplina) {
        listaDeDisciplinas.remove(disciplina);
    }

    public static void removerTurmaDisciplina(TurmaDisciplina turmaDisciplina) {
        listaDeTurmaDisciplinas.remove(turmaDisciplina);
    }

    public static void removerLancamentoNota(LancamentoNota lancamentoNota) {
        listaDeLancamentoNota.remove(lancamentoNota);
    }

    // metodos de substituição

    public static void atualizarAluno(Aluno alunoAtualizado) {
        for (int i = 0; i < listaDeAlunos.size(); i++) {
            if (listaDeAlunos.get(i).getNome().equals(alunoAtualizado.getNome())) {
                listaDeAlunos.set(i, alunoAtualizado);
                return;
            }
        }
    }
    public static void atualizarProfessor(Professor professorAtualizado) {
        for (int i = 0; i < listaDeProfessores.size(); i++) {
            if (listaDeProfessores.get(i).getNome().equals(professorAtualizado.getNome())) {
                listaDeProfessores.set(i, professorAtualizado);
                return;
            }
        }
    }

    // Método para atualizar uma turma na lista de turmas
    public static void atualizarTurma(Turma turmaAtualizada) {
        for (int i = 0; i < listaDeTurmas.size(); i++) {
            if (listaDeTurmas.get(i).equals(turmaAtualizada)) {
                listaDeTurmas.set(i, turmaAtualizada);
                return;
            }
        }
    }

    // Método para atualizar uma disciplina na lista de disciplinas
    public static void atualizarDisciplina(Disciplina disciplinaAtualizada) {
        for (int i = 0; i < listaDeDisciplinas.size(); i++) {
            if (listaDeDisciplinas.get(i).equals(disciplinaAtualizada)) {
                listaDeDisciplinas.set(i, disciplinaAtualizada);
                return;
            }
        }
    }

    // Método para atualizar uma TurmaDisciplina na lista de TurmaDisciplinas
    public static void atualizarTurmaDisciplina(TurmaDisciplina turmaDisciplinaAtualizada) {
        for (int i = 0; i < listaDeTurmaDisciplinas.size(); i++) {
            if (listaDeTurmaDisciplinas.get(i).getTurmaDisciplinaID() == turmaDisciplinaAtualizada.getTurmaDisciplinaID()) {
                listaDeTurmaDisciplinas.set(i, turmaDisciplinaAtualizada);
                return;
            }
        }
    }

    // Método para atualizar um LancamentoNota na lista de LancamentoNota
    public static void atualizarLancamentoNota(LancamentoNota lancamentoNotaAtualizada) {
        for (int i = 0; i < listaDeLancamentoNota.size(); i++) {
            if (listaDeLancamentoNota.get(i).getAluno().equals(lancamentoNotaAtualizada.getAluno())) {
                listaDeLancamentoNota.set(i, lancamentoNotaAtualizada);
                return;
            }
        }
    }

    // alunos*, professores*, turma*, disciplina*, turmadisciplina* e nota*;
}