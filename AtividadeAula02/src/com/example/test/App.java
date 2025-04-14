package com.example.test;

import com.example.java.Fixo;
import com.example.java.Freelancer;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Fixo[] vendedores = {
                new Fixo("Elton Kasesky", "123.456.789-00", 2000.0, 10.0),
                new Fixo("Inajara Giglio", "123.456.789-99", 3000.0, 10.0),
        };

        Freelancer[] freelancers = {
                new Freelancer(vendedores[0].getNome(), vendedores[0].getCpf(), 3, 500.0)
        };

        boolean loop;
        Scanner scanner = new Scanner(System.in);
        double valorVendas = 0.0;

        do{
            System.out.println("----------Sistema de Vendas----------\nVendedores:");
            System.out.println("1-> " + vendedores[0].getNome());
            System.out.println("2-> " + vendedores[1].getNome());

            System.out.print("Escola o vendedor (Digite o número anterior ao nome): ");
            int vendedor = scanner.nextInt();

            System.out.println("Digite o valor da venda: ");
            double valorVenda = scanner.nextDouble();

            valorVendas += valorVenda;
            vendedores[vendedor-1].calcularSalario(valorVenda); //Calculo do salario bruto

            //Calculo do salario bruto somado com o freelancer
            if (vendedores[vendedor - 1].getCpf().equals(freelancers[vendedor - 1].getCpf())) {
                vendedores[vendedor - 1].calcularSalario(freelancers[0]);
            }

            System.out.println("Deseja encerrar o sistema? (S/N): ");
            String encerrar = scanner.next();

            loop = !encerrar.equalsIgnoreCase("S");

            if(!loop){
                System.out.println("\n----------Salário dos Vendedores----------");
                System.out.println("Nome: " + vendedores[0].getNome() + "\nSalário Base: R$" + vendedores[0].getSalarioBase() + "\nSalário Bruto: R$" + vendedores[0].getSalarioBruto());
                System.out.println("\nNome: " + vendedores[1].getNome() + "\nSalário Base: R$" + vendedores[1].getSalarioBase() + "\nSalário Bruto: R$" + vendedores[1].getSalarioBruto());
                System.out.println("\n----------Total Vendido---------- \nTotal: R$" + valorVendas);
            }
        }while(loop);
        scanner.close();
    }
}
