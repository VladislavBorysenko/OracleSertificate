package Lesson_22_SuperProtected;

public class Test3 {
    void uvelichenieZP(Employee e) {
        e.salary = e.salary + 100;
    }

    public static void main(String[] args) {
        Doctor doc = new Doctor();
        doc.name = "Ivan";
        doc.age = 52;
        doc.experience = 25;
        doc.specializacia = "Hirurg";
        doc.sleep();
        doc.eat();
    }
}

class Employee {
    String name;
    int age;
    int experience;

    void eat() {
        System.out.println("Kushat");
    }

    void sleep() {
        System.out.println("spat");
    }

    double salary = 100;
}

class Doctor extends Employee {


    String specializacia;

    void lechit() {
        System.out.println("Lechit");
    }
}

class Teacher {

    int ucheniki;

    void uchit() {
        System.out.println("teach");
    }
}

class Driver {

    String machina;

    void drive() {
        System.out.println("vodit");
    }
}

class Hirurg extends Doctor {
    String skalpel;

    void operacia() {
    }
}

class Dantist extends Doctor{

}
