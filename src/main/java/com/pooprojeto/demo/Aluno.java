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

    private static Disciplina logicaProgramaçao;
    private static Disciplina pOO;
    private static Disciplina api;
    private static Disciplina frontEnd;
    private static Disciplina backEnd;

    
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

    
}

//Menu Aluno:
//O aluno pode:
//Verificar suas próprias notas. ok
//Alugar livro pelo sistema (somente se o aluno não possuir aluguel em aberto). em progresso
//Lançar avaliação de um determinado professor. ok
//Avaliar a escola em pontos específicos ok