package Lesson_9_Variables.HomeWork;

public class Human {
    public static void main(String[] args) {
        Human hm1=new Human();
        Human hm2=new Human();
        Human hm3=new Human();
        Human hm4=new Human();
        Human hm5=new Human();
        Human hm6=new Human();
        Human hm7=new Human();
        Human hm8=new Human();

        hm1=hm2=hm3=hm4;
        hm5=hm6=hm7=null;
        System.out.println(hm3);
        System.out.println(hm4);
        System.out.println(hm1);
        System.out.println(hm5);
        System.out.println(hm7);
        System.out.println(hm8);

    }
}
