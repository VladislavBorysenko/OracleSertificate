package lesson_26_Equals_ToString;

public class Test7 {
    public static void main(String[] args) {
        Animal a=new Animal();
        Lion l=new Lion();
    }
}


class Animal{
    Animal(){
        System.out.println("constructor of Animal");
    }
    static {
        System.out.println("Static init in Animal");
    }
    {
        System.out.println("non static in Animal");
    }
}

class Mammal extends Animal{
    Mammal(){
        System.out.println("constructor of Mammal");
    }
    static {
        System.out.println("Static init in Mammal");
    }
    {
        System.out.println("non static init in Mammal");
    }
}

class Lion extends Mammal{
    Lion(){
        System.out.println("constructor of Lion");
    }
    static {
        System.out.println("Static init in Lion");
    }
    {
        System.out.println("non static init in Lion");
    }
    
}