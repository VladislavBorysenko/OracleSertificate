package Lesson_25_Polymorphism_Operator_instanceof;

public class Test3 {
    public static void main(String[] args) {
        JumpAble j=new Man();
        Man m =new Man();
        Student s=new Student();
        if (j instanceof JumpAble){
            System.out.println("j is Jumpable");
        }
        if (m instanceof Human){
            System.out.println("m is Human");
        }
       if (s instanceof JumpAble){
           System.out.println("s is Jumpable");
       }

    }
}
interface JumpAble{}
class Human implements JumpAble{}
class Man extends Human{}
class Student{}
