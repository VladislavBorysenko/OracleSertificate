package lesson_28_DATE_TIME;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Test5 {
    public static void main(String[] args) {
        LocalDate ld=LocalDate.of(2020,10,11);
        LocalDateTime ldt=LocalDateTime.of(2020,10,11,23,3);
        System.out.println(ld.getDayOfWeek());
        System.out.println(ldt.getDayOfWeek());
        System.out.println(ld.getDayOfMonth());
        System.out.println(ldt.getDayOfMonth());
        System.out.println(ld.getDayOfYear());
        System.out.println(ldt.getDayOfYear());
        System.out.println(ld.getMonth());
        System.out.println(ldt.getMonth());
        System.out.println(ld.getEra());
        System.out.println(ldt.getHour());
        System.out.println(ld.getMonthValue());

        System.out.println(ld.getChronology());
        System.out.println(ldt.getChronology());

        LocalTime lt=LocalTime.of(14,47);
        System.out.println(lt.getHour());
        System.out.println(lt.getMinute());
        System.out.println(lt.getSecond());
        System.out.println(lt.getNano());

        DateTimeFormatter d1=DateTimeFormatter.ISO_LOCAL_DATE;
        DateTimeFormatter d2=DateTimeFormatter.ISO_ORDINAL_DATE;

        System.out.println(ld.format(d1));
        System.out.println(ld.format(d2));
        System.out.println(lt.format(DateTimeFormatter.ISO_LOCAL_TIME));

        DateTimeFormatter d4=DateTimeFormatter.ISO_WEEK_DATE;
        System.out.println(ld);
        System.out.println(ld.format(d4));

        DateTimeFormatter shortFormat=DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
        DateTimeFormatter shortTimeFormat=DateTimeFormatter.ofLocalizedTime(FormatStyle.MEDIUM);
        System.out.println(ld);
        System.out.println(ld.format(shortFormat));
        System.out.println(lt);
        System.out.println(lt.format(shortTimeFormat));
        System.out.println(shortFormat.format(ldt));
        System.out.println(d4.format(ld));

        DateTimeFormatter f=DateTimeFormatter.ofPattern("dd MMMM , yyyy, hh:mm");
        DateTimeFormatter f1=DateTimeFormatter.ofPattern("MM dd yyyy");
        System.out.println(ldt);
        System.out.println(ldt.format(f));
        LocalDate ld1=LocalDate.parse("10 12 2020",f1);
        System.out.println(ld1);
    }
}
