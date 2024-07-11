package com.pooprojeto.demo;

import java.util.ArrayList;

public class BancoDeDados {

    private static ArrayList<Aluno> listaDeAlunos = new ArrayList<>();
    private static ArrayList<Professor> listaDeProfessores = new ArrayList<>();
    private static ArrayList<Disciplina> listaDeDisciplinas = new ArrayList<>();

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


    public static ArrayList<Disciplina> getListaDeDisciplinas() {
        return listaDeDisciplinas;
    }

    public static void setListaDeDisciplinas(ArrayList<Disciplina> listaDeDisciplinas) {
        BancoDeDados.listaDeDisciplinas = listaDeDisciplinas;
    }

    // Função para adicionar na lista;

    public static void adicionarAluno(Aluno aluno) {
        listaDeAlunos.add(aluno);
    }

    public static void adicionarProfessor(Professor professor) {
        listaDeProfessores.add(professor);
    }

    public static void adicionarDisciplina(Disciplina disciplina) {
        listaDeDisciplinas.add(disciplina);
    }
    // Funções para remover algo das listas

    public static void removerAluno(Aluno aluno) {
        listaDeAlunos.remove(aluno);
    }

    public static void removerProfessor(Professor professor) {
        listaDeProfessores.remove(professor);
    }

    public static void removerDisciplina(Disciplina disciplina) {
        listaDeDisciplinas.remove(disciplina);
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

    public static void atualizarDisciplina(Disciplina disciplinaAtualizada) {
        for (int i = 0; i < listaDeDisciplinas.size(); i++) {
            if (listaDeDisciplinas.get(i).equals(disciplinaAtualizada)) {
                listaDeDisciplinas.set(i, disciplinaAtualizada);
                return;
            }
        }
    }
    // alunos*, professores*, turma*, disciplina*, turmadisciplina* e nota*;
}