package com.pooprojeto.demo;

public class Menu {

    public void verificarNota(Disciplina disciplina) {
        

        System.out.println("========== Verificador de Notas =========");
        System.out.println("Sua Nota do Teste é : "+disciplina .getNota1());  
        System.out.println("Sua Nota da Prova é : "+disciplina.getNota2()); 
        System.out.println("Sua Nota da Recuperação é: "+disciplina.getNotaRec()); 
        System.out.println("Sua Nota Final é: "+disciplina.getMedia());
        System.out.println("=========================================");   
    }
    public void alugarLivro(Aluno aluno) {
         //continuar
         if (aluno.getContadorAluguel()==0) {
            System.out.println("Digite o Nome do Livro: ");
            aluno.setContadorAluguel(1);
        }else {
            System.out.println("Você ja tem um Aluguel em aberto");
        }    
    }
    public void devolverLivro(Aluno aluno) {
        if (aluno.getContadorAluguel()==1) {
            System.out.println("Livro Devolvido!");
            aluno.setContadorAluguel(0);
        } else {
            System.out.println("Você não tem Livro para devoler!");
        }
    }
    
}
