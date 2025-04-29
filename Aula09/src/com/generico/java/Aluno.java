package com.generico.java;

public class Aluno {
    private String nome;
    private Integer idade;

    public Aluno(String nome, Integer idade) {
        this.nome = nome;
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "Nome: " + this.getNome() +
                ", idade: " + this.getIdade();
    }

    public String getNome() {
        return nome;
    }

    public Integer getIdade() {
        return idade;
    }
}
