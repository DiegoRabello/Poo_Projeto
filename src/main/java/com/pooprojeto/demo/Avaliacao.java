package com.pooprojeto.demo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Avaliacao {
    private Map<String, Professor> professor;

    //Atributos Estáticos 
    // private static ArrayList<Avaliacao> avaliacao = new ArrayList<Avaliacao>();
    private static int contador = 1;
    Professor prof;
    
    //Atributos
    private int idAvaliacao;
    private int notaAvaliacao;

    
    //construtor
    // public Avaliacao(int notaAvaliacao,Professor professor ) {
    //     this.idAvaliacao = contador++;
    //     this.notaAvaliacao = notaAvaliacao;
    //     this.prof = prof;
    //     avaliacao.add(this);
    // }
    public Avaliacao() {
        professor = new HashMap<>();
    }
    

    //Getters and Setters
    public int getNotaAvaliacao() {
        return notaAvaliacao;
    }
    
    public void setNotaAvaliacao(int notaAvaliacao) {
        this.notaAvaliacao = notaAvaliacao;
    }

    public static void adicionarAvaliacao() {
   

     Scanner scanner1 = new Scanner(System.in);

    try {
        System.out.println("\nSelecione o Professor:");
        // Lista os alunos
        Professor.listarProfessores();

        // Seleciona um aluno
        System.out.print("\nDigite o número do Professor: ");
        int professorIndex = scanner1.nextInt() - 1;
        scanner1.nextLine();  // Consome a nova linha

        // Verifica se o índice do aluno é válido
        if (professorIndex >= 0 && professorIndex < Professor.getProfessores().size()) {
            Professor professor = Professor.getProfessores().get(professorIndex);

            // Solicita o motivo da advertência
            System.out.println("\nComente a Avaliação: ");
            String motivo = scanner1.nextLine();
            
            // Valida o motivo da advertência
            if (motivo == null || motivo.trim().isEmpty()) {
                System.out.println("\nMotivo da avaliação não pode ser vazio.");
                return;
            }

            // Adiciona a advertência ao aluno selecionado
            professor.adicionarAvaliacao(motivo);
            System.out.println("\nAdvertência adicionada ao aluno " + professor.getNome() + ".");

            // Lista as advertências do aluno
            System.out.println("Advertências de " + professor.getNome() + ": " + professor.listarAvaliacao());
        } else {
            System.out.println("\nNúmero do professor inválido. Tente novamente:");
            Professor.listarProfessores();
            adicionarAvaliacao(); // Chama o método novamente
        }
    } catch (InputMismatchException e) {
        System.out.println("Erro: entrada inválida. Tente novamente:");
        scanner1.next(); // Consome a entrada inválida
        adicionarAvaliacao(); // Chama o método novamente
    } finally {
        // scanner1.close();
    }
}// Fecha o Scanner
    public static void  listarAvaliacao() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("\nSelecione o Professor: ");
        // Lista os professores
        Professor.listarProfessores();

        // Seleciona um professor
        System.out.print("\nDigite o número do Professor para ver as avaliações: ");
        int professorIndex = -1;
        
        // Verifica se o próximo input é um inteiro e lê
        if (scanner.hasNextInt()) {
            professorIndex = scanner.nextInt() - 1;
            scanner.nextLine();  // Consome a nova linha
        } else {
            scanner.nextLine(); // Consome a nova linha em caso de entrada inválida
        }

        // Verifica se o índice do professor é válido
        if (professorIndex >= 0 && professorIndex < Professor.getProfessores().size()) {
            Professor professor = Professor.getProfessores().get(professorIndex);

            // Lista as avaliações do professor
            System.out.println("Avaliações de " + professor.getNome() + ":");
            List<String> avaliacoes = professor.listarAvaliacao();
            if (avaliacoes.isEmpty()) {
                System.out.println("\nNenhuma avaliação encontrada.");
            } else {
                for (String avaliacao : avaliacoes) {
                    System.out.println("- " + avaliacao);
                }
            }
        } else {
            System.out.println("\nNúmero do professor inválido.");
        }
    }
}