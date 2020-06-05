package Lesson_5_Methods;

public class Employee {
    Employee (int id, int vozrast, String familiya, Double zarplata, String depart){
        id=id;
        age=vozrast;
        salary=zarplata;
        surname=familiya;
        department=depart;
    }
    int id;
    int age;
    String surname;
    Double salary;
    String department;

    double udvoenie(){
         salary=salary*2;
        System.out.println("После повышения, ваша зарплата составляет: "+salary);
        return salary;

    }
}
class EmployeeTest{
    public static void main(String[] args) {
        Employee emp=new Employee(1,25,"Rabotnik",17000.,"Service");
        Employee emp2=new Employee(2,33,"Dolbin",1200.,"sales");
        emp.udvoenie();
        emp2.udvoenie();
    }
}