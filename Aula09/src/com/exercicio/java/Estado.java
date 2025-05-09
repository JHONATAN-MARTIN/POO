package com.exercicio.java;

public class Estado {
    private String nome;
    private String sigla;

    public Estado(String nome, String sigla) {
        this.nome = nome;
        this.sigla = sigla;
    }

    @Override
    public String toString() {
        return "Estado" +
                ", nome: " + this.getNome() +
                ", sigla: " + this.getSigla();
    }

    public String getNome() {
        return nome;
    }

    public String getSigla() {
        return sigla;
    }
}
