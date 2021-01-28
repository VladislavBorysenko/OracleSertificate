package Lesson_28_DATE_TIME;

import java.time.*;

public class Test1 {
    public static void main(String[] args) {
//        System.out.println(LocalDate.now());
//        System.out.println(LocalTime.now());
//        System.out.println(LocalDateTime.now());

        LocalDate ld = LocalDate.of(2001, 12, 4);
        System.out.println(ld);


        LocalDate ld2 = LocalDate.of(2020, Month.OCTOBER, 5);
        System.out.println(ld2);


        LocalTime lt1 = LocalTime.of(15, 34);
        LocalTime lt2 = LocalTime.of(15, 34, 22);
        LocalTime lt3 = LocalTime.of(15, 34, 22, 34554);
        System.out.println(lt1);
        System.out.println(lt2);
        System.out.println(lt3);

        LocalDateTime ldt1 = LocalDateTime.of(2020, Month.OCTOBER, 4, 21, 15);
        LocalDateTime ldt2 = LocalDateTime.of(2020, Month.OCTOBER, 4, 21, 03, 34);
        LocalDateTime ldt3 = LocalDateTime.of(2020, Month.OCTOBER, 4, 21, 03, 34, 99999999);
        System.out.println(ldt1);
        System.out.println(ldt2);
        System.out.println(ldt3);

        //методы
        System.out.println("ld=" + ld);
        LocalDate ld1 = ld.plusDays(12);
        System.out.println("new ld1 =" + ld1);
        LocalDate ld3 = ld.minusDays(12);
        System.out.println(ld3);
        LocalDate ld4 = ld.plusWeeks(12);
        LocalDate ld5 = ld.plusMonths(12);
        LocalDate ld6 = ld.plusYears(12);

        LocalTime lt = LocalTime.of(12, 23);
        System.out.println(lt);
        lt = lt.plusHours(12).minusMinutes(245).plusSeconds(780).minusNanos(56);

        System.out.println(lt);

        LocalDateTime ldt = LocalDateTime.of(2020,10,9,34,43);


    }
}
