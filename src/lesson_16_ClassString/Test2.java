package lesson_16_ClassString;

public class Test2 {
    public static void main(String[] args) {

        String s1 = new String("privet kak dela?");
        String sub1=s1.substring(4);
        System.out.println(sub1);

        String sub2=s1.substring(3,9);
        System.out.println(sub2);

        String s2=s1.trim();
        System.out.println(s2);

        String s3=s1.replace('r','k');
        System.out.println(s3);
        String s4=s1.replace("vet","vivka");
        System.out.println(s4);

        String s5="drug";
        String s6="privet,";
        s6=s6.concat(s5);
        System.out.println(s6);
    }
}
