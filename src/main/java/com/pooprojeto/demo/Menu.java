package com.pooprojeto.demo;

import java.util.List;
import java.util.Scanner;

public class Menu {
    
    // finalizado
    public static void verificarNota() {
        Scanner scanner = new Scanner(System.in);

        BancoDeDados.getListaDeAlunos();

        System.out.println("\nSelecione o aluno: ");
        for (int i = 0; i < BancoDeDados.getListaDeAlunos().size(); i++) {
            System.out.println((i + 1) + ". " + BancoDeDados.getListaDeAlunos().get(i).getNome());
        }
        System.out.print("\nDigite o Número do Aluno: ");
        while (!scanner.hasNextInt()) {
            System.out.println("Número Inválido");
            scanner.next();
        }
        int alunoIndex = scanner.nextInt() - 1; // subtract 1 because array indices start at 0
        Aluno aluno = BancoDeDados.getListaDeAlunos().get(alunoIndex);

        System.out.println("\nSelecione a disciplina:");
        List<Disciplina> listaDeDisciplinas = BancoDeDados.getListaDeDisciplinas();
        System.out.println("\nLista de Disciplinas: ");
        for (int i = 0; i < listaDeDisciplinas.size(); i++) {
            Disciplina d = listaDeDisciplinas.get(i);
            System.out.println((i + 1) + ". " + d.getNomeDisciplina());
        }
        System.out.print("\nDigite o Número da Disciplina: ");
        while (!scanner.hasNextInt()) {
            System.out.println("Número Inválido");
            scanner.next();
        }
        int disciplinaIndex = scanner.nextInt() - 1; // subtract 1 because array indices start at 0
        Disciplina disciplina = BancoDeDados.getListaDeDisciplinas().get(disciplinaIndex);

        System.out.println("Nota do(a) aluno(a) " + aluno.getNome() + " na disciplina " + disciplina.getNomeDisciplina() + ":");
        System.out.println("Nota 1: " + aluno.getNota1());
        System.out.println("Nota 2: " + aluno.getNota2());
        System.out.println("Nota de Recuperação: " + aluno.getNotaRec());
        if (aluno.getMedia()<6) {
            System.out.println("Média: " + aluno.getMediaRec());
        } else {
            System.out.println("Média: " + aluno.getMedia());
        }
    }
    //Terminar quando tiver pronto biblioteca
    public void alugarLivro(Aluno aluno) {
         //continuar
         if (aluno.getContadorAluguel()==0) {
            System.out.println("Digite o Nome do Livro: ");
            aluno.setContadorAluguel(1);
        }else {
            System.out.println("Você ja tem um Aluguel em aberto");
        }    
    }

    //Terminar quando tiver pronto biblioteca
    public void devolverLivro(Aluno aluno) {
        if (aluno.getContadorAluguel()==1) {
            System.out.println("Livro Devolvido!");
            aluno.setContadorAluguel(0);
        } else {
            System.out.println("Você não tem Livro para devoler!");
        }
    }

    public void avaliarEscola() {
        // Scanner scanner = new Scanner(System.in);
        //     Avaliacao av = new Avaliacao();
        //     System.out.println("Avaliação da Escola:");
        //     System.out.println("Digite a nota de 1 a 5 para a infraestrutura:");
        //     int infraestrutura = scanner.nextInt(); // assume you have a scanner object
        //     av.setInfraestrutura(infraestrutura);
    
        //     System.out.println("Digite a nota de 1 a 5 para a qualidade do ensino:");
        //     int qualidadeEnsino = scanner.nextInt();
        //     av.setQualidadeEnsino(qualidadeEnsino);
            
        //     System.out.println("Digite a nota de 1 a 5 para a atenção ao aluno:");
        //     int atencaoAluno = scanner.nextInt();
        //     av.setAtencaoAluno(atencaoAluno);
            
        //     System.out.println("Digite um comentário sobre a escola:");
        //     String comentario = scanner.next();
        //     av.setComentario(comentario);
            
        //     System.out.println("Avaliação realizada com sucesso!");
        //     scanner.close();
    }

    public static void avaliarProfessor() {
        
        

        // System.out.println("Avaliação do Professor:");
        // System.out.println("Digite a nota de 1 a 5 para o Método De ensino do Professor:");

        // int metodoDidatico = scanner.nextInt();

        // // Verificação da nota
        // if (metodoDidatico < 1 || metodoDidatico > 5) {
        //     System.out.println("Nota inválida. Digite uma nota entre 1 e 5.");
        // } else {
        //     // Supondo que o ProfessorIndex é definido em algum lugar antes no código
        //     int ProfessorIndex = ...; // Substitua pelo índice correto do professor
        //     Professor prof = BancoDeDados.getListaDeConceitosProfessor().get(ProfessorIndex);

        //     // Adiciona a nota ao professor
        //     BancoDeDados.adicionarConceitoProfessor(prof, metodoDidatico);

        //     System.out.println("Nota adicionada com sucesso.");
        // Scanner scanner = new Scanner(System.in);
        // Avaliacao av=new Avaliacao();
        
        // System.out.println("Avaliação do Professor:");
        // System.out.println("Digite a nota de 1 a 5 para o MétodoDidatico:");
        // int metodoDidatico = scanner.nextInt(); // assume you have a scanner object
        // av.setMetodoDidatico(metodoDidatico);
    
        // System.out.println("Digite a nota de 1 a 5 para o carisma do Professor:");
        // int carisma = scanner.nextInt();
        // av.setCarisma(carisma);
    
        // System.out.println("Digite um comentário sobre o Professor:");
        // String comentario = scanner.next();
        // av.setComentarioProf(comentario);
        // scanner.close();
        // }
    }
    //====== professor =======
    //finalizado
    public static void lancarNota () {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Selecione o aluno:");
        List<Aluno> listaDeAlunos = BancoDeDados.getListaDeAlunos();
        System.out.println("Lista de Alunos:");
        for (int i = 0; i < BancoDeDados.getListaDeAlunos().size(); i++) {
            System.out.println((i + 1) + ". " + BancoDeDados.getListaDeAlunos().get(i).getNome());
        }
        int alunoIndex = scanner.nextInt() - 1;
        Aluno aluno = BancoDeDados.getListaDeAlunos().get(alunoIndex);

        System.out.println("Selecione a disciplina:");
        List<Disciplina> listaDeDisciplinas = BancoDeDados.getListaDeDisciplinas();
        System.out.println("Lista de Disciplinas:");
        for (int i = 0; i < listaDeDisciplinas.size(); i++) {
            Disciplina d = listaDeDisciplinas.get(i);
            System.out.println((i + 1) + ". " + d.getNomeDisciplina());
        }
        int disciplinaIndex = scanner.nextInt() - 1; // subtract 1 because array indices start at 0
        Disciplina disciplina = BancoDeDados.getListaDeDisciplinas().get(disciplinaIndex);
        
        boolean notaValida=false;
        while (!notaValida) {
            System.out.print("Digite a nota 1: ");
            double nota = scanner.nextDouble();
            if (nota >= 0 && nota <= 10) {
                System.out.println("Nota válida: " + nota);
                aluno.setNota1(nota);
                notaValida = true;
            } else {
                System.out.println("Nota inválida. Por favor, digite uma nota entre 0 e 10.");
                
            }
        }
        boolean notaValida2=false;
        while (!notaValida2) {
            System.out.print("Digite a nota 2: ");
            double nota2 = scanner.nextDouble();
            if (nota2 >= 0 && nota2 <= 10) {
                System.out.println("Nota válida: " + nota2);
                aluno.setNota2(nota2);
                notaValida2 = true;
            }
            else {
                System.out.println("Nota inválida. Por favor, digite uma nota entre 0 e 10.");
                
            }
        }
        boolean notavalida3 =false;
        while (!notavalida3) {
            if(aluno.getMedia()<6) {
                System.out.println("Digite a nota de Recuperação:");
                double notarec = scanner.nextDouble();
                if (notarec >= 0 && notarec <= 10) {
                    System.out.println("Nota válida: " + notarec);
                    aluno.setNotaRec(notarec);
                    System.out.println("Notas Lançadas!");
                    notavalida3 = true;
                }else {
                    System.out.println("Nota inválida. Por favor, digite uma nota entre 0 e 10.");
                    // Process the valid note here
                }
            } else {
                System.out.println("Notas Lançadas!");
                notavalida3 = true;
            }
        }
    }
    //diretor
    //Terminar
    public static void  verificarAvaliacaoProfessor() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nSelecione o Professor: ");
        for (int i = 0; i < BancoDeDados.getListaDeProfessores().size(); i++) {
            System.out.println((i + 1) + ". " + BancoDeDados.getListaDeProfessores().get(i).getNome());
        }
        System.out.print("\nDigite o Número do Professor: ");
    
        while (!scanner.hasNextInt()) {
            System.out.println("Número Inválido");
            scanner.next();
        }
        int ProfessorIndex = scanner.nextInt() - 1; // subtract 1 because array indices start at 0
        Professor professor = BancoDeDados.getListaDeProfessores().get(ProfessorIndex);

        System.out.println("Metodo didatico nota: "+professor.getMetodoDidatico());


    
    }
    public static void verificarAlunoAdvertencia() {

    }
    public static void verificarAvaliacaoEscola() {

    }
    public static void adicionarObjetos () {
        Scanner scanner = new Scanner(System.in);
        System.out.println("====== Adicionar Elementos ======");
        System.out.println("1.Adicionar Professor á Escola ");
        System.out.println("2.Adicionar Disciplina ao Aluno ");
        System.out.println("3.Adicionar Turma ");
        int escolha = scanner.nextInt();
        switch (escolha) {
            case 1:
                Professor prof = new Professor;
                break;
            case 2:

                break;
            case 3:

                break;

        }



    }
}
