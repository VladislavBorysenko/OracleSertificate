package lesson_24_Abstract_Defoult_StaticMethods_Interface;

public class Test2 {
    public static void main(String[] args) {
        Figura f1=new Kvadrat();
        System.out.println(f1.kolichestvoStoron);
        f1.ploshad();
    }

}

abstract class Figura {
    //constructor
//    public Figura(int kolichestvoStoron) {
//        this.kolichestvoStoron = kolichestvoStoron;
//    }

    int kolichestvoStoron = 0;

    abstract void perimetr();

    abstract void ploshad();

    void showInfo() {
        System.out.println("Eto figura ");
    }
}

class Kvadrat extends Figura {
    int kolichestvoStoron = 4;
    int storona1 = 10;

    public void perimetr() {
        System.out.println("perimetr kvadrata = " + 4 * storona1);
    }

    ;

    public void ploshad() {
        System.out.println("ploshad  kvadrata = " + storona1 * storona1);
    }

    ;
}

class Pryamougolnik extends Figura {
    int kolichestvoStoron = 4;
    int storona1 = 8;
    int storona2 = 10;

    public void perimetr() {
        System.out.println("perimetr kvadrata = " + 2 * (storona2 + storona1));


    }

    public void ploshad() {
        System.out.println("perimetr kvadrata = " + storona2 * storona1);
    }

    ;
}

class Okrujnost extends Figura {
    int kolichestvoStoron = 0;
    int radius = 4;

    public void perimetr() {
        System.out.println("perimetr kvadrata = " + 2 * 3.14 * radius);}
        public void ploshad () {
            System.out.println("perimetr kvadrata = " + 3.14 * radius * radius);
        }
        ;
    }

   abstract class ChetirohUgolnik extends Figura{
    void def(){
        System.out.println("Eto chetirexugolnik");
    }
    }