package com.pooprojeto.demo;

import java.time.LocalDate;

public class Professor extends Funcionario {

    private static int contador = 1;
    private int idProfessor;
    private int metodoDidatico;

    public int getMetodoDidatico() {
        return metodoDidatico;
    }

    public void setMetodoDidatico(int metodoDidatico) {
        this.metodoDidatico = metodoDidatico;
    }

    public Professor(String nome, LocalDate dtNascimento, String cpf, String email, String telefone, String login,
            String senha, Endereco endereco, double salario) {
        super(nome, dtNascimento, cpf, email, telefone, login, senha, endereco, salario);
        this.idProfessor = contador;
        contador++;
    }
}

// O professor pode:
// Lançar notas dos alunos de uma turma ou disciplina.
// Visualizar a lista de toda a turma e os conceitos dos alunos.
// Lançar advertência para um aluno.
// Visualizar a lista de alunos com advertência.