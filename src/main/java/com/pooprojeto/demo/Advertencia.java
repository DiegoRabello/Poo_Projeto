package com.pooprojeto.demo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Advertencia {

    private Map<String, Aluno> alunos;

    public Advertencia() {
        alunos = new HashMap<>();
    }

    // Adiciona um aluno ao sistema
    public void adicionarAluno(Aluno aluno) {
        alunos.put(aluno.getNome(), aluno);
    }

    // Adiciona uma advertência a um aluno específico
    public static void adicionarAdvertencia() {
        Scanner scanner = new Scanner(System.in);
      
        // Lista os alunos
        Aluno.listarAlunos();

        // Seleciona um aluno
        System.out.print("Digite o número do aluno: ");
        int alunoIndex = scanner.nextInt() - 1;
        scanner.nextLine();  // Consome a nova linha

        // Verifica se o índice do aluno é válido
        if (alunoIndex >= 0 && alunoIndex < Aluno.getAlunos().size()) {
            Aluno aluno = Aluno.getAlunos().get(alunoIndex);

            // Solicita o motivo da advertência
            System.out.println("Digite o motivo da advertência: ");
            String motivo = scanner.nextLine();

            // Adiciona a advertência ao aluno selecionado
            aluno.adicionarAdvertencia(motivo);
            System.out.println("Advertência adicionada ao aluno " + aluno.getNome() + ".");

            // Lista as advertências do aluno
            System.out.println("Advertências de " + aluno.getNome() + ": " + aluno.listarAdvertencias());
        } else {
            System.out.println("Número do aluno inválido.");
        }

      
    }
    public static void listarAdvertencias () {
        Scanner scanner2 = new Scanner(System.in);
         // Lista os alunos
         Aluno.listarAlunos();

         // Seleciona um aluno
         System.out.print("Digite o número do aluno para ver as advertências: ");
         int alunoIndex = -1;
 
         // Verifica se o próximo input é um inteiro e lê
         if (scanner2.hasNextInt()) {
             alunoIndex = scanner2.nextInt() - 1;
         }
         scanner2.nextLine();  // Consome a nova linha
 
         // Verifica se o índice do aluno é válido
         if (alunoIndex >= 0 && alunoIndex < Aluno.getAlunos().size()) {
             Aluno aluno = Aluno.getAlunos().get(alunoIndex);
 
             // Lista as advertências do aluno
             System.out.println("Advertências de " + aluno.getNome() + ":");
             List<String> advertencias = aluno.listarAdvertencias();
             if (advertencias.isEmpty()) {
                 System.out.println("Nenhuma advertência encontrada.");
             } else {
                 for (String advertencia : advertencias) {
                     System.out.println("- " + advertencia);
                 }
             }
         } else {
             System.out.println("Número do aluno inválido.");
         }
    }


    




















}
