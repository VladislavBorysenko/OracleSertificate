package Lesson_5_Methods;

public class Human {
    String name;
    Car3 car;
    BankAccount ba;
    void info(){
        System.out.println("Name: "+name+"\nCar: "+car.color+"\nBalance: "+ba.balance);
    }
}

class HumanTest{
    public static void main(String[] args) {

        Human me=new Human();
        me.name="Vlad";
        me.ba=new BankAccount(1,25.25);
        me.car=new Car3("black","V12");
        me.info();
    }
}

class Car3{

    //создаем конструктор для класса Car3 c параметрами с и е
    Car3(String c, String e){
        color=c;
        engine=e;
    }
    String color;
    String engine;
}

class  BankAccount{
    BankAccount(int id2,double balance2){

        id=id2;
        balance=balance2;
    }
    int id;
    double balance;
}