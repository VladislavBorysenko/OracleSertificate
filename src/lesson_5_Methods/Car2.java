package lesson_5_Methods;

public class Car2 {

    //constructor
    Car2(String cvet, String motor) {
        color = cvet;
        engine = motor;

        System.out.println("Цвет машины - " + color + "\nМотор машины - " + engine);
    }

    String color;
    String engine;
}

class CarTest2 {
    public static void main(String[] args) {
        Car2 cr1 = new Car2("Black", "V8");

    }
}
