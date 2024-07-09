package com.pooprojeto.demo;

import java.time.LocalDate;

public class Turma {
    private static int contador=1;
    private int idTurma;
    private String nomeDaTurma;
    private LocalDate dataInicio;

    //Getters and Setters
    public String getNome() {
        return nomeDaTurma;
    }
    public void setNome(String nome) {
        this.nomeDaTurma = nome;
    }
    public LocalDate getDataInicio() {
        return dataInicio;
    }
    public void setDataInicio(LocalDate dataInicio ) {
        this.dataInicio=dataInicio;
    }
    //Construtor
    public Turma (String nomeDaTurma, LocalDate dataInicio) {
        this.nomeDaTurma = nomeDaTurma;
        this.dataInicio=dataInicio;
        idTurma=contador;
        contador++;
    }
}
