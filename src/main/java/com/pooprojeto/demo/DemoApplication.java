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
        BancoDeDados.listaDeAlunos.add(new Aluno(
            "João", 
            LocalDate.of(2000, 1, 1),
            "123.456.789-00",
            "joao@email.com", 
            "1234-5678",
            "joao",
            "1234",
            new Endereco(12345123),
            123456
            ));

        



        

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
}
