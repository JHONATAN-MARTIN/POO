package com.revisao.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AppListas {
    public static void main(String[] args) {
        List<String> cores = new ArrayList<>();
        cores.add("Azul");

        List<Integer> numeros = Arrays.asList(10, 20, 30 ,40);

        List<String> times = List.of("Flamengo", "Vasco");

        for(String time : times){
            System.out.println(time);
        }
    }
}
