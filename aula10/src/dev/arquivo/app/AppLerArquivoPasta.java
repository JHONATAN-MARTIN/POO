package dev.arquivo.app;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class AppLerArquivoPasta {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Informe o caminho do diretorio ou nome do arquivo: ");
            String diretorio = scanner.nextLine();

            File file = new File(diretorio);

            if(file.exists()){
                if(file.isFile()){
                    System.out.printf("\nArquivo %s existe: - tamanho %d bytes", file.getName(), file.length());
                } else {
                    System.out.println("\nConteúdo da pasta: ");
                    for(File f: file.listFiles()){
                        System.out.println(f);
                    }
                }
            } else {
                throw new FileNotFoundException("Diretorio ou arquivo não encontrado!");
            }
        } catch(Exception e){
            System.err.println(e.getMessage());
        }
        scanner.close();
    }
}