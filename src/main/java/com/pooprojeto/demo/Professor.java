package com.pooprojeto.demo;

import java.util.ArrayList;
import java.util.Scanner;

public class Professor extends Funcionario {
    // Atributos Estáticos
    private static ArrayList<Professor> professores = new ArrayList<Professor>();

    // Construtores
    public Professor(String nome,  String cpf, String email, String telefone, String login,
            String senha, double salario) {
        super(nome, cpf, email, telefone, login, senha, salario);
        professores.add(this);
    }

    public Professor(String nome,  String cpf, String email, String telefone, String login,
            String senha, Endereco endereco,double salario) {
        super(nome, cpf, email, telefone, login, senha, endereco,salario);
        professores.add(this);
    }

    // Getters and Setters
    public static ArrayList<Professor> getProfessores() {
        return professores;
    }

    public static void setProfessores(ArrayList<Professor> professores) {
        Professor.professores = professores;
    }

    // Métodos
    public static void alimentaBancoProfessores() {

        Professor professor1 = new Professor("Bruno almada",
                // LocalDate.of(1905, 10, 6),
                "154.356.988-51",
                "BrunoAlmada@gmail.com",
                "24993114508",
                "Bruno",
                "12345",
                new Endereco(25711),
                3000);

        Professor professor2 = new Professor("Ana Souza",
                // LocalDate.of(1980, 5, 15),
                "123.456.789-00",
                "AnaSouza@gmail.com",
                "24993114509",
                "Ana",
                "54321",
                new Endereco(25712),
                4000);

        Professor professor3 = new Professor("Carlos Silva",
                // LocalDate.of(1975, 3, 20),
                "234.567.890-11",
                "CarlosSilva@gmail.com",
                "24993114510",
                "Carlos",
                "67890",
                new Endereco(25713),
                5000);

        Professor professor4 = new Professor("Mariana Lima",
                // LocalDate.of(1985, 7, 30),
                "345.678.901-22",
                "MarianaLima@gmail.com",
                "24993114511",
                "Mariana",
                "09876",
                new Endereco(25714),
                3500);

        Professor professor5 = new Professor("Rafael Alves",
                // LocalDate.of(1990, 12, 25),
                "456.789.012-33",
                "RafaelAlves@gmail.com",
                "24993114512",
                "Rafael",
                "11223",
                new Endereco(25715),
                4500);

        Professor professor6 = new Professor("Juliana Santos",
                // LocalDate.of(1995, 1, 1),
                "567.890.123-44",
                "jusantos@gmail.com",
                "24993114513",
                "Juliana",
                "33445",
                new Endereco(25716),
                6000);
    }

    public static void lancarNota() {
        // Lançar notas dos alunos de uma turma ou disciplina.
        System.out.println("Selecione um aluno para lançar a nota: ");
        Aluno.listarAlunos();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o Número do Aluno: ");
        int alunoIndex = scanner.nextInt() - 1;
        Aluno aluno = Aluno.getAlunos().get(alunoIndex);

        System.out.println("Selecione a disciplina: ");
        Disciplina.listarDisciplinas();
        System.out.print("Digite o Número da Disciplina: ");
        int disciplinaIndex = scanner.nextInt() - 1;
        Disciplina disciplina = Disciplina.getDisciplinas().get(disciplinaIndex);

        System.out.print("Digite a nota 1 do aluno: ");
        double nota1 = scanner.nextDouble();

        System.out.print("Digite a nota 2 do aluno: ");
        double nota2 = scanner.nextDouble();

        System.out.print("Digite a nota rec do aluno: ");
        double nota3 = scanner.nextDouble();

        LancamentoNota lancamentoNota = new LancamentoNota(aluno, disciplina, nota1, nota2, nota3);
    }
    public static void listarProfessores() {
        for (int i = 0; i < Profesores.getProfessores().size(); i++) {
            System.out.println((i + 1) + ". " + Aluno.getAlunos().get(i).getNome());
        }
    }
}

// O professor pode:
// Lançar notas dos alunos de uma turma ou disciplina.
// Visualizar a lista de toda a turma e os conceitos dos alunos.
// Lançar advertência para um aluno.
// Visualizar a lista de alunos com advertência.