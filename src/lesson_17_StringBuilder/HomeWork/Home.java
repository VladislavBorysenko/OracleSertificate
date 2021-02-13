package lesson_17_StringBuilder.HomeWork;

public class Home {

    public static boolean ravenstvo(StringBuilder sb1,StringBuilder sb2){
        return sb1.equals(sb2);
    }

    public static void main(String[] args) {
        StringBuilder sb1=new StringBuilder("abcd");
        StringBuilder sb2=new StringBuilder("abcd");
        StringBuilder sb3=sb2;
        System.out.println(ravenstvo(sb1,sb3));
        System.out.println(ravenstvo(sb2,sb3));
        System.out.println(ravenstvo(sb1,sb2));
    }
}
