package lesson_24_Abstract_Defoult_StaticMethods_Interface;

public class Test6 {
}

interface I11 {
    private static void method1(){
        System.out.println("Static method 1");
    }
    private void method2(){
        System.out.println();
    }

    default void method3(){
        method1();
    }
    static void method4(){
        method1();
    }
}
