package Lesson_11_Argument_of_methods;

public class Employee {
    public String name;
    public double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public double  dableSalary(double a){
       return a*2;
    }
public double zp2(double a){
        return this.salary=a*2;
}
}



class EmployeeTest{
    public static void main(String[] args) {
        Employee emp = new Employee("Vlad",12000);
        double d=emp.dableSalary(emp.salary);
        System.out.println(d);
        System.out.println( emp.salary);
        double b=emp.zp2(20000);
        System.out.println(emp.salary);
    }
}
