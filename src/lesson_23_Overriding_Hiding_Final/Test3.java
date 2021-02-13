package lesson_23_Overriding_Hiding_Final;

public class Test3 {
    public static void main(String[] args) {
        Teacher t=new Teacher();

        Employee empTeach=new Teacher();
        Employee emp1=new Employee();
        empTeach.eat();


    }
}
//class Eda{}
class Frukti extends Eda{}



//class Employee {
//    String name;
//    double salary = 100;
//    int age;
//    int experience;
//
//  public Eda eat() {
//        System.out.println("Kushaet rabotnik");
//        Eda e=new Eda();
//        return e;
//    }
//
//    void sleep() {
//        System.out.println("spat");
//    }
//}

//class Teacher extends Employee {
//
//    int ucheniki;
//    public Frukti eat(){
//        System.out.println("Kushaet uchitel");
//        Frukti f=new Frukti();
//        return f;
//    }
//    void uchit() {
//        System.out.println("teach");
//    }
//}

//class A{
//    Employee opbjectCreation(){
//        return new Employee();
//    }
//}
//
//class B extends A{
//    Teacher opbjectCreation(){
//        System.out.println("Ok");
//        return new Teacher();
//
//    }
//}