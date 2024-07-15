package com.pooprojeto.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.springframework.aop.config.AdviceEntry;

import classesAntigas.Endereco;

public class Professor extends Funcionario {
    Avaliacao avaliacao;
    // Atributos Estáticos
    private static ArrayList<Professor> professores = new ArrayList<Professor>();

    // Construtor
    public Professor(String nome, String cpf, String email, String telefone, String login,
            String senha, double salario) {
        super(nome, cpf, email, telefone, login, senha, salario);
        professores.add(this);
    }

    public Professor(String nome, String cpf, String email, String telefone, String login,
            String senha, Endereco endereco, double salario) {
        super(nome, cpf, email, telefone, login, senha, endereco, salario);
        this.avaliacoes = new ArrayList<>();
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
        int escolhaLancamentoNota;
        double escolhaNovaNota;

        // Lançar notas dos alunos de uma turma ou disciplina.
        System.out.println("\nSelecione um aluno para lançar a nota: ");
        Aluno.listarAlunos();
        Scanner scanner3 = new Scanner(System.in);
        System.out.print("\nDigite o Número do Aluno: ");
        int alunoIndex = scanner3.nextInt() - 1;
        Aluno aluno = Aluno.getAlunos().get(alunoIndex);

        System.out.println("\nSelecione a disciplina: ");
        Disciplina.listarDisciplinas();
        System.out.print("\nDigite o Número da Disciplina: ");
        int disciplinaIndex = scanner3.nextInt() - 1;
        Disciplina disciplina = Disciplina.getDisciplinas().get(disciplinaIndex);

        System.out.println("Qual nota deseja incluir do Aluno " + aluno.getNome());
        System.out.println("""
                1 - Nota 1.
                2 - Nota 2.
                3 - Nota de Recuperação.
                """);
        escolhaLancamentoNota = scanner3.nextInt();

        if (escolhaLancamentoNota == 1) {
            // Identificar se existe algum LancamentoNota para o aluno e disciplina

            for (int i = 0; i < LancamentoNota.getLancamentoNotas().size(); i++) {
                // Identifica se o aluno de LancamentoNota é igual o objeto Aluno e da mesma
                // disciplina
                if (LancamentoNota.getLancamentoNotas().get(i).getAluno().equals(aluno)
                        &&
                        LancamentoNota.getLancamentoNotas().get(i).getDisciplina().equals(disciplina)) {
                    // Ver se existe algum lancamento de nota1 para o Aluno desejado
                    if (LancamentoNota.getLancamentoNotas().get(i).getNota1() != 0) {
                        System.out.println("Nota já lançada para o aluno " + aluno.getNome() + " Nota 1 = "
                                + LancamentoNota.getLancamentoNotas().get(i).getNota1());
                        System.out.println("""
                                Deseja alterar a nota?
                                1 - Sim
                                2 - Não
                                """);

                        escolhaLancamentoNota = scanner3.nextInt();

                        if (escolhaLancamentoNota == 1) {
                            System.out.println("Qual a nova nota 1 do aluno: ");
                            escolhaNovaNota = scanner3.nextDouble();

                            LancamentoNota.getLancamentoNotas().get(i).setNota1(escolhaNovaNota);
                            System.out.println("Nova nota adicionada.");
                            return;

                        } else if (escolhaLancamentoNota == 2) {
                            return;
                        } else {
                            System.out.println("Escolha invalida.");
                        }
                        return;
                    } else {
                        System.out.println("Nota não lançada para o aluno " + aluno.getNome());
                        System.out.println("Insira a nota 1: ");
                        escolhaNovaNota = scanner3.nextDouble();

                        LancamentoNota.getLancamentoNotas().get(i).setNota1(escolhaNovaNota);
                        System.out.println("Nova nota adicionada.");
                        return;
                    }
                }
            }
            // Lancamento Nota 2
        } else if (escolhaLancamentoNota == 2) {
            // Identificar se existe algum LancamentoNota para o aluno e disciplina

            for (int i = 0; i < LancamentoNota.getLancamentoNotas().size(); i++) {
                // Identifica se o aluno de LancamentoNota é igual o objeto Aluno e da mesma
                // disciplina
                if (LancamentoNota.getLancamentoNotas().get(i).getAluno().equals(aluno)
                        &&
                        LancamentoNota.getLancamentoNotas().get(i).getDisciplina().equals(disciplina)) {
                    // Ver se existe algum lancamento de nota1 para o Aluno desejado
                    if (LancamentoNota.getLancamentoNotas().get(i).getNota1() != 0) {
                        System.out.println("Nota já lançada para o aluno " + aluno.getNome() + " Nota 2 = "
                                + LancamentoNota.getLancamentoNotas().get(i).getNota2());
                        System.out.println("""
                                Deseja alterar a nota?
                                1 - Sim
                                2 - Não
                                """);

                        escolhaLancamentoNota = scanner3.nextInt();

                        if (escolhaLancamentoNota == 1) {
                            System.out.println("Qual a nova nota 1 do aluno: ");
                            escolhaNovaNota = scanner3.nextDouble();

                            LancamentoNota.getLancamentoNotas().get(i).setNota2(escolhaNovaNota);
                            System.out.println("Nova nota adicionada.");
                            return;

                        } else if (escolhaLancamentoNota == 2) {
                            return;
                        } else {
                            System.out.println("Escolha invalida.");
                        }
                        return;
                    } else {
                        System.out.println("Nota não lançada para o aluno " + aluno.getNome());
                        System.out.println("Insira a nota 2: ");
                        escolhaNovaNota = scanner3.nextDouble();

                        LancamentoNota.getLancamentoNotas().get(i).setNota2(escolhaNovaNota);
                        System.out.println("Nova nota adicionada.");
                        return;
                    }
                }
            }
        } else if (escolhaLancamentoNota == 3) {
            // Identificar se existe algum LancamentoNota para o aluno e disciplina

            for (int i = 0; i < LancamentoNota.getLancamentoNotas().size(); i++) {
                // Identifica se o aluno de LancamentoNota é igual o objeto Aluno e da mesma
                // disciplina
                if (LancamentoNota.getLancamentoNotas().get(i).getAluno().equals(aluno)
                        &&
                        LancamentoNota.getLancamentoNotas().get(i).getDisciplina().equals(disciplina)) {
                    // Ver se existe algum lancamento de notaRec para o Aluno desejado
                    if (LancamentoNota.getLancamentoNotas().get(i).getNotaRec() != 0) {
                        System.out.println("Nota já lançada para o aluno " + aluno.getNome() + " Nota de Recuperação = "
                                + LancamentoNota.getLancamentoNotas().get(i).getNotaRec());
                        System.out.println("""
                                Deseja alterar a nota?
                                1 - Sim
                                2 - Não
                                """);

                        escolhaLancamentoNota = scanner3.nextInt();

                        if (escolhaLancamentoNota == 1) {
                            System.out.println("Qual a nova nota 1 do aluno: ");
                            escolhaNovaNota = scanner3.nextDouble();

                            LancamentoNota.getLancamentoNotas().get(i).setNotaRec(escolhaNovaNota);
                            System.out.println("Nova nota adicionada.");
                            return;

                        } else if (escolhaLancamentoNota == 2) {
                            return;
                        } else {
                            System.out.println("Escolha invalida.");
                        }
                        return;
                    } else {
                        System.out.println("Nota não lançada para o aluno " + aluno.getNome());
                        System.out.println("Insira a nota Rec: ");
                        escolhaNovaNota = scanner3.nextDouble();

                        LancamentoNota.getLancamentoNotas().get(i).setNotaRec(escolhaNovaNota);
                        System.out.println("Nova nota adicionada.");
                        return;
                    }
                }
            }
        } else {
            System.out.println("Função inválida.");
            lancarNota();
        }

    }
    public static void listarProfessores() {
        for (int i = 0; i < Professor.getProfessores().size(); i++) {
            System.out.println((i + 1) + ". " + Professor.getProfessores().get(i).getNome());
        }
    }

    private List<String> avaliacoes;
    public void adicionarAvaliacao(String avaliacao) {
        avaliacoes.add(avaliacao);
    }

    public List<String> listarAvaliacao() {
        return new ArrayList<>(avaliacoes);
    }

    
}

// O professor pode:
// Lançar notas dos alunos de uma turma ou disciplina.
// Visualizar a lista de toda a turma e os conceitos dos alunos.
// Lançar advertência para um aluno.
// Visualizar a lista de alunos com advertência.