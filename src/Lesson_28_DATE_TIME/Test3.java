package Lesson_28_DATE_TIME;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

public class Test3 {
    static void smenaDezhurnogo(LocalDate nachalo, LocalDate konec, Period p){
        LocalDate data=nachalo;
        while (data.isBefore(konec)){
            System.out.println("nastupila data: "+data+" - pora menyat dezhurnogo");
            data=data.plus(p);
        }
    }

    public static void main(String[] args) {
        LocalDate nachalo=LocalDate.of(2020,9,1);
        LocalDate konec=LocalDate.of(2021, Month.MAY,31);
        Period p=Period.of(1,1,1);
        smenaDezhurnogo(nachalo,konec,p);

    }
}
