package lesson_22_SuperProtected.Home_Work;

public class Pet extends Animal {

    String name;
    int tail=1;
    int paw=4;


    void run(){
        System.out.println("Pet runs");
    }
    void jump(){
        System.out.println("Pat jumps");
    }

    public Pet(String name) {
        this.name = name;
        System.out.println("I am pet");
        super.eyes =2;
    }

    Pet(){
        System.out.println("I am pet");
        super.eyes =2;
    }

}
