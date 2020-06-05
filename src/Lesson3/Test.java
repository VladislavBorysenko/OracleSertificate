package Lesson3;

public class Test {
    public static void main(String[] args) {
        int a = 5;
        int b = a;
        // System.out.println(b);

        int x = 1, z = 2, y = 3;
       // z = x + y++;
        //System.out.println(z);
        //System.out.println(y);
        z = x + ++y;
        System.out.println(z);

    }
}
