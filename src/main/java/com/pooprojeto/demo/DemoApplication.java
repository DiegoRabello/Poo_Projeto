package com.pooprojeto.demo;

import java.io.IOException;
import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {
    
    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
        
        limpaConsole();
        alimentaBanco(); 
        
            // System.out.println("======= lancar nota ======");
            // Menu.lancarNota();
            // // System.out.println("======= lancar nota ======");
            // // Menu.lancarNota();
            // // System.out.println("======= lancar nota ======");
            // // Menu.lancarNota();
            // System.out.println("======= Verificar nota ======");
            // Menu.verificarNota();
            // Menu.avaliarProfessor();
            Menu.avaliarProfessor();
            Menu.avaliarProfessor();
            Menu.avaliarProfessor();
            
            

            
        

        
        // logica para ver a lista de alunos  
        // List<Aluno> listaDeAlunos = BancoDeDados.getListaDeAlunos();
        // System.out.println("Lista de Alunos:");
        // for (int i = 0; i < listaDeAlunos.size(); i++) {
        //     Aluno a = listaDeAlunos.get(i);
        //     System.out.println((i + 1) + ". " + a.getNome());
        // }


        // Logica de como ver lista de disciplinas
        // List<Disciplina> listaDeDisciplinas = BancoDeDados.getListaDeDisciplinas();
        // System.out.println("Lista de Disciplinas:");
        // for (int i = 0; i < listaDeDisciplinas.size(); i++) {
        //     Disciplina d = listaDeDisciplinas.get(i);
        //     System.out.println((i + 1) + ". " + d.getNomeDisciplina());
        // }
        
        //logica de como ver lista de turmas
        // List<Turma> listaDeTurmas = BancoDeDados.getListaDeTurmas();
        // System.out.println("Lista de Disciplinas:");
        // for (int i = 0; i < listaDeTurmas.size(); i++) {
        //     Turma t = listaDeTurmas.get(i);
        //     System.out.println((i + 1) + ". " + t.getNome());
        // }

        //logica de como ver lista de professores
        // List<Professor> listaDeProfessores = BancoDeDados.getListaDeProfessores();
        // System.out.println("Lista de Professores:");
        // for (int i = 0; i < listaDeProfessores.size(); i++) {
        //     Professor f = listaDeProfessores.get(i);
        //     System.out.println((i + 1) + ". " + f.getNome());
        // }

        


	
	}
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
    public static void alimentaBanco() {
        Aluno aluno = new Aluno(
            "Maria", 
            LocalDate.of(1999, 2, 2),
            "987.654.321-00",
            "maria@email.com", 
            "9876-5432",
            "maria",
            "9876",
            new Endereco(98765432),
            654321
            );
        BancoDeDados.adicionarAluno(aluno);

        Aluno aluno2 = new Aluno(
                    "João", 
                    LocalDate.of(2000, 5, 15),
                    "123.456.789-00",
                    "joao@email.com", 
                    "1234-5678",
                    "joao",
                    "1234",
                    new Endereco(12345678),
                    123456
                    );
        BancoDeDados.adicionarAluno(aluno2);
        Aluno aluno3 = new Aluno(
                    "Carlos", 
                    LocalDate.of(2001, 3, 3),
                    "456.789.012-00",
                    "carlos@email.com", 
                    "4567-8901",
                    "carlos",
                    "4567",
                    new Endereco(45678901),
                    789012
                    );
        BancoDeDados.adicionarAluno(aluno3);

        Aluno aluno4 = new Aluno(
                    "Beatriz", 
                    LocalDate.of(1995, 10, 10),
                    "111.222.333-00",
                    "beatriz@email.com", 
                    "1111-2222",
                    "beatriz",
                    "1111",
                    new Endereco(11122233),
                    222333
                    );
        BancoDeDados.adicionarAluno(aluno4);

        Aluno aluno5 = new Aluno(
                    "Eduardo", 
                    LocalDate.of(2002, 11, 11),
                    "222.333.444-00",
                    "eduardo@email.com", 
                    "2222-3333",
                    "eduardo",
                    "2222",
                    new Endereco(22233344),
                    333444
                    );
        BancoDeDados.adicionarAluno(aluno5);

        Aluno aluno6 = new Aluno(
                    "Luisa", 
                    LocalDate.of(1994, 12, 12),
                    "333.444.555-00",
                    "luisa@email.com", 
                    "3333-4444",
                    "luisa",
                    "3333",
                    new Endereco(33344455),
                    444555
                    );
        BancoDeDados.adicionarAluno(aluno6);

        Aluno aluno7 = new Aluno(
                    "Mariana", 
                    LocalDate.of(2003, 1, 1),
                    "444.555.666-00",
                    "mariana@email.com", 
                    "4444-5555",
                    "mariana",
                    "4444",
                    new Endereco(44455566),
                    555666
                    );
        BancoDeDados.adicionarAluno(aluno7);

        Aluno aluno8 = new Aluno(
                    "Ricardo", 
                    LocalDate.of(1993, 2, 2),
                    "555.666.777-00",
                    "ricardo@email.com", 
                    "5555-6666",
                    "ricardo",
                    "5555",
                    new Endereco(55566677),
                    666777
                    );
        BancoDeDados.adicionarAluno(aluno8);

        Aluno aluno9 = new Aluno(
                    "Sofia", 
                    LocalDate.of(2004, 3, 3),
                    "666.777.888-00",
                    "sofia@email.com", 
                    "6666-7777",
                    "sofia",
                    "6666",
                    new Endereco(66677788),
                    777888
                    );
        BancoDeDados.adicionarAluno(aluno9);

        Aluno aluno10 = new Aluno(
                    "Thiago", 
                    LocalDate.of(1992, 4, 4),
                    "777.888.999-00",
                    "thiago@email.com", 
                    "7777-8888",
                    "thiago",
                    "7777",
                    new Endereco(77788899),
                    888999
                    );
        BancoDeDados.adicionarAluno(aluno10);
        // Disciplinas

        Disciplina disciplina1 = new Disciplina(
            LocalDate.of(2022, 5, 10),
            "Logica De Programação");
        BancoDeDados.adicionarDisciplina(disciplina1);

        Disciplina disciplina2 = new Disciplina(
            LocalDate.of(2022, 5, 11),
            "Programação Orientada a objetos");
        BancoDeDados.adicionarDisciplina(disciplina2);

        Disciplina disciplina3 = new Disciplina(
            LocalDate.of(2022, 5, 12),
            "BackEnd");
        BancoDeDados.adicionarDisciplina(disciplina3);

        Disciplina disciplina4 = new Disciplina(
            LocalDate.of(2022, 5, 13),
            "Api");
        BancoDeDados.adicionarDisciplina(disciplina4);

        Disciplina disciplina5 = new Disciplina(
            LocalDate.of(2022, 5, 14),
            "FrontEnd");
        BancoDeDados.adicionarDisciplina(disciplina5);

        Disciplina disciplina6 = new Disciplina(
            LocalDate.of(2022, 5, 10),
            "Mobile");
        BancoDeDados.adicionarDisciplina(disciplina6);

        // TURMA
        Turma turma1 = new Turma(
            "FullStack Senai"
            );
        BancoDeDados.adicionarTurma(turma1);

        //  Professores

    Professor professor1 = new Professor("Bruno almada", 
    LocalDate.of(1905, 10, 6), 
    "154.356.988-51", 
    "BrunoAlmada@gmail.com", 
    "24993114508", 
    "Bruno", 
    "12345",
    new Endereco(25711), 
    3000);

    BancoDeDados.adicionarProfessor(professor1);

    Professor professor2 = new Professor("Ana Souza", 
            LocalDate.of(1980, 5, 15), 
            "123.456.789-00", 
            "AnaSouza@gmail.com", 
            "24993114509", 
            "Ana", 
            "54321",
            new Endereco(25712), 
            4000);
        BancoDeDados.adicionarProfessor(professor2);

        Professor professor3 = new Professor("Carlos Silva", 
            LocalDate.of(1975, 3, 20), 
            "234.567.890-11", 
            "CarlosSilva@gmail.com", 
            "24993114510", 
            "Carlos", 
            "67890",
            new Endereco(25713), 
            5000);
        BancoDeDados.adicionarProfessor(professor3);

        Professor professor4 = new Professor("Mariana Lima", 
            LocalDate.of(1985, 7, 30), 
            "345.678.901-22", 
            "MarianaLima@gmail.com", 
            "24993114511", 
            "Mariana", 
            "09876",
            new Endereco(25714), 
            3500);
        BancoDeDados.adicionarProfessor(professor4);

        Professor professor5 = new Professor("Rafael Alves", 
            LocalDate.of(1990, 12, 25), 
            "456.789.012-33", 
            "RafaelAlves@gmail.com", 
            "24993114512", 
            "Rafael", 
            "11223",
            new Endereco(25715), 
            4500);
        BancoDeDados.adicionarProfessor(professor5);

    }
}
