package lesson_26_Equals_ToString;

import java.util.ArrayList;

public class Test2 {
    public static void main(String[] args) {
        ArrayList<Integer>list = new ArrayList<>();
        list.add(5);
        //autoboxing
        Long l =50l;
        //unboxing
        int a =list.get(0);
        System.out.println(a);
        Integer b= 10;
        int c=b;

        String s1="50";
        int i1=Integer.parseInt(s1);

        String s2="true";
        boolean b1=Boolean.parseBoolean(s2);

        String s3="3.14";
        double d1=Double.parseDouble(s3);

        //valueOf
        Integer i2=Integer.valueOf(10);
        Double d2=Double.valueOf(s3);

    }
}
