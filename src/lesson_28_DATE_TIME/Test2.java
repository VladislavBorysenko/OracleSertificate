package lesson_28_DATE_TIME;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Test2 {
    public static void main(String[] args) {
        LocalDate ld1=LocalDate.of(2020,10,9);
        LocalTime lt1=LocalTime.of(12,45);
        LocalDateTime ldt1=LocalDateTime.now();
        LocalDateTime ldt2=LocalDateTime.of(2020,10,17,23,23);
        System.out.println(ldt1);
        System.out.println(ldt1.isBefore(ldt2));
    }
}
