package lesson_8_Non_accesM.HomeWork;

public class HomeWork {

    static int firstMethod(int a, int b, int c) {
        return a * b * c;
    }

    static void secondMethod(int a1, int b1) {
        System.out.println(a1 * b1 + " " + a1 % b1);
    }
}

class Test {
    public static void main(String[] args) {

        System.out.println(HomeWork.firstMethod(2, 3, 4));
        double r=HomeWork.firstMethod(1,2,3);
        System.out.println(r);
        HomeWork.secondMethod(9, 2);
        HomeWork.secondMethod(2,4);
    }
}