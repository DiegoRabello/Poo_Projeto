package com.pooprojeto.demo;

public class Nota {
    private int contador=1;
    private int idNota;
    private int valor;
    private String etapa;
    
    //Getters and Setters
    public int getValor() {
        return valor;
    }
    public void setValor(int valor) {
        this.valor = valor;
    }   
    public String getEtapa() {
        return etapa;
    }
    public void setEtapa(String etapa){
        this.etapa = etapa;
    }
    
    //construtor
    public Nota (int valor, String etapa) {
        this.valor=valor;
        this.etapa=etapa;
        idNota=contador;
        contador++;
    }
}
