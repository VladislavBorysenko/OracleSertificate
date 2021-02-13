package lesson_6_OverloadingMethods;

public class MethodOverloading2 {

  private   int sum(int a, int b){
        System.out.println(a+b);
        return a+b;
    }

  public   String sum(String s1, String s2){
        System.out.println(s1+s2);
        return s1+s2;
    }



    public static void main(String[] args) {
        MethodOverloading2 mo2=new MethodOverloading2();
        String s=mo2.sum("sum","sum");
        int in=mo2.sum(2,5);
        System.out.println(s+in);
    }
}
