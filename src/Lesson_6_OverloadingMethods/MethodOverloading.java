package Lesson_6_OverloadingMethods;

public class MethodOverloading {
    void show(int i1) {
        System.out.println(i1);
    }

    void show(boolean b1){
        System.out.println(b1);
    }

    void show(String s1){
        System.out.println(s1);
    }

    void show(String s, int i){
        System.out.println("String "+s+"\nInt "+i);
    }

    void show(int i2, String s2){
        System.out.println("Good day");
    }
}

//--------------------------------------------------------------------------------------

class MethodOverlodingTest {
    public static void main(String[] args) {
        MethodOverloading mo = new MethodOverloading();
        int a = 20;
        mo.show(a);
        boolean b2=true;
        mo.show(b2);
        String s="Privet";
        mo.show(s);
        mo.show(s,10);
        mo.show(10,"Privet");
    }

}