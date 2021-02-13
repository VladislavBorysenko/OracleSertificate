package lesson_14_for.Home;

public class Test1 {
    static void time() {
        OUTER:
        for (int hour = 0; hour <= 6; hour++) {
            MID:
            for (int minuta = 0; minuta <= 59; minuta++) {
                if (hour > 1 && minuta % 10 == 0) {
                    break OUTER;
                }
                INNER:
                for (int secunda = 0; secunda <= 59; secunda++) {

                    if (secunda * hour > minuta) {
                        continue MID;
                    }
                    System.out.println(hour + ":" + minuta + ":" + secunda);
                }
            }
        }
    }

    public static void main(String[] args) {
        time();
    }
}
