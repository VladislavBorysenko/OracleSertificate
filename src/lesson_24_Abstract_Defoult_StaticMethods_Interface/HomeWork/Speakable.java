package lesson_24_Abstract_Defoult_StaticMethods_Interface.HomeWork;

public interface Speakable {
    default void speak() {
        System.out.println("Somebody speaks");
    }
}
