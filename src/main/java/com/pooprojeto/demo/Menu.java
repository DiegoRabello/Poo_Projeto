package com.pooprojeto.demo;

import java.util.List;
import java.util.Scanner;

public class Menu {

    public static void menuPrincipal(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bem vindo ao Sistema Escolar");
        System.out.println("1. Menu Aluno");
        System.out.println("2. Menu Professor");
        // System.out.println("3. Menu Diretor");
        System.out.println("0. Sair");
        System.out.print("Escolha uma opção: ");
        int escolha = scanner.nextInt();
        switch (escolha) {
            case 1:
                // Depois de criar o método de autenticação substituir pelo menuAluno()
                selecionaAluno();
                break;
            case 2:
                menuProfessor();
                break;
            // case 3:
            //     menuDiretor();
            //     break;
            case 0:
                System.out.println("Saindo...");
                break;
            default:
                System.out.println("Opção inválida");
                menuPrincipal();
                break;
        }
    }

    public static void selecionaAluno() {
        System.out.println("Selecione o Aluno:");
        Aluno.listarAlunos();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o Número do Aluno: ");
        int alunoIndex = scanner.nextInt() - 1;
        Aluno aluno = Aluno.getAlunos().get(alunoIndex);
        menuAluno(aluno);
    }

    public static void menuAluno(Aluno aluno) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("1. Verificar Notas");
        // System.out.println("2. Avaliar Escola");
        // System.out.println("3. Avaliar Professor");
        // System.out.println("4. Alugar Livro");
        // System.out.println("5. Devolver Livro");
        System.out.println("0. Voltar");
        System.out.print("Escolha uma opção: ");
        int escolha = scanner.nextInt();
        switch (escolha) {
            case 1:
                Aluno.imprimirBoletim(aluno);
                break;
            // case 2:
            //     avaliarEscola();
            //     break;
            // case 3:
            //     avaliarProfessor();
            //     break;
            // case 4:
            //     // alugarLivro();
            //     break;
            // case 5:
            //     // devolverLivro();
            //     break;
            case 0:
                menuPrincipal();
                break;
            default:
                System.out.println("Opção inválida");
                // menuAluno();
                break;
        }
    }

    public static void menuProfessor() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1. Lançar Notas");
        // System.out.println("2. Verificar Avaliação dos Professores");
        System.out.println("0. Voltar");
        System.out.print("Escolha uma opção: ");
        int escolha = scanner.nextInt();
        switch (escolha) {
            case 1:
                Professor.lancarNota();
                menuPrincipal();
                // break;
            // case 2:
            //     Professor.verificarAvaliacaoProfessor();
            //     break;
            case 0:
                menuPrincipal();
                break;
            default:
                System.out.println("Opção inválida");
                menuProfessor();
                break;
        }
    }
    public static void menuDiretor() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1. Verificar avaliações dos Professores");
        System.out.println("2. Verificar avaliações da Escola");
        System.out.println("3. Verificar Alunos com Advertencia");
        System.out.println("4. Adicionar Professor");
        System.out.println("5. Adicionar Alunos ");
        System.out.println("6. Adicionar Turmas");
        System.out.println("0. Voltar");
        System.out.print("Escolha uma opção: ");
        int escolha = scanner.nextInt();
        switch (escolha) {
            case 1:

                break;
            case 0:
                
                break;
            default:
                System.out.println("Opção inválida");
                menuProfessor();
                break;
        }
        //Menu Gestor:
        //O gestor pode:
        //Verificar professores e suas avaliações feitas pelos alunos.
        //Verificar alunos com advertências.
        //Verificar avaliações dos alunos quanto à escola.
        //Adicionar professor, disciplina e alunos a uma turma.
    }



//------------------------biblioteca-------------------------

//     //Terminar quando tiver pronto biblioteca
//     public void alugarLivro(Aluno aluno) {
//          //continuar
//          if (aluno.getContadorAluguel()==0) {
//             System.out.println("Digite o Nome do Livro: ");
//             aluno.setContadorAluguel(1);
//         }else {
//             System.out.println("Você ja tem um Aluguel em aberto");
//         }    
//     }

//     //Terminar quando tiver pronto biblioteca
//     public void devolverLivro(Aluno aluno) {
//         if (aluno.getContadorAluguel()==1) {
//             System.out.println("Livro Devolvido!");
//             aluno.setContadorAluguel(0);
//         } else {
//             System.out.println("Você não tem Livro para devoler!");
//         }
//     }

//---------------------------------------------------------------------------------

//   --------------------------------Diretor---------------------------------------------------
//     public static void  verificarAvaliacaoProfessor() {
//         Scanner scanner = new Scanner(System.in);
//         System.out.println("\nSelecione o Professor: ");
//         for (int i = 0; i < BancoDeDados.getListaDeProfessores().size(); i++) {
//             System.out.println((i + 1) + ". " + BancoDeDados.getListaDeProfessores().get(i).getNome());
//         }
//         System.out.print("\nDigite o Número do Professor: ");
    
//         while (!scanner.hasNextInt()) {
//             System.out.println("Número Inválido");
//             scanner.next();
//         }
//         int ProfessorIndex = scanner.nextInt() - 1; // subtract 1 because array indices start at 0
//         Professor professor = BancoDeDados.getListaDeProfessores().get(ProfessorIndex);

//         System.out.println("Metodo didatico nota: "+professor.getMetodoDidatico());


    
//     }
//     public static void verificarAlunoAdvertencia() {

//     }
//     public static void verificarAvaliacaoEscola() {

//     }


// --------------------------adicionar Objetos-------------------------------------------------------
//         Scanner scanner = new Scanner(System.in);
//         System.out.println("====== Adicionar Elementos ======");
//         System.out.println("1.Adicionar Professor á Escola ");
//         System.out.println("2.Adicionar Disciplina ao Aluno ");
//         System.out.println("3.Adicionar Turma ");
//         int escolha = scanner.nextInt();
//         BancoDeDados bancoDeDados = new BancoDeDados();
//         switch (escolha) {
//             case 1:
//                 System.out.println("Digite os dados do professor:");
//                 System.out.print("Nome Completo: ");
//                 String nomeProfessor = scanner.next();
//                 scanner.nextLine();

//                 // System.out.print("Data Nascimento : ");
//                 // String dtnascimento = scanner.next();

//                 System.out.print("CPF: ");
//                 String cpfProfessor = scanner.next();


//                 System.out.print("Email: ");
//                 String emailProfessor = scanner.next();


//                 System.out.print("Telefone: ");
//                 String telefoneProfessor = scanner.next();


//                 System.out.print("Login: ");
//                 String loginProfessor = scanner.next();


//                 System.out.print("Senha: ");
//                 String senhaProfessor = scanner.next();
                
//                 System.out.print("Salário: ");
//                 Double salariaoProfessor = scanner.nextDouble();
                
//                 Professor professor = new Professor(nomeProfessor,cpfProfessor,emailProfessor,telefoneProfessor,loginProfessor,senhaProfessor,new Endereco(123456),salariaoProfessor);
//                 bancoDeDados.adicionarProfessor(professor);
//                 break;

//             case 2:
//                 System.out.println("Digite os Dados da Disciplina");
//                 System.out.print("Nome da Disciplina: ");
//                 String nomeDisciplina = scanner.next();
//                 Disciplina disciplina = new Disciplina(nomeDisciplina);
//                 disciplina.setNomeDisciplina(nomeDisciplina);
//                 bancoDeDados.adicionarDisciplina(disciplina);

//                 break;
//             case 3:
//                 System.out.println("Digite os Dados da Turma");
//                 System.out.print("Nome da Turma: ");
//                 String nomeTurma = scanner.next();
//                 Turma turma = new Turma(nomeTurma);
//                 turma.setNome(nomeTurma);
//                 bancoDeDados.adicionarTurma(turma);;
//                 break;

//         }    
}
