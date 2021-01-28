package Lesson_27_Exceptions;

public class Test5 {
    static void abc(){
        System.out.println("Rabotaet Method abc");
        abc();
    }

    public static void main(String[] args) {
        abc();
    }
}
