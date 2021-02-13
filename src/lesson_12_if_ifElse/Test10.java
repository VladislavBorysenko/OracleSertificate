package lesson_12_if_ifElse;

public class Test10 {

    static void maximum(int i1, int i2, int i3) {
        if (i1 > i2 && i1 > i3) {
            System.out.println("maximum  i1=" + i1);
        } else if (i2 > i1 && i2 > i3) {
            System.out.println("maximum i2=" + i2);
        } else if (i3 > i2 && i3 > i1) {
            System.out.println("maximum i3=" + i3);
        } else {
            System.out.println("ERROR");
        }
    }

    void abc() {

        String str=null;
        int i=1;

        if (i<10){
            str="POKA";
        }
        if (i>=10){
            str="Privet";
        }
        System.out.println(str);
    }

    public static void main(String[] args) {

        int a = 10;
        if (a < 20) {
            System.out.println("a < 20");
        } else {
            System.out.println("a >20");
            System.out.println("Vsem privet");
        }

        int salary = 800;

        if (salary < 200) {
            System.out.println("oчень маленькая зарплата");
        } else if (salary < 400) {
            System.out.println("зарплата среднего размера");
        } else if (salary < 600) {
            System.out.println("Зарплата высокая");
        } else {
            System.out.println("Зарплата отличная");
        }

        maximum(4, 8, 8);
        Test10 ts = new Test10();
        ts.abc();

        int b=12;
        int c =20;
        int max=(c>b?c:b);
        System.out.println(max);
    }
}
