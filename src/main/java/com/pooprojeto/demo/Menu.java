package com.pooprojeto.demo;

import java.util.Scanner;

public class Menu {
    Scanner scanner = new Scanner(System.in);

    public void verificarNota(Disciplina disciplina) {
        

        System.out.println("========== Verificador de Notas =========");
        System.out.println("Sua Nota do Teste é : "+disciplina .getNota1());  
        System.out.println("Sua Nota da Prova é : "+disciplina.getNota2()); 
        System.out.println("Sua Nota da Recuperação é: "+disciplina.getNotaRec()); 
        System.out.println("Sua Nota Final é: "+disciplina.getMedia());
        System.out.println("=========================================");   
    }
    public void alugarLivro(Aluno aluno) {
         //continuar
         if (aluno.getContadorAluguel()==0) {
            System.out.println("Digite o Nome do Livro: ");
            aluno.setContadorAluguel(1);
        }else {
            System.out.println("Você ja tem um Aluguel em aberto");
        }    
    }
    public void devolverLivro(Aluno aluno) {
        if (aluno.getContadorAluguel()==1) {
            System.out.println("Livro Devolvido!");
            aluno.setContadorAluguel(0);
        } else {
            System.out.println("Você não tem Livro para devoler!");
        }
    }
    public void avaliarEscola() {
            Avaliacao av = new Avaliacao();
            System.out.println("Avaliação da Escola:");
            System.out.println("Digite a nota de 1 a 5 para a infraestrutura:");
            int infraestrutura = scanner.nextInt(); // assume you have a scanner object
            av.setInfraestrutura(infraestrutura);
    
            System.out.println("Digite a nota de 1 a 5 para a qualidade do ensino:");
            int qualidadeEnsino = scanner.nextInt();
            av.setQualidadeEnsino(qualidadeEnsino);
            
            System.out.println("Digite a nota de 1 a 5 para a atenção ao aluno:");
            int atencaoAluno = scanner.nextInt();
            av.setAtencaoAluno(atencaoAluno);
            
            System.out.println("Digite um comentário sobre a escola:");
            String comentario = scanner.next();
            av.setComentario(comentario);
            
            System.out.println("Avaliação realizada com sucesso!");
    } 
    public void avaliarProfessor() {
        Avaliacao av=new Avaliacao();
        
        System.out.println("Avaliação do Professor:");
        System.out.println("Digite a nota de 1 a 5 para o MétodoDidatico:");
        int metodoDidatico = scanner.nextInt(); // assume you have a scanner object
        av.setMetodoDidatico(metodoDidatico);

        System.out.println("Digite a nota de 1 a 5 para o carisma do Professor:");
        int carisma = scanner.nextInt();
        av.setCarisma(carisma);

        System.out.println("Digite um comentário sobre o Professor:");
        String comentario = scanner.next();
        av.setComentarioProf(comentario);
        
    }
    public void boletim(){
        BancoDeDados bc = new BancoDeDados(); // assuming BancoDeDados is a class that holds the list of students
        System.out.println("========== Boletim ==========");
        for (Aluno aluno : Aluno.alunos) {
            System.out.println("Aluno: " + aluno.getNome());
            System.out.println("Notas:");
            for (Disciplina disciplina : aluno.getDisciplinas()) {
                System.out.println("  " + disciplina.getNome() + ": " + disciplina.getMedia()+"\n" +" Nota 1: "+disciplina.getNota1()+"\n"+" Nota 2: "+disciplina.getNota2()+"\n"+" Nota Recuperação: "+disciplina.getNotaRec());
            }
            System.out.println();
        }
        System.out.println("=================================");
    }
    //====== professor =======
    public void lancarNota () {
        Disciplina disciplina;

        disciplina.getNome;
    }
}
