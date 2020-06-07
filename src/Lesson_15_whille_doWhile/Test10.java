package Lesson_15_whille_doWhile;

public class Test10 {
    public static void main(String[] args) {
       OUTER: for (int chas = 0; chas <24 ; chas++) {
            int minuta=0;
          INNER:  while (minuta<59){
                System.out.println(chas+":"+minuta);
                minuta++;
            }

        }
    }
}
