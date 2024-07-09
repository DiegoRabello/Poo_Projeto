package com.pooprojeto.demo;

public class Endereco{

    private static int contador = 1;

    private int idEndereco;
    private int cep;
    private String uf;
    private String cidade;
    private String tipo;
    private String logadouro;
    private String complemento;

    public Endereco (int cep){
        this.cep = cep;
        this.idEndereco = contador;
        contador++;
    }
    public int getIdEndereco (){
        return idEndereco;
    }
    public int getCep(){
        return cep;
    }
    public String getUf(){
        return uf;
    }
    public String getCidade(){
        return cidade;
    }
    public String getTipo(){
        return tipo;
    }
    public String getLogadouro(){
        return logadouro;
    }
    public String getComplemento(){
        return complemento;
    }
    public void setIdEndereco(int idEndereco){
        this.idEndereco = idEndereco;
    }
    public void setCep(int cep){
        this.cep = cep;
    }
    public void setUf(String uf){
        this.uf = uf;
    }
    public void setCidade(String cidade){
        this.cidade = cidade;
    }
     public void setTipo( String tipo){
        this.tipo = tipo;
    }
    public void setLogadouro( String logadouro){
        this.logadouro = logadouro;
    }
    public void setComplemento(String complemento){
        this.complemento = complemento;
    }

}