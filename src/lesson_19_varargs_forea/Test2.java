package lesson_19_varargs_forea;

public class Test2 {
    static void summa(String as, int... a) {
        int summa = 0;
        for (int i = 0; i < a.length; i++) {
            summa += a[i];
        }
        System.out.println(summa + " " + as);
    }

    public void abc(int[]...array){

    }
    public static void main(String[] args) {
        summa("load", 2, 4, 5);
    }
}
