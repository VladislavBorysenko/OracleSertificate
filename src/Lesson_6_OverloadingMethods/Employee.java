package Lesson_6_OverloadingMethods;

public class Employee {

    Employee(int age1, String surname1) {

        this(0,age1,surname1,00.0,null);
    }

    public Employee(int id2, int age2, String surname2) {

        this(id2,age2, surname2,0.0,null);

    }

    public Employee(int id3, int age3, String surname3, Double salary3, String department3) {
        id = id3;
        age = age3;
        surname = surname3;
        salary = salary3;
        department = department3;
    }





    int id;
    int age;
    public String surname;
    Double salary;
    String department;
}

class EmployeeTest {
    public static void main(String[] args) {
        Employee emp = new Employee(1, 29, "Ivanov");
        System.out.println(emp.age);

        Employee emp1 = new Employee(29, "Smirnov");
        Employee emp3 = new Employee(1, 29, "Smirnov", 45000.500, "It");
        System.out.println(emp3.age + emp3.id + emp3.salary + emp3.department + emp3.surname);

    }
}
