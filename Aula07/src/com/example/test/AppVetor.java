package com.example.test;

import com.example.java.Aluno;

import java.util.Scanner;

public class AppVetor {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Aluno[] alunos = new Aluno[2];

        try {
            for(int i = 0; i < alunos.length; i++){
                alunos[i] = new Aluno("", 0,  "");
                System.out.print("Insira o nome do aluno: ");
                alunos[i].setNome(sc.next());
                System.out.print("Insira o idade do aluno: ");
                alunos[i].setIdade(sc.nextInt());
                System.out.print("Insira o email do aluno: ");
                alunos[i].setEmail(sc.next());
                System.out.println("Aluno cadastrado!");
            }
        } catch (NullPointerException e) {
            System.out.println("Foi inserida uma frase nula!");
            e.printStackTrace();
        } catch(IllegalArgumentException e) {
            System.out.println("Foi inserido um caracter invalido!");
            e.printStackTrace();
        } finally {
            sc.close();
            for(Aluno aluno : alunos){
                System.out.println(aluno);
            }
        }
    }
}