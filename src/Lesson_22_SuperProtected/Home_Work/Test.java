package Lesson_22_SuperProtected.Home_Work;

public class Test {
    public static void main(String[] args) {
        Dog dog=new Dog("Bobik");
        System.out.println(dog.paw);
        System.out.println("-----------------------------------------------------------------------------");
        Cat cat=new Cat("Murzik");
        cat.sleep();
    }
}
