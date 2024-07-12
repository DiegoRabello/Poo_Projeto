package com.pooprojeto.demo;

import java.io.IOException;
import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);

        limpaConsole();

        alimentaBancoDeDados();
        Professor.listarProfessores();
        // O que vou ter no meu menu principal?

        // 1. Alunos > Consulta de Boletim
        // Buscar o aluno pelo nome/index/matricula
        // Usar o método ImprimirListaDeDisciplinas() com notas

        // 2. Professores > Lançamento de Notas
        // Usar o método ImprimirListaDeAlunos()

        // 3. Professores > Imprimir notas de uma disciplina (Todos os alunos)
        // Usar o métoro imprimirListaDeDisciplinas()
        // Usar o método ImprimirListaDeAlunos()


    }
        // Menu.adicionarObjetos();
        // List<Professor> listaDeProfessores = BancoDeDados.getListaDeProfessores();
        // System.out.println("Lista de Professores:");
        // for (int i = 0; i < listaDeProfessores.size(); i++) {
        // Professor f = listaDeProfessores.get(i);
        // System.out.println((i + 1) + ". " + f.getNome());
        // }

        // List<Disciplina> listaDeDisciplinas = BancoDeDados.getListaDeDisciplinas();
        // System.out.println("Lista de Disciplinas:");
        // for (int i = 0; i < listaDeDisciplinas.size(); i++) {
        // Disciplina d = listaDeDisciplinas.get(i);
        // System.out.println((i + 1) + ". " + d.getNomeDisciplina());
        // }

        // List<Turma> listaDeTurmas = BancoDeDados.getListaDeTurmas();
        // System.out.println("Lista de Disciplinas:");
        // for (int i = 0; i < listaDeTurmas.size(); i++) {
        // Turma t = listaDeTurmas.get(i);
        // System.out.println((i + 1) + ". " + t.getNome());
        // }

        // List<Turma> listaDeTurmas = BancoDeDados.getListaDeTurmas();
        // System.out.println("Lista de Turmas:");
        // for (int i = 0; i < listaDeTurmas.size(); i++) {
        // Turma t = listaDeTurmas.get(i);
        // System.out.println((i + 1) + ". " + t.getNome());

    // logica para ver a lista de alunos
    // List<Aluno> listaDeAlunos = BancoDeDados.getListaDeAlunos();
    // System.out.println("Lista de Alunos:");
    // for (int i = 0; i < listaDeAlunos.size(); i++) {
    // Aluno a = listaDeAlunos.get(i);
    // System.out.println((i + 1) + ". " + a.getNome());
    // }

    // Logica de como ver lista de disciplinas

    // logica de como ver lista de turmas

    // logica de como ver lista de professores
    // List<Professor> listaDeProfessores = BancoDeDados.getListaDeProfessores();
    // System.out.println("Lista de Professores:");
    // for (int i = 0; i < listaDeProfessores.size(); i++) {
    // Professor f = listaDeProfessores.get(i);
    // System.out.println((i + 1) + ". " + f.getNome());
    // }

    

    public static void alimentaBancoDeDados() {
        Aluno.alimentaBancoAlunos();
        Professor.alimentaBancoProfessores();
        Disciplina.alimentaBancoDisciplinas();
    }
}
