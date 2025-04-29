package dev.data.main.app;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class AppInstant {
    public static void main(String[] args) {
        /*Instant dataHoje = Instant.now();
        System.out.println(dataHoje);*/

        /*LocalDateTime dataConvertida = LocalDateTime.ofInstant(dataHoje, ZoneId.systemDefault());
        System.out.println("Data convertida para fuso de São Paulo\n" + dataConvertida);*/

        Instant dataNova = Instant.parse("2025-04-16T01:00:00Z");
        LocalDateTime dataConvertida2 = LocalDateTime.ofInstant(dataNova, ZoneId.systemDefault());
        System.out.println("Data convertida para fuso de São Paulo\n" + dataConvertida2);
    }
}