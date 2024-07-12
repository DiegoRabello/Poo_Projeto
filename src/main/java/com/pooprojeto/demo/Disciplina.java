package com.pooprojeto.demo;

import java.time.LocalDate;
import java.util.ArrayList;

public class Disciplina {

    // Atributos estáticos
    private static ArrayList<Disciplina> disciplinas = new ArrayList<Disciplina>();
    private static int contadorDisciplina = 0;

    // Atributos
    private int disciplinaID;
    private String nomeDisciplina;
    private Professor professor;
    
    // Construtor
    public Disciplina(String nomeDisciplina, Professor professor) {
        this.disciplinaID = contadorDisciplina++;
        this.nomeDisciplina = nomeDisciplina;
        this.professor = professor;
        disciplinas.add(this);
    }

    // Métodos
    public static ArrayList<Disciplina> getDisciplinas() {
        return disciplinas;
    }

    public static void setDisciplinas(ArrayList<Disciplina> disciplinas) {
        Disciplina.disciplinas = disciplinas;
    }

    public static int getContadorDisciplina() {
        return contadorDisciplina;
    }

    public static void setContadorDisciplina(int contadorDisciplina) {
        Disciplina.contadorDisciplina = contadorDisciplina;
    }

    public int getDisciplinaID() {
        return disciplinaID;
    }

    public void setDisciplinaID(int disciplinaID) {
        this.disciplinaID = disciplinaID;
    }

    public String getNomeDisciplina() {
        return nomeDisciplina;
    }

    public void setNomeDisciplina(String nomeDisciplina) {
        this.nomeDisciplina = nomeDisciplina;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }
    public static void alimentaBancoDisciplinas() {
        Disciplina disciplina1 = new Disciplina(
            "Logica De Programação",
            Professor.getProfessores().get(0));
            
        Disciplina disciplina2 = new Disciplina(
            "Programação Orientada a objetos",
            Professor.getProfessores().get(1));

        Disciplina disciplina3 = new Disciplina(
            "BackEnd",
            Professor.getProfessores().get(2));

        Disciplina disciplina4 = new Disciplina(
            "Api",
            Professor.getProfessores().get(3));

        Disciplina disciplina5 = new Disciplina(
            "FrontEnd",
            Professor.getProfessores().get(4));

        Disciplina disciplina6 = new Disciplina(
            "Mobile",
            Professor.getProfessores().get(5));
    }

    public static void listarDisciplinas() {
        for (int i=0; i<disciplinas.size(); i++) {
            System.out.println("1- "+ getDisciplinas().get(i).getNomeDisciplina());
        }
    }
}
    