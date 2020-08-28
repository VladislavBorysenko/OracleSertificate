package Lesson_24_Abstract_Defoult_StaticMethods_Interface.HomeWork;

public class Lesson24 {
    public static void main(String[] args) {
        Mechenosec mechenosec=new Mechenosec("Klaus");
        System.out.println(mechenosec.name);
        mechenosec.eat();
        mechenosec.swim();
        mechenosec.sleep();

        Speakable p=new Pingvin("Ping");
        p.speak();

        Animal lev=new Lev("Simba");
        System.out.println(lev.name);
    lev.eat();
    lev.sleep();

    Mammal lev2=new Lev("Sharhan");
        System.out.println(lev2.name);
        lev2.run();
        lev2.eat();
        lev2.speak();
        lev2.sleep();
    }
}
