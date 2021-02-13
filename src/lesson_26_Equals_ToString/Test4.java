package lesson_26_Equals_ToString;

public class Test4 {

    static void abc(String s) {
        System.out.println("A");
    }

    static void abc(String... s) {
        System.out.println("B");
    }

    static void abc(Object s) {
        System.out.println("C");
    }

    static void abc(String s1, String s2) {
        System.out.println("D");
    }

    public static void main(String[] args) {
        Test4.abc("ok", "!!!");
    }


}
