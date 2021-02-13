package lesson_17_StringBuilder;

public class Test3 {
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder("123");
        StringBuilder sb2 = new StringBuilder("123");
        StringBuilder sb3 = sb2;

        //     StringBuilder sb2=sb1.append("45"); ссылаются на один и тот же обьект
        //     sb2=sb2.append("6").append("7");

        //     System.out.println("sb1 ="+sb1 );//sb1 =1234567
        //Значения равны так как они ссылаются на один и тот же обьект
        //     System.out.println("sb2 ="+sb2 );//sb2 =1234567
        System.out.println(sb1.equals(sb2));
        System.out.println(sb3.equals(sb2));

    }
}
