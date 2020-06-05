package Lesson_9_Variables.HomeWork;

public class Test1 {
   // int a=1;
    static int a=1;
    void abc(int a){
        System.out.println(a);
        System.out.println(this.a   );
    }

    public static void main(String[] args) {
        Test1 t1=new Test1();
        t1.abc(3);
    }
}
