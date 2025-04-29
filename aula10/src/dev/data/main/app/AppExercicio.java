package dev.data.main.app;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class AppExercicio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Digite o dia: ");
            int dia = scanner.nextInt();

            System.out.print("Digite o mes: ");
            int mes = scanner.nextInt();

            System.out.print("Digite o ano: ");
            int ano = scanner.nextInt();

            LocalDate data = LocalDate.of(ano, mes, dia);
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd");
            System.out.println("Data inserida: " + data);
            System.out.println("Data formatada: " + data.format(formatter));
        } catch (Exception e) {
            System.err.println("A forma de inserir a data esta incorreta! Use a forma dia/mes/ano.");
        }
        scanner.close();
    }
}
