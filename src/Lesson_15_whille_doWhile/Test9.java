package Lesson_15_whille_doWhile;

public class Test9 {
    public static void main(String[] args) {
        int chas = 0;

        //будем производить действие в цикле пока переменная chas меньше 24
        OUTER:
        do {
            int minuta = 0;
            INNER:
            while (minuta < 60) {
                if (minuta==20);
                System.out.println(chas + ":" + minuta);
                minuta++;
            }chas++;
        }while (chas<24);
    }
}
