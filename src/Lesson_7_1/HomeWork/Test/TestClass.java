package Lesson_7_1.HomeWork.Test;

import Lesson_7_1.HomeWork.Employee;

public class TestClass {
    public static void main(String[] args) {
        Employee emp=new Employee(13);
        emp.showId();
        emp.showSalary();
        emp.showSurname();

//        Employee emp1=new Employee("Subochov",1000,12);
//        emp1.showId();
//        emp1.showSalary();
//        emp1.showSurname();
//
//        Employee emp2=new Employee(12.999,5,"Ivanov");
//        emp2.showId();
//        emp2.showSalary();
//        emp2.showSurname();
//
//        System.out.println(emp.id+" "+emp.surname);
//        System.out.println(emp1.id+" "+emp1.surname);

        System.out.println(emp.surname);
    }
}
