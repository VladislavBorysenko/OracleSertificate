package Lesson_27_Exceptions;


import java.io.FileNotFoundException;

public class Test19 {
    public static void main(String[] args) {

    }
}

class Animal2{
   Animal2()throws FileNotFoundException{

   }
}

class Mouse extends Animal2{
    Mouse() throws FileNotFoundException {
        super();
    }
}

class Human{
    String name;
    int age;

    public Human(String name, int age) throws Exception {
        this.name = name;
       if (age<0){throw new Exception("Ne korrektuy vozrast");}
       this.age=age;
    }
}