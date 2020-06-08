package Lesson_16_ClassString;

public class Test8 {
    public static void main(String[] args) {
        String s1=new String ("ok");
        String s2=new String ("ok");
        System.out.println(s1==s2);
        String s3=s2;
        System.out.println(s2==s3);
        System.out.println(s1.equals(s2));
        System.out.println(s1!=s3);
        System.out.println("_________________________________________________________________________");
        String s10="KAK DELA?";
        String s11="kak dela?";
        boolean b;
        b=s10.equalsIgnoreCase(s11);
        System.out.println(b);
        System.out.println(s10==s11);
        System.out.println(s10.equals(s11));
    }
}
