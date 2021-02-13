package lesson_23_Overriding_Hiding_Final;

public class Test5 {
    public static void main(String[] args) {
        Employee e = new Teacher();
        Employee emp = new Employee();
        Teacher t = new Teacher();
      //  emp.sleep();
    t.sleep();
     //  e.sleep();
    }
}

class Eda {
}

class Frukt extends Eda {
}

class Employee {
    double salary = 100;
    String name = "Kolya";

    public Eda eat() {
        System.out.println("Kushaet Rabotnik");
        Eda e = new Eda();
        return e;
    }

    static void sleep() {
        System.out.println("Spit rabotnik");
    }

}

class Teacher extends Employee {
    String salary="dvesti ";
    @Override
    public Eda eat() {
        System.out.println("Kushaet uchitel");
        Frukti f = new Frukti();
        return f;
    }

    int kolischestvoUchenikov;

    void uchit() {
        System.out.println("Uchit");
    }

    static void sleep() {
        System.out.println("Spit uchitel");

    }
}

