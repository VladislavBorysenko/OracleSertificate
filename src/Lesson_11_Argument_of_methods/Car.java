package Lesson_11_Argument_of_methods;

public class Car {

    String color;
    String engine;
    int door;

    public Car(String color, String engine, int door) {
        this.color = color;
        this.engine = engine;
        this.door = door;
    }
}

class CarTest{

    public static void changeDoor(Car c1, int door){
        c1.door=door;
    }

    public static void changeColor (Car c1, Car c2){
       String color;
        color= c1.color;
        c1.color=c2.color;
        c2.color=color;
    }

    public static void main(String[] args) {

        Car c1=new Car("Red","V8",4);
        Car c2=new Car("Black","V6",2);
        changeDoor(c1,5);
        System.out.println(c1.door);
        changeColor(c1,c2);
        System.out.println(c1.color+" "+c1.door+" "+c1.engine);
        System.out.println(c2.color+" "+c2.door+" "+c2.engine);

    }
}
