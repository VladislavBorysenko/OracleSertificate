package Lesson_25_Polymorphism_Operator_instanceof;

public class Test6 {
}

class Test10{
    int a=5;
    void abc(){
        System.out.println("ok1");
    }
}
class Test20 extends Test10{
    int a=10;
    void abc(){
        System.out.println("ok2");
    }
}

class Test30 extends Test20{
    int a=15;
    void abc(){
        System.out.println("ok3");}

    public static void main(String[] args) {
        Test30 t=new Test30();
        System.out.println(((Test10)t).a);
        ((Test10)t).abc();// ok3
        ((Test20)t).abc();// ok3
        ((Test30)t).abc();// ok3

    }
}