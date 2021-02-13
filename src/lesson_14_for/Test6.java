package lesson_14_for;

public class Test6 {
    public void time() {//выводим на экран время через цикл (поминутно)

        OUTER:
        for (int chas = 0; chas <= 23; chas++) {
            System.out.println("Nachalo outer loopa");

            INNER:
            for (int minuta = 0; minuta <= 59; minuta++) {

                System.out.println(chas + ":" + minuta + ":");
                //if (minuta == 30) break OUTER;
                if (minuta==20)continue OUTER;
            }

            System.out.println("konec outer loopa");

        }
    }


    public static void main(String[] args) {
        Test6 ts = new Test6();
        ts.time();
    }
}
