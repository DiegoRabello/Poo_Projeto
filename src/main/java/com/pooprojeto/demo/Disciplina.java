package com.pooprojeto.demo;

import java.time.LocalDate;

public class Disciplina {

    private static int contadorDisciplina = 1;
    private int disciplinaID;
    private String nomeDisciplina;

    public Disciplina(String nome, LocalDate dataInicio, String nomeDisciplina) {
        this.nomeDisciplina = nomeDisciplina;
        disciplinaID = contadorDisciplina;
        contadorDisciplina++;
    }

    public String getNomeDisciplina() {
        return nomeDisciplina;
    }

    public void setNomeDisciplina(String nomeDisciplina) {
        this.nomeDisciplina = nomeDisciplina;
    }
}