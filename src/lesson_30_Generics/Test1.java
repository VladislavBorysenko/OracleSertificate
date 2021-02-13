package lesson_30_Generics;

public class Test1 {
    public static void main(String[] args) {
//        ArrayList<String>al=new ArrayList<>();
//        ArrayList<Number>al1=new ArrayList<>();

        Info<String> info1 = new Info<>("sss");
        System.out.println(info1);
        String s= info1.getValue();
        System.out.println(s);

        Info <Integer> info2 = new Info<>(123-3);
        System.out.println(info2);
        int i= info2.getValue();
        System.out.println(i);
    }
    //public void abc(Info<String>info){ String s = info.getValue(); }

    public void abc(Info<Integer>info){
        Integer i = info.getValue();
    }
}

class Info<T> {
    private T value;

    public Info(T value) {
        this.value = value;
    }

    public String toString() {
        return "((" + value + "))";
    }

    public T getValue() {
        return value;
    }
}

class Parent{
    public void abc(Info<String>info){
        String s=info.getValue();
    }
}

class Child extends Parent{
//    public void abc(Info<Integer>info){
//        Integer s=info.getValue();
//    }
}