package Lesson_25_Polymorphism_Operator_instanceof;

public class Test1 {
    public static void main(String[] args) {
        Employee emp1=new Teacher();
        Employee emp2=new Driver();
        Employee emp3=new Doctor();
//        emp1.work();
//        emp2.work();
//        emp3.work();
//        HelpAble h=new Teacher();
//        emp1.help();
//        emp2.help();

    //  h.help();

      //Driver[]array1={new Driver(),new Driver()};
      Employee[]array2={emp1,emp2,emp3};
      //HelpAble[]array3={new Driver(),new Driver(), new Teacher(), new Doctor()};

        for (Employee emp:array2
             ) {
emp.work();
        }
    }
}

abstract class Employee implements HelpAble{
    void sleep(){
        System.out.println("Employee sleeps");
    };
    abstract void work();
}
class Teacher extends Employee implements HelpAble{
    void work(){
        System.out.println("Teacher works");
    }

    @Override
    public void help() {
        System.out.println("Teacher helps");
    }
}

class Driver extends Employee{
    void work(){
        System.out.println("Driver works");
    }

    @Override
    public void help() {
        System.out.println("Driver helps");
    }
}
class Doctor extends Employee{
    void work(){
        System.out.println("Doctor works");
    }

    @Override
    public void help() {
        System.out.println("Doctor helps");
    }
}

interface HelpAble{
    void help();
}