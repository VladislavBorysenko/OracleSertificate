package lesson_29_Lyambda.Lyambda2;

public class Test {

    public static void main(String[] args) {
        var tit = new TestInferenceType();
        var i = 10;
        var d = 11.1;
        var f = 11.3f;
        var s = "privet";
        Object obj1 = "poka";
        var obj2 = obj1;
        var array= new String[]{"abc","def"};
        var result=abc();
    }
    static double abc(){return 3.14;}
}


class TestInferenceType {
}

interface I{
    void abc();
    default void def(){}
    default void def1(){}
    static void def2(){}
}