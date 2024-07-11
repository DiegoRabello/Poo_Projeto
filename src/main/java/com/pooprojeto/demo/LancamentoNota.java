package com.pooprojeto.demo;

import java.util.ArrayList;

public class LancamentoNota {

    // private static int contadorLancamentoNota = 1;
    // private int lancamentoNotaID;
    // private TurmaDisciplina turmaDisciplina;
    // private Professor professor;
    // private Aluno aluno;
    // // private double nota1, nota2, notaRec;
    // // private double media = nota1+ nota2;
    // private Disciplina disciplina;

    // constructor
   
    // Aluno aluno, Disciplina disciplina,
    // public LancamentoNota( Disciplina nota) {
    //     // this.aluno = aluno;
    //     // this.disciplina = disciplina;
    //     this.disciplina=nota;
    //     lancamentoNotaID = contadorLancamentoNota;
    //     contadorLancamentoNota++;
    // }

    // public Object getAluno() {
    //     // TODO Auto-generated method stub
    //     throw new UnsupportedOperationException("Unimplemented method 'getAluno'");
    // }

    // setters
    // public void setNota1(double nota1) {
    //     this.nota1 = nota1;
    // }

    // public void setNota2(double nota2) {
    //     this.nota2 = nota2;
    // }

    // public void setNotaRec(double notaRec) {
    //     this.notaRec = notaRec;
    // }

    // public void setMedia(double media) {
    //     this.media = media;
    // }
    // // getters
    // public double getNota1() {
    //     return nota1;
    // }

    // public double getNota2() {
    //     return nota2;
    // }

    // public double getNotaRec() {
    //     return notaRec;
    // }
    // public double getMedia(){
    //     return media;
    // }

    // public boolean aprovadoOuNao(){
    //     return this.media >= 6.0;
    // }


    // public boolean recuperacao(){
    //     return this.notaRec >= 6;
    // }
    // public void verificarNota() {

    //     System.out.println("========== Verificador de Notas =========");
    //     System.out.println("Sua Nota do Teste é : "+this.getNota1());  
    //     System.out.println("Sua Nota da Prova é : "+this.getNota2()); 
    //     System.out.println("Sua Nota da Recuperação é: "+this.getNotaRec()); 
    //     System.out.println("========================================="); 
          
    // }

    // public boolean recuperacao(){
    //     return this.notaRec >= 6;
    // 


    private Aluno aluno;
    private Disciplina disciplina;
    private double nota;

    public LancamentoNota(Aluno aluno, Disciplina disciplina, double nota) {
        this.aluno = aluno;
        this.disciplina = disciplina;
        this.nota = nota;
    }

    // Getters e setters (se necessário)
    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public Disciplina getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }
}
