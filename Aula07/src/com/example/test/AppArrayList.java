package com.example.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AppArrayList {
    public static void main(String[] args) {
        List<String> times = new ArrayList<>();

        times.add("Flamengo");
        times.add("Vasco");
        times.add("Fluminense");
        times.add("Botafogo");

        System.out.println("A lista contem Flamengo: " + (times.contains("Flamengo")?"Sim":"Não"));
        System.out.println("A lista esta vazia: " + (times.isEmpty()?"Sim":"Não"));

        //Collections.sort(times); //Ordena a lista por ordem alfabetica
        //Collections.shuffle(times); //Embaralha a lista
        Collections.reverse(times); //Inverte a lista

        for(String time : times){
            System.out.println(time);
        }
    }
}
