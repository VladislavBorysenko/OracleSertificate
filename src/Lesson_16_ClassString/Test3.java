package Lesson_16_ClassString;

public class Test3 {

     static class Employee{

        double salary;
        boolean isManager;

        public Employee(double salary, boolean isManager) {
            this.salary = salary;
            this.isManager = isManager;
        }
    }
    static class EmployeeTest{
        public static void main(String[] args) {

            Employee emp=new Employee(1000,true);
            System.out.println("On manager ?"+emp.isManager+" Ego zarplata"+emp.salary);
        }
    }
}
