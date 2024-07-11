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

    //disciplinas

        // private static Disciplina logicaProgramaçao = new Disciplina( LocalDate.of(2024, 5, 10), "logica de Programação");

     
        // private static Disciplina poO = new Disciplina( LocalDate.of(2024, 5, 20), "Programção Orientada Objetos");
        
        // private static Disciplina api = new Disciplina( LocalDate.of(2024, 5, 30), "Api");
        // private static Disciplina frontEnd = new Disciplina( LocalDate.of(2024, 5, 30), "FrontEnd");
        // private static Disciplina backEnd = new Disciplina( LocalDate.of(2024, 5, 30), "BackEnd");
    
    
    //Construtores
   
    public Aluno(String nome, LocalDate dtNascimento, String cpf, String email, String telefone, String login,String senha, Endereco endereco,int numMatricula) {
        super(nome, dtNascimento, cpf, email, telefone, login, senha, endereco);
        this.numMatricula=numMatricula;
        idAluno=contador;
        contador++;
    }
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
    public class Builder {

		public Object nome(String string) {
			// TODO Auto-generated method stub
			throw new UnsupportedOperationException("Unimplemented method 'nome'");
		}

    }
}

//Menu Aluno:
//O aluno pode:
//Verificar suas próprias notas. ok
//Alugar livro pelo sistema (somente se o aluno não possuir aluguel em aberto). em progresso
//Lançar avaliação de um determinado professor. ok
//Avaliar a escola em pontos específicos ok