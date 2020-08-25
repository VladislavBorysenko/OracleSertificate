package Lesson_22_SuperProtected.Home_Work;

public class Animal {
    int eyes=2;

    public Animal(int eyes) {
        this.eyes = eyes;
        System.out.println("I am animal");
    }

    public Animal(){
        System.out.println("I am animal");
    }
    void eat(){
        System.out.println("Animal eats");
    }
    void drink(){
        System.out.println("Animal drinks");
    }
}
