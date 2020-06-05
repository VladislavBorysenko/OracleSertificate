package Lesson_12_if_ifElse;

public class Car {
int engine;
int countDoor;
String name;

    public Car(int engine, int countDoor, String name) {
        this.engine = engine;
        this.countDoor = countDoor;
        this.name=name;
    }
}

class CarTest{
    public static void main(String[] args) {

        Car c1=new Car(300,1,"lamba");
        Car c2=new Car(500,2,"lamba");

//        if (c1.engine>c2.engine)
//            if (c1.countDoor>c2.countDoor)
//                System.out.println("Moshnost motora i kolichestvo dverei bolshe u pervoi mashinu");
//            else System.out.println("moshnost matora bolshe u pervoi mashinu, a kolischestvo dverey y vtoroi");
//            else System.out.println("moshnost motora bolshe y pervoi mashini");

        if (c1.engine>c2.engine) {
            if (c1.countDoor > c2.countDoor){
                System.out.println("Moshnost motora i kolichestvo dverei bolshe u pervoi mashinu");}
            else System.out.println("moshnost matora bolshe u pervoi mashinu, a kolischestvo dverey y vtoroi");
        }
        else System.out.println("moshnost motora bolshe y pervoi mashini");

        if (c1.name.equals(c2.name)){
            System.out.println("Oba krasava");
        }
    }
}
