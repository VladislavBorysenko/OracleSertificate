package Lesson_7_Package_AccessModifiers;

public class A {
    public static void main(String[] args) {
        B b=new B();//Создали обьект класса B которій находится в пакете Lesson_7_Package_AccessModifiers
        Lesson_6_OverloadingMethods.Employee emp = new Lesson_6_OverloadingMethods.Employee(1,25,"Ivanov");
        System.out.println(emp);
    }
}
