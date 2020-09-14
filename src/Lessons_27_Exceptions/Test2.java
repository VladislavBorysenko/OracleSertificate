package Lessons_27_Exceptions;

public class Test2 {
    void abc() throws NullPointerException{
        String s =null;
        System.out.println(s.length());
    }
    public static void main(String[] args) {

        System.out.println("Hello");
    }
}
