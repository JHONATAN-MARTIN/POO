package dev.arquivo.app;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class AppLeitura {
    public static void main(String[] args) {
        File arquivo = new File("/Curso/aula.txt");

        try {
            Scanner scanner = new Scanner(arquivo);
            System.out.println("Arquivo encontrado.");

            while (scanner.hasNext()){
                System.out.println(scanner.nextLine());
            }
        } catch (FileNotFoundException e) {
            System.err.println("Arquivo não encontrado. Verifique a rota do arquivo!");
            e.printStackTrace();
        }
    }
}
