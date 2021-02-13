package lesson_5_Methods;

public class Car {
    Car(){}//Дефолтный конструктор
    String color;
    String engine;
    int speed;

    int gaz(int skorost) {
        speed += skorost;
        return speed;
    }

    int tormoz(int skorost) {
        speed -= skorost;
        return speed;
    }

    void showinfo() {
        System.out.println("Cvet: " + color + ". motor: " + engine + ". skorost:" + speed);
    }
}

class Test2 {
    public static void main(String[] args) {
        Car toyota = new Car();
        toyota.speed = 80;
        toyota.engine = "V8";
        toyota.color = "Red";
        toyota.showinfo();
        toyota.gaz(20);
        toyota.showinfo();
        toyota.gaz((int) Math.pow(5, 2));
        toyota.showinfo();
    }
}
