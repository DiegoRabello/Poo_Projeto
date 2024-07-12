package com.pooprojeto.demo;

public class Advertencias {

    private static int contador =1;

    private int idAdvertencias;
    private String atraso;
    private String indisciplina;

    public int getIdAdvertencias(){
        return idAdvertencias;
    }
    public String getAtraso(){
        return atraso;
    }
    public String getIndisciplina(){
        return indisciplina;
    }
    public void setIdAdvertencias(int idAdvertencias){
        this.idAdvertencias = idAdvertencias;
    }
    public void setAtraso(String atraso){
        this.atraso = atraso;
    }
    public void setIndiciplina(String indiciplina){
        this.indisciplina = indisciplina;
    }
    public Advertencias (String atraso, String indiciplina){
        this.atraso = atraso;
        this.indisciplina = indisciplina;
        this.idAdvertencias = contador;
        contador++;
    }
    

}