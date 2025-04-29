package com.exercicio.app;

import com.exercicio.java.Estado;

import java.util.HashMap;
import java.util.Map;

public class AppEstado {
    public static void main(String[] args) {
        /*Map<Integer, Estado> estados = new HashMap<>();

        estados.put(1, new Estado("Rio de Janeiro", "RJ"));
        estados.put(2, new Estado("São Paulo", "SP"));
        estados.put(3, new Estado("Minas Gerais", "MG"));

        for (Estado estado : estados.values()){
            System.out.println(estado);
        }*/

        Map<String, String> estados = new HashMap<>();
        estados.put("RJ", "Rio de Janeiro");
        estados.put("SP", "São Paulo");
        estados.put("MG", "Minas Gerais");

        //Imprime a chave
        for(String sigla : estados.keySet()){
            System.out.println(sigla);
        }

        //Imprime o valor
        for(String nome : estados.values()){
            System.out.println(nome);
        }

        //Imprime chave e valor (Juntos)
        for(Map.Entry<String, String> dados : estados.entrySet()){
            System.out.println(dados);
        }
    }
}
