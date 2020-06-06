package Lesson_14_for;

public class Test2 {
    public static void main(String[] args) {
        for (int i = 0, j = 2; i < 11; i++, j += 5, abc(10)) {
            System.out.println(i + " " + j);
        }

        for (int i = 0; i < 5; ) {
            System.out.println(i);
            i++;
        }
    }

    static void abc(int n) {
        System.out.println(n);
    }
}
