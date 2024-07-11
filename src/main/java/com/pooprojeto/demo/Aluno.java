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
    private double nota1, nota2, notaRec;
    private double media,mediaRec;

    private int qualidadeEnsino; //Avaliar Escola
    private int atencaoAluno;//Avaliar Escola
    private int idAvaliacao;
    private String comentario;
    private int metodoDidatico;
    private int carisma;
    private String comentarioProf;

   
    //Construtores
    public Aluno(String nome, LocalDate dtNascimento, String cpf, String email, String telefone, String login,String senha, Endereco endereco,int numMatricula) {
        super(nome, dtNascimento, cpf, email, telefone, login, senha, endereco);
        this.numMatricula=numMatricula;
        idAluno=contador;
        contador++;
    }
    //Getters and Setters
    public  double getNota1() {
        return nota1;
    }
    public  void setNota1(double nota1) {
        this.nota1 = nota1;
    }
    public  double getNota2() {
        return nota2;
    }
    public  void setNota2(double nota2) {
        this.nota2 = nota2;
    }
    public  double getNotaRec() {
        return notaRec;
    }
    public  void setNotaRec(double notaRec) {
        this.notaRec = notaRec;
    }
    public  double getMedia() {
        media = (nota1+nota2)/2;
        return media;
    }
    public  void setMedia(double media) {
        this.media = media;
    }
    public  double getMediaRec() {
        if (notaRec>nota1) {
            nota1=notaRec;
            mediaRec=(notaRec+nota2)/2;
        } else {
            mediaRec=(nota1+notaRec)/2;
        }
        return mediaRec;
    }
    public  void setMediaRec(double mediaRec) {
        this.mediaRec = mediaRec;
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
    public int getQualidadeEnsino() {
        return qualidadeEnsino;
    }
    public void setQualidadeEnsino(int qualidadeEnsino) {
        this.qualidadeEnsino = qualidadeEnsino;
    }
    public int getAtencaoAluno() {
        return atencaoAluno;
    }
    public void setAtencaoAluno(int atencaoAluno) {
        this.atencaoAluno = atencaoAluno;
    }
    public int getIdAvaliacao() {
        return idAvaliacao;
    }
    public void setIdAvaliacao(int idAvaliacao) {
        this.idAvaliacao = idAvaliacao;
    }
    public String getComentario() {
        return comentario;
    }
    public void setComentario(String comentario) {
        this.comentario = comentario;
    }
    public int getMetodoDidatico() {
        return metodoDidatico;
    }
    public void setMetodoDidatico(int metodoDidatico) {
        this.metodoDidatico = metodoDidatico;
    }
    public int getCarisma() {
        return carisma;
    }
    public void setCarisma(int carisma) {
        this.carisma = carisma;
    }
    public String getComentarioProf() {
        return comentarioProf;
    }
    public void setComentarioProf(String comentarioProf) {
        this.comentarioProf = comentarioProf;
    }
    
}

//Menu Aluno:
//O aluno pode:
//Verificar suas próprias notas. ok
//Alugar livro pelo sistema (somente se o aluno não possuir aluguel em aberto). em progresso
//Lançar avaliação de um determinado professor. ok
//Avaliar a escola em pontos específicos ok