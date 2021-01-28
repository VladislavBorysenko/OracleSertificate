package Lesson_28_DATE_TIME;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class HomeWork {
    public static void main(String[] args) {
        DateTimeFormatter f1 = DateTimeFormatter.ofPattern("yyyy, MMMM-dd !! hh mm");
        DateTimeFormatter f2 = DateTimeFormatter.ofPattern("hh:mm, dd/MMM/yy");
        LocalDateTime ldt1 = LocalDateTime.of(2016, Month.JANUARY, 01, 9, 00);
        LocalDateTime ldt2 = LocalDateTime.of(2016, Month.FEBRUARY, 03, 9, 00);
        System.out.println(ldt1.format(f1));
        System.out.println(ldt2.format(f2));
        Period p = Period.ofDays(2);
        Duration d = Duration.ofHours(2);
        smena(ldt1, ldt2, p, d);
    }

    static void smena(LocalDateTime ldt1, LocalDateTime ldt2, Period p, Duration d) {

        DateTimeFormatter f1 = DateTimeFormatter.ofPattern("yyyy, MMMM-dd !! hh mm");
        DateTimeFormatter f2 = DateTimeFormatter.ofPattern("hh:mm, dd/MMM/yy");
        do {
            System.out.println("Работаем с :" + ldt1.format(f1));

            ldt1 = ldt1.plus(p).plus(d);
            System.out.println("До: " + ldt1.format(f1));


            ldt1 = ldt1.plus(p).plus(d);
            System.out.println("Отдыхаем с: " + ldt1.format(f2));

            ldt1 = ldt1.plus(p).plus(d);
            System.out.println("До: " + ldt1.format(f2));
            System.out.println("____________________________________________________________________________");

        }
        while (ldt1.isBefore(ldt2));


    }
}
