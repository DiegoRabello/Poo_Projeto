package com.pooprojeto.demo;

import java.io.IOException;
import java.util.Scanner;

import org.springframework.aop.config.AdviceEntry;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);

        Menu.limpaConsole();
        alimentaBancoDeDados();

        Menu.menuPrincipal();
        // Advertencia.adicionarAdvertencia();
        // Advertencia.listarAdvertencias();

    }
    public static void alimentaBancoDeDados() {
        Aluno.alimentaBancoAlunos();
        Professor.alimentaBancoProfessores();
        Disciplina.alimentaBancoDisciplinas();
        LancamentoNota.alimentaLancamentoNotas();
    }
}
