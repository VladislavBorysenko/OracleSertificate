package Lesson_22_SuperProtected.Home_Work;

public class Dog extends Pet {
    public Dog(String name) {
        super(name);
        System.out.println("I am dog and my name is: "+name);
    }
    void play(){
        System.out.println("Dog plays");
    }
}
