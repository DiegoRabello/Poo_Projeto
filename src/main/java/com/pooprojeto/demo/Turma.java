package com.pooprojeto.demo;

import java.time.LocalDate;

public class Turma {
    private int contador=1;
    private int idTurma;
    private String nome;
    private LocalDate dataInicio;

    //Getters and Setters
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public LocalDate getDataInicio() {
        return dataInicio;
    }
    public void setDataInicio(LocalDate dataInicio ) {
        this.dataInicio=dataInicio;
    }
    //Construtor
    public Turma (String nome, LocalDate dataInicio) {
        this.nome = nome;
        this.dataInicio=dataInicio;
        idTurma=contador;
        contador++;
    }
}
