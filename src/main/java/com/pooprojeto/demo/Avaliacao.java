package com.pooprojeto.demo;

import java.util.ArrayList;

public class Avaliacao {
    //Atributos Estáticos 
    private static ArrayList<Avaliacao> avaliacao = new ArrayList<Avaliacao>();
    private static int contador = 1;
    Professor professor;
    
    //Atributos
    private int idAvaliacao;
    private int notaAvaliacao;

    
    //construtor
    public Avaliacao(int notaAvaliacao,Professor professor ) {
        this.idAvaliacao = contador++;
        this.notaAvaliacao = notaAvaliacao;
        this.professor = professor;
        avaliacao.add(this);
    }

    //Getters and Setters
    public int getNotaAvaliacao() {
        return notaAvaliacao;
    }
    
    public void setNotaAvaliacao(int notaAvaliacao) {
        this.notaAvaliacao = notaAvaliacao;
    }
}