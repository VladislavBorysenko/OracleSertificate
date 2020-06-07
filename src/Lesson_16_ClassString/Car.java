package Lesson_16_ClassString;

public class Car {
    String color;
    String engine;

    public Car(String color, String engine) {
        this.color = color;
        this.engine = engine;
    }
    final static int a=5;
public Car abc(String color){
    Car c10=new Car(color,"v10");
    return c10;
}

    public static void main(String[] args) {
        Car c=new Car("red","v8");
        Car c2= c.abc("black");
        System.out.println(c.color);
        System.out.println(c2.color);
    }

}

