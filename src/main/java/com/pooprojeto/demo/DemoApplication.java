package com.pooprojeto.demo;

import java.io.IOException;
import java.time.LocalDate;
import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);

        // Grupo de acoes pra alimentar minhas listas
       alimentaBanco();

    // BancoDeDados.getListaDeAlunos();
    Aluno.getLogicaProgramaçao();



        

        // Menu
		
        // System.out.println("Digite o nome do aluno");
        // Scanner sc = new Scanner(System.in);
        // String nome = sc.nextLine();
       
       


        
        limpaConsole();
	
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
        BancoDeDados.listaDeAlunos.add(new Aluno(
            "Maria", 
            LocalDate.of(1999, 2, 2),
            "987.654.321-00",
            "maria@email.com", 
            "9876-5432",
            "maria",
            "9876",
            new Endereco(98765432),
            654321
            ));

        BancoDeDados.listaDeAlunos.add(new Aluno(
                    "Pedro", 
                    LocalDate.of(2001, 3, 3),
                    "456.789.012-00",
                    "pedro@email.com", 
                    "4567-8901",
                    "pedro",
                    "4567",
                    new Endereco(45678901),
                    789012
                    ));

        BancoDeDados.listaDeAlunos.add(new Aluno(
                    "Ana", 
                    LocalDate.of(1998, 4, 4),
                    "234.567.890-00",
                    "ana@email.com", 
                    "2345-6789",
                    "ana",
                    "2345",
                    new Endereco(23456789),
                    567890
                    ));

        BancoDeDados.listaDeAlunos.add(new Aluno(
                    "Luiz", 
                    LocalDate.of(2002, 5, 5),
                    "901.234.567-00",
                    "luiz@email.com", 
                    "9012-3456",
                    "luiz",
                    "9012",
                    new Endereco(90123456),
                    345678
                    ));

        BancoDeDados.listaDeAlunos.add(new Aluno(
                    "Julia", 
                    LocalDate.of(1997, 6, 6),
                    "678.901.234-00",
                    "julia@email.com", 
                    "6789-0123",
                    "julia",
                    "6789",
                    new Endereco(67890123),
                    901234
                    ));

        BancoDeDados.listaDeAlunos.add(new Aluno(
                    "Rafael", 
                    LocalDate.of(2003, 7, 7),
                    "345.678.901-00",
                    "rafael@email.com", 
                    "3456-7890",
                    "rafael",
                    "3456",
                    new Endereco(34567890),
                    678901
                    ));

        BancoDeDados.listaDeAlunos.add(new Aluno(
                    "Gabriela", 
                    LocalDate.of(1996, 8, 8),
                    "567.890.123-00",
                    "gabriela@email.com", 
                    "5678-9012",
                    "gabriela",
                    "5678",
                    new Endereco(56789012),
                    890123
                    ));

        BancoDeDados.listaDeAlunos.add(new Aluno(
                    "Fernanda", 
                    LocalDate.of(2004, 9, 9),
                    "890.123.456-00",
                    "fernanda@email.com", 
                    "8901-2345",
                    "fernanda",
                    "8901",
                    new Endereco(89012345),
                    123456
        ));

        Disciplina logicaProgramaçao = new Disciplina( LocalDate.of(2024, 5, 10), "logica de Programação");
        Disciplina poo = new Disciplina( LocalDate.of(2024, 5, 20), "Programção Orientada Objetos");
        Disciplina api = new Disciplina( LocalDate.of(2024, 5, 30), "Api");
        Disciplina frontEnd = new Disciplina( LocalDate.of(2024, 5, 30), "FrontEnd");
        Disciplina backEnd = new Disciplina( LocalDate.of(2024, 5, 30), "BackEnd");
    
    
    }
}
