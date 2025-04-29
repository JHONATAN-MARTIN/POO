package com.hashset.app;

import com.hashset.java.Aluno;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class AppAluno {
    public static void main(String[] args) {
        Set<Aluno> alunos = new TreeSet<>();
        alunos.add(new Aluno("Elton Kasesky", "a@gmail.com", 18));
        alunos.add(new Aluno("Ana Julia", "b@gmail.com", 20));
        alunos.add(new Aluno("Inajara Giglio", "c@gmail.com", 60));
        alunos.add(new Aluno("Jean Carlos", "d@gmail.com", 40));
        alunos.add(new Aluno("Jean Carlos", "d@gmail.com", 40));

        /*for(Aluno aluno : alunos){
            System.out.println(aluno);
        }*/

        Set<Integer> numeros = new HashSet<>();
        numeros.add(20);
        numeros.add(20);
        numeros.add(30);

        for(Integer numero : numeros){
            System.out.println(numero);
        }
    }
}
