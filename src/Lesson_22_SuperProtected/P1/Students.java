package Lesson_22_SuperProtected.P1;


import Lesson_22_SuperProtected.Human;

public class Students extends Human {
    public static void main(String[] args) {
        Students s=new Students();
        //
        s.work();
        System.out.println(s.getName());
        s.work();
      //  s.setName("Ivan");
      //  System.out.println(s.getName());
      //  Human h=new Human();
      //  String str=h.getName();
      //  System.out.println(str);
        //h.name=s.getName();
       // System.out.println(h.name);
    }
}

class Test{
    public static void main(String[] args) {
        Students s=new Students();
      //  s.work();
      //  System.out.println(s.name);
    }
}
