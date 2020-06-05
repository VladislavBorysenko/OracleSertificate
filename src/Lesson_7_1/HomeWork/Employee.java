package Lesson_7_1.HomeWork;

public class Employee {

    //type
    int id;
    public String surname;
    private Double salary;


    //methods
    public void showId() {
        System.out.println("Id ="+id);
    }

    public void showSurname() {
        System.out.println("surname: "+surname);
    }

    public void showSalary() {
        System.out.println("Salary is: "+salary);
    }

    //Constructors
    public Employee(int idAccount) {

        id = idAccount;

    }

    Employee(String surnameAccount) {

        surname = surnameAccount;
    }

    private Employee(double salaryAccount) {

        salary = salaryAccount;
    }
}

class EmployeeTest{
    public static void main(String[] args) {
        Employee emp=new Employee(12);
        emp.showId();
        emp.showSalary();
        emp.showSurname();

        Employee emp1=new Employee("Smornov");
        emp1.showId();
        emp1.showSalary();
        emp1.showSurname();

    //   Employee emp2=new Employee(12.999);
    //   emp2.showId();
    //   emp2.showSalary();
    //   emp2.showSurname();
        System.out.println(emp.id+" "+emp.surname);
        System.out.println(emp1.id+" "+emp1.surname);
    }
}
