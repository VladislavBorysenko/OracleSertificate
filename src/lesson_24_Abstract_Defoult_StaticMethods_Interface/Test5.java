package lesson_24_Abstract_Defoult_StaticMethods_Interface;

public class Test5 {
}
interface I1{

    default void abc(){
        System.out.println("eto method ghi");
    };
    static void def(){
        System.out.println("static method");
    }
}

interface  I2 extends I1{
    static void def(){
        System.out.println("static method");
    }
}
abstract class O{}
class R extends O implements I1{
   static I2 method1(I2 i){return new D2();}
    public static void main(String[] args) {
       I2 i=new D2();
method1(i);
    }
}

class D2 implements I2{}
//class Z2 implements I1{
//    @Override
//    public void abc() {
//        System.out.println("eto method abc");
//    }
//
//    public static void main(String[] args) {
//        Z2 z=new Z2();
//        z.abc();
//        z.def();
//        z.ghi();
//    }
//}