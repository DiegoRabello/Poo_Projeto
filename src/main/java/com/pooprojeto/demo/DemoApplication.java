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
<<<<<<< Updated upstream
=======

        // Grupo de acoes pra alimentar minhas listas
    BancoDeDados.listaDeAlunos.add(new Aluno(
    "Antonio Marcos", 
    LocalDate.of(2000, 1, 1), 
    "123.456.789-01", 
    "antonio.marcos@email.com", 
    "1234-5679", 
    "antonio.marcos", 
    "1234", 
    new Endereco(12345124), 
    123457
));

BancoDeDados.listaDeAlunos.add(new Aluno(
    "Enzo Gazon", 
    LocalDate.of(2000, 1, 1), 
    "123.456.789-02", 
    "enzo@email.com", 
    "1234-5680", 
    "enzo", 
    "1234", 
    new Endereco(12345125), 
    123458
));

BancoDeDados.listaDeAlunos.add(new Aluno(
    "Maria Eduarda", 
    LocalDate.of(2000, 1, 1), 
    "123.456.789-03", 
    "maria.eduarda@email.com", 
    "1234-5681", 
    "maria.eduarda", 
    "1234", 
    new Endereco(12345126), 
    123459
));

BancoDeDados.listaDeAlunos.add(new Aluno(
    "Willas", 
    LocalDate.of(2000, 1, 1), 
    "123.456.789-04", 
    "willas@email.com", 
    "1234-5682", 
    "willas", 
    "1234", 
    new Endereco(12345127), 
    123460
));

BancoDeDados.listaDeAlunos.add(new Aluno(
    "Isaac Marinho", 
    LocalDate.of(2000, 1, 1), 
    "123.456.789-05", 
    "isaac@email.com", 
    "1234-5683", 
    "isaac", 
    "1234", 
    new Endereco(12345128), 
    123461
));

BancoDeDados.listaDeAlunos.add(new Aluno(
    "Pedro Correa", 
    LocalDate.of(2000, 1, 1), 
    "123.456.789-06", 
    "pedro.correa@email.com", 
    "1234-5684", 
    "pedro.correa", 
    "1234", 
    new Endereco(12345129), 
    123462
));

BancoDeDados.listaDeAlunos.add(new Aluno(
    "Wagner Gomes", 
    LocalDate.of(2000, 1, 1), 
    "123.456.789-07", 
    "wagner@email.com", 
    "1234-5685", 
    "wagner", 
    "1234", 
    new Endereco(12345130), 
    123463
));

BancoDeDados.listaDeAlunos.add(new Aluno(
    "Patrick Assis", 
    LocalDate.of(2000, 1, 1), 
    "123.456.789-08", 
    "patrick@email.com", 
    "1234-5686", 
    "patrick", 
    "1234", 
    new Endereco(12345131), 
    123464
));

BancoDeDados.listaDeAlunos.add(new Aluno(
    "Pedro Henrique", 
    LocalDate.of(2000, 1, 1), 
    "123.456.789-09", 
    "pedro.henrique@email.com", 
    "1234-5687", 
    "pedro.henrique", 
    "1234", 
    new Endereco(12345132), 
    123465
));

BancoDeDados.listaDeAlunos.add(new Aluno(
    "Alexsandro Souza", 
    LocalDate.of(2000, 1, 1), 
    "123.456.789-10", 
    "alexsandro@email.com", 
    "1234-5688", 
    "alexsandro", 
    "1234", 
    new Endereco(12345133), 
    123466
));

BancoDeDados.listaDeAlunos.add(new Aluno(
    "Diego Rabello", 
    LocalDate.of(2000, 1, 1), 
    "123.456.789-11", 
    "diego.rabello@email.com", 
    "1234-5689", 
    "diego.rabello", 
    "1234", 
    new Endereco(12345134), 
    123467
));

BancoDeDados.listaDeAlunos.add(new Aluno(
    "Eloisa", 
    LocalDate.of(2000, 1, 1), 
    "123.456.789-12", 
    "eloisa@email.com", 
    "1234-5690", 
    "eloisa", 
    "1234", 
    new Endereco(12345135), 
    123468
));

BancoDeDados.listaDeAlunos.add(new Aluno(
    "Giordano Borsato", 
    LocalDate.of(2000, 1, 1), 
    "123.456.789-13", 
    "giordano@email.com", 
    "1234-5691", 
    "giordano", 
    "1234", 
    new Endereco(12345136), 
    123469
));

BancoDeDados.listaDeAlunos.add(new Aluno(
    "Aline Lemos", 
    LocalDate.of(2000, 1, 1), 
    "123.456.789-14", 
    "aline@email.com", 
    "1234-5692", 
    "aline", 
    "1234", 
    new Endereco(12345137), 
    123470
));

BancoDeDados.listaDeAlunos.add(new Aluno(
    "Davi Moura", 
    LocalDate.of(2000, 1, 1), 
    "123.456.789-15", 
    "davi@email.com", 
    "1234-5693", 
    "davi", 
    "1234", 
    new Endereco(12345138), 
    123471
));

BancoDeDados.listaDeAlunos.add(new Aluno(
    "JoaoX", 
    LocalDate.of(2000, 1, 1), 
    "123.456.789-16", 
    "joao@email.com", 
    "1234-5694", 
    "joao", 
    "1234", 
    new Endereco(12345139), 
    123472
));

BancoDeDados.listaDeAlunos.add(new Aluno(
    "Yuri Albuquerque", 
    LocalDate.of(2000, 1, 1), 
    "123.456.789-17", 
    "yuri.albuquerque@email.com", 
    "1234-5695", 
    "yuri.albuquerque", 
    "1234", 
    new Endereco(12345140), 
    123473
));

BancoDeDados.listaDeAlunos.add(new Aluno(
    "Victor Gnoato", 
    LocalDate.of(2000, 1, 1), 
    "123.456.789-18", 
    "victor@email.com", 
    "1234-5696", 
    "victor", 
    "1234", 
    new Endereco(12345141), 
    123474
));

BancoDeDados.listaDeAlunos.add(new Aluno(
    "Lucas Carvalho", 
    LocalDate.of(2000, 1, 1), 
    "123.456.789-19", 
    "lucas@email.com", 
    "1234-5697", 
    "lucas", 
    "1234", 
    new Endereco(12345142), 
    123475
));

BancoDeDados.listaDeAlunos.add(new Aluno(
    "Yuri Leocadio", 
    LocalDate.of(2000, 1, 1), 
    "123.456.789-20", 
    "yuri.leocadio@email.com", 
    "1234-5698", 
    "yuri.leocadio", 
    "1234", 
    new Endereco(12345143), 
    123476
));

        



        

        // Menu
>>>>>>> Stashed changes
		
        System.out.println("Digite o nome do aluno");
        Scanner sc = new Scanner(System.in);
        String nome = sc.nextLine();
        Aluno.criarAluno(nome);
        
        
        
        
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

}
