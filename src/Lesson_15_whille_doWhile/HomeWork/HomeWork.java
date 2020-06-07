package Lesson_15_whille_doWhile.HomeWork;

public class HomeWork {
    static void time() {
        int hour = 0;


        OUTER:
        while (hour < 6) {

            int minute = -1;

            MID:
            do {
                minute++;

                if (hour > 1 && minute % 10 == 0) {
                    break OUTER;
                }
                int second = 0;

                INNER:
                while (second <= 59) {


                    if (second * hour > minute) {
                        continue MID;
                    }
                    System.out.println(hour + ":" + minute + ":" + second);
                    second++;
                }


            } while (minute <= 59);
            hour++;
        }
    }

    public static void main(String[] args) {
        time();
    }
}
