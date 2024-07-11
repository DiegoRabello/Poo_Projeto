package com.pooprojeto.demo;

import java.time.LocalDate;

public class Aluno extends Pessoa {

    // Atributos
    private static int contador = 1;

    private int idAluno;
    private int contadorAluguel = 0;
    private int numMatricula;
    private Disciplina logicaProgramaçao;
    private Disciplina pOO;
    private Disciplina api;
    private Disciplina frontEnd;
    private Disciplina backEnd;
    private int nota1, nota2, notaRec;
    private int media = (nota1 + nota2) /2;
    
    
    public Aluno(String nome, LocalDate dtNascimento, String cpf, String email, String telefone, String login,
    String senha, Endereco endereco, int numMatricula) {
        super(nome, dtNascimento, cpf, email, telefone, login, senha, endereco);
        this.numMatricula = numMatricula;
        idAluno = contador;
        contador++;
    }
    // Getters and Setters

    public int getNotaRec() {
        return notaRec;
    }

    public void setNotaRec(int notaRec) {
        this.notaRec = notaRec;
    }
    
    public int getMedia() {
        return media;
    }

    public void setMedia(int media) {
        this.media = media;
    }
    public Disciplina getLogicaProgramaçao() {
        return logicaProgramaçao;
    }

    public void setLogicaProgramaçao(Disciplina logicaProgramaçao) {
        this.logicaProgramaçao = logicaProgramaçao;
    }

    public Disciplina getpOO() {
        return pOO;
    }

    public void setpOO(Disciplina pOO) {
        this.pOO = pOO;
    }

    public Disciplina getApi() {
        return api;
    }

    public void setApi(Disciplina api) {
        this.api = api;
    }

    public Disciplina getFrontEnd() {
        return frontEnd;
    }

    public void setFrontEnd(Disciplina frontEnd) {
        this.frontEnd = frontEnd;
    }

    public Disciplina getBackEnd() {
        return backEnd;
    }

    public void setBackEnd(Disciplina backEnd) {
        this.backEnd = backEnd;
    }

    public void setContadorAluguel(int contadorAluguel) {
        this.contadorAluguel = contadorAluguel;
    }

    public int getContadorAluguel() {
        return contadorAluguel;
    }

    public int getnumMatricula() {
        return numMatricula;
    }

    public void setnumMatricula(int numMatricula) {
        this.numMatricula = numMatricula;
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
}
// Menu Aluno:
// O aluno pode:
// Verificar suas próprias notas. ok
// Alugar livro pelo sistema (somente se o aluno não possuir aluguel em aberto).
// em progresso
// Lançar avaliação de um determinado professor. ok
// Avaliar a escola em pontos específicos ok