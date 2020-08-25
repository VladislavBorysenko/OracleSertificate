package Lesson_22_SuperProtected;

public class Human {
    protected String name = "Kolya";
    public static int salary = 150;

    protected void work() {
        System.out.println("work");
    }

    static void rest() {
        System.out.println("spat");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static int getSalary() {
        return salary;
    }

    public static void setSalary(int salary) {
        Human.salary = salary;
    }
}

class Student extends Human {
    public static void main(String[] args) {
        Student s = new Student();
        System.out.println(s.name);
        System.out.println(Student.salary);
        s.work();
        Student.rest();
    }
}

