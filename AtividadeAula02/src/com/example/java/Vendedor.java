package com.example.java;

public abstract class Vendedor {
    protected String nome;
    protected String cpf;

    public Vendedor(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        return "Vendedor{" +
                "nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }
}
