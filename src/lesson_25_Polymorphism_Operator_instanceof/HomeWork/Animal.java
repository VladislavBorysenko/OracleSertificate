package lesson_25_Polymorphism_Operator_instanceof.HomeWork;


public abstract class Animal {
    String name;

    public Animal(String name) {
        this.name = name;
    }
    abstract void eat();
    abstract void sleep();
}

abstract class Fish extends Animal {

    public Fish(String name) {
        super(name);
    }

    @Override
    void sleep() {
        System.out.println("Vsegda intersno nabludat kak spiat ribi");
    }
    abstract void swim();
}

abstract class Bird extends Animal implements Speakable {

    public Bird(String name) {
        super(name);
    }
    abstract void fly();

    @Override
    public void speak() {
        System.out.println(name+" sings");
    }
}

abstract class Mammal extends Animal implements Speakable {

    public Mammal(String name) {
        super(name);
    }
    abstract void run();
}


class Mechenosec extends Fish {

    public Mechenosec(String name) {
        super(name);
    }

    @Override
    void eat() {
        System.out.println("Mechenosec ne xishnaya riba, i ona est obichniy ribiy korm ");
    }

    @Override
    void swim() {
        System.out.println("Mechenosec krasivaya riba kotoray bistro plavaet!");
    }
}

class Pingvin extends Bird {
    public Pingvin(String name) {
        super(name);
    }

    @Override
    void eat() {
        System.out.println("Pingvin lubit est ribu!");
    }

    @Override
    void sleep() {
        System.out.println("Pingvinu spyat prizhavshis drug k drugu");
    }

    @Override
    void fly() {
        System.out.println("Pingvinu ne umeuyt letat");
    }

    @Override
    public void speak() {
        System.out.println("Pingvinu ne umeyut pet kak soloviy");
    }
}

class Lev extends Mammal {
    public Lev(String name) {
        super(name);
    }

    @Override
    void eat() {
        System.out.println("Lev kak i luboy xishnik lubit myaso");
    }

    @Override
    void sleep() {
        System.out.println("bolshuyu chast dnya lev spit");
    }

    @Override
    void run() {
        System.out.println("Lev-eto ne samaya bistraya koshka!");
    }


}