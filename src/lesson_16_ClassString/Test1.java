package lesson_16_ClassString;

public class Test1 {

    public static void main(String[] args) {
        String s1 = new String("privet kak dela?");
        int l = s1.length();
        System.out.println(l);
        System.out.println(s1.charAt(3));
        int i = s1.indexOf('i');
        System.out.println(i);
        int i2 = s1.indexOf("kak");
        System.out.println(i2);

        int i3=s1.indexOf('e',5);
        System.out.println(i3);

        int i4=s1.indexOf("kak",3);
        System.out.println(i4);

        boolean b1=s1.startsWith("pr");
        System.out.println(b1);

        boolean b2=s1.startsWith("pr",2);
        System.out.println(b2);

        boolean b3=s1.endsWith("a?");
        System.out.println(b3);
    }
}
