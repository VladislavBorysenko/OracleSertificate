package lesson_29_Lyambda;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class Car {
    String model;
    String color;
    double engine;

    public Car(String model, String color, double engine) {
        this.model = model;
        this.color = color;
        this.engine = engine;
    }

    public String toString() {
        return "our car is " + model + ", color is " + color + ", engine is " + engine + "\n";
    }
}

class Test10 {
    public static ArrayList<Car> craeteThreeCar(Supplier<Car> carSupplier) {
        ArrayList<Car> ai = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            ai.add(carSupplier.get());
        }
        return ai;
    }

    public static void changeCar(Car car, Consumer<Car> carConsumer) {
        carConsumer.accept(car);
    }

    public static void main(String[] args) {
        ArrayList<Car> ourCars = craeteThreeCar(() -> new Car("Nissan Tigo", "silver metallic", 3.5));
        System.out.println("Our Cars is " + ourCars);

//        changeCar(ourCars.get(0), car -> {
//            car.color = "red";
//            car.engine = 4.2;
//            System.out.println("updated car" + car);
//        });
        Consumer<Car> consumer=car -> {
            car.color="red";
            car.engine=4.5;
            System.out.println("updated car" + car);
        };
        consumer.accept(ourCars.get(0));
    }


}
