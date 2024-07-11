package com.pooprojeto.demo;

import java.time.LocalDate;

public class Disciplina {

    private static int contadorDisciplina = 1;
    private int disciplinaID;
    private String nomeDisciplina;
    private double nota1, nota2, notaRec;
    
    
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
    private double media = (nota1+nota2)/2;


    public double getMedia() {
        return media;
    }

    public String getNome() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getNome'");
    }
}