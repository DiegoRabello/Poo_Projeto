package com.pooprojeto.demo;

import java.time.LocalDate;

public class Diretor extends Funcionario{
    
    public Diretor(String nome, LocalDate dtNascimento, String cpf, String email, String telefone, String login, String senha, Endereco endereco, double salario) {
        super(nome, dtNascimento, cpf, email, telefone, login, senha, endereco,salario);
    }
}
