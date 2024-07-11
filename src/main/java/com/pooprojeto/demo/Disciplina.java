package com.pooprojeto.demo;

import java.time.LocalDate;

public class Disciplina {

    private static int contadorDisciplina = 1;
    private int disciplinaID;
    private String nomeDisciplina;
    private double nota1, nota2, notaRec;
    LocalDate dataInicio;
    
    
    public Disciplina( LocalDate dataInicio, String nomeDisciplina) {
        this.nomeDisciplina = nomeDisciplina;
        disciplinaID = contadorDisciplina;
        contadorDisciplina++;
    }
    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public double getNotaRec() {
        return notaRec;
    }

    public void setNotaRec(double notaRec) {
        this.notaRec = notaRec;
    }
    
    public String getNomeDisciplina() {
        return nomeDisciplina;
    }
    
    public void setNomeDisciplina(String nomeDisciplina) {
        this.nomeDisciplina = nomeDisciplina;
    }
    
    public double getMedia() {
        return media;
    }
    public void setMedia(double media) {
        this.media = media;
    }
    public static int getContadorDisciplina() {
        return contadorDisciplina;
    }
    public int getDisciplinaID() {
        return disciplinaID;
    }
    
    private double media = (nota1+nota2)/2;
    
}