package Lesson_25_Polymorphism_Operator_instanceof.HomeWork;

public interface Speakable {
    default void speak() {
        System.out.println("Somebody speaks");
    }
}
