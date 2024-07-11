package com.pooprojeto.demo;
import java.time.LocalDate;

abstract class Funcionario extends Pessoa{

    private static int contador = 1;
    private int idFuncionario;
    private double salario;
    
    public void setSalario(double salario) {
        this.salario = salario;
    }
    public double getSalario() {
        return salario;
    }
    public Funcionario(String nome, LocalDate dtNascimento, String cpf, String email, String telefone, String login, String senha, Endereco endereco,double salario){
        super(nome, dtNascimento, cpf, email, telefone, login, senha, endereco);

        this.salario = salario;
        this.idFuncionario = contador;
        contador++; 
    }
    // @Override
    // public boolean autentica(String login, String senha){
    //     return this.login.equals(login) && this.senha.equals(senha);
    // }
    public void contraCheque() {
        System.out.println("Impressão de contracheque para Gerente: ");
        System.out.println("Salário Base: " + getSalario());
        
        double fgts = getSalario() * 0.08;
        double inss = getSalario() * 0.12;
        System.out.println("FGTS: " + fgts);
        System.out.println("INSS: " + inss);
    }
}