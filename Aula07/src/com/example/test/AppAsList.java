package com.example.test;

import com.example.java.Aluno;

import java.util.Arrays;
import java.util.List;

public class AppAsList {
    public static void main(String[] args) {
        Aluno a1 = new Aluno("Elton Kasesky", 18,  "eltonkasesky9@gmail.com");
        Aluno a2 = new Aluno("Ana Julia", 19,  "anajulia@gmail.com");
        //Aluno a3 = new Aluno("Lucas Delgado", 19,  "lucas@gmail.com");

        List<Aluno> alunos = Arrays.asList(a1, a2); //Depois de criada a lista, não pode ser adicionado mais nada
        //alunos.add(a3);

        for (Aluno aluno : alunos){
            System.out.println(aluno);
        }
    }
}
