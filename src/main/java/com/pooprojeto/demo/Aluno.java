package com.pooprojeto.demo;

import java.util.ArrayList;

import classesAntigas.Endereco;

public class Aluno extends Pessoa {
    // Atributos Estáticos
    private static ArrayList<Aluno> alunos = new ArrayList<Aluno>();
    private static int contador = 0;

    // Atributos
    private int numMatricula;

    // Construtor
    public Aluno(String nome, String cpf, String email, String telefone, String login, String senha,
            Endereco endereco) {
        super(nome, cpf, email, telefone, login, senha, endereco);
        this.numMatricula = contador++;
        alunos.add(this);
    }

    public static ArrayList<Aluno> getAlunos() {
        return alunos;
    }

    public static void setAlunos(ArrayList<Aluno> alunos) {
        alunos = alunos;
    }

    public static int getContador() {
        return contador;
    }

    public static void setContador(int contador) {
        Aluno.contador = contador;
    }

    public int getNumMatricula() {
        return numMatricula;
    }

    public void setNumMatricula(int numMatricula) {
        this.numMatricula = numMatricula;
    }

    // Métodos
    public static void alimentaBancoAlunos() {
        Aluno aluno = new Aluno(
                "Maria",
                // LocalDate.of(1999, 2, 2),
                "987.654.321-00",
                "maria@email.com",
                "9876-5432",
                "maria",
                "9876",
                new Endereco(98765432));

        Aluno aluno2 = new Aluno(
                "João",
                // LocalDate.of(2000, 5, 15),
                "123.456.789-00",
                "joao@email.com",
                "1234-5678",
                "joao",
                "1234",
                new Endereco(12345678));

        Aluno aluno3 = new Aluno(
                "Carlos",
                // LocalDate.of(2001, 3, 3),
                "456.789.012-00",
                "carlos@email.com",
                "4567-8901",
                "carlos",
                "4567",
                new Endereco(45678901));

        Aluno aluno4 = new Aluno(
                "Beatriz",
                // LocalDate.of(1995, 10, 10),
                "111.222.333-00",
                "beatriz@email.com",
                "1111-2222",
                "beatriz",
                "1111",
                new Endereco(11122233));

        Aluno aluno5 = new Aluno(
                "Eduardo",
                // LocalDate.of(2002, 11, 11),
                "222.333.444-00",
                "eduardo@email.com",
                "2222-3333",
                "eduardo",
                "2222",
                new Endereco(22233344));

        Aluno aluno6 = new Aluno(
                "Luisa",
                // LocalDate.of(1994, 12, 12),
                "333.444.555-00",
                "luisa@email.com",
                "3333-4444",
                "luisa",
                "3333",
                new Endereco(33344455));

        Aluno aluno7 = new Aluno(
                "Mariana",
                // LocalDate.of(2003, 1, 1),
                "444.555.666-00",
                "mariana@email.com",
                "4444-5555",
                "mariana",
                "4444",
                new Endereco(44455566));

        Aluno aluno8 = new Aluno(
                "Ricardo",
                // LocalDate.of(1993, 2, 2),
                "555.666.777-00",
                "ricardo@email.com",
                "5555-6666",
                "ricardo",
                "5555",
                new Endereco(55566677));

        Aluno aluno9 = new Aluno(
                "Sofia",
                // LocalDate.of(2004, 3, 3),
                "666.777.888-00",
                "sofia@email.com",
                "6666-7777",
                "sofia",
                "6666",
                new Endereco(66677788));

        Aluno aluno10 = new Aluno(
                "Thiago",
                // LocalDate.of(1992, 4, 4),
                "777.888.999-00",
                "thiago@email.com",
                "7777-8888",
                "thiago",
                "7777",
                new Endereco(77788899));
    }

    public static void listarAlunos() {
        for (int i = 0; i < Aluno.getAlunos().size(); i++) {
            System.out.println((i + 1) + ". " + Aluno.getAlunos().get(i).getNome());
        }
    }

    public static void imprimirBoletim(Aluno aluno) {
        // Buscar as notas de um aluno na lista de notas em LancamentoDeNotas
        
        for (LancamentoNota lancamentoNota : LancamentoNota.getLancamentoNotas()) {
            if (lancamentoNota.getAluno().equals(aluno)) {
                System.out.println(lancamentoNota.getDisciplina().getNomeDisciplina());
                System.out.print("Nota 1: " + lancamentoNota.getNota1() + " / ");
                System.out.print("Nota 2: " + lancamentoNota.getNota2() + " / ");
                System.out.print("Nota 3: " + lancamentoNota.getNotaRec() + " / ");
            }
        }
    }

}
