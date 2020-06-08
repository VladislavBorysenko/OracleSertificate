package Lesson_17_StringBuilder;

public class Test1 {
    public static void main(String[] args) {
        StringBuilder sb1=new StringBuilder();
        StringBuilder sb2=new StringBuilder("good day");
        StringBuilder sb3=new StringBuilder(50);
        StringBuilder sb4=new StringBuilder(sb2);
        //---------------------Methods----------------------
      // System.out.println(sb2.subSequence(5,8));
      // sb2.append(22);
      // sb2.append(true);
      // System.out.println(sb2);

        System.out.println(sb2.insert(5,55));
        System.out.println(sb2.insert(sb2.length(),"Hello"));
        StringBuilder sb10=new StringBuilder("Hello World");
        //sb10.delete(2,5);
        //sb10.deleteCharAt(5);
        sb10.reverse();
        System.out.println(sb10);

        StringBuilder sb12= new StringBuilder("Vsem privet");
        sb12.replace(0,4,"Pete");
        System.out.println(sb12);
        System.out.println(sb12.capacity());
    }
}
