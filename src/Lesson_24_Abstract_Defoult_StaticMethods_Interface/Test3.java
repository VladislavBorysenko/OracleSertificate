package Lesson_24_Abstract_Defoult_StaticMethods_Interface;

import Lesson_10_Import_ImportStatic.HomeWork.P2.P3.P4.D;

public class Test3 {
    public static void main(String[] args) {

        Help_able h=new Driver();
        Swim_able s=new Driver();
        Employee e=new Driver();

        System.out.println(h.a);
        h.pomosh();
        h.tushitPojar("voda");
        s.swim();
    }
}

class Employee {
    String name;
    int age;
    int experience;

    void eat() {
        System.out.println("Kushat");
    }

    void sleep() {
        System.out.println("spat");
    }

    double salary = 100;
}


class Teacher extends Employee implements Help_able {

    int ucheniki;

    void uchit() {
        System.out.println("teach");
    }

    @Override
    public void pomosh() {
        System.out.println("Uchitel pomogaet");
    }

    @Override
    public void tushitPojar(String p) {
        System.out.println("Uchitel tushit pozhar s pomochu "+ p);
    }
}

class Driver extends Employee implements Help_able, Swim_able {

    String machina;

    void drive() {
        System.out.println("vodit");
    }

    @Override
    public void pomosh() {
        System.out.println("Voditel pomogaet");
    }

    @Override
    public void tushitPojar(String s) {
        System.out.println("Voditel tushit pojar s pomochi "+s);
    }

    @Override
    public void swim() {
        System.out.println("Voditel plavaet ");
    }
}

interface Help_able {
    public abstract void pomosh();

    void tushitPojar(String predmet);
    public final static int a=10;
}

interface Swim_able {
    void swim();
}

abstract class Y implements Swim_able{};
abstract class X extends Y{}
class Z extends Y{
    @Override
    public void swim() {

    }
}