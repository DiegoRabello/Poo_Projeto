package com.pooprojeto.demo;

import java.util.Scanner;

public class Menu {
    

    public void verificarNota() {
        BancoDeDados bc = new BancoDeDados();
        System.out.println("Selecione o aluno:");
        for (int i = 0; i < bc.getListaDeAlunos().size(); i++) {
            System.out.println((i + 1) + ". " + bc.getListaDeAlunos().get(i).getNome());
        }
        int alunoIndex = scanner.nextInt() - 1; // subtract 1 because array indices start at 0
        Aluno aluno = bc.getListaDeAlunos().get(alunoIndex);
    
        System.out.println("Selecione a disciplina:");
        for (int i = 0; i < bc.getListaDeDisciplinas().size(); i++) {
            System.out.println((i + 1) + ". " + bc.getListaDeDisciplinas().get(i).getNome());
        }
        int disciplinaIndex = scanner.nextInt() - 1; // subtract 1 because array indices start at 0
        Disciplina disciplina = bc.getListaDeDisciplinas().get(disciplinaIndex);
    
        System.out.println("Nota do aluno " + aluno.getNome() + " na disciplina " + disciplina.getNome() + ":");
        System.out.println("Nota 1: " + disciplina.getNota1());
        System.out.println("Nota 2: " + disciplina.getNota2());
        System.out.println("Nota de Recuperação: " + disciplina.getNotaRec());
        System.out.println("Média: " + disciplina.getMedia());
        scanner.close();
        
        // Disciplina disciplina = aluno.getDisciplina();
        // System.out.println("========== Verificador de Notas ==========");
        // System.out.println("Aluno: " + aluno.getNome());
        // System.out.println("Sua Nota do Teste é : " + disciplina.getNota1());  
        // System.out.println("Sua Nota da Prova é : " + disciplina.getNota2()); 
        // System.out.println("Sua Nota da Recuperação é: " + disciplina.getNotaRec()); 
        // System.out.println("Sua Nota Final é: " + disciplina.getMedia());
        // System.out.println("========================================="); 
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
        Scanner scanner = new Scanner(System.in);
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
            scanner.close();
    } 
    public void avaliarProfessor() {
        Scanner scanner = new Scanner(System.in);
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
        scanner.close();
    }
    public void boletim(){
        BancoDeDados bc = new BancoDeDados(); // assuming BancoDeDados is a class that holds the list of students
        System.out.println("========== Boletim ==========");
        for (Aluno aluno : bc.getListaDeAlunos()) {
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
        BancoDeDados bc = new BancoDeDados(); // assuming BancoDeDados is a class that holds the list of students
        System.out.println("Selecione o aluno:");
        for (int i = 0; i < BancoDeDados.getListaDeAlunos().size(); i++) {
            System.out.println((i + 1) + ". " + BancoDeDados.getListaDeAlunos().get(i).getNome());
        }
        int alunoIndex = scanner.nextInt() - 1; // subtract 1 because array indices start at 0
        Aluno aluno = BancoDeDados.getListaDeAlunos().get(alunoIndex);
    
        System.out.println("Selecione a disciplina:");
        
        //Menu de selecao
        System.out.println(aluno.getGeografia());
        System.out.println(aluno.getHistoria());
        System.out.println(aluno.getMatematica());

        Disciplina disciplinaSelecionada = aluno.getGeografia();

        System.out.println("Digite a nota 1:");
        double nota1 = scanner.nextDouble();
        disciplinaSelecionada.setNota1(nota1);
    
        System.out.println("Digite a nota 2:");
        double nota2 = scanner.nextDouble();
        disciplinaSelecionada.setNota2(nota2);
    
        System.out.println("Digite a nota de recuperação (ou 0 se não houver):");
        double notaRec = scanner.nextDouble();
        disciplinaSelecionada.setNotaRec(notaRec);
    
        System.out.println("Nota lançada com sucesso!");
        scanner.close();
    }
    public void  verListaTurmaConceito() {
      
        BancoDeDados bc = new BancoDeDados();
        System.out.println("========== Lista de Alunos e Avaliações ==========");
        for (Aluno aluno : bc.getListaDeAlunos()) {
            System.out.println("Aluno: " + aluno.getNome());
            System.out.println("Avaliações:");
            for (Avaliacao avaliacao : aluno.Avaliacao()) {
                System.out.println("  - Infraestrutura: " + avaliacao.getInfraestrutura());
                System.out.println("  - Qualidade do Ensino: " + avaliacao.getQualidadeEnsino());
                System.out.println("  - Atenção ao Aluno: " + avaliacao.getAtencaoAluno());
                System.out.println("  - Comentário: " + avaliacao.getComentario());
            }
        System.out.println();
    }
    System.out.println("=================================================");
        // BancoDeDados bc = new BancoDeDados();

        // for (int i = 0; i < bc.getListaDeAlunos().size(); i++) {
        //     System.out.println((i + 1) + ". " + bc.getListaDeAlunos().get(i).getNome());
        // }
    }
}
