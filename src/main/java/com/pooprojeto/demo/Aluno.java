package com.pooprojeto.demo;
import java.util.ArrayList;
import java.util.Scanner;
import java.time.LocalDate;

public class Aluno extends Pessoa {

    //Atributos
    private static int contador=1;

    private int idAluno;
    private int contadorAluguel=0;
    private int numMatricula;
    private Disciplina historia;
    private Disciplina geografia;
    private Disciplina matematica;

    
    
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
    public static int getContador() {
        return contador;
    }
    public static void setContador(int contador) {
        Aluno.contador = contador;
    }
    public int getIdAluno() {
        return idAluno;
    }
    public void setIdAluno(int idAluno) {
        this.idAluno = idAluno;
    }
    public int getNumMatricula() {
        return numMatricula;
    }
    public void setNumMatricula(int numMatricula) {
        this.numMatricula = numMatricula;
    }
    public Disciplina getHistoria() {
        return historia;
    }
    public void setHistoria(Disciplina historia) {
        this.historia = historia;
    }
    public Disciplina getGeografia() {
        return geografia;
    }
    public void setGeografia(Disciplina geografia) {
        this.geografia = geografia;
    }
    public Disciplina getMatematica() {
        return matematica;
    }
    public void setMatematica(Disciplina matematica) {
        this.matematica = matematica;
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