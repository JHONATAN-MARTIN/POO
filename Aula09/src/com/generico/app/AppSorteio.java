package com.generico.app;

import com.generico.java.Aluno;
import com.generico.java.Sorteio;

public class AppSorteio {
    public static void main(String[] args){
        /*Aluno a1 = new Aluno("Elton Kasesky", 18);
        Aluno a2 = new Aluno("Ana Julia", 20);
        Aluno a3 = new Aluno("Jean Carlos", 40);

        Sorteio<Aluno> sorteio = new Sorteio<>();

        sorteio.adicionar(a1, a2, a3);
        System.out.println("Aluno sorteado: " + sorteio.sortear());*/

        Sorteio<Integer> sorteioNum = new Sorteio<>();
        sorteioNum.adicionar(10, 20, 30, 40, 50, 60, 70, 80, 90, 100);
        System.out.println("Número sorteado: " + sorteioNum.sortear());
    }
}