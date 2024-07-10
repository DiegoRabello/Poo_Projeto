package com.pooprojeto.demo;
import java.util.ArrayList;
import java.util.Scanner;
import java.time.LocalDate;

public class Aluno extends Pessoa {
    Scanner scanner = new Scanner(System.in);
    LancamentoNota nota =new LancamentoNota();
    
    //Atributos
    private static int contador=1;

    private int idAluno;
    private int contadorAluguel=0;
    private int numMatricula;

    
    
    //Getters and Setters
    public void setContadorAluguel(int contadorAluguel) {
        this.contadorAluguel = contadorAluguel;
    }
    public int getContadorAluguel() {
        return contadorAluguel;
    }
    public int getnumMatricula() {
        return numMatricula;
    }
    public void setnumMatricula (int numMatricula) {
        this.numMatricula=numMatricula;
    }
    
    //Construtores
    
    public Aluno(String nome, LocalDate dtNascimento, String cpf, String email, String telefone, String login,String senha, Endereco endereco,int numMatricula) {
        super(nome, dtNascimento, cpf, email, telefone, login, senha, endereco);
        this.numMatricula=numMatricula;
        idAluno=contador;
        contador++;
    }
    public Aluno(String nome) {
        super(nome);
    }
    // public void alugarLivro() {
    //     //continuar
    //     if (contadorAluguel==0) {
    //         System.out.println("Digite o Nome do Livro: ");
    //         contadorAluguel++;
    //     }else {
    //         System.out.println("Você ja tem um Aluguel em aberto");
    //     }    
    // }
    public Disciplina[] getDisciplinas() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getDisciplinas'");
    }
    public Avaliacao[] Avaliacao() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'Avaliacao'");
    }
    
    // public void devolverLivro() {
    //     //continuar Depois
    //     if (contadorAluguel==1) {
    //         System.out.println("Livro Devolvido!");
    //         contadorAluguel--;
    //     } else {
    //         System.out.println("Você não tem Livro para devoler!");
    //     }
    // }
    
    // public void avaliarEscola() {
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
    // }   
    
    // public void avaliarProfessor() {
    //     Avaliacao av=new Avaliacao();
        
    //     System.out.println("Avaliação do Professor:");
    //     System.out.println("Digite a nota de 1 a 5 para o MétodoDidatico:");
    //     int metodoDidatico = scanner.nextInt(); // assume you have a scanner object
    //     av.setMetodoDidatico(metodoDidatico);

    //     System.out.println("Digite a nota de 1 a 5 para o carisma do Professor:");
    //     int carisma = scanner.nextInt();
    //     av.setCarisma(carisma);

    //     System.out.println("Digite um comentário sobre o Professor:");
    //     String comentario = scanner.next();
    //     av.setComentarioProf(comentario);
        
    // }
    // // aluno.verificarNota()
    
    // public void boletim(){

    // }
    // public static void criarAluno(String nome){
    //     Aluno a1 = new Aluno(nome);
    //     Aluno.alunos.add(a1);
    // }
}

//Menu Aluno:
//O aluno pode:
//Verificar suas próprias notas. ok
//Alugar livro pelo sistema (somente se o aluno não possuir aluguel em aberto). em progresso
//Lançar avaliação de um determinado professor. ok
//Avaliar a escola em pontos específicos ok