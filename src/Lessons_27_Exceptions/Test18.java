package Lessons_27_Exceptions;

public class Test18 {
    void abc(){
        System.out.println("method abc");
        throw new StackOverflowError();
    }
    void def(){
        try {
            abc();
            return;
        }finally {
            System.out.println("eto finally block");
        }
    }

    public static void main(String[] args) {
        Test18 t=new Test18();
        t.def();
    }
}
