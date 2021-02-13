package lesson_7_Package_AccessModifiers;

public class Employee  {
  public   double salary;

   public void dvoYnayaZp(){
        System.out.println("Novaya z/p="+salary*2);
    }
  public   Employee(double salary2){
        salary=salary2;
    }

    public static void main(String[] args) {
        Employee emp=new Employee(120);
        System.out.println(emp.salary);
        emp.dvoYnayaZp();
    }
}
class EmployeeTest{
    public static void main(String[] args) {
        Employee emp=new Employee(500);
        System.out.println(emp.salary);
        emp.dvoYnayaZp();
    }
}