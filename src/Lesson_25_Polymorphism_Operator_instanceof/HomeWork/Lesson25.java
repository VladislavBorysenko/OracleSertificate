package Lesson_25_Polymorphism_Operator_instanceof.HomeWork;

public class Lesson25 {
    public static void main(String[] args) {
      Animal a1=new Mechenosec("Karl_1");
      Animal a2=new Pingvin("Kavalski");
      Animal a3=new Lev("Simba_1");
      Fish f1=new Mechenosec("Karl2");
      Bird b1=new Pingvin("Kavalski_2");
      Mammal m1=new Lev("Simba_2");
      Mechenosec mech1=new Mechenosec("Karl_3");
      Pingvin p1=new Pingvin("Kavalski_3");
      Lev l1=new Lev("Simba_3");
      Speakable s1=new Pingvin("Kovalski_4");
      Speakable s2=new Lev("Simba_4");

        System.out.println("-------------------------------------------------------------------------");
        Animal []animals={ a1,a2,a3,f1,b1,m1,mech1,p1,l1, (Animal) s1, (Animal) s2};
        Speakable[]speakables={ b1,m1, p1,l1,  s1,  s2};
        for (Animal a:animals
             ) {
            if (a instanceof Animal){
                a.eat();
                a.sleep(); }
            else if (a instanceof Mechenosec){
                Mechenosec m= (Mechenosec) a;
                System.out.println(m.name);
                m.sleep();
                m.eat();
               m.swim();

            }
            else if (a instanceof Pingvin){
                Pingvin p= (Pingvin) a;
                System.out.println(p.name);
                p.eat();
                p.fly();
                p.sleep();
                p.speak();

            }
            else if (a instanceof Lev){
                Lev l= (Lev) a;
                System.out.println(l.name);
                l.eat();
                l.run();
                l.sleep();
                l.speak();
            }
            System.out.println("------------------------------------------------------------------------------------");

        }
        System.out.println("______________________________________________________________________________");
        System.out.println("______________________________________________________________________________");
        for (Speakable a:speakables
        ) {

                if (a instanceof Speakable){
                    a.speak();
                }
                else if (a instanceof Mechenosec){
                    Mechenosec m= (Mechenosec) a;
                    System.out.println(m.name);
                    m.sleep();
                    m.eat();
                    m.swim();

                }
                else if (a instanceof Pingvin){
                    Pingvin p= (Pingvin) a;
                    System.out.println(p.name);
                    p.eat();
                    p.fly();
                    p.sleep();
                    p.speak();

                }
                else if (a instanceof Lev){
                    Lev l= (Lev) a;
                    System.out.println(l.name);
                    l.eat();
                    l.run();
                    l.sleep();
                    l.speak();
                }
                System.out.println("------------------------------------------------------------------------------------");

            }
        }
    }

