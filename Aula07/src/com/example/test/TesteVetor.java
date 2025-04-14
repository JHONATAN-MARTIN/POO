package com.example.test;

import java.util.Arrays;
import java.util.List;

public class TesteVetor {
    public static void main(String[] args) {
        String[] carros = {"Sandero","HB20","Versa","KA","Corsa"};
        List<String> carrosAsList = Arrays.asList(carros);

        carrosAsList.set(0, "Fusca");
        carros[1] = "Fox";

        for (String carro : carrosAsList) {
            System.out.println(carro);
        }
    }
}
