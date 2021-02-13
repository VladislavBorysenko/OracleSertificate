package lesson_26_Equals_ToString;

public class Test5 {
    public Test5() {
        System.out.println("Eto konstructor");
    }

    public Test5(int a) {
        this();
        System.out.println("Eto konstructor 2");
    }

    {  //initializer block

        int b = 5;
        System.out.println("eto init block 1");
    }

    static {
        System.out.println("static init block 1");
    }

    {
        System.out.println("eto init block 2");
    }

    static {
        System.out.println("static init block 2");
    }

    public static void main(String[] args) {
        Test5 t = new Test5();
        Test5 t2 = new Test5();
        Test5 t3 = new Test5();
    }
}
