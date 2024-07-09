package com.pooprojeto.demo;

public class Avaliacao {

    private static int contador = 1;
    private int infraestrutura;
    private int qualidadeEnsino; //Avaliar Escola
    private int atencaoAluno;//Avaliar Escola
    private int idAvaliacao;
    private String comentario;
    private int metodoDidatico;
    private int carisma;
    private String comentarioProf;
    
    public String getComentarioProf() {
        return comentarioProf;
    }
    public void setComentarioProf(String comentarioProf) {
        this.comentarioProf = comentarioProf;
    }
    public int getCarisma() {
        return carisma;
    }
    public void setCarisma(int carisma) {
        this.carisma = carisma;
    }
    public int getMetodoDidatico() {
        return metodoDidatico;
    }
    public void setMetodoDidatico(int metodoDidatico) {
        this.metodoDidatico = metodoDidatico;
    }
    public int getAtencaoAluno() {
        return atencaoAluno;
    }
    public void setAtencaoAluno(int atencaoAluno) {
        this.atencaoAluno = atencaoAluno;
    }
    public int getQualidadeEnsino() {
        return qualidadeEnsino;
    }
    public void setQualidadeEnsino(int qualidadeEnsino) {
        this.qualidadeEnsino = qualidadeEnsino;
    }
    public int getInfraestrutura() {
        return infraestrutura;
    }
    public void setInfraestrutura(int infraestrutura) {
        this.infraestrutura = infraestrutura;
    }
    public int getIdAvaliacao(){
        return idAvaliacao;
    }
    public String getComentario(){
        return comentario;
    }
    public void setIdAvaliacao(int idAvaliacao){
        this.idAvaliacao = idAvaliacao;
    }
    public void setComentario(String comentario){
        this.comentario = comentario;
    }
    public Avaliacao ( String comentario){
        this.comentario = comentario;
        this.idAvaliacao = contador;
        contador++;
    }
    //construtor vazio
    public Avaliacao () {

    }
}