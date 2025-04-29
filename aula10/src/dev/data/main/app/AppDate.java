package dev.data.main.app;

import java.util.Calendar;
import java.util.Date;

public class AppDate {
    public static void main(String[] args) {
        Date data = new Date();
        System.out.println("Data de hoje: \n"+ data);
        System.out.println(data.getHours());

        Calendar dataHoje = Calendar.getInstance();
        //System.out.println("Data de hoje: \n"+ dataHoje);
        System.out.println(dataHoje.get(Calendar.MONTH));
    }
}
