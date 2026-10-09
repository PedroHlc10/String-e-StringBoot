package com.produto.api.model;

public class Carro{
    private int id;
    private String nome;

    public Carro(int id, String nome){
        this.id = id;
        this.nome = nome;
    }

    public int getInt(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }

    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
}