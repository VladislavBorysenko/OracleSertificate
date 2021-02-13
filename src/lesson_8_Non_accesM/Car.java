package lesson_8_Non_accesM;

public class Car {
    String color = "blue";
    String engine = "V6";
}

class Human{
    String name="Stas";
    Car c=new Car();
    // final Car  c=new Car(); не позволит нам обратить переменную с ,типа данных Car на другуую переменную

    public static void main(String[] args) {
        Human h1 =new Human();
        h1.c=new Car();
        h1.c=new Car();
        h1.c.engine="V8";//Обьект Human.Обьект Car.Поле обьекта Car, engine
    }
}