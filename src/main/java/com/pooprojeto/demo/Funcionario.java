package com.pooprojeto.demo;

import classesAntigas.Endereco;

abstract class Funcionario extends Pessoa {

    private double salario;

    // Construtores
    public Funcionario(String nome, String cpf, String email, String telefone, String login, String senha,
            double salario) {
        super(nome, cpf, email, telefone, login, senha);
        this.salario = salario;
    }

    public Funcionario(String nome, String cpf, String email, String telefone, String login, String senha, Endereco endereco,double salario) {
        super(nome, cpf, email, telefone, login, senha, endereco);
        this.salario = salario;
    }

    public Funcionario(String nome, String cpf, String email, String telefone, String login, String senha,
            Endereco endereco) {
        super(nome, cpf, email, telefone, login, senha, endereco);
    }

    // Getters e Setters
    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }

    public void contraCheque() {
        System.out.println("Impressão de contracheque para Gerente: ");
        System.out.println("Salário Base: " + getSalario());

        double fgts = getSalario() * 0.08;
        double inss = getSalario() * 0.12;
        System.out.println("FGTS: " + fgts);
        System.out.println("INSS: " + inss);
    }
}