package com.pooprojeto.demo;

import java.io.IOException;
import java.util.Scanner;

public class Menu {

    public static void limpaConsole() {
        try {
            if (System.getProperty("os.name").contains("Windows")) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {
                // Para sistemas UNIX-like (Linux, macOS), use o comando "clear"
                new ProcessBuilder("clear").inheritIO().start().waitFor();
            }
        } catch (IOException | InterruptedException ex) {
            ex.printStackTrace();
        }
    }

    public static void menuPrincipal() {
        Scanner sc1 = new Scanner(System.in);
        System.out.println(" \n=== Bem vindo ao Sistema Escolar ===");
        System.out.println(" 1 - Menu Aluno");
        System.out.println(" 2 - Menu Professor");
        System.out.println(" 3 - Menu Diretor");
        System.out.println(" 0 - Sair");
        System.out.println("Escolha uma opção: ");
        int escolhaPrincipal = sc1.nextInt();
        boolean menuAtivado = true;

        limpaConsole();

        while (menuAtivado) {

            switch (escolhaPrincipal) {
                case 1:
                    // Depois de criar o método de autenticação substituir pelo menuAluno()
                    selecionaAluno();
                    break;
                case 2:
                    menuProfessor();
                    break;
                // case 3:
                // menuDiretor();
                // break;
                case 0:
                    System.out.println("Saindo...");
                    menuAtivado = false;
                    break;
                default:
                    System.out.println("Opção inválida.");
                    break;
            }
        }
    }

    public static void selecionaAluno() {
        System.out.println("\nSelecione o Aluno:");
        Aluno.listarAlunos();
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nDigite o Número do Aluno: ");
        int alunoIndex = scanner.nextInt() - 1;
        Aluno aluno = Aluno.getAlunos().get(alunoIndex);
        menuAluno(aluno);
        
    }

    public static void menuAluno(Aluno aluno) {

        Scanner scanner4 = new Scanner(System.in);
        System.out.println("\n1 - Verificar Notas");
        // System.out.println("2. Avaliar Professor");
        System.out.println("0 - Voltar");
        System.out.print("Escolha uma opção: ");
        int escolha ;
        escolha = scanner4.nextInt();
       
        switch (escolha) {
            case 1:
                limpaConsole();
                Aluno.imprimirBoletim(aluno);
                break;
       
            case 0:
                limpaConsole();
                menuPrincipal();
                break;
            default:
                System.out.println("Opção inválida.");
                // menuAluno();
                break;
        }
    }

    public static void menuProfessor() {
        Scanner sc2 = new Scanner(System.in);
        System.out.println("1. Lançar Notas");
        System.out.println("2. Lançar Advertência");
        System.out.println("3.ver ADVERTENCIAS");
        System.out.println("0. Voltar");
        System.out.print("Escolha uma opção: ");
        int escolhaProfessor = sc2.nextInt();
        switch (escolhaProfessor) {
            case 1:
                limpaConsole();
                Professor.lancarNota();
                menuPrincipal();
                break;
                // case 2:
                // Professor.verificarAvaliacaoProfessor();
                // break;
            case 2:
                limpaConsole();
                Advertencia.adicionarAdvertencia();
                menuPrincipal();
                break;
            case 3:
                limpaConsole();
                Advertencia.listarAdvertencias();
                menuPrincipal();
                break;
            case 0:
                limpaConsole();
                menuPrincipal();
                break;
            default:
                limpaConsole();
                System.out.println("Opção inválida");
                menuProfessor();
                break;
        }
    }

    // public static void menuDiretor() {
    //     Scanner scanner = new Scanner(System.in);
    //     // System.out.println("1. Verificar avaliações dos Professores");
    //     // System.out.println("2. Verificar avaliações da Escola");
    //     // // System.out.println("3. Verificar Alunos com Advertencia");
    //     // System.out.println("4. Adicionar Professor");
    //     // System.out.println("5. Adicionar Alunos ");
    //     // System.out.println("6. Adicionar Turmas");
    //     System.out.println("0. Voltar");
    //     System.out.print("Escolha uma opção: ");
    //     int escolha = scanner.nextInt();
    //     switch (escolha) {
    //         case 1:

    //             break;
    //         case 0:
                
    //             break;
    //         default:
    //             System.out.println("Opção inválida");
    //             menuProfessor();
    //             break;
    //     }
        //Menu Gestor:
        //O gestor pode:
        //Verificar professores e suas avaliações feitas pelos alunos.
        //Verificar alunos com advertências.
        //Verificar avaliações dos alunos quanto à escola.
        //Adicionar professor, disciplina e alunos a uma turma.
    // }
}
