package lesson_23_Overriding_Hiding_Final;

public class A10 {
    String s1="privet";
    static double pi=3.14;
    int summa(int...i){
        int result=0;
        for (int a:i
             ) {
            result+=a;
        }
        return result;
    }
    static void abc(){
        System.out.println("static method");
    }

}
class B10 extends A10{
//    String s2=super.s1+" drug";
    boolean s1=true;

    @Override
    int summa(int... i) {
        int result=super.summa(i);
        return result;
    }

    public static void main(String[] args) {
        B10 b=new B10();
        System.out.println(b.s1);
       // System.out.println(super.s1);
        }
}
