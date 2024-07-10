package com.pooprojeto.demo;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

import org.springframework.cglib.core.Local;
public class Pessoa {
    //atributos
    private static int contador = 1;
    private int idpessoa;

    private String nome;
    private LocalDate dtNascimento;
    private String cpf;
    private String rg;
    private String email;
    private String telefone;
    private String login;
    private String senha;
    private Endereco endereco;

    public Pessoa(String nome) {
        this.nome = nome;
    }

    //construtores
    public Pessoa(String nome, LocalDate dtNascimento, String cpf, String email, String telefone, String login, String senha, Endereco endereco) {
        this.nome = nome;
        this.dtNascimento = dtNascimento;
        this.cpf = cpf;
        this.email = email;
        this.telefone = telefone;
        this.login = login;
        this.senha = senha;
        this.endereco = endereco;
        idpessoa = contador;
        contador++;
    }

    public Pessoa(LocalDate dtNascimento) {
        this.dtNascimento = dtNascimento;
    }

    public boolean autentica(String login, String senha) {
        return this.login.equals(login) && this.senha.equals(senha);
    }

    public void idade() {
        LocalDate currentDate = LocalDate.now();
        Period age = Period.between(dtNascimento, currentDate);
        System.out.println("Sua idade é " + age.getYears());
    }

    // Getters and Setters
    public int getIdpessoa() {
        return idpessoa;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDtNascimento() {
        return dtNascimento;
    }

    public void setDtNascimento(LocalDate dtNascimento) {
        this.dtNascimento = dtNascimento;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        if (cpf.length() == 11) {
            this.cpf = cpf;
        }
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        if (rg.length() == 9) {
            this.rg = rg;
        }
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}

