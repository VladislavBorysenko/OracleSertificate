package lesson_7_1;

import lesson_7_Package_AccessModifiers.Employee;

public class TretiyClass {
    public static void main(String[] args) {
        Employee emp=new Employee(1000);
        System.out.println(emp.salary);
        emp.dvoYnayaZp();
        lesson_6_OverloadingMethods.Employee emp1=new lesson_6_OverloadingMethods.Employee(1,23,"Ivanov");
         System.out.println(emp1.surname);
    }
}
