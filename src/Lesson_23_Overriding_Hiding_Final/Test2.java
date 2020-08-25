package Lesson_23_Overriding_Hiding_Final;

public class Test2 {
    public Doctor abc(){
        return new Hirurg();
    }
    public static void main(String[] args) {
     //   Doctor doc=new Doctor();
     //   Teacher t=new Teacher();
     //   Driver d=new Driver();
     //   Employee emp=new Employee();

        Employee emp1=new Doctor();
      //  Employee emp2=new Teacher();
        Employee emp3=new Driver();
        Employee emp4=new Hirurg();
        Hirurg h=new Hirurg();
        Doctor d2=new Hirurg();

//        System.out.println(emp1.age);
//        System.out.println(emp1.experience);
//        System.out.println(emp1.name);
//        System.out.println(emp1.salary);
//        emp1.eat();
//        emp1.sleep();
//        System.out.println(d2.age);
        d2.lechit();
        h.operacia();
    }
}
//class Employee {
//    String name;
//    double salary = 100;
//    int age;
//    int experience;
//
//    void eat() {
//        System.out.println("Kushaet rabotnik");
//    }
//
//    void sleep() {
//        System.out.println("spat");
//    }
//
//
//}

class Doctor extends Employee {


    String specializacia;

    void lechit() {
        System.out.println("Lechit");
    }
}

//class Teacher extends Employee {
//
//    int ucheniki;
//    void eat(){
//        System.out.println("Kushaet uchitel");
//    }
//    void uchit() {
//        System.out.println("teach");
//    }
//}

class Driver extends Employee {

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


