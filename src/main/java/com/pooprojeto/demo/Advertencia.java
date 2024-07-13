package com.pooprojeto.demo;

import java.util.ArrayList;

public class Advertencia {
    //Atributos estáticos
    private static ArrayList<Advertencia> advertencias = new ArrayList<Advertencia>();
    private static int contador =1;
    //Atributos
    private int idAdvertencias;
    private String explicação;
    private Aluno aluno;
    
    //construtor
    public Advertencia (String explicação){
        this.aluno=aluno;
        this.explicação = explicação;
        this.idAdvertencias = contador;
        advertencias.add(this); 
        contador++;
    }

    //Getters and Setters
    public String getExplicação() {
        return explicação;
    }
    public void setExplicação(String explicação) {
        this.explicação = explicação;
    }
    public Aluno getAluno() {
        return aluno;
    }
    public static ArrayList<Advertencia> getAdvertencias() {
        return advertencias;
    }
    public static void setAdvertencias(ArrayList<Advertencia> advertencias) {
        Advertencia.advertencias = advertencias;
    }
    public int getIdAdvertencias(){
        return idAdvertencias;
    }
    
    public static void listarAdvertencias () {
        for (int i = 0; i < Advertencia.getAdvertencias().size(); i++) {
            System.out.println((i + 1) + ". " + Advertencia.getAdvertencias().get(i).getExplicação());
        }
    }

}