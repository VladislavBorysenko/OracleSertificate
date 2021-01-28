package Lesson_28_DATE_TIME;

import java.time.*;

public class Test4 {
    public static void main(String[] args) {
        LocalTime lt=LocalTime.of(10,20);
        LocalDate nachalo=LocalDate.of(2020, Month.SEPTEMBER,1);
        LocalDateTime ldt=LocalDateTime.of(2020,10,11,23,3);
        Period p=Period.ofMonths(1).ofDays(10);//выполниться только ofDays(10)
        Duration d=Duration.ofMinutes(22);
        System.out.println(nachalo.plus(p).plus(d));
        System.out.println(lt.plus(p).plus(d));
        System.out.println(ldt.plus(p).plus(d));
    }
}
