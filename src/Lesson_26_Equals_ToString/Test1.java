package Lesson_26_Equals_ToString;

import java.util.ArrayList;

public class Test1 {
    public static void main(String[] args) {
        Car c1 = new Car("red", "V4");
        Car c2 = new Car("red", "V4");
        Car c3 = new Car("black", "V8");
        Car c4 = new Car("black", "V8");
        ArrayList<Car> list = new ArrayList<>();
        list.add(c1);
        list.add(c2);
        list.add(c3);
        System.out.println(c3);
       // System.out.println(list.contains(c4));
        //   System.out.println(c1==c2);
        //   System.out.println(c1.equals(c2));
        //   System.out.println(c1.equals(c3));
    }
}

class Car {
    String color;
    String engine;

    public Car(String color, String engine) {
        this.color = color;
        this.engine = engine;
    }

    public boolean equals(Object obj) {
        if (obj instanceof Car) {
            return (color.equals(((Car) obj).color) && engine.equals(((Car) obj).engine));
        } else {
            return false;
        }

    }

    public String toString(){
        return "Mashina cveta "+color+ " i s motorom "+engine;
    }
}

