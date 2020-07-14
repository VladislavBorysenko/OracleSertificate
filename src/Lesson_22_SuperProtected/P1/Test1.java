package Lesson_22_SuperProtected.P1;
import Lesson_22_SuperProtected.Chelovek;
public class Test1 {
    public static void main(String[] args) {
        Chelovek c=new Chelovek("male");
        c.setVozrast(33);
        c.setVes(78);
        c.setName(new StringBuilder("Dima"));
        c.getName().append("!!!");
        System.out.println(c.getName());
    }
}
