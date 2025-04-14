package com.example.java;

public class Freelancer extends Vendedor{
    private Integer diasTrabalhados;
    private Double valorDia;

    public Freelancer(String nome, String cpf, Integer diasTrabalhados, Double valorDia) {
        super(nome, cpf);
        this.diasTrabalhados = diasTrabalhados;
        this.valorDia = valorDia;
    }

    public Integer getDiasTrabalhados() {
        return diasTrabalhados;
    }

    public Double getValorDia() {
        return valorDia;
    }

    public Double calculoFreelancer(){
        return this.getDiasTrabalhados() * this.getValorDia();
    }
}
