package dev.arquivo.app;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class AppGravarArquivo {

    public static void main(String[] args) {
        BufferedWriter gravar = null;

        try {
            gravar = new BufferedWriter(new FileWriter("/Curso/arquivo.txt"));
            gravar.append("teste\n");
            gravar.append("aula 10 de java");
            gravar.close();
        } catch (IOException e) {
            System.out.println("Erro ao gravar arquivo.");
            e.printStackTrace();
        }
    }
}
