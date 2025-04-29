package dev.data.main.app;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.time.temporal.ChronoUnit;
import java.util.Locale;

public class AppLocalDate {

    public static void main(String[] args) {

        LocalDate dataHoje = LocalDate.now();
        // LocalDate dataManual = LocalDate.of(2025, 4, 15);

        Locale locale = new Locale("pt", "BR");

        System.out.println(dataHoje.getDayOfWeek().getDisplayName(TextStyle.FULL_STANDALONE, locale));
        System.out.println(dataHoje.isLeapYear() ? "Sim" : "Não");

        LocalTime hora = LocalTime.now();
        System.out.println(hora.plusHours(2));

        LocalDate dataNascimento = LocalDate.of(1975, 6, 13);

        Period periodo = Period.between(dataNascimento, dataHoje);
        System.out.println("Sua idade é:" + periodo.getYears() + " anos"
                + periodo.getMonths() + " meses" + periodo.getDays() + " dias");
        //System.out.println(periodo.get(ChronoUnit.YEARS));
//		Duration duration = Duration.between(dataNascimento, dataHoje);
//		long dias = duration.toDays();
//		System.out.println(dias);
//
        System.out.println(ChronoUnit.DAYS.between(dataNascimento, dataHoje));

        LocalDateTime dataHora = LocalDateTime.now();
        System.out.println(dataHora);

        ZoneId fuso = ZoneId.systemDefault();
        System.out.println(fuso);

        for (String s : ZoneId.getAvailableZoneIds()) {
            //System.out.println(s);
        }

        DateTimeFormatter formatarData = DateTimeFormatter.ofPattern("dd-M-yy");
        System.out.println(dataHoje.format(formatarData));
    }
}