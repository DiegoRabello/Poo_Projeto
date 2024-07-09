package com.pooprojeto.demo;

public class Advertencias {

    private static int contador = 1;

    private int idAdvertencias;
    private String atraso;
    private String indiciplina;

    public int getIdAdvertencias(){
        return idAdvertencias;
    }
    public String getAtraso(){
        return atraso;
    }
    public String getIndiciplina(){
        return indiciplina;
    }
    public void setIdAdvertencias(int idAdvertencias){
        this.idAdvertencias = idAdvertencias;
    }
    public void setAtraso(String atraso){
        this.atraso = atraso;
    }
    public void setIndiciplina(String indiciplina){
        this.indiciplina = indiciplina;
    }
    public Advertencias (String atraso, String indiciplina){
        this.atraso = atraso;
        this.indiciplina = indiciplina;
        this.idAdvertencias = contador = 1;
        cpntador++
    }

}