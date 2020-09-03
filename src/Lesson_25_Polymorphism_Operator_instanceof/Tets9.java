package Lesson_25_Polymorphism_Operator_instanceof;

public class Tets9 {
}

class Test implements interface1,interface2{
    @Override
    public void abc() {
        System.out.println("ok");
    }

    public static void main(String[] args) {
        Test t=new Test();
        ((interface1)t).abc();
        System.out.println(((interface2)t).a  );
    }
}


interface interface1{
    int a=5;
    void abc();
}
interface interface2{
    int a=10;
    void abc();
}
