package Lesson_29_Lyambda.HomeWork;

import java.util.ArrayList;
import java.util.function.Predicate;

public class Employee {
    String name;
    String department;
    double salary;

    public Employee(String name, String department, double salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
    }



}

class TestEmployee{
   static void printEmployee(Employee e){
        System.out.println("department: "+e.department+"\n"+"name: "+e.name+"\n"+"salary: "+e.salary+"\n___________________________________");
    }
   static void filtraciyaRabotnikov(ArrayList<Employee> employeeArrayList, Predicate<Employee>employeePredicate){
        for (Employee e:employeeArrayList
        ) {
            if (employeePredicate.test(e)){
                printEmployee(e);
            }

        }
    }

    public static void main(String[] args) {
ArrayList<Employee>employeeArrayList=new ArrayList<>();

    Employee e1=new Employee("EvA","IT",300);
    Employee e2=new Employee("Kolya","Electrical",600);
    Employee e3=new Employee("Alexandr","Machinery",300);
    Employee e4=new Employee("IT","IT",300);
    Employee e5=new Employee("Bobi","Electrical",450);
    Employee e6=new Employee("Machinery","Machinery",100);

    employeeArrayList.add(e1);
    employeeArrayList.add(e2);
    employeeArrayList.add(e3);
    employeeArrayList.add(e4);
    employeeArrayList.add(e5);
    employeeArrayList.add(e6);



    filtraciyaRabotnikov(employeeArrayList,x -> x.salary>200 &&x.department.equals("IT"));
        System.out.println("--------------------------------------------------------------------------------");
    filtraciyaRabotnikov(employeeArrayList,x -> x.salary!=450 &&x.name.startsWith("E"));
    filtraciyaRabotnikov(employeeArrayList,x -> x.name.equals(x.department));
    }
}

