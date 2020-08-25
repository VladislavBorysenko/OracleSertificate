package Lesson_22_SuperProtected.Home_Work;

public class Cat extends Pet {
    public Cat(String name) {
        super(name);
        System.out.println("I am cat and my name is: "+name);
    }
    void sleep(){
        System.out.println("Cat sleeps");
    }
}


