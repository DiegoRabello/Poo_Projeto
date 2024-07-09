package com.pooprojeto.demo;

public class Avaliacao {

    private static int contador = 1;

    private int idAvaliacao;
    private int nota;
    private String comentario;

    public int getIdAvaliacao(){
        return idAvaliacao;
    }
    public int getNota(){
        return nota;
    }
    public String getComentario(){
        return comentario;
    }
    public void setIdAvaliacao(int idAvaliacao){
        this.idAvaliacao = idAvaliacao;
    }
    public void setNota(int nota){
        this.nota = nota;
    }
    public void setComentario(String comentario){
        this.comentario = comentario;
    }
    public Avaliacao (int nota, String comentario){
        this.nota = nota;
        this.comentario = comentario;
        this.idAvaliacao = contador;
        contador++;
    }

}