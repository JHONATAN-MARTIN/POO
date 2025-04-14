package com.example.test;

import com.example.java.Aluno;

import java.util.List;

public class AppOFList {
    public static void main(String[] args) {
        Aluno a1 = new Aluno("Elton Kasesky", 18,  "eltonkasesky9@gmail.com");
        Aluno a2 = new Aluno("Ana Julia", 19,  "anajulia@gmail.com");
        Aluno a3 = new Aluno("Lucas Delgado", 19,  "lucas@gmail.com");

        List<Aluno> alunos = List.of(a1, a2); //Não pode ser adicionado nem modificado após a criação (Lista Imutavel)
        alunos.set(0, a3);

        for(Aluno aluno : alunos){
            System.out.println(aluno);
        }
    }
}