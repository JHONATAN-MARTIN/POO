package com.hashset.app;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class App {
    public static void main(String[] args) {
        System.out.println("Times: ");
        Set<String> times = new HashSet<>(); //Não ordena

        times.add("Flamengo");
        times.add("Vasco");
        times.add("Vasco");
        times.add("Fluminense");
        times.add("Botafogo");
        times.add("Flamengo");

        for(String time : times){
            System.out.println(time);
        }

        System.out.println("\nCores: ");
        Set<String> cores = new LinkedHashSet<>(); //Ordena pela ordem de inserção

        cores.add("Azul");
        cores.add("Vermelho");
        cores.add("Branco");
        cores.add("Branco");
        cores.add("Preto");
        cores.add("Azul");

        for(String cor : cores){
            System.out.println(cor);
        }

        System.out.println("\nIdades: ");
        Set<Integer> idades = new TreeSet<>(); //Ordena

        idades.add(10);
        idades.add(20);
        idades.add(25);
        idades.add(18);
        idades.add(20);

        for(Integer idade : idades){
            System.out.println(idade);
        }
    }
}
