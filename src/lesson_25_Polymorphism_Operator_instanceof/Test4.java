package lesson_25_Polymorphism_Operator_instanceof;

public class Test4 {
    public static void main(String[] args) {
        Employee1 emp1 = new Doctor1();
        Employee1 emp2 = new Teacher1();
        Employee1 emp3 = new Driver1();



        Employee1 emp4= new Employee1();
        Employee1[] array={emp1,emp2,emp3,emp4};
        //перебор списка обьектов и вывод данных обьекта Driver1

        for (Employee1 e:array
             ) {
            if ( e instanceof Driver1){//проверяем является ли  e обьектом типа Driver
                System.out.println(((Driver1) e).nazvanieMachinu);
                ((Driver1) e).vodit();
            }
        }
    }

}

class Employee1 extends java.lang.Object {
    double salary = 100;
    String name = "Kolya";
    int age;
    int experience;

    void eat() {
        System.out.println("Kushat");
    }

    void sleep() {
        System.out.println("Spat");
    }
}

class Doctor1 extends Employee1 implements HelpAble{
    String specializaciya="Xirurg";

    void lechit() {
        System.out.println("Doctor lechit");
    }

    @Override
    public void help() {
        System.out.println("Doctor okazivaet pomosh");
    }
}

class Teacher1 extends Employee1 {
    int kolichestvoUchenikov;

    void uchit() {
        System.out.println("Uchitel uchit");
    }

    ;
}

class Driver1 extends Employee1 {
    String nazvanieMachinu="Marcedess";

    void vodit() {
        System.out.println("Vodit");
    }
}
interface HelpAble {
    void help();
}