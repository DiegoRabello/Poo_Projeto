package com.pooprojeto.demo;

import java.time.LocalDate;

public class Diretor extends Funcionario{

    private static int contador =1 ;
    private int idDiretor;
    
    
    public Diretor(String nome, LocalDate dtNascimento, String cpf, String email, String telefone, String login, String senha, Endereco endereco, double salario) {
        super(nome, dtNascimento, cpf, email, telefone, login, senha, endereco,salario);
        this.idDiretor = contador;
        contador++;
    }
    public verificaProfessores () {
        Professor prof
    }
}

//Menu Gestor:
//O gestor pode:
//Verificar professores e suas avaliações feitas pelos alunos.
//Verificar alunos com advertências.
//Verificar avaliações dos alunos quanto à escola.
//Adicionar professor, disciplina e alunos a uma turma.