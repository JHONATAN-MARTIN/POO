package com.example.java;

public class Fixo extends Vendedor{
    private Double salarioBase;
    private Double comissao;
    private Double salarioBruto;

    public Fixo(String nome, String cpf, Double salarioBase, Double comissao) {
        super(nome, cpf);
        this.salarioBase = salarioBase;
        this.setComissao(comissao);
        this.setSalarioBruto();
    }

    public Double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(Double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public Double getComissao() {
        return comissao;
    }

    public void setComissao(Double comissao) {
        this.comissao = (comissao/100);
    }

    public Double getSalarioBruto() {
        return salarioBruto;
    }

    public void setSalarioBruto() {
        this.salarioBruto = this.salarioBase;
    }

    public void setSalarioBruto(Double salarioBruto) {
        this.salarioBruto = salarioBruto;
    }

    public void calcularSalario(Double valorVenda){
        if(valorVenda == null || valorVenda < 0){
            System.out.println("Cadastre uma venda valida!");
        } else {
            this.salarioBruto += (this.getComissao() * valorVenda);
        }
    }

    public void calcularSalario(Freelancer freelancer){
        this.salarioBruto += freelancer.calculoFreelancer();
    }
}