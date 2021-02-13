package lesson_26_Equals_ToString;

public class Test6 {

    int a = 3;

    Test6() {
        a = 4;
    }

    {
        a = 5;
    }

//    public static void main(String[] args) {
//        Test6 t=new Test6();
//        System.out.println(t.a);
//    }
//}
}

class A {
    static final int b;

    static {
        b = 10;
    }
}

class C {
    String s = "ok";

    {
        System.out.println(s);
    }

    static int i = 0;

    static {
        System.out.println(i);
    }

    static {
        i = i + 1;
        System.out.println(i);
    }

    C() {
        System.out.println("eto konstructor");
    }

    public static void main(String[] args) {
        C c = new C();
    }
}

class D {
    static {
        abc(2);
    }

    static void abc(int a) {
        System.out.println("A=" + a);
    }

    D() {
        abc(5);
    }

    static {
        abc(4);
    }

    {
        abc(6);
    }

    static {
        new D();
    }

    {
        abc(8);
    }

    //2,4,6,8,5
    public static void main(String[] args) {

    }
}